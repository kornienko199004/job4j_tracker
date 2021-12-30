package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<Item>();
    private int ids = 1;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }
    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public List<Item> findByName(String name) {
        List<Item> rsl = new ArrayList<Item>();

        for (Item item : items) {
            if (name.equals(item.getName())) {
                rsl.add(item);
            }
        }
        return rsl;
    }

    public List<Item> findAll() {
        return items;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index > -1) {
            items.set(index, item);
            item.setId(id);
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        items.remove(index);
        return true;
    }

    private int indexOf(int id) {
        int rsl = -1;
        int index = 0;
        for (Item item : items) {
            if (item.getId() == id) {
                rsl = index;
                break;
            }
            index++;
        }
        return rsl;
    }
}