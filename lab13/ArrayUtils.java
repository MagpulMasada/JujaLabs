package ua.com.juja.lab13;

/*
На вход подается одномерный массив. Необходимо найти диапазон максимальной ширины, элементы которого положительные (больше 0).
В качестве ответа должен быть массив из 2х элементов, где:
- элемент №0 - индекс элемента левой границы отрезка;
- элемент №1 - индекс элемента правой границы отрезка.

Если таких отрезков несколько - вернуть самый ПРАВЫЙ. Если в массиве отсутствует такой отрезок (все числа отрицательны) - вернуть пустой массив.

Например

lookFor([1, 1, 1]) = [0, 2]
lookFor([0, 1, 1]) = [1, 2]
lookFor([1, 1, 0]) = [0, 1]
lookFor([0, -100, 1, 1, 0, -1]) = [2, 3]
lookFor([1, 1, 0, 1, 1]) = [3, 4] // возвращаем ПРАВЫЙ
lookFor([0, -1, 0, -1]) = [] // отсутствуют положительные числа
-------------------
Лабораторная совпадает с предыдущей, кроме следующего случая - при наличии 2-х отрезков равной длинны, выбрать ПРАВЫЙ, а не левый.
 */

public class ArrayUtils {
    public static int[] lookFor(int[] array) {
        int[] result = new int[2];
        int firstIndex = 0;
        int lastIndex = 0;
        int sequenceLength = 0;
        int currentSequenceLength = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                if ( currentSequenceLength == 0 ) {
                    lastIndex = i;
                }

                currentSequenceLength += 1;
                firstIndex = i;
            } else {
                if (currentSequenceLength > sequenceLength) {
                    sequenceLength = currentSequenceLength;

                    result[0] = firstIndex;
                    result[1] = lastIndex;
                }

                currentSequenceLength = 0;
            }
        }

        if (currentSequenceLength > sequenceLength) {
            sequenceLength = currentSequenceLength;
            result[0] = firstIndex;
            result[1] = lastIndex;
        }
        if (sequenceLength == 0) {
            return new int[0];
        }

        return result;
    }
}
