package org.zerock;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("AAA");
        list.add("AAAB");
        list.add("AAAC");
        list.add("sssss");
        System.out.println(list);

        //read
        System.out.println(list.get(2));
        System.out.println(list.remove(0));//꺼내서 보여주고 없앰.
        System.out.println(list);

        //update
        list.set(0,"zzzzz");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.stream().forEach(x -> System.out.println(x)); //람다식

        Collections.shuffle(list);
        System.out.println(list);




    }
}
