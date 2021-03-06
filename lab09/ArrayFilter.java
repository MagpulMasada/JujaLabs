package ua.com.juja.lab09;

/*
Отфильтровать массив так, чтобы оставить только четные элементы. Для проверки четности можно использовать операцию "остаток от деления" - %
3 % 2 == 1;
6 % 2 == 0;
Исходящий массив, для простоты, должен быть того же размера, что и входящий. Например, для {4, 3, 5, 6, 7, 9} -> {4, 6, 0, 0, 0, 0}
 */

public class ArrayFilter {
    public static int [] filterEven(int [] nums){
        int []result = new int[nums.length];

        for (int i= 0, k = 0; i< nums.length; i++ ) {
            if ( nums[i] % 2 == 0 ) {
                result[k] = nums[i];
                k += 1;
            }
        }

        return result;
    }
}