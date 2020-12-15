package datehour;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DateHourJava8_Period {
    public static void main(String[] args) {

        Period of = Period.of(1, 5, 0);
        System.out.println(of);

        Period years = Period.ofYears(5);
        System.out.println(years);

        LocalDate ld = LocalDate.of(1990, Month.AUGUST, 6);
        LocalDate ld2 = ld.plusWeeks(2).plusDays(1).plusMonths(1);
        Period between = Period.between(ld, ld2);
        System.out.println(between);

        Period between2 = between.plusDays(10);
        System.out.println(between2);

        Period until = ld.until(ld2);
        System.out.println(until);

        LocalDate plus = ld.plus(years);
        System.out.println(plus);

//    LocalTime ltNow = LocalTime.now();
//    LocalTime plus2 = ltNow.plus(years);
//    System.out.println(plus2);

        LocalDate date = LocalDate.of(1990, Month.AUGUST, 6);
        LocalDate now = LocalDate.now();
        Period between3 = Period.between(date, now);
        System.out.println(between3);
    }
}
