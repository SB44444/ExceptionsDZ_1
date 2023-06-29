// Задание 3.Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.
//Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.


import java.util.Arrays;


public class DZ1_T3 {
    public static void main(String[] args) {
        int[] arrayFist = { 10, 148, 587, 108, 31 };
        int[] arraySecond = { 14, 12, 37, 54, 21 };
        // int[] arrayX = { 14, 12, 37, 54, 21, 471, 721 };

        arrayIntDifference(arrayFist, arraySecond);
        // arrayIntDifference(arrayFist, arrayX);
    }

    public static void arrayIntDifference(int[] arrayFist, int[] arraySecond) {
        int[] arrayOut = new int[arrayFist.length];
        if (arrayFist.length == arraySecond.length) {
            for (int i = 0; i < arraySecond.length; i++) {
                arrayOut[i] = (int) (arrayFist[i] / arraySecond[i]);
            }
            System.out.println(Arrays.toString(arrayOut));

        } else {
            throw new RuntimeException("Длины массивов не равны");
        }

    }
}