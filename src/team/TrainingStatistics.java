package team;

public class TrainingStatistics {
    private int strength;
    private int resistance;
    private int topSpeed;
    private int flexiblility;

    public TrainingStatistics(int strength, int resistance, int topSpeed, int flexiblility) {
        this.strength = strength;
        this.resistance = resistance;
        this.topSpeed = topSpeed;
        this.flexiblility = flexiblility;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getFlexiblility() {
        return flexiblility;
    }

    public void setFlexiblility(int flexiblility) {
        this.flexiblility = flexiblility;
    }

    @Override
    public String toString() {
        return
                "strength:" + strength + " N" + "-" +
                " resistance: " + resistance + " Ω" + "-" +
                " topSpeed:" + topSpeed + " K/hs" + "-" +
                " flexiblility:" + flexiblility + " IFG" + "-";
    }
}

