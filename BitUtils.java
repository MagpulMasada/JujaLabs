package ua.com.juja;

public class BitUtils {
    public static byte swapBits(int b, int i, int j) {
        int d = i - j;
        int y = (b ^ (b >> d)) & (1 << j);
        return (byte) (b ^ y ^ (y << d));
    }

    public static void main(String[] args) {
        int b = 0b0000_0001;
        int i = 0;
        int j = 1;
        System.out.println(swapBits( b, i, j));
    }
}
