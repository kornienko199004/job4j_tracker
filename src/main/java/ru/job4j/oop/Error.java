package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {}

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("active: " + this.active);
        System.out.println("status: " + this.status);
        System.out.println("message: " + this.message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        error1.printInfo();

        Error error2 = new Error(false, 1, "no error");
        error2.printInfo();

        Error error3 = new Error(true, 2, "Some error");
        error3.printInfo();

        Error error4 = new Error(false, 3, "no error");
        error4.printInfo();
    }
}
