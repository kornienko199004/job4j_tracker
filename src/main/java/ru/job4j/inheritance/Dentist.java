package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private boolean canRemoveTooth = true;

    public Dentist(String name, String surname, String education, String birthday, boolean canTreat, boolean canRemoveTooth) {
        super(name, surname, education, birthday, canTreat);
        this.canRemoveTooth = canRemoveTooth;
    }

    public boolean getCanRemoveTooth() {
        return this.canRemoveTooth;
    }
}
