package Java3Lesson1.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        test();

    }
    public static final <T> void swap (T[] a, int i, int j) {
        T t = a [i];
        a[i]= a [j];
        a[j]= t;
    }

    public static final <T> void swap (List<T> l, int i, int j) {
        Collections.<T>swap(l, i, j);
    }

    private static void test() {
        System.out.println("Task 1 and 2.");
        String [] a = {"Fruits", "Vegetables"};
        swap(a, 0, 1);
        System.out.println("a:"+Arrays.toString(a));
        List<String> l = new ArrayList<String>(Arrays.asList(a));
        swap(l, 0, 1);
        System.out.println("l:"+l);
}
}
