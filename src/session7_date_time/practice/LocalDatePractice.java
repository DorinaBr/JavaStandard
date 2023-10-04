package session7_date_time.practice;

import java.time.LocalDate;

public class LocalDatePractice {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date is: " + today);

        LocalDate afterTenDays = today.plusDays(10);
        System.out.println("The date after ten days will be: " + afterTenDays);

        if (today.isBefore(afterTenDays)) {
            System.out.println(today + " is before " + afterTenDays);
        }
    }
}
