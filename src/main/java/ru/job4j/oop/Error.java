package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

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
        Error defaultConstructorError = new Error();
        defaultConstructorError.printInfo();

        Error errorStatusOne = new Error(false, 1, "no error");
        errorStatusOne.printInfo();

        Error errorStatusTwo = new Error(true, 2, "Some error");
        errorStatusTwo.printInfo();

        Error errorStatusThree = new Error(false, 3, "no error");
        errorStatusThree.printInfo();
    }
}
