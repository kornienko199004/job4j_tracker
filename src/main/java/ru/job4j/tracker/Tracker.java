package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }
    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findByName(String name) {
        Item[] rsl = new Item[this.size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (name.equals(item.getName())) {
                rsl[count] = item;
                count += 1;
            }
        }
        rsl = Arrays.copyOf(rsl, count);
        return rsl;
    }

    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.size);
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index > -1) {
            this.items[index] = item;
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
        System.arraycopy(this.items, index + 1, this.items, index, this.size - index - 1);
        this.items[this.size - 1] = null;
        this.size -= 1;
        return true;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}