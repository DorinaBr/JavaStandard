package session18_another_recap;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class Problem2 {

    public static void main(String[] args) {
        List<LocalDate> mondays = new ArrayList<>();

        LocalDate firstDayOfNextYear = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        LocalDate firstMonday = firstDayOfNextYear.getDayOfWeek() == DayOfWeek.MONDAY
                ? firstDayOfNextYear : firstDayOfNextYear.with(TemporalAdjusters.next(DayOfWeek.MONDAY));

        LocalDate currentMonday = firstMonday;

        while(currentMonday.getYear() == firstMonday.getYear()){
            mondays.add(currentMonday);
            currentMonday = currentMonday.plusWeeks(1);
        }

        System.out.println(mondays);
    }
}
