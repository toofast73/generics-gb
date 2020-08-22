package ru.gb.comparator;

import java.util.Collections;
import java.util.List;

public class StringSorter {

    public List<String> sortAscendingNatural(List<String> input){
        Collections.sort(input);
        return input;
    }


    public List<String> sortDescendingNatural(List<String> input){
        input.sort(new StringComparator().reversed());
        return input;
    }

    public List<String> sortByLength(List<String> input){
        input.sort(new LengthComparator());
        return input;
    }


}
