package org.homework_1;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String test1 = "()[]{}";
        String test2 = "([{}])";
        String test3 = "(]";
        String test4 = "([)]";
        String test5 = "{[]}";

        System.out.println(test1 + " " + checkBrackets(test1));
        System.out.println(test2 + " " + checkBrackets(test2));
        System.out.println(test3 + " " + checkBrackets(test3));
        System.out.println(test4 + " " + checkBrackets(test4));
        System.out.println(test5 + " " + checkBrackets(test5));
    }

    public static boolean checkBrackets(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            } else if (current == ')' || current == '}' || current == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char last = stack.pop();

                if (current == ')' && last != '(') {
                    return false;
                }
                if (current == '}' && last != '{') {
                    return false;
                }
                if (current == ']' && last != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}