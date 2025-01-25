package generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {
    public static void main(String[] args) {
        ArrayList<Integer> firstList = new ArrayList<>();
        firstList.add(5);
        firstList.add(15);
        firstList.add(45);
        showListInfo(firstList);
        List<String> secondList = new ArrayList<>();
        secondList.add("I");
        secondList.add("LOVE");
        secondList.add("JAVA");
        showListInfo(secondList);
        List<? extends Number> list = new ArrayList<Integer>();
        listSum(firstList);
    }

    static void showListInfo(List<?> list){
        System.out.println("This list contains: " + list);
    }

    public static double listSum(ArrayList<? extends Number> list){
        double sum = 0;
        for(Number i : list){
            sum = sum + i.doubleValue();
        }
        System.out.println("Result: " + sum);
        return sum;
    }
}
