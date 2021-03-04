package demo;

import sorting.BubbleSortDemo;
import sorting.InsertionSortDemo;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(10);
        data.add(1);
        data.add(5);
        data.add(3);
        data.add(2);


        data = InsertionSortDemo.sort(data);
        for (int i = 0; i < data.size(); i++)
            System.out.println(data.get(i));
    }
}
