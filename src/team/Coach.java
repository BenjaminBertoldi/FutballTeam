package team;

import people.People;

public class Coach extends People {
    private int chagesRealized;

    public Coach(String firstName, String lastName, int age, int chagesRealized) {
        super(firstName, lastName, age);
        this.chagesRealized = chagesRealized;
    }

    public Coach() {}

    public int getChagesRealized() {
        return chagesRealized;
    }

    public void setChagesRealized(int chagesRealized) {
        this.chagesRealized = chagesRealized;
    }

    @Override
    public String toString() {
        return "Coach: " + super.toString() +
                " Changes Realized: " + chagesRealized ;
    }
}
