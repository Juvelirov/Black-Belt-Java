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
