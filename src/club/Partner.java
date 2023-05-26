package club;

import people.People;
import people.User;

public class Partner extends People {
    private Boolean adherentPartner;

    private Boolean activePartner;


    private User user;



    public Partner(String firstName, String lastName, int age, Boolean adherentPartner, Boolean activePartner,User user) {
        super(firstName, lastName, age);
        this.adherentPartner = adherentPartner;
        this.activePartner = activePartner;
        this.user = user;
    }
    public Partner (){}

    public Boolean getAdherentPartner() {
        return adherentPartner;
    }

    public void setAdherentPartner(Boolean adherentPartner) {
        this.adherentPartner = adherentPartner;
    }

    public Boolean getActivePartner() {
        return activePartner;
    }

    public void setActivePartner(Boolean activePartner) {
        this.activePartner = activePartner;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + user
                + (adherentPartner?" ::Adherent Partner:: ":" ::Active Partner:: ") ;
    }
    public void bet(int amount){
        System.out.println(" user " + user.getEmail() + " Bet for " + amount);
    }

}

