package hw_16_05;

/* Дан список неотрицательных чисел и некоторое число s.
Необходимо вывести мксимальное количество числе из списка, сумма
которых не превышает s. Пример: [15, 5, 11, 10, 12], s = 30, тогда
 ответ будет 3 (например, 5 + 10 + 11 < 30)
 */

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] numbers = {15, 5, 11, 10, 12};
        int s = 30;
        System.out.println(maxNum(numbers, s));
    }

    public static int maxNum(int[] nums, int s) {
        Arrays.sort(nums);

        int count = 0;
        int currentSum = 0;

        for(int num : nums) {
            if(currentSum + num <= s) {
                currentSum += num;
                count++;
            } else {
                break;
            }
        }
        return count;
    }

}
