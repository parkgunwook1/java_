package school.ch1.together.study.ch17_api.project2.controller;
import java.util.Calendar;
public class LeapController {
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public long leapDate(Calendar c) {
        int currentYear = c.get(Calendar.YEAR);
        int currentDay = c.get(Calendar.DAY_OF_YEAR);

        long totalDays = 0;
        for (int year = 1; year < currentYear; year++) {
            totalDays += isLeapYear(year) ? 366 : 365;
        }

        totalDays += currentDay;
        return totalDays;
    }
}