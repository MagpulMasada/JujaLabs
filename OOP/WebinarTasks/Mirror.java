package ua.com.juja.OOP.WebinarTasks;

public class Mirror {
    public static void main(String[] args) {

    }

    public void upDown(int[][] array) {
        if (array.length <= 1) return;

        for (int x = 0; x < array.length; x++) {
            /*int a1 = array[0][x];
            int a2 = array[1][x];

            array[1][x] = a1;
            array[0][x] = a2;*/

            int temp = array[0][x];
            array[0][x] = array[1][x];
            array[1][x] = temp;

        }
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
