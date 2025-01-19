/*
 * Copyright (c) 2025. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package comporation;

public class People implements Comparable<People> {
    int age;
    String name;
    String surname;
    int id;
    public int salary;

    public People(int age, int id, int salary, String name, String surname) {
        this.age = age;
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    // Возвращает целое число
    @Override
    public int compareTo(People anotherEmp) {
        if (this.id == anotherEmp.id){
            return 0;
        } else if (this.id < anotherEmp.id){
            return -1;
        }
        else {
            return 1;
        }
    }
}