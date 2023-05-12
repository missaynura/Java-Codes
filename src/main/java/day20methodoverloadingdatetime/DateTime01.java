package day20methodoverloadingdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        //How to get current date
        LocalDate currentDate=LocalDate.now();
        System.out.println(currentDate);//2023-04-18

        //how to get components of the date
        System.out.println(currentDate.getYear());//2023
        System.out.println(currentDate.getMonth());//APRIL
        System.out.println(currentDate.getMonthValue());//4
        System.out.println(currentDate.getDayOfWeek());//TUESDAY
        System.out.println(currentDate.getDayOfMonth());// 18

        //how to get current date in a specific zone
        System.out.println(LocalDate.now(ZoneId.of("Asia/Tokyo")));//2023-04-18

        //how to go future and past
        System.out.println(currentDate.plusYears(3).plusMonths(2).plusDays(12));//2026-06-30
        System.out.println(currentDate.minusYears(4).minusMonths(23).minusDays(11));//2017-05-07

        //E1.: john was born 12 years 5 months 11 days ago. type code to find the day name of John's birth date
        System.out.println(currentDate.minusYears(12).minusMonths(5).minusDays(23).getDayOfWeek());//TUESDAY

        //how to compare two dates
        LocalDate dobTom = LocalDate.of(2011, Month.JULY, 21);

        LocalDate dobJim = LocalDate.of(2007, 3, 13);

        System.out.println(dobTom.isAfter(dobJim)); //true
        System.out.println(dobJim.isBefore(dobTom));//true

        //E2. type code for booking application. if booking date is before current date give an error message booking date cannot be past date
        // if booking date equals current date give a message like we will call you when we have availability
        // if booking date is after current date give a message like the ticket was booked.

        Scanner input = new Scanner(System.in);
        System.out.println("enter year with 4 digits to book a ticket");
        int year = input.nextInt();

        System.out.println("enter month number to book a ticket");
        int month = input.nextInt();

        System.out.println("enter day number to book a ticket");
        int day = input.nextInt();

        LocalDate bookingDate = LocalDate.of(year, month, day);

        if(bookingDate.isBefore(currentDate)){
            System.out.println("booking date cannot be past date");
        } else if (bookingDate.equals(currentDate)) {
            System.out.println("we will call you when we have availability");
        }else{
            System.out.println("the ticket was booked");
        }

        //e3. type code to find the day name of your birth
        LocalDate myDob=LocalDate.of(1994, 2, 11);
        DayOfWeek dayNme = myDob.getDayOfWeek();
        System.out.println(dayNme);//Friday

        //How to format date
        LocalDate current = LocalDate.now();
        System.out.println(current);//2023-04-18

        //m is reserved for minutes, thats why we use M for month
        //M makes month number single digit if it is less that 10
        //MM makes month number two digits if it is less than 10
        //MMM prints the first 3 characters of month name
        // MMMM prints full name of the month
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String myDate=dtf.format(current);
        System.out.println(myDate);//18/04/2023

    }
}
