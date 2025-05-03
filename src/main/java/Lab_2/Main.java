package Lab_2;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ввод круглых скобок");
        String scob = sc.nextLine();

        int remove = calcRemove(scob);
        System.out.println("число" + remove);

        sc.close();
    }

    public static int calcRemove(String a) {
        Stack<Character> steck= new Stack<>();
        int delete = 0;

        for(int i = 0; i < a.length(); i++) {
            char current = a.charAt(i);

            if(current == '(') {
                steck.push(current);
            } else if (current == ')') {
                if(!steck.isEmpty()) {
                    steck.pop();
                } else {
                    delete++;
                }
            }
        }
        delete += steck.size();
        return delete;
    }
}
