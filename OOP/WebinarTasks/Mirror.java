package ua.com.juja.OOP.WebinarTasks;

public class Mirror {
    public static void main(String[] args) {

    }

    public void upDown(int[][] array) {

        /*if(!verifySquare(array)) {
            throw new RuntimeException("Массив не квадратной формы");
        }*/

        for (int x = 0; x < array.length; x++) {

            int y1 = 0;
            int y2 = array.length - 1;

            while (y1 < y2) {
                swapY(array, x, y1, y2);
                y1++;
                y2--;
            }
            //2x2
//            swapY(array, x, 0, 1);
//            swapY(array, x, 1, 0); STOP

            //3x3x
//            swapY(array, x, 0, 2);
//            swapY(array, x, 1, 1); STOP

            //4x4
//            swapY(array, x, 0, 3);
//            swapY(array, x, 1, 2);
//            swapY(array, x, 2, 1); STOP

            //5x5
//            swapY(array, x, 0, 4);
//            swapY(array, x, 1, 3);
//            swapY(array, x, 2, 2); STOP

            //6x6
//            swapY(array, x, 0, 5);
//            swapY(array, x, 1, 4);
//            swapY(array, x, 2, 3);
//            swapY(array, x, 3, 2); STOP

            //7x7
//            swapY(array, x, 0, 6);
//            swapY(array, x, 1, 5);
//            swapY(array, x, 2, 4);
//            swapY(array, x, 3, 3); STOP
        }
    }

    /*private boolean verifySquare(int[][] array) {

    }*/

    private void swapY(int[][] array, int x, int y1, int y2) {
        int temp = array[y1][x];
        array[y1][x] = array[y2][x];
        array[y2][x] = temp;
    }

    public void LeftRight(int[][] array) {

        for (int y = 0; y < array.length; y++) {

            int x1 = 0;
            int x2 = array.length - 1;

            while (x1 < x2) {
                swapX(array, y, x1, x2);
                x1++;
                x2--;
            }
        }
    }
    private void swapX(int[][] array, int y, int x1, int x2) {
        int temp = array[y][x1];
        array[y][x1] = array[y][x2];
        array[y][x2] = temp;
    }

        //TODO implement me
    /*public void leftRight (int[][] array) {

    }*/

        //TODO implement me
    /*public void all (int[][] array) {

    }*/

        //TODO implement me
    /*public void d1 (int[][] array) {

    }*/

        //TODO implement me
    /*public void d2 (int[][] array) {

    }*/
}
