package team.players;

import team.TrainingStatistics;

public class Defence extends Player {
    private int ballDefended;

    public Defence(String firstName, String lastName, int age, int number, String position, int height, int weight,int ballDefended, PlayerStatistics playerStatistics, TrainingStatistics trainingStatistics) {
        super(firstName, lastName, age, number, position, height, weight, playerStatistics, trainingStatistics);
        this.ballDefended = ballDefended;
    }

    public Defence(int ballDefended) {
        this.ballDefended = ballDefended;
    }

    public int getBallDefended() {
        return ballDefended;
    }

    public void setBallDefended(int ballDefended) {
        this.ballDefended = ballDefended;
    }

    @Override
    public String toString() {
        return "Defence" + super.toString();

    }
}
