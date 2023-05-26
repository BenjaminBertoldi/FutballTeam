package UIMenu;
import game.Die;
import people.User;
import club.*;
import team.*;
import team.players.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Uimenu {
    public static Calendar calendar = new GregorianCalendar();
    public static Partner partner;

    static Team team1 = new Team("Chavos Football");

    static Club club = new Club("Tovichas Club","Huberman 1750 - Nueva Italia - Cordoba",team1 );
    static ArrayList<Partner> partners = new ArrayList<>();
    static Stadium  s = new Stadium(1000,14000);
    static Die d = new Die();



    public static void showMenu() {

        System.out.println("Welcome to Tovicha Fotball Club");

        int responce = 0;

        do {
            System.out.println("1. Club");
            System.out.println("2. Team");
            System.out.println("3. See Game on live");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            responce = Integer.valueOf(sc.nextLine());

            switch (responce) {
                case 1:
                    Uimenu.showClubMenu();
                    break;
                case 2:
                    showTeamMenu();
                    break;
                case 3:
                    showGameMenu();
                    break;
                case 0:
                    System.out.println("Thanks for your vicit");
                    break;
            }

        } while (responce != 0);


    }

    public static void showClubMenu() {

        System.out.println("Club");
        int responce = 0;
        do {
            System.out.println("1. Field");
            System.out.println("2. Stadium");
            System.out.println("3. Partner");
            System.out.println("4. Sponsor");
            System.out.println("5. President");
            System.out.println("6. Club");
            System.out.println("0. Back");


            Scanner sc = new Scanner(System.in);
            responce = Integer.valueOf(sc.nextLine());

            switch (responce) {
                case 1:
                    System.out.println(new Field(105, 70).toString());
                    back();
                    break;
                case 2:
                    Uimenu.showStadiumMenu();
                    break;
                case 3:
                    Scanner imput = new Scanner(System.in);
                    int responce3 = 0;
                    do {
                        System.out.println("1. Create User");
                        System.out.println("2. Insert User");
                        System.out.println("0. Back");
                        responce3 = Integer.valueOf(sc.nextLine());

                        switch (responce3) {
                            case 1:
                                Uimenu.createUser();
                                back();
                                System.out.println("User Crate Successfully");
                                break;
                            case 2:
                                insertUser(partner);
                                break;
                            case 0:
                                break;
                        }

                    } while (responce3 != 0);

                    break;
                case 4:
                    Sponsor sp1 = new Sponsor("Coca Cola");
                    Sponsor sp2 = new Sponsor("Garbarino");
                    Sponsor sp3 = new Sponsor("Samsung");
                    System.out.println("Sponsor List");
                    System.out.println(sp1);
                    System.out.println(sp2);
                    System.out.println(sp3);
                    back();
                    break;
                case 5:
                    President prdt1 = new President("Alfredo Fransisco", " Cantillo", 52, "Consist of first divition of Rugby in the Club");
                    System.out.println(prdt1);
                    back();
                    break;
                case 6:
                    clubMenu();
                    break;
                case 0:
                    break;

            }

        } while (responce != 0);
    }

    public static void createUser() {
        User user = new User();
        String firstName = "";
        String lastName = "";
        String email= "";
        String address = "";
        int age, idCard, creditCardNumber, option;
        boolean adherentPartner, activePartner;

        Scanner imput = new Scanner(System.in);

        System.out.println(" Create User ");
        System.out.println(" First Name:");
        firstName = imput.next();
        System.out.println(" Last Name:");
        lastName = imput.next();
        System.out.println(" Age:");
        age = imput.nextInt();
        System.out.println(" ID Card:");
        idCard = imput.nextInt();
        user.setIdCard(idCard);
        System.out.println(" Address:");
        address = imput.next();
        user.setAddress(address);
        System.out.println(" Email:");
        email = imput.next();
        user.setEmail(email);
        System.out.println(" Insert Credit Card Number:");
        creditCardNumber = imput.nextInt();
        user.setCreditCardNumber(creditCardNumber);
        System.out.println("select 1 for Active User , Select 2 for Adherent User");

        option = imput.nextInt();
        if (option == 1) {
            adherentPartner = false;
            activePartner = true;
            System.out.println("¡¡User created susses!! ");
        } else if (option == 2) {
            adherentPartner = true;
            activePartner = false;
            System.out.println("¡¡User created susses!! ");
        } else {
            System.out.println("Wrong choise, selecting default");
            adherentPartner = false;
            activePartner = true;
        }

        partner = new Partner(firstName, lastName, age, adherentPartner, activePartner, user);
    }

    public static boolean insertUser(Partner partner) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Inser Email registred");
        String emailImput = imput.nextLine();

        if (partner == null) {
            System.out.println(" Don´t user created ");
            return false;
        } else if (partner.getUser().getEmail().equals(emailImput)) {
            System.out.println("Welcome " + partner.getFirstName());
            System.out.println(partner);
            return true;
        } else {
            System.out.println("Email not registred");
            return false;
        }
    }


    public static void showTeamMenu() {

        System.out.println("Team Menu");
        int responce = 0;
        do {
            System.out.println("1. Players");
            System.out.println("2. Technician");
            System.out.println("0. Back");

            Scanner sc = new Scanner(System.in);
            responce = Integer.valueOf(sc.nextLine());

            switch (responce) {
                case 1:
                    System.out.println("1. Players");
                    showPlayerMenu();
                    break;
                case 2:
                    System.out.println("2. Technician");
                    showTechnicianMenu();
                    break;
                case 0:
                    System.out.println("0. Back");
                    break;
            }


        } while (responce != 0);
    }

    public static void showPlayerMenu() {

        System.out.println("Player List");
        int responce = 0;
        do {
            System.out.println("1. GoalKeepers");
            System.out.println("2. Defences");
            System.out.println("3. Midfielders");
            System.out.println("4. Strikers");
            System.out.println("0. Back");

            Scanner sc = new Scanner(System.in);
            responce = Integer.valueOf(sc.nextLine());

            switch (responce) {
                case 1:
                    createTeam();
                    for (Player p :
                            createTeam().getPlayers()) {
                        if (p instanceof Goalkeeper) {
                            System.out.println(p);
                        }
                    }

                    System.out.println();
                    int responce1 = 0;
                    do {
                        System.out.println("1. Player Stadistics");
                        System.out.println("2. Training Stadistics");
                        System.out.println("select 0 to back");
                        responce1 = Integer.valueOf(sc.nextLine());
                        switch (responce1) {
                            case 1:
                                createTeam();
                                for (Player p :
                                        createTeam().getPlayers()) {
                                    if (p instanceof Goalkeeper) {
                                        System.out.println(p.getFirstName() + p.getLastName() + p.getStatistics());
                                    }
                                }
                                back();
                                break;
                            case 2:
                                createTeam();
                                for (Player p :
                                        createTeam().getPlayers()) {
                                    if (p instanceof Goalkeeper) {
                                        System.out.println(p.getFirstName() + p.getLastName() + p.getTrainingStatistics());
                                    }
                                }
                                back();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Try Again");
                        }
                    } while (responce1 != 0);
                    break;
                case 2:
                    createTeam();
                    for (Player p :
                            createTeam().getPlayers()) {
                        if (p instanceof Defence) {
                            System.out.println(p);
                        }
                    }
                    System.out.println();
                    int responce2 = 0;
                    do {
                        System.out.println("1. Player Stadistics");
                        System.out.println("2. Training Stadistics");
                        System.out.println("select 0 to back");
                        responce2 = Integer.valueOf(sc.nextLine());
                        switch (responce2) {
                            case 1:
                                createTeam();
                                for (Player p :
                                        createTeam().getPlayers()) {
                                    if (p instanceof Defence) {
                                        System.out.println(p.getFirstName() + p.getLastName() + p.getStatistics());
                                    }
                                }
                                back();
                                break;
                            case 2:
                                createTeam();
                                for (Player p :
                                        createTeam().getPlayers()) {
                                    if (p instanceof Defence) {
                                        System.out.println(p.getFirstName() + p.getLastName() + p.getTrainingStatistics());
                                    }
                                }
                                back();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Try Again");
                        }
                    } while (responce2 != 0);
                    break;
                case 3:
                    createTeam();
                    for (Player p :
                            createTeam().getPlayers()) {
                        if (p instanceof Midfielder) {
                            System.out.println(p);
                        }
                    }
                    System.out.println();
                    int responce3 = 0;
                    do {
                        System.out.println("1. Player Stadistics");
                        System.out.println("2. Training Stadistics");
                        System.out.println("select 0 to back");
                        responce3 = Integer.valueOf(sc.nextLine());
                        switch (responce3) {
                            case 1:
                                createTeam();
                                for (Player p :
                                        createTeam().getPlayers()) {
                                    if (p instanceof Midfielder) {
                                        System.out.println(p.getFirstName() + p.getLastName() + p.getStatistics());
                                    }
                                }
                                back();
                                break;
                            case 2:
                                createTeam();
                                for (Player p :
                                        createTeam().getPlayers()) {
                                    if (p instanceof Midfielder) {
                                        System.out.println(p.getFirstName() + p.getLastName() + p.getTrainingStatistics());
                                    }
                                }
                                back();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Try Again");
                        }
                    } while (responce3 != 0);
                    break;
                case 4:
                    createTeam();
                    for (Player p :
                            createTeam().getPlayers()) {
                        if (p instanceof Striker) {
                            System.out.println(p);
                        }
                    }
                    int responce4 = 0;
                    do {
                        System.out.println("1. Player Stadistics");
                        System.out.println("2. Training Stadistics");
                        System.out.println("select 0 to back");
                        responce4 = Integer.valueOf(sc.nextLine());
                        switch (responce4) {
                            case 1:
                                createTeam();
                                for (Player p :
                                        createTeam().getPlayers()) {
                                    if (p instanceof Striker) {
                                        System.out.println(p.getFirstName() + p.getLastName() + p.getStatistics());
                                    }
                                }
                                back();
                                break;
                            case 2:
                                for (Player p :
                                        createTeam().getPlayers()) {
                                    if (p instanceof Striker) {
                                        System.out.println(p.getFirstName() + p.getLastName() + p.getTrainingStatistics());
                                    }
                                }
                                back();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Try Again");
                        }
                    } while (responce4 != 0);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Try Again");
            }

        } while (responce != 0);

    }

    public static void showTechnicianMenu() {

        int responce = 0;
        do {
            System.out.println("1. Coach");
            System.out.println("2. Team Medical");
            System.out.println("0. Back");

            Scanner sc = new Scanner(System.in);
            responce = Integer.valueOf(sc.nextLine());

            switch (responce) {
                case 1:
                    System.out.println(createTeam().getCoach());
                    System.out.println();
                    back();
                    break;
                case 2:
                    System.out.println(createTeam().getMedicals());
                    System.out.println();
                    back();
                    break;

            }

        } while (responce != 0);
    }

    public static Team createTeam() {
        ArrayList<Player> goalkeepers = new ArrayList<>();
        goalkeepers.add(new Goalkeeper("Hector ", " baley ", 27, 03, " Main Goalkeeper ", 170, 70, 34, new PlayerStatistics(0, 0, 5, 7, 4, 3, 0), new TrainingStatistics(143, 321, 17, 64)));
        goalkeepers.add(new Goalkeeper("Usbaldo ", " Fillol ", 27, 05, " Second Goalkeeper ", 170, 70, 64, new PlayerStatistics(0, 0, 34, 6, 48, 2, 1), new TrainingStatistics(156, 345, 19, 71)));
        goalkeepers.add(new Goalkeeper("Ricardo ", " La Volpe ", 26, 13, " Second Goalkeeper ", 170, 70, 14, new PlayerStatistics(0, 0, 25, 6, 40, 5, 0), new TrainingStatistics(123, 342, 15, 65)));
        ArrayList<Player> defences = new ArrayList<>();
        defences.add(new Defence("Luis ", " Galvan ", 30, 07, " Left Defence", 170, 70, 32, new PlayerStatistics(0, 0, 5, 7, 4, 3, 0), new TrainingStatistics(143, 321, 17, 64)));
        defences.add(new Defence("Daniel ", " Killer ", 28, 11, " Right Defence", 170, 70, 25, new PlayerStatistics(0, 2, 15, 20, 14, 3, 0), new TrainingStatistics(156, 300, 18, 60)));
        defences.add(new Defence("Miguel ", " Oviedo ", 27, 17, " Left Defence", 170, 70, 43, new PlayerStatistics(1, 5, 34, 13, 5, 6, 2), new TrainingStatistics(165, 321, 16, 52)));
        defences.add(new Defence("Jorge Mario ", " Olguín ", 26, 17, " Central Defence", 170, 70, 32, new PlayerStatistics(0, 2, 64, 12, 7, 4, 0), new TrainingStatistics(134, 400, 10, 60)));
        defences.add(new Defence("Rubén ", " Pagnanini ", 29, 18, " Right Defence", 170, 70, 50, new PlayerStatistics(1, 3, 80, 32, 30, 5, 0), new TrainingStatistics(200, 321, 15, 65)));
        defences.add(new Defence("Daniel ", " Passarella ", 25, 19, " Central Defence", 170, 70, 32, new PlayerStatistics(0, 0, 5, 7, 4, 3, 0), new TrainingStatistics(143, 300, 17, 60)));
        defences.add(new Defence("Alberto ", " Tarantini ", 22, 20, " Central Defence", 170, 70, 40, new PlayerStatistics(1, 2, 13, 7, 5, 4, 1), new TrainingStatistics(187, 298, 15, 70)));
        ArrayList<Player> midfielders = new ArrayList<>();
        midfielders.add(new Midfielder("Norberto ", " Alonso ", 25, 01, " Central Midfielder", 170, 70, 45, new PlayerStatistics(1, 4, 20, 0, 7, 5, 3), new TrainingStatistics(203, 401, 16, 42)));
        midfielders.add(new Midfielder("Osvaldo ", " Ardiles ", 25, 02, " Left Midfielder", 170, 70, 38, new PlayerStatistics(3, 9, 32, 6, 6, 1, 0), new TrainingStatistics(243, 354, 18, 53)));
        midfielders.add(new Midfielder("Americo ", " Gallego ", 23, 06, " Rigth Midfielder", 170, 70, 28, new PlayerStatistics(0, 5, 26, 7, 14, 10, 5), new TrainingStatistics(308, 116, 17, 92)));
        midfielders.add(new Midfielder("Ruben ", " Galvan ", 26, 8, " Central Midfielder", 170, 70, 65, new PlayerStatistics(1, 9, 26, 0, 6, 5, 2), new TrainingStatistics(204, 326, 15, 32)));
        midfielders.add(new Midfielder("Omar ", " Larrosa ", 30, 12, " Rigth Midfielder", 170, 70, 54, new PlayerStatistics(0, 5, 32, 0, 9, 1, 0), new TrainingStatistics(411, 243, 16, 42)));
        midfielders.add(new Midfielder("Jose Daniel ", " Valencia ", 22, 21, " Central Midfielder", 170, 70, 38, new PlayerStatistics(0, 9, 43, 12, 3, 0, 0), new TrainingStatistics(500, 300, 14, 70)));
        midfielders.add(new Midfielder("Ricardo ", " Villa ", 25, 22, " Left Midfielder", 170, 70, 41, new PlayerStatistics(2, 14, 41, 4, 20, 15, 0), new TrainingStatistics(278, 302, 14, 65)));
        ArrayList<Player> strikers = new ArrayList<>();
        strikers.add(new Striker("Daniel ", " Bertoni ", 23, 04, " Central Striker ", 170, 70, 46, new PlayerStatistics(30, 25, 65, 5, 0, 0, 0), new TrainingStatistics(342, 578, 20, 45)));
        strikers.add(new Striker("René ", " Houseman ", 24, 9, " Left Striker ", 170, 70, 67, new PlayerStatistics(23, 42, 34, 2, 1, 0, 0), new TrainingStatistics(421, 602, 19, 76)));
        strikers.add(new Striker("Mario Alberto ", " Kempes ", 23, 10, " Right Striker ", 170, 70, 560, new PlayerStatistics(301, 200, 45, 0, 5, 3, 1), new TrainingStatistics(500, 720, 23, 98)));
        strikers.add(new Striker("Loepardo Jacinto ", " Luque ", 29, 14, " Central Striker ", 170, 70, 65, new PlayerStatistics(67, 49, 54, 8, 5, 2, 1), new TrainingStatistics(321, 444, 16, 76)));
        strikers.add(new Striker("Oscar ", " Ortiz ", 25, 16, " Right Striker ", 170, 70, 67, new PlayerStatistics(78, 54, 75, 7, 6, 3, 1), new TrainingStatistics(643, 321, 17, 44)));
        Coach coach = new Coach("Cesar Luis", "Menotti", 76, 34);
        MedicalTeam medicalTeam = new MedicalTeam();
        medicalTeam.addMedicals(new Medical("joe", "doe", 25, "Psychical Therapist"));
        medicalTeam.addMedicals(new Medical("Pepe", "Carlos", 42, "Psychological Therapist"));
        medicalTeam.addMedicals(new Medical("Raul", "Alonzo", 37, "Nurse"));
        medicalTeam.addMedicals(new Medical("Luciana", "Pereira", 26, "Doctor"));
        ArrayList<Player> players = new ArrayList<>();
        players.addAll(goalkeepers);
        players.addAll(defences);
        players.addAll(midfielders);
        players.addAll(strikers);
        Team pt = new Team("Tovichas Club", new TeamStatistics(1200, 1342, 1042, 300, 0), medicalTeam, coach, players);
        return pt;


    }

    public static void showStadiumMenu() {
        int seatAvailable = s.getSeatGeneral() + s.getSeatPremium();

        int responce2 = 0;
        System.out.println("Buy Entrance");
         do {
            System.out.println("1. Seat General");
            System.out.println("2. Seat Premium");
            System.out.println("3. Seat Available");
            System.out.println("0. Back");

            Scanner sc = new Scanner(System.in);
            responce2 = Integer.valueOf(sc.nextLine());
            switch (responce2) {
                case 1:
                    System.out.println("Selet numbers of seat");
                    int seatsg = sc.nextInt();
                    s.soldAvailableSeatGeneral(seatsg);
                    break;
                case 2:
                    System.out.println("Selet numbers of seat");
                    int seatsp = sc.nextInt();
                    s.soldAvailableSeatPremium(seatsp);
                    break;
                case 3:
                    System.out.println("seat general: " + s.getAvailableSeatGeneral() +" seat premium: " + s.getAvailableSeatPremium());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Try Again");
            }

        } while (responce2 != 0);

    }

    public static void showGameMenu() {

        int teams1 = team1.throwdice(d);
        int teams2 = createTeam().throwdice(d);


        if (teams1 > teams2) {
            System.out.println(" win " + team1.getTeamName());
        }else {
            System.out.println(" win " + createTeam().getTeamName());
        }
    }
    public static void clubMenu() {
        ArrayList<Player> ps = new ArrayList<>();
        ps.add(new Player("Elias", "Alderete", 28, 19, "Sriker", 70, 170, new PlayerStatistics(9, 4, 10, 8, 3, 1, 0), new TrainingStatistics(100, 100, 100, 100)));
        ps.add(new Player("Leandro", "Gimenez", 23, 9, "Sriker", 70, 170, new PlayerStatistics(3, 4, 10, 8, 3, 1, 0), new TrainingStatistics(100, 100, 100, 100)));
        ps.add(new Player("Edgardo", "Hoyos", 23, 17, "Midfielder", 70, 170, new PlayerStatistics(4, 6, 20, 8, 3, 1, 0), new TrainingStatistics(100, 100, 100, 100)));
        ps.add(new Player("Alejandro", "Cuellos", 29, 8, "Midfielder", 70, 170, new PlayerStatistics(2, 5, 24, 8, 3, 1, 0), new TrainingStatistics(100, 100, 100, 100)));
        ps.add(new Player("Fernando", "Quiroz", 25, 3, "Defence", 70, 170, new PlayerStatistics(2, 3, 30, 8, 3, 1, 0), new TrainingStatistics(100, 100, 100, 100)));
        ps.add(new Player("Emanuel", "lettieri", 26, 6, "Defence", 70, 170, new PlayerStatistics(0, 3, 32, 8, 3, 1, 0), new TrainingStatistics(100, 100, 100, 100)));
        ps.add(new Player("Gaston", "Brambatti", 32, 1, "Goalkeeper", 70, 170, new PlayerStatistics(0, 0, 10, 8, 3, 1, 0), new TrainingStatistics(100, 100, 100, 100)));

        Scanner sc = new Scanner(System.in);
        int response1 = 0;
        do {
            System.out.println("1.History of Club");
            System.out.println("2.Hold a Drawing");
            System.out.println("3.Buy Player");
            System.out.println("0.Back");
            response1 = Integer.valueOf(sc.nextLine());
            switch (response1) {
                case 1:
                    club.historyOfClub();
                    break;
                case 2:
                    club.holdADrawing(partners);
                    break;
                case 3:
                    club.signings(ps);
                    break;
                case 0:
                    break;
            }
        } while (response1 != 0);
    }
    public static void back(){
        Scanner sc = new Scanner(System.in);
        int responce1 = 0;
        do {
            System.out.println("select 0 to back");
            responce1 = Integer.valueOf(sc.nextLine());
            switch (responce1) {
                case 0:
                    break;
                default:
                    System.out.println("Try Again");
            }
        } while (responce1 != 0);
    }
}
