package ua.com.juja.lab21;

public class MatrixUtils1 {
    public static void main(String[] args) {
        int[][] fst = new int[][]{{1, 2, 3},
                                  {4, 5, 6},
                                  {4, 5, 1}};

        int[][] snd = new int[][]{{7, 8, 11},
                                  {9, 10, 15},
                                  {11, 12, 22}};
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
    }
}
