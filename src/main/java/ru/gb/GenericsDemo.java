package ru.gb;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {


    public static void main(String[] args) {


        List list = new ArrayList();
        list.add("A");
        list.add("B");

        List<Long> numberList = new ArrayList<>();
        numberList.add(1L);
        numberList.addAll(list);

        for (Long aLong : numberList) {
            System.out.println(aLong);
        }
    }



    public static <T> T findFIrstElement(List<T> input){
        return input.get(0);
    }



}
