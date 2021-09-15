package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book storyBook = new Book();
        storyBook.setName("История древнего мира");
        storyBook.setSheetsCount(505);

        Book childrenBook = new Book();
        childrenBook.setName("Колобок");
        childrenBook.setSheetsCount(10);

        Book detectiveBook = new Book();
        detectiveBook.setName("Агата Кристи");
        detectiveBook.setSheetsCount(375);

        Book programmerBook = new Book();
        programmerBook.setName("Clean code");
        programmerBook.setSheetsCount(607);

        Book[] books = { storyBook, childrenBook, detectiveBook, programmerBook };

        for (Book value : books) {
            System.out.println(value.getName() + " " + value.getSheetsCount());
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (Book value : books) {
            System.out.println(value.getName() + " " + value.getSheetsCount());
        }

        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName());
            }
        }
    }
}
