package club;

import java.util.ArrayList;

public class Stadium {
    private int availableSeatPremium;
    private int availableSeatGeneral;
    private int seatPremium;
    private int seatGeneral;
   private Field field ;

    public int getSeatPremium() {
        return seatPremium;
    }

    public Stadium(int seatPremium, int seatGeneral) {
        this.seatPremium = seatPremium;
        this.seatGeneral = seatGeneral;
        this.availableSeatGeneral = seatGeneral;
        this.availableSeatPremium = seatPremium;
    }


    public void setSeatPremium(int seatPremium) {
        this.seatPremium = seatPremium;
    }

    public int getSeatGeneral() {
        return seatGeneral;
    }

    public void setSeatGeneral(int seatGeneral) {
        this.seatGeneral = seatGeneral;
    }

    public int getAvailableSeatPremium() {
        return availableSeatPremium;
    }

    public void soldAvailableSeatPremium(int quantity) {
        if(quantity > this.availableSeatPremium){
            System.out.println("there is no available seat premium at the moment");
        }else {
            System.out.println("purchase completed");
            this.availableSeatPremium =this.availableSeatPremium - quantity;
        }

    }

    public int getAvailableSeatGeneral() {
        return availableSeatGeneral;
    }

    public void soldAvailableSeatGeneral(int quantity) {
        if (quantity >this.availableSeatGeneral){
            System.out.println("there is no available seat general at the moment");
        }else {
            System.out.println("purchace completed");
            this.availableSeatGeneral =this.availableSeatGeneral- quantity;
        }
    }



    @Override
    public String toString() {
        return "Stadium" +
                " Seat Premium: " + seatPremium +
                " Seat General: " + seatGeneral +
                " Available Seat Premium: " + availableSeatPremium +
                " Available Seat General: " + availableSeatGeneral;
    }

}
