package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery firstBattery = new Battery(20);
        Battery secondBattery = new Battery(10);

        System.out.println("First battery load: " + firstBattery.load);
        System.out.println("Second battery load: " + secondBattery.load);

        firstBattery.exchange(secondBattery);

        System.out.println("First battery load: " + firstBattery.load);
        System.out.println("Second battery load: " + secondBattery.load);
    }
}
