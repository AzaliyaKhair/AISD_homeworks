package hw_16_05;
/* Есть строка. Нужно развернуть строку так, чтобы каждое
 из слов осталось в естественном порядке.
 Например. Input 1: A = "the sky is blue" Output 1:
 "blue is sky the" Input 2: A = "this is ib"
  Output 2: "ib is this". Сложность линейная, с О(1)
  дополнительной памяти.
 */

public class Main2 {
    public static void main(String[] args) {
        String s1 = "the sky is blue";
        String s2 = " this is ib ";

        System.out.println(reverseW(s1));
        System.out.println(reverseW(s2));
    }

    public static String reverseW(String s) {
        s = s.trim();
        String[] words = s.split(" +");

        String result = "";
        for(int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if(i > 0) {
                result += " ";
            }
        }

        return result;
    }
}
