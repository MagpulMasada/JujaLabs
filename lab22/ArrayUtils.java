package ua.com.juja.lab22;

/*
lil kek cheburek
 */

public class ArrayUtils {
    public static void main(String[] args){
        int[][]arg=new int[][]{{55,2,3},
                                {4,5,6},
                                {7,8,9}};

        for(int i=0;i<arg.length;i++){
            for(int j=0;j<arg[i].length;j++)
                System.out.format("%6d ",arg[i][j]);
            System.out.println();
        }
        System.out.println();
        rotateClockwise(arg);
    }

    public static int[][] rotateClockwise(int[][] arg) {
        if (arg == null || arg.length == 0 || arg[0] == null || arg[0].length != arg.length) {
            return null;
        }
        for(int j = 0; j < arg.length; j++){
            if(arg[j] == null || arg[j].length != arg[0].length){
                return null;
            }
        }

        for (int i = 0; i < arg.length / 2; i++) {
            for (int j = i; j < arg.length-1-i; j++) {
                int tmp = arg [i][j];
                arg [i][j] = arg [arg.length-1-j][i];
                arg [arg.length-1-j][i] = arg [arg.length-1-i][arg.length-1-j];
                arg [arg.length-1-i][arg.length-1-j] = arg[j][arg.length-1-i];
                arg[j][arg.length-1-i] = tmp;
            }
        }
        for(int row=0;row<arg.length;row++){
            for(int col=0;col<arg[row].length;col++)
                System.out.format("%6d ",arg[row][col]);
            System.out.println();
        }

        return arg;
    }

}
