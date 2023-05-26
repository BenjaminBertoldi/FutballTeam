package club;

import game.Die;
import team.Coach;
import team.MedicalTeam;
import team.TeamStatistics;
import team.players.Player;

import java.util.List;

public class Team {
    private String teamName;
    private TeamStatistics teamStatistics;
    private List<Player> players;
    private MedicalTeam medicals;
    private Coach coach;

    public Team(String teamName, TeamStatistics teamStatistics, MedicalTeam medicals,Coach coach,List<Player> players) {
        this.teamName = teamName;
        this.teamStatistics = teamStatistics;
        this.medicals = medicals;
        this.coach = coach;
        this.players = players;
    }

    public Team() {
    }
    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public TeamStatistics getTeamStatistics() {
        return teamStatistics;
    }

    public void setTeamStatistics(TeamStatistics teamStatistics) {
        this.teamStatistics = teamStatistics;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public MedicalTeam getMedicals() {
        return medicals;
    }

    public void setMedicals(MedicalTeam medicals) {
        this.medicals = medicals;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    @Override
    public String toString() {
        return "Team" +
                "teamName: " + teamName + '\'' +
                " teamStatistics: " + teamStatistics +
                " players: " + players +
                " medicals: " + medicals +
                "Coach: " + coach ;
}
public int throwdice(Die d){
        return d.throwDie();
}
}

