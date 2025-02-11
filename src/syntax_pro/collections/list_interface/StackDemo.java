/*
 * Copyright (c) 2025. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package syntax_pro.collections.list_interface;

public class StackDemo {
    // Stack наследуется от Vector, вектор наследуется от List
    // Также синхронизованный, работает по принципу LIFO.
    // Не рекомендован к использованию, как и Vector.
    public static void main(String[] args) {
        System.out.println("main starts");
        abc3();
        System.out.println("main endssss");
    }

    static void abc1() {
        System.out.println("abc1 starts");
        System.out.println("abc1 ends");
    }

    static void abc2() {
        System.out.println("abc2 starts");
        abc1();
        System.out.println("abc2 ends");
    }

    static void abc3(){
        System.out.println("abc3 starts");
        abc2();
        System.out.println("abc3 ends");
    }


}
