package com.company;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] list = {0, 1, 2, 3, 4, 5};
        printArray(list, 2, 5);
        printArray(list, 1, 10);
        printArray(list, 3, 5);

    }

    public static void printArray(int[] array, int start, int end) {
        try {
            int i = 1;
            while (start < end) {
                System.out.printf("%d) %d\n",i, array[start]);
                start++;
                i++;
            }
            System.out.println("=".repeat(50));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("Ошибка. Попытка обращения к " +
                    "несуществующему индексу: текущий индекс = %d; " +
                    "размер массива = %d;\n", start, array.length);
        }

    }
}
