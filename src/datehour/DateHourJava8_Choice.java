package datehour;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateHourJava8_Choice {
    public static void main(String[] args) {

        // LocalDateTime - Data + Hora

        // Instant - Data + Hora + GMT

        // ZonedDateTime - Data + Hora + Fuso Horário

        Instant now = Instant.now();
//    now.plus(5, ChronoUnit.MONTHS);

        ZonedDateTime atZone = now.atZone(ZoneId.of("America/Sao_Paulo"));
        System.out.println(now);
        System.out.println(atZone);
        ZonedDateTime plusMonths = atZone.plusMonths(1);
    }
}
