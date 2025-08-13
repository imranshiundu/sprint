package sprint;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayChecker {

    public static String checkDayType(LocalDate date) {
            DayOfWeek day = date.getDayOfWeek();

                    switch (day) {
                                case WEDNESDAY:
                                                return "Hump Day!";
                                                            case SATURDAY:
                                                                        case SUNDAY:
                                                                                        return "Weekend";
                                                                                                    default:
                                                                                                                    return "Weekday";
                                                                                                                            }
                                                                                                                                }
                                                                                                                                }