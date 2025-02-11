/*
 * Copyright (c) 2025. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

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
