import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Date {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println();

        LocalDate newYearsEve = LocalDate.of(2023, 12, 31);
        System.out.println(newYearsEve);
        System.out.println();


        LocalDate firstDayOfNewYear = newYearsEve.plusDays(1);
        System.out.println("New year: " + firstDayOfNewYear);
        // .plusYears
        // .plusWeeks
        // .plusMonths
        //.minus
        System.out.println();

        //System.out.println(localDate.isBefore(firstDayOfNewYear));

        boolean isBefore = localDate.isBefore(firstDayOfNewYear);
        System.out.println(isBefore);
        System.out.println();

        System.out.println("Day of week: " + newYearsEve.getDayOfWeek());
        System.out.println();

        LocalTime localTime = LocalTime.now();
        System.out.println("local time: " + localTime);
        System.out.println();

        System.out.println(localTime.minusHours(2));

        LocalTime minusMinutes = localTime.minusMinutes(15);
        System.out.println(minusMinutes);
        System.out.println();

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("date time: " + localDateTime);
    }
}
