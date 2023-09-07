package review_Interface;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2022,1,28);
       date= date.plusDays(4);
        date= date.plusWeeks(5);
        System.out.println(date);
    }
}
