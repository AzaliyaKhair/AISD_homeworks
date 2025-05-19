package hw_16_05;
/* Дана последовательность различных чисел,
в которой все числа до определенного индекса j
отсортированы по убыванию, а после j по возрастанию.
 Найдите этот индекс j.  (Сложность O(log n).)
 */

public class Main1 {
    public static void main(String[] args) {
        int[] arr1 = {5, 4, 3, 2, 1, 2, 3, 4, 5}; // j = 4
        int[] arr2 = {10, 9, 8, 7, 3, 4, 5}; // j = 4
        int[] arr3 = {5, 4, 3, 2, 1}; // j = 4
        int[] arr4 = {1, 2, 3, 4, 5, 6}; // j = 0

        System.out.println(findJ(arr1));
        System.out.println(findJ(arr2));
        System.out.println(findJ(arr3));
        System.out.println(findJ(arr4));
    }

    public static int findJ(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i - 1]) {
                return i - 1;
            }
        }

        return arr.length - 1;

    }



}
