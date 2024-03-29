package seasonchecker;

import java.time.MonthDay;

public class SeasonChecker {

    public static String checkIfSummer(MonthDay date) {
        if (date.isAfter(MonthDay.of(6, 20)) && date.isBefore(MonthDay.of(9, 23))) {
            return "It is summer.";
        }
        return "Nope";
    }
}

