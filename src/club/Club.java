package club;

import UIMenu.Uimenu;
import game.Raffle;
import people.User;
import team.TrainingStatistics;
import team.players.Player;
import team.players.PlayerStatistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static UIMenu.Uimenu.back;
import static UIMenu.Uimenu.showPlayerMenu;


public class Club {
    private  List<Partner> partners;
    private String clubName;
    private String Direction;
    private Team team;


    public Club(String clubName, String direction, Team team) {
        this.clubName = clubName;
        this.Direction = direction;
        this.team = team;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getDirection() {
        return Direction;
    }

    public void setDirection(String direction) {
        Direction = direction;
    }

    @Override
    public String toString() {
        return
                "Club Name: " + clubName +
                        " Direction: " + Direction;
    }

    public void historyOfClub() {
        Date actaualDate = new Date();

        System.out.println("Well funded in 14 of december of 1924 and your principal activity is the professional football.\n" +
                "it plays yours game int the stadium Miguel de sancho panza.<<Nueva Italia>> Cordaba Argentina.\n" +
                "Actually play in the first National and dispute the tournament Clausura.");
        System.out.println("Last actualitations: <" + actaualDate + ">");
    }

    public void holdADrawing(ArrayList<Partner> partners) {
        Scanner sc = new Scanner(System.in);
        int responce = 0;
        do {
            System.out.println("1.See Prize");
            System.out.println("2.See Raffle");
            responce = Integer.valueOf(sc.nextLine());
            switch (responce) {
                case 1:
                    System.out.println("First Place <:¡¡3 pair of entrance free!!:>");
                    System.out.println("Second Place <:¡¡The Team Shirt officialy of the Club!!:>");
                    System.out.println("Third Place <:!!The Hat Officialy of the Club");
                    back();

                    break;
                case 2:
                    Raffle<Partner> raffle = new Raffle<>();
                    raffle.add(new Partner("Benjamin", "Bertoldi", 27, true, false, new User()));
                    raffle.add(new Partner("Jeremias", "Bertoldi", 27, false, true, new User()));
                    raffle.add(new Partner("Candelaria", "Bertoldi", 25, true, false, new User()));
                    raffle.add(new Partner("Camila", "Bertoldi", 22, false, true, new User()));
                    raffle.add(new Partner("Florecia", "Peliza", 48, false, true, new User()));
                    raffle.add(new Partner("Julio", "Bertoldi", 48, true, false, new User()));
                    raffle.add(new Partner("Alfred", "Cernotto", 30, true, false, new User()));
                    raffle.add(new Partner("Axel", "Sanchez Tovo", 29, false, true, new User()));
                    raffle.add(new Partner("Nadia", "Bertoldi", 39, true, false, new User()));
                    raffle.add(new Partner("Lucas", "Bertoldi", 12, false, true, new User()));
                    raffle.add(new Partner("Luna", "Farias", 23, true, false, new User()));
                    raffle.addAll(partners);
                    System.out.println(raffle.remove());
                    while (!raffle.isEmpty()) {
                        System.out.println(raffle.remove() + "\n.:¡¡win one prize!!:.");
                    }
                    back();
                    break;
                default:
                    System.out.println("Try Again");
            }
        } while (responce != 0);
    }

    public void signings(ArrayList<Player> singings) {

        System.out.println("available players");
        for (Player p:
             singings) {
            System.out.println(p);
        }

        buyPlayers(singings);

    }

    private boolean buyPlayers(ArrayList<Player> signing) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert Player to Buy");
        String playersc = sc.nextLine();

        for (Player player :
                signing) {
            if ( player.getLastName().toLowerCase().equals(playersc.toLowerCase()) ) {
                System.out.println("Want you buy? " + " " + playersc);
                String res = sc.nextLine();
                if (res.equals("yes")){
                    System.out.println("congrats you adquire " + player.getFirstName() + " " + player.getLastName());
                    return true;
                }else {
                    return false;
                }
            }
        }
        System.out.println("player not available");
        return false;
    }


}
