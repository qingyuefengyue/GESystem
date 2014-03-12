package com.bonc.GESysServer.core;


public final class BitUtil {
    private static int[] byte_masks = new int[] { 0xFF, 0x7F, 0x3F, 0x1F, 0x0F, 0x07, 0x03, 0x01};
    private static int[] short_masks = new int[]{ 0xFFFF, 0x7FFF, 0x3FFF, 0x1FFF, 0x0FFF, 0x07FF, 0x03FF, 0x01FF,
        0x00FF, 0x007F, 0x003F, 0x001F, 0x000F, 0x0007, 0x0003, 0x0001 };



    /**
     * Perform a true unsigned right shift on a {@link byte}.
     * @param value The value to shift.
     * @param offset The number of bits to shift.
     * @return Unsigned right shift <i>offset</i> bits on the given <i>value</i>.
     * <p>If offset < 0, perform left shift of <i>-offset</i> bits; if offset >=8, return 0.</p>
     */
    public static final byte unsignedRightShift(final byte value, final int offset) {
        if (offset < 0) {
            return (byte) (value << -offset);
        } else if(offset >= 8) {
            return 0;
        }
        byte result;
        if (value > 0) {
            result = (byte) (value >> offset);
        } else {
            result = (byte) ((value >> offset) & byte_masks [offset]);
        }
        return result;
    }

    /**
     * Perform a true unsigned right shift on a {@link short}.
     * @param value The value to shift.
     * @param offset The number of bits to shift.
     * @return Unsigned right shift <i>offset</i> bits on the given <i>value</i>.
     * <p>If offset < 0, perform left shift of <i>-offset</i> bits; if offset >=16, return 0.</p>
     */
    public static final short unsignedRightShift(final short value, final int offset) {
        if (offset < 0) {
            return (short) (value << -offset);
        } else if(offset >= 16) {
            return 0;
        }
        short result;
        if (value > 0) {
            result = (short) (value >> offset);
        } else {
            result = (short) ((value >> offset) & short_masks [offset]);
        }
        return result;
    }

}
