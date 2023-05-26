package team;

import java.util.ArrayList;
import java.util.List;

public class MedicalTeam {
    private List<Medical> medicals = new ArrayList<>();

    public MedicalTeam(List<Medical> medicals) {
        this.medicals = medicals;
    }


    public MedicalTeam() {
    }

    public List<Medical> getMedicals() {
        return medicals;
    }

    public void addMedicals(Medical medicals) {
        this.medicals.add(medicals);
    }

    @Override
    public String toString() {
        return "MedicalTeam: " +
                "medicals: " + medicals;
    }
}
