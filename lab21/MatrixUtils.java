package ua.com.juja.lab21;

public class MatrixUtils {

    public static void main(String[] args) {
        int[][] fst = new int[][]{{1, 2, 3},
                                  {4, 5, 6},
                                  {4, 5, 1}};

        int[][] snd = new int[][]{{7, 8, 11, 0},
                                  {9, 10, 15, 1},
                                  {11, 12, 22, 2}};
        for (int row = 0; row < fst.length; row++) {
            for (int col = 0; col < fst[row].length; col++)
                System.out.format("%6d ", fst[row][col]);
            System.out.println();
        }

        System.out.println();

        for (int row = 0; row < snd.length; row++) {
            for (int col = 0; col < snd[row].length; col++)
                System.out.format("%6d ", snd[row][col]);
            System.out.println();
        }
        System.out.println();

        mul(fst, snd);

    }

    public static int[][] mul(int[][] fst, int[][] snd) {
        if (fst == null || fst.length == 0 || fst[0] == null || fst[0].length == 0) {
            throw new IllegalArgumentException();
        }
        if (snd == null || snd.length == 0 || snd[0] == null || snd[0].length == 0) {
            throw new IllegalArgumentException();
        }
        if (fst[0].length != snd.length) {
            throw new IllegalArgumentException();
        }

        int m = fst.length;
        int n = snd[0].length;
        int o = snd.length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                for (int k = 0; k < o; k++)
                    res[i][j] += fst[i][k] * snd[k][j];
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++)
                System.out.format("%6d ", res[i][j]);
            System.out.println();
        }
        return res;
    }
}
