package sprint;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;

public class CalendarBuilder {

    public static String buildCalendar(String monthName, int year) {
        Month month = Month.valueOf(monthName.toUpperCase());
        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate firstDay = yearMonth.atDay(1);
        int lengthOfMonth = yearMonth.lengthOfMonth();

        StringBuilder calendar = new StringBuilder();
        calendar.append(monthName.toUpperCase()).append(" ").append(year).append("\n");
        calendar.append("Mon Tue Wed Thu Fri Sat Sun\n");

        
        int startDay = firstDay.getDayOfWeek().getValue(); // Monday = 1, Sunday = 7

        int currentDay = 1;

        
        for (int i = 1; i < startDay; i++) {
            calendar.append("    ");
        }

        while (currentDay <= lengthOfMonth) {
            DayOfWeek dayOfWeek = LocalDate.of(year, month, currentDay).getDayOfWeek();
            int dayValue = dayOfWeek.getValue();

            
            if (currentDay < 10) {
                calendar.append("  ").append(currentDay);
            } else {
                calendar.append(" ").append(currentDay);
            }

            
            if (dayValue == 7 || currentDay == lengthOfMonth) {
                calendar.append("\n");
            } else {
                calendar.append(" ");
            }

            currentDay++;
        }

        
        return calendar.toString().stripTrailing();
    }
}
