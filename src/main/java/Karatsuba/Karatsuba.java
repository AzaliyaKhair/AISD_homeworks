package Karatsuba;

public class Karatsuba {

    public static void main(String[] args) {
        String num1 = "1101"; // 13
        String num2 = "1010"; // 10

        String result = karatsubaMultiply(num1, num2);
        System.out.println("Результат: " + result); //10000010 (130)
    }

    public static String karatsubaMultiply(String a, String b) {
        // Удаляем лишние нули в начале
        a = removeLeadingZeros(a);
        b = removeLeadingZeros(b);

        if (a.length() == 1 && b.length() == 1) {
            if (a.equals("1") && b.equals("1")) {
                return "1";
            } else {
                return "0";
            }
        }

        //делаем числа одинаковой длины, добавляя нули в начало
        int maxLen = Math.max(a.length(), b.length());
        a = padWithZeros(a, maxLen);
        b = padWithZeros(b, maxLen);

        //разбиваем числа пополам
        int half = maxLen / 2;
        String high1 = a.substring(0, a.length() - half);
        String low1 = a.substring(a.length() - half);
        String high2 = b.substring(0, b.length() - half);
        String low2 = b.substring(b.length() - half);

        //умножаем части
        String z0 = karatsubaMultiply(low1, low2);
        String z1 = karatsubaMultiply(addBinary(low1, high1), addBinary(low2, high2));
        String z2 = karatsubaMultiply(high1, high2);

        //Вычисляем результат по формуле Карацубы
        String term1 = shiftLeft(z2, 2 * half);
        String term2 = shiftLeft(subtractBinary(subtractBinary(z1, z2), z0), half);
        String result = addBinary(addBinary(term1, term2), z0);

        return result;
    }
    private static String padWithZeros(String s, int length) {
        while (s.length() < length) {
            s = "0" + s;
        }
        return s;
    }

    //Удаляет ведущие нули
    private static String removeLeadingZeros(String s) {
        int i = 0;
        while (i < s.length() - 1 && s.charAt(i) == '0') {
            i++;
        }
        return s.substring(i);
    }

    private static String shiftLeft(String s, int m) {
        return s + "0".repeat(m);
    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j--) - '0' : 0;
            int sum = digitA + digitB + carry;
            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }

    // Вычитание двух двоичных чисел (a должно быть >= b)
    public static String subtractBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int borrow = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0) {
            int digitA = a.charAt(i--) - '0' - borrow;
            int digitB = (j >= 0) ? b.charAt(j--) - '0' : 0;
            borrow = 0;

            if (digitA < digitB) {
                digitA += 2;
                borrow = 1;
            }

            result.append(digitA - digitB);
        }

        return result.reverse().toString();
    }
}