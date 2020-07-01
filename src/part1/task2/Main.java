package part1.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(method1(array1)));

        int[] array2 = new int[8];
        System.out.println(Arrays.toString(method2(array2)));

        int[] array3 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(method3(array3)));

        int[][] array4 = new int[5][5];
        array4 = method4(array4);
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }

        int[] array5 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Минимальное число: " + (method5_1(array5)) + "\nМаксимальное число: " + method5_2(array5));

        int[] array6 = new int[] {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(method6(array6));

        int[] array7 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        method7(array7, 3);
        System.out.println(Arrays.toString(array7));
    }

    public static int[] method1(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1 - arr1[i];
        }
        return arr1;
    }

    public static int[] method2(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        return arr2;
    }

    public static int[] method3(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        return arr3;
    }

    public static int[][] method4(int[][] arr4) {
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = 1;
            arr4[i][arr4.length - 1 - i] = 1;
        }
        return arr4;
    }

    public static int method5_1(int[] arr5) {
        int min = arr5[0];
        for (int i = 1; i < arr5.length; i++) {
            if (arr5[i] < min) {
                min = arr5[i];
            }
        }
        return min;
    }

    public static int method5_2(int[] arr5) {
        int max = arr5[0];
        for (int i = 1; i < arr5.length; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
            }
        }
        return max;
    }

    public static boolean method6(int[] arr6) {
        int sum = 0;
        for (int i = 0; i < arr6.length; i++) {
            sum += arr6[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        int leftSum = 0;
        int i = 0;
        while (leftSum < sum / 2) {
            leftSum += arr6[i];
            i++;
        }
        return leftSum == sum / 2;
    }

    public static int[] method7(int[] arr7, int number) {
        int count = number % arr7.length;
        if (count < 0) {
            count += arr7.length;
        }
        for (int i = 0; i < count; i++) {
            int lastElement = arr7[arr7.length - 1];
            for (int j = arr7.length - 1; j > 0; j--) {
                arr7[j] = arr7[j - 1];
            }
            arr7[0] = lastElement;
        }
        return arr7;
    }
}