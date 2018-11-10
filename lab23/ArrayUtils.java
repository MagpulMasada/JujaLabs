package ua.com.juja.lab23;

public class ArrayUtils {
    public static void main(String[]args){
        //int [][][] arg = new int[2][2][2];
        int [][][] arg = new int[3][3][3];
        /*arg[0][0][0] = 1; arg[1][0][0] = 5;
        arg[0][0][1] = 2; arg[1][0][1] = 6;
        arg[0][1][0] = 3; arg[1][1][0] = 7;
        arg[0][1][1] = 4; arg[1][1][1] = 8;
        */

        arg[0][0][0] = 10; arg[1][0][0] = 40; arg[2][0][0] = 70;
        arg[0][0][1] = 11; arg[1][0][1] = 41; arg[2][0][1] = 71;
        arg[0][0][2] = 12; arg[1][0][2] = 42; arg[2][0][2] = 72;
        arg[0][1][0] = 20; arg[1][1][0] = 50; arg[2][1][0] = 80;
        arg[0][1][1] = 21; arg[1][1][1] = 51; arg[2][1][1] = 81;
        arg[0][1][2] = 22; arg[1][1][2] = 52; arg[2][1][2] = 82;
        arg[0][2][0] = 30; arg[1][2][0] = 60; arg[2][2][0] = 90;
        arg[0][2][1] = 31; arg[1][2][1] = 61; arg[2][2][1] = 91;
        arg[0][2][2] = 32; arg[1][2][2] = 62; arg[2][2][2] = 92;

        for (int i = 0;i<arg.length;i++){
            for (int j = 0; j<arg[i].length;j++){
                for (int k = 0; k<arg[i].length;k++) {
                    System.out.print(arg[i][j][k] +"  ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("----------------");
        rotateClockwise(arg);
    }

    public static int[][][] rotateClockwise(int[][][] arg) {


        int l = arg.length;
        int m = arg[0].length;
        int n = arg[1].length;
        int [][][] mtrx = new int[l][m][n];
        for (int i = 0;i<arg.length;i++) {
            for (int j = 0; j < arg[0].length; j++) {
                for (int k = 0; k < arg[1].length; k++) {
                    mtrx[i][j][k] = arg[k][i][j];
                }
            }
        }
        for (int i = 0;i<mtrx.length;i++){
            for (int j = 0; j<mtrx[i].length;j++){
                for (int k = 0; k<mtrx[i].length;k++) {
                    System.out.print(mtrx[i][j][k] +"  ");
                }
                System.out.println();
            }
            System.out.println();
        }
        return mtrx;
    }
}
