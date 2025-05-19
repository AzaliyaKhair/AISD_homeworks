package hw_16_05;

/*Дан список неотрицательных чисел. Измените их порядок так,
 чтобы если их после этого выписать в строку, то получилось
  максимальное из возможных чисел. Пример: дан массив
  [3, 30, 34, 5, 9]. Максимальное возможное число можно получить
  9534330. Сложность O(n log n)
 */

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        System.out.println(BigNum(numbers));
    }

    public static String BigNum(int[] nums) {
        String[] textNums = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            textNums[i] = "" + nums[i];
        }

        Arrays.sort(textNums, (a, b) -> (b + a).compareTo(a + b));

        if(textNums[0].equals("0")) {
            return "0";
        }

        String result = "";
        for(String num : textNums) {
            result += num;
        }
        return result;
    }
}
