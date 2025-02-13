package syntax_pro.collections.list_interface;

import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Zaur");
        stack.push("Misha");
        stack.push("Oleg");
        stack.push("Katya"); // push вставляет в верхушку
        System.out.println("До pop(): " + stack);
        System.out.println(stack.pop());
        System.out.println("После pop(): " + stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
            System.out.println(stack);
        }
    }
}
