package ua.com.juja.lab05;

/*
Реализовать метод leftShift(int) класса IntegerUtils, который осуществляет ЦИКЛИЧЕСКИЙ СДВИГ (биты, которые
“выталкивают” с одного конца – появляются на втором конце) битов влево. То есть leftShift(int),
получив число 0b00000000_00000000_00000000_00000001 - возвращает 0b00000000_00000000_00000000_00000010,
получив число 0b10000000_00000000_00000000_00000000 - возвращает 0b00000000_00000000_00000000_00000001,
получив число 0b00111000_11111111_00000000_10101010 - возвращает 0b01110001_11111110_00000001_01010100
 */

public class IntegerUtils {
    public static int leftShift(int arg) {
        if(arg <0) {
            return ((arg << 1) + 1);
        } else return arg << 1 ;
    }
}
