package team;

import people.People;

public class Medical extends People {
    private String speciality;

    public Medical(String firstName, String lastName, int age, String speciality) {
        super(firstName, lastName, age);
        this.speciality = speciality;
    }

    public Medical() {
    }

    @Override
    public String toString() {
        return "\n" + "Medical: " + "\n" +
                super.toString() +
                " speciality: " + speciality ;
    }
}
