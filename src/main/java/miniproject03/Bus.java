package miniproject03;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    //--------------------------- Mini Project: Bus ---------------------
    //plate number, seat numbers
    public String plateNumber;
    public List<String> seats=new ArrayList<>();

    //when we create a Bus object plateNumber and seatNo should be present
    public Bus(String plateNumber){
        this.plateNumber=plateNumber;
        for(int i=1; i<33; i++){
            this.seats.add(i+"");// concatenate or use String.valueOf() to convert int to string

        }
    }
}
