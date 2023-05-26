package team.players;

import team.TrainingStatistics;

public class Goalkeeper extends Player {
    private int interruptions;


    public Goalkeeper(String firstName, String lastName, int age, int number, String position, int height, int weight, int interruptions, PlayerStatistics playerStatistics, TrainingStatistics trainingStatistics ) {
        super(firstName, lastName, age, number, position, height, weight, playerStatistics, trainingStatistics);
        this.interruptions = interruptions;

    }

    public Goalkeeper(int interruptions) {
        this.interruptions = interruptions;
    }

    public int getInterruptions() {
        return interruptions;
    }

    public void setInterruptions(int interruptions) {
        this.interruptions = interruptions;
    }

    @Override
    public String toString() {
        return "Goalkeeper: "  + super.toString() ;
    }
}
