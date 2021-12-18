package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException{
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                return i;
            }
        }
        throw new ElementNotFoundException("Element not found");
    }

    public static void main(String[] args) {
        try {
            String[] value = { "1", "2" };
            indexOf(value, "0");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}