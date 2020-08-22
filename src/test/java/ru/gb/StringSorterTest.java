package ru.gb;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import ru.gb.comparator.StringSorter;

import java.util.ArrayList;
import java.util.List;

public class StringSorterTest {



    @Test
    public void sortAscendingNatural() {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("CCCC");
        list.add("BB");

        StringSorter stringSorter = new StringSorter();
        stringSorter.sortAscendingNatural(list);
        System.out.println(list);
    }

    @Test
    public void sortDescNatural() {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("CCCC");
        list.add("BB");

        StringSorter stringSorter = new StringSorter();
        stringSorter.sortByLength(list);
        Assertions
                .assertThat(list)
                .containsExactly("A", "BB2", "CCCC");
    }
}