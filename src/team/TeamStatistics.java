package team;

public class TeamStatistics {
    private int goals;
    private int machs;
    private int wonMachs;
    private int lostMachs;
    private int tiedMachs;

    public TeamStatistics(int goals, int machs, int wonMachs, int lostMachs, int tiedMachs) {
        this.goals = goals;
        this.machs = machs;
        this.wonMachs = wonMachs;
        this.lostMachs = lostMachs;
        this.tiedMachs = tiedMachs;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getMachs() {
        return machs;
    }

    public void setMachs(int machs) {
        this.machs = machs;
    }

    public int getWonMachs() {
        return wonMachs;
    }

    public void setWonMachs(int wonMachs) {
        this.wonMachs = wonMachs;
    }

    public int getLostMachs() {
        return lostMachs;
    }

    public void setLostMachs(int lostMachs) {
        this.lostMachs = lostMachs;
    }

    public int getTiedMachs() {
        return tiedMachs;
    }

    public void setTiedMachs(int tiedMachs) {
        this.tiedMachs = tiedMachs;
    }

    @Override
    public String toString() {
        return "TeamStatistics" +
                "Goals: " + goals +
                " Machs: " + machs +
                " Won Machs: " + wonMachs +
                " Lost Machs: " + lostMachs +
                " Tied Machs: " + tiedMachs ;
    }
}

