/*
 * Copyright (c) 2025. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package comporation.comparator;

import comporation.People;

import java.util.Comparator;

public class SalaryComparator implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        if (o1.salary == o2.salary){
            return 0;
        }
        else if (o1.salary > o2.salary){
            return 1;
        }
        else {
            return -1;
        }
    }
}
