package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);

        ArrayList<Integer> result = new ArrayList<>();
        for (Integer each : list) {
            if (result.contains(each)){
                continue;
            }/* i need to skip the elements that are already before adding
            i need to check the make sure that the element is not contained the
            array list.if it is already contained
             that we need to skip the element */

            result.add(each); //add all the elements
        }
    }
}
