package ru.job4j.poly;

public class Bus implements Transport {
    private int passengersCount;
    private double price;
    private boolean stop = true;

    public Bus(double price) {
        this.price = price;
    }

    @Override
    public void ride() {
        this.stop = false;
    }

    @Override
    public void passengers(int number) {
        this.passengersCount = number;
    }

    @Override
    public double refuel(double count) {
        return count * this.price;
    }
}
