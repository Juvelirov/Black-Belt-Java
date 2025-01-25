package syntax_pro.comporation.comparable;


import syntax_pro.comporation.People;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
    public static void main(String[] args) {
        List<People> empList = new ArrayList<>();
        People emp1 = new People(20, 3, 80000, "Ivan", "Astafiev");
        People emp2 = new People(52, 1, 500000, "Evgeny", "Prigozhin");
        People emp3 = new People(20, 2, 180000, "Artem", "Denisov");
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        System.out.println("Before sorting: \n" + empList);
        Collections.sort(empList);
        System.out.println("After sorting: \n" + empList);

    }
}


