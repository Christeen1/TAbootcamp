package com.bootcampexcercise.module8.activity;

        import java.util.Set;
        import java.util.HashSet;

public class SetActivity {

    public static void main(String[] args) {

        HashSet coloursSet = new HashSet();

        coloursSet.add("Red");
        coloursSet.add("Green");
        coloursSet.add("Orange");
        coloursSet.add("Violet");
        coloursSet.add("Rose");
        coloursSet.add("Violet");

        SetActivity obj = new SetActivity();

        for (Object nameOfObject : coloursSet) {
            System.out.println(nameOfObject.toString());
        }
        System.out.println(coloursSet);

    }
}

