package club;

import people.People;

public class President extends People {
    private String takesResolutons;

    public President(String firstName, String lastName, int age, String takesResolutons) {
        super(firstName, lastName, age);
        this.takesResolutons = takesResolutons;
    }

    public President() {
    }

    public President(String takesResolutons) {
        this.takesResolutons = takesResolutons;
    }

    public String getTakesResolutons() {
        return takesResolutons;
    }

    public void setTakesResolutons(String takesResolutons) {
        this.takesResolutons = takesResolutons;
    }

    @Override
    public String toString() {
        return "President" + super.toString() + "\n" +
                "Takes Resolutons: " + takesResolutons ;
    }
}
