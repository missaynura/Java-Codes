package day21datetimestringbuilder;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        //---------------------------- Date and Time ------------------------------------
        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime); //16:24:48.915160600

        //how to format time
        // hh uses 12 hour system
        //HH uses 24 hour system
        //Using lowercase a = "hh:mm a"= at the end will display am or pm at the end depending on time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String myTime = dtf.format(currentTime);
        System.out.println(myTime); //04:28 pm

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);//2023-04-18T16:33:13.843430800

        LocalDateTime ldtJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(ldtJapan);//2023-04-19T00:34:49.899014600

    }
}
