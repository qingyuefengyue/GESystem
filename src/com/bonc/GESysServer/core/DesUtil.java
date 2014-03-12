package com.bonc.GESysServer.core;

import java.io.UnsupportedEncodingException;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class DesUtil {

	private static final String url_safe_base64_alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_*";

	/**
	 * 解码原理:将4个字节转换成3个字节. 先读入4个6位(用或运算),每次左移6位,再右移3次,每次8位.
	 * 
	 * @param data
	 *            需解码的Base64字符串。
	 * @return byte[]－解码出的字节数组
	 */
	public static byte[] urlSafeBase64Decode(final String data) {
		if (null == data) {
			throw new IllegalArgumentException("data must not be null.");
		}
		if (0 == data.length()) {
			return new byte[0];
		}
		final char[] chArray = data.toCharArray();
		final int len = chArray.length;
		final byte[] result = new byte[len * 3 / 4];
		for (int i = 0, res_i = 0; i < len; i += 4, res_i += 3) {
			int goal = 0;
			int index = 0;
			for (int k = 0; k < 4; k++) {
				index = url_safe_base64_alphabet.indexOf(chArray[i + k]);
				goal <<= 6;
				goal |= index;
			}
			for (int j = 2; j >= 0; j--) {
				result[res_i + j] = (byte) goal;
				goal >>>= 8;
			}
		}
		// 等号=的处理
		if (chArray[len - 1] != '*') {
			return result;
		} else if (chArray[len - 2] == '*') {
			final byte[] ret = new byte[result.length - 2];
			for (int i = 0; i < result.length - 2; i++) {
				ret[i] = result[i];
			}
			return ret;
		} else {
			final byte[] ret = new byte[result.length - 1];
			for (int i = 0; i < result.length - 1; i++) {
				ret[i] = result[i];
			}
			return ret;
		}
	}

	/**
	 * Decode a Base64 string to a string, use default encoding.
	 * 
	 * @param base64
	 *            The Base64 string to decode.
	 * @return The ordinary string of the Base64 string.
	 */
	public static String urlSafeBase64DecodeString(final String base64) {
		final byte[] data = urlSafeBase64Decode(base64);
		return new String(data);
	}

	/**
	 * Decode a Base64 string to a string, use default encoding.
	 * 
	 * @param base64
	 *            The Base64 string to decode.
	 * @param encoding
	 *            The encoding to use.
	 * @return The ordinary string of the Base64 string.
	 * @throws UnsupportedEncodingException
	 *             Encoding not supported.
	 */
	public static String urlSafeBase64DecodeString(final String base64,
			final String encoding) throws UnsupportedEncodingException {
		final byte[] data = urlSafeBase64Decode(base64);
		return new String(data, encoding);
	}

	/**
	 * 编码原理:将3个字节转换成4个字节( (3 X 8) = 24 = (4 X 6) )
	 * 先读入3个字节,每读一个字节,左移8位,再右移四次,每次6位,这样就有4个字节了
	 * 
	 * @param data
	 *            The data to encrypt.
	 * @return 编码后的Base64字符串
	 */
	public static String urlSafeBase64Encode(final byte[] data) {
		if (null == data) {
			throw new IllegalArgumentException("data must not be null.");
		}
		if (0 == data.length) {
			return "";
		}
		final StringBuilder builder = new StringBuilder();
		final int[] temp = new int[4];
		final int len = data.length - data.length % 3;
		for (int i = 0; i < len; i += 3) {
			int goal = 0;
			for (int j = 0; j < 3; j++) {
				goal <<= 8;
				goal |= (data[i + j] & 0xff);
			}
			for (int k = 0; k < 4; k++) {
				temp[k] = goal & 0x3f;
				goal >>>= 6;
			}
			for (int k = 3; k >= 0; k--) {
				builder.append(url_safe_base64_alphabet.charAt(temp[k]));
			}
		}
		int index;
		switch (data.length % 3) {
		case 1:
			index = BitUtil.unsignedRightShift(data[data.length - 1], 2);
			builder.append(url_safe_base64_alphabet.charAt(index));
			index = (data[data.length - 1] & 0x03) << 4;
			builder.append(url_safe_base64_alphabet.charAt(index));
			builder.append("**");
			break;
		case 2:
			index = BitUtil.unsignedRightShift(data[data.length - 1 - 1], 2);
			builder.append(url_safe_base64_alphabet.charAt(index));
			index = (data[data.length - 1 - 1] & 0x03) << 4
					| BitUtil.unsignedRightShift(data[data.length - 1], 4);
			builder.append(url_safe_base64_alphabet.charAt(index));
			index = (data[data.length - 1] & 0x0f) << 2;
			builder.append(url_safe_base64_alphabet.charAt(index));
			builder.append('*');
			break;
		}
		return builder.toString();
	}

	/**
	 * Encode a text to Base64 representation.
	 * 
	 * @param text
	 *            The text to encode.
	 * @return The Base64 representation of the text.
	 */
	public static String urlSafeBase64EncodeString(final String text) {
		try {
			return urlSafeBase64Encode(text.getBytes("utf-8"));
		} catch (final UnsupportedEncodingException e) {
			return urlSafeBase64Encode(text.getBytes());
		}
	}

	/**
	 * Encode a text to Base64 representation.
	 * 
	 * @param text
	 *            The text to encode.
	 * @param encoding
	 *            The encoding to use.
	 * @return The Base64 representation of the text.
	 * @throws UnsupportedEncodingException
	 *             Encoding not supported.
	 */
	public static String urlSafeBase64EncodeString(final String text,
			final String encoding) throws UnsupportedEncodingException {
		return urlSafeBase64Encode(text.getBytes(encoding));
	}
	
	/**
	 * 
	 * @param 明文
	 * @param 加密key
	 * @param 加密向量
	 * @return 加密之后的字节数组
	 * @throws Exception
	 */
	public static byte[] desEncrypt(byte[] message,byte[] key,byte[] iv)
	
	throws Exception {
		Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
		DESKeySpec desKeySpec = new DESKeySpec(key);
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
		SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
		IvParameterSpec desiv = new IvParameterSpec(iv);
		cipher.init(Cipher.ENCRYPT_MODE, secretKey, desiv);
		return cipher.doFinal(message);
	}
	
	/**
	 * 
	 * @param 明文字符串
	 * @param 加密key
	 * @return 加密向量
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static String desEncryptASUrlSafeBase64String(String message, String key){	
		try {
			return urlSafeBase64Encode(desEncrypt(message.getBytes("UTF-8"), key.getBytes("UTF-8"),key.getBytes("UTF-8")));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
	}

	/**
	 * 
	 * @param 密文
	 * @param 解密key
	 * @param 向量
	 * @return
	 * @throws Exception
	 */
	public static byte[] desDecrypt(byte[] message,byte[] key,byte[] iv)
	throws Exception {
			Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
			DESKeySpec desKeySpec = new DESKeySpec(key);
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
			IvParameterSpec desiv = new IvParameterSpec(iv);
			cipher.init(Cipher.DECRYPT_MODE, secretKey, desiv);
			return cipher.doFinal(message);
	}
	/**
	 * 解密
	 * */
	public static String desDecryptASUrlSafeBase64String(String data, String key){	
		try {
			return new String(desDecrypt(urlSafeBase64Decode(data), key.getBytes("UTF-8"),key.getBytes("UTF-8")),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
	}
}
