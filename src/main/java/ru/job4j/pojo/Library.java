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

        for (int i = 0; i < books.length; i += 1) {
            System.out.println(books[i].getName() + " " + books[i].getSheetsCount());
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (Book book : books) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName());
            }
        }
    }
}
