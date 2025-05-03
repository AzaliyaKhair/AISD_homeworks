package Lab_2;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ввод постфиксной записи");
        String input = sc.nextLine().trim();

        try {
            int res = calc(input);
            System.out.println("число" + res);
        }catch (Exception e) {
            System.out.println("ошибка" + e.getMessage());
        }

        sc.close();
    }

    public static int calc(String input) {
        Stack<Integer> nums = new Stack<>();
        String[] parts = input.split(" ");

        for(String part : parts) {
            if (part.isEmpty()) {
                continue;
            }
            if (isNum(part)) {
                nums.push(Integer.parseInt(part));
            } else {
                if (nums.size() < 2) {
                    throw new RuntimeException("не выполнится" + part);
                }
                int a = nums.pop();
                int b = nums.pop();
                int res;

                if (part.equals("+")) {
                    res = a + b;
                } else if (part.equals("-")) {
                    res = a - b;
                } else if (part.equals("*")) {
                    res = a * b;
                } else {
                    throw new RuntimeException(part);
                }
                nums.push(res);
            }
        }

        if (nums.size() != 1) {
            throw new RuntimeException();
        }
        return nums.pop();
    }

    private static boolean isNum(String ok) {
        try {
            Integer.parseInt(ok);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
