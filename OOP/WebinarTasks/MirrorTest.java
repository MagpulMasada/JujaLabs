package ua.com.juja.OOP.WebinarTasks;

import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class MirrorTest {
    @Test
    public void testUpDown_whenArraySizeIs0(){
       //given
        Mirror mirror = new Mirror();
        int[][] array = new int [0][0];

       //when
        mirror.upDown(array);

       //then
        assertEquals("", toString(array));
    }

    @Test
    public void testUpDown_whenArraySizeIs1(){
        //given
        Mirror mirror = new Mirror();
        int[][] array = new int [1][1];

        array[0][0] = 13;

        //when

        mirror.upDown(array);

        //then
        assertEquals("13\n", toString(array));
    }

    @Test
    public void testUpDown_whenArraySizeIs2(){
        //given
        Mirror mirror = new Mirror();
        int[][] array = new int [2][2];

        //12
        //34
        array[0][0] = 1;
        array[1][0] = 3;
        array[0][1] = 2;
        array[1][1] = 4;

        assertEquals(
                "12\n"+
                         "34\n", toString(array));

        //when

        mirror.upDown(array);

        //then
        assertEquals(
                "34\n"+
                         "12\n", toString(array));
    }

    @Test
    public void testUpDown_whenArraySizeIs3(){
        //given
        Mirror mirror = new Mirror();
        int[][] array = new int [3][3];

        //123
        //456
        //789
        /*array[0][0] = 1;
        array[1][0] = 4;
        array[2][0] = 7;
        array[0][1] = 2;
        array[1][1] = 5;
        array[2][1] = 8;
        array[0][2] = 3;
        array[1][2] = 6;
        array[2][1] = 9;*/
        array[0] = new int[] {1, 2, 3};
        array[1] = new int[] {4, 5, 6};
        array[2] = new int[] {7, 8, 9};

        assertEquals(
                "123\n"+
                         "456\n"+
                         "789\n", toString(array));

        //when

        mirror.upDown(array);

        //then
        assertEquals(
                "789\n"+
                         "456\n"+
                         "123\n", toString(array));
    }

    @Test
    public void testUpDown_whenArraySizeIs4(){
        //given
        Mirror mirror = new Mirror();
        int[][] array = new int [4][4];

        // 1  2  3  4
        // 5  6  7  8
        // 9 10 11 12
        //13 14 15 16
        array[0] = new int[] {1, 2, 3, 4};
        array[1] = new int[] {5, 6, 7, 8};
        array[2] = new int[] {9, 10, 11, 12};
        array[3] = new int[] {13, 14, 15, 16};

        assertEquals(
                "1234\n"+
                         "5678\n"+
                         "9101112\n"+
                         "13141516\n", toString(array));

        //when

        mirror.upDown(array);

        //then
        assertEquals(
                "13141516\n"+
                         "9101112\n"+
                         "5678\n"+
                         "1234\n", toString(array));
    }
    @Test
    public void testUpDown_whenArraySizeIs5(){
        //given
        Mirror mirror = new Mirror();
        int[][] array = new int [5][5];

        // 1  2  3  4 34
        // 5  6  7  8 38
        // 9 10 11 12 32
        //13 14 15 16 36
        //17 18 19 20 30
        array[0] = new int[] {1, 2, 3, 4, 34};
        array[1] = new int[] {5, 6, 7, 8, 38};
        array[2] = new int[] {9, 10, 11, 12, 32};
        array[3] = new int[] {13, 14, 15, 16, 36};
        array[4] = new int[] {17, 18, 19, 20, 30};

        assertEquals(
                "123434\n"+
                         "567838\n"+
                         "910111232\n"+
                         "1314151636\n"+
                         "1718192030\n", toString(array));

        //when

        mirror.upDown(array);

        //then
        assertEquals(
                "1718192030\n"+
                         "1314151636\n"+
                         "910111232\n"+
                         "567838\n"+
                         "123434\n", toString(array));
    }

    private String toString(int[][] array) {
        String result= "";

        int size = array.length;
        for (int y = 0; y < size; y++) {
            int[] row = array[y];
            if (row.length != size) {
                fail("Массив не квадратный");
            }
            for (int x = 0; x < size; x++) {
                result += array[y][x];
            }
            result += "\n";
        }
        
        return result;
    }

    //
}
