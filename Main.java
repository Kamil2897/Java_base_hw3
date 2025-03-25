package Java_base_hw3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> array = new MyArrayList<>();
        ArrayList<String> array2 = new ArrayList<>();
        array2.add("ok");
        array2.add("hi");
        array.add("ok");
        array.add("hello");
        array.add("bye");

        array.add(1, "poka");
        System.out.println(array);

        System.out.println(array.get(2));
    }
}
