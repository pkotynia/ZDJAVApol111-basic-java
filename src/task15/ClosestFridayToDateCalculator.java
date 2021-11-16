package task15;
/*Napisz program, który wczyta datę w standardowym formacie

yyyy-MM-dd

i wypisze datę najbliższego piątku w tym samym formacie.*/

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class ClosestFridayToDateCalculator {

    public static void main(String[] args) {

        var today = "2021-11-15";

        LocalDate dateOfToday = LocalDate.parse(today);
        System.out.println("dateOfToday = " + dateOfToday);

        System.out.println("findFridayUsingSwitch(dateOfToday) = " + findFridayUsingSwitch(dateOfToday));

        System.out.println("findFridayUsingLoop(dateOfToday) = " + findFridayUsingLoop(dateOfToday));

        System.out.println("findFridayUsingTemporalAdjusters(dateOfToday) = " + findFridayUsingTemporalAdjusters(dateOfToday));

    }

    private static LocalDate findFridayUsingTemporalAdjusters(LocalDate dateOfToday) {
        return dateOfToday.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
    }

    private static LocalDate findFridayUsingLoop(LocalDate dateOfToday) {

        for (int i = 0; i < 7; i++) {
            if (dateOfToday.getDayOfWeek() != DayOfWeek.FRIDAY) {
                dateOfToday = dateOfToday.plusDays(1);
            } else {
                return dateOfToday;
            }
        }
        return dateOfToday;
    }

    private static LocalDate findFridayUsingSwitch(LocalDate dateOfToday) {
        DayOfWeek dayOfWeek = dateOfToday.getDayOfWeek();

        System.out.println("dayOfWeek = " + dayOfWeek);
        switch (dayOfWeek) {
            case MONDAY:
                dateOfToday = dateOfToday.plusDays(4);
                break;
            case TUESDAY:
                dateOfToday = dateOfToday.plusDays(3);
                break;
            case WEDNESDAY:
                dateOfToday = dateOfToday.plusDays(2);
                break;
            case THURSDAY:
                dateOfToday = dateOfToday.plusDays(1);
                break;
            case SATURDAY:
                dateOfToday = dateOfToday.plusDays(6);
                break;
            case SUNDAY:
                dateOfToday = dateOfToday.plusDays(5);
                break;
            default:
                System.out.println("It is Friday I do not need to do nothing");
        }

        return dateOfToday;
    }
}
