package school.ch1.together.study.ch17_api.project2.view;

import school.ch1.together.study.ch17_api.project2.controller.LeapController;

import java.util.Calendar;

public class LeapView {
    public LeapView() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int currentDay = Calendar.getInstance().get(Calendar.DAY_OF_YEAR);

        LeapController controller = new LeapController();
        boolean isLeapYear = controller.isLeapYear(currentYear);
        long totalDays = controller.leapDate(Calendar.getInstance());

        System.out.println(currentYear + "년은 " + (isLeapYear ? "윤년" : "평년") + "입니다.");
        System.out.println("총 날짜 수: " + totalDays);
    }
}