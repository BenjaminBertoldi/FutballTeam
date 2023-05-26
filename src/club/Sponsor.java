package club;

import team.Medical;

import java.util.ArrayList;
import java.util.List;

public class Sponsor {
    private String hallmarkAgherent;



    public Sponsor(String hallmarkAgherent) {
        this.hallmarkAgherent = hallmarkAgherent;
    }

    public Sponsor() {
    }

    public String getHallmarkAgherent() {
        return hallmarkAgherent;
    }

    public void setHallmarkAgherent(String hallmarkAgherent) {
        this.hallmarkAgherent = hallmarkAgherent;
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "hallmarkAgherent='" + hallmarkAgherent + '\'' +
                '}';
    }
}
