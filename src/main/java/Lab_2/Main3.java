package Lab_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 6, 6, 6, 5);

        List<Integer> unique = new ArrayList<>();
        Integer number = null;

        for (Integer curNum : numbers) {
            if (number == null || !curNum.equals(number)) {
                unique.add(curNum);
            }
            number = curNum;
        }
        System.out.println("без дублирования: " + unique);
    }
}