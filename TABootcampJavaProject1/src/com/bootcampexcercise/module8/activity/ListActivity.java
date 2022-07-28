package com.bootcampexcercise.module8.activity;
        import com.bootcampexcercise.module7.activity.Sample.Sample2;

        import java.util.Iterator;
        import java.util.List;
        import java.util.ArrayList;

public class ListActivity {

    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("Green");
        list.add(0, "Blue");
        int size = list.size();
        Object element = list.get(list.size() - 1);
        element = list.get(0);

        list.add("Orange");
        list.add("Red");
        list.add("Rose");
        list.add("Violet");

        ListActivity obj = new ListActivity();
        obj.print(list);
    }

    void print(List list)
    {
        Iterator<Object> nameOfIterator = list.iterator();
        System.out.println("*** Work of iterator ***");
        while (nameOfIterator.hasNext()) {
            System.out.println(nameOfIterator.next());
        }

        System.out.println("*** Work of for loop ***");
        for (Object nameOfMyObject : list) {
            System.out.println(nameOfMyObject.toString());
        }
    }
}