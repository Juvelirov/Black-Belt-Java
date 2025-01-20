/*
 * Copyright (c) 2025. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package generics;

import java.util.ArrayList;

public class ParameterizedMethodExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("first string example");
        list.add("second string example");
        list.add("third string example");
        Object value = GenericMethodContainer.getSecondElement(list);
        System.out.println(value);
    }
}

class GenericMethodContainer{
    public static <T> T getSecondElement(ArrayList<T> list){
        return list.get(1);
    }
}


