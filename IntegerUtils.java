package ua.com.juja;

public class IntegerUtils {
            public static int leftShift(int arg) {
            int result = arg << 1;
            int x = 0b10000000_00000000_00000000_00000000;

            if ( x == (x & arg) ) {
                result += 1;
            }

            return result;
        }
    /*public class IntegerUtils {
        public static int leftShift(int arg) {
            if(arg <0) {
                return ((arg << 1) + 1);
            } else return arg << 1 ;
        }
    }*/

    public static void main(String[] args) {
        int arg = 0b10000000_00000000_00000000_00000000;
        System.out.println(leftShift(arg));
    }
}

