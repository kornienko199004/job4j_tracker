package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private boolean canMakeOperations = true;

    public Surgeon(String name, String surname, String education, String birthday, boolean canTreat, boolean canMakeOperations) {
        super(name, surname, education, birthday, canTreat);
        this.canMakeOperations = canMakeOperations;
    }

    public boolean getCanMakeOperations() {
        return this.canMakeOperations;
    }
}
