package team.players;

import people.People;
import team.TrainingStatistics;

public class Player extends People {
    private int number;
    private String position;
    private int height;
    private int weight;
    private int salary;
    private PlayerStatistics statistics;
    private TrainingStatistics trainingStatistics;

    public Player(String firstName, String lastName, int age, int number, String position, int height, int weight, PlayerStatistics playerStatistics, TrainingStatistics trainingStatistics) {
        super(firstName, lastName, age);
        this.number = number;
        this.position = position;
        this.height = height;
        this.weight = weight;
        this.statistics = playerStatistics;
        this.trainingStatistics = trainingStatistics;

    }

    public Player() {
        super();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    public String  getStatistics() {
        return statistics.toString();
    }

    public String getTrainingStatistics(){
        return this.trainingStatistics.toString();
    }

    public void setStatistics(PlayerStatistics statistics) {
        this.statistics = statistics;
    }

    public void setTrainingStatistics(TrainingStatistics trainingStatistics){ this.trainingStatistics = trainingStatistics; }

    @Override
    public String toString() {
        return "Players" + "\n" +
                super.toString() +
                " - Number: " + number +
                " - Position: " + position +
                " - Height: " + height + " Cm " +
                " - Weight: " + weight + " Kg - ";
    }


}
