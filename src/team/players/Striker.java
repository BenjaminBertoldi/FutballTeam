package team.players;

import team.TrainingStatistics;

public class Striker extends Player {
    private int chanceOfGoals;

    public Striker(String firstName, String lastName, int age, int number, String position, int height, int weight,int chanceOfGoals, PlayerStatistics playerStatistics, TrainingStatistics trainingStatistics) {
        super(firstName, lastName, age, number, position, height, weight, playerStatistics, trainingStatistics);
        this.chanceOfGoals = chanceOfGoals;
    }
    public void hitTheBall(){
        System.out.println("you hit the ball");
    }

    public Striker(int chanceOfGoals) {
        this.chanceOfGoals = chanceOfGoals;
    }

    public int getChanceOfGoals() {
        return chanceOfGoals;
    }

    public void setChanceOfGoals(int chanceOfGoals) {
        this.chanceOfGoals = chanceOfGoals;
    }

    @Override
    public String toString() {
        return "Striker: " + super.toString();
    }
}
