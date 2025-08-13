package sprint;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekendCalculator {

    public long countWeekendDays(LocalDate start, LocalDate end) {
            long count = 0;

                    // Ensure start is before or equal to end
                            if (start.isAfter(end)) {
                                        return 0;
                                                }

                                                        LocalDate current = start;

                                                                while (!current.isAfter(end)) {
                                                                            DayOfWeek day = current.getDayOfWeek();
                                                                                        if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
                                                                                                        count++;
                                                                                                                    }
                                                                                                                                current = current.plusDays(1);
                                                                                                                                        }

                                                                                                                                                return count;
                                                                                                                                                    }
                                                                                                                                                    }