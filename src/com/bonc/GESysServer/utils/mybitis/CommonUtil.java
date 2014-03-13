package com.bonc.GESysServer.utils.mybitis;

/**
 * @author xz 
 * common util 
 * 
 * */
public class CommonUtil {
	
	/**
	 * check targetString is null or empty ，if not anyone return true
	 * @param targetString
	 * @return boolean 
	 * */
	public static boolean isEmpty(String targetString){
		if(targetString != null && !targetString.isEmpty()){
			return true;
		}
		return false;
	}
}
