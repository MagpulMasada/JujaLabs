package ua.com.juja.OOP.WebinarTasks;

public class Mirror {
    public static void main(String[] args) {

    }

    public void upDown(int[][] array) {

        if (array.length <= 1) return;

        for (int x = 0; x < array.length; x++) {

            int y1 = 0;
            int y2 = array.length - 1;

            while (y1 < y2) {
                swap(array, x, y1, y2);
                y1++;
                y2--;
            }
            //2x2
//            swap(array, x, 0, 1);
//            swap(array, x, 1, 0); STOP

            //3x3x
//            swap(array, x, 0, 2);
//            swap(array, x, 1, 1); STOP

            //4x4
//            swap(array, x, 0, 3);
//            swap(array, x, 1, 2);
//            swap(array, x, 2, 1); STOP

            //5x5
//            swap(array, x, 0, 4);
//            swap(array, x, 1, 3);
//            swap(array, x, 2, 2); STOP

            //6x6
//            swap(array, x, 0, 5);
//            swap(array, x, 1, 4);
//            swap(array, x, 2, 3);
//            swap(array, x, 3, 2); STOP

            //7x7
//            swap(array, x, 0, 6);
//            swap(array, x, 1, 5);
//            swap(array, x, 2, 4);
//            swap(array, x, 3, 3); STOP
        }
    }

    private void swap(int[][] array, int x, int y1, int y2) {
        int temp = array[y1][x];
        array[y1][x] = array[y2][x];
        array[y2][x] = temp;
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
