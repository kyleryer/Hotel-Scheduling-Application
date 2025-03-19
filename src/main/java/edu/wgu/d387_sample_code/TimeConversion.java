package edu.wgu.d387_sample_code;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {

    public static String convertTime() {

        ZonedDateTime time = ZonedDateTime.now();

        ZonedDateTime ET = time.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime MT = time.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime UTC = time.withZoneSameInstant(ZoneId.of("UTC"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");

        return ET.format(formatter) + " ET, " + MT.format(formatter) + " MT, " + UTC.format(formatter) + " UTC";
    }
}
