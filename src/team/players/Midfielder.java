package team.players;

import team.TrainingStatistics;

public class Midfielder extends Player {

    private int sideline;

    public Midfielder(String firstName, String lastName, int age, int number, String position, int height, int weight,int sideline, PlayerStatistics playerStatistics, TrainingStatistics trainingStatistics) {
        super(firstName, lastName, age, number, position, height, weight, playerStatistics, trainingStatistics);
        this.sideline = sideline;
    }

    public Midfielder(int sideline) {
        this.sideline = sideline;
    }

    public int getSideline() {
        return sideline;
    }

    public void setSideline(int sideline) {
        this.sideline = sideline;
    }

    public String showPosition(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Midfielder" +super.toString();
    }
}
