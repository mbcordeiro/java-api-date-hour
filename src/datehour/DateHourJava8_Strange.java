package datehour;

import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class DateHourJava8_Strange {

    public static void main(String[] args) {

        Locale.setDefault(Locale.forLanguageTag("pt-BR"));

        DateTimeFormatter dateTimeFormatter =
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateFormat dateFormat =
                DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);

        LocalDate localDate = LocalDate.of(1899, 8, 6);
        LocalTime localTime = LocalTime.of(23, 59);
        ZoneId zoneId = ZoneId.of("America/Sao_Paulo");

        ZonedDateTime zdt = ZonedDateTime.of(localDate, localTime, zoneId);
        Instant instant = zdt.toInstant();
        Date date = new Date(instant.toEpochMilli());

        System.out.println(dateTimeFormatter.format(zdt));
        System.out.println(dateFormat.format(date));

        System.out.println(zdt.getZone() + " - " + zdt.getOffset());
        System.out.println(date.getTimezoneOffset());

        // LMT - Local Mean Time

    }
}
