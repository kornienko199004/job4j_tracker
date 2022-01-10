package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SortingTest {
    @Test
    public void sortItemsAsc() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("third"));
        items.add(new Item("first"));
        items.add(new Item("second"));
        Collections.sort(items, new ItemAscByName());

        List<Item> expectedItems = new ArrayList<>();
        expectedItems.add(new Item("first"));
        expectedItems.add(new Item("second"));
        expectedItems.add(new Item("third"));

        assertEquals(items, expectedItems);
    }

    @Test
    public void sortItemsDesc() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("third"));
        items.add(new Item("first"));
        items.add(new Item("second"));
        Collections.sort(items, new ItemDescByName());

        List<Item> expectedItems = new ArrayList<>();
        expectedItems.add(new Item("third"));
        expectedItems.add(new Item("second"));
        expectedItems.add(new Item("first"));

        assertEquals(items, expectedItems);
    }
}
