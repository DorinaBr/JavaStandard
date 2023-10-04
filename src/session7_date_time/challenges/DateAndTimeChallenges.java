package session7_date_time.challenges;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;


public class DateAndTimeChallenges {
    public static void main(String[] args) {
//        displayTodaysDate();
//        displayDateComponents("2023-09-25");
//        createSpecificDate();
//        areDatesEqual();
//        isTodaySpecificDate();
//        displayCurrentTime();
//        addWeeksToToday(3);
//        findDayOfWeek();
//        daysBetween();
//        isValidDate();
//        elapsedTimeSince();
        convertToTimeZone();
    }


    public static void displayTodaysDate() {
        LocalDate currentDate = LocalDate.now();

        System.out.println("The current date is: " + currentDate);
    }

    public static void displayDateComponents(String date) {
        LocalDate currentDate = LocalDate.parse(date);

        int year = currentDate.getYear();
        System.out.println("Year: " + year);

        int month = currentDate.getMonthValue();
        System.out.println("Month: " + month);

        int day = currentDate.getDayOfMonth();
        System.out.println("Day: " + day);
    }

    public static void createSpecificDate() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("2025-9-19");
        String extractSimpleDate = dateFormat.format(date);
        System.out.println("Given date is: " + extractSimpleDate);

        dateFormat = new SimpleDateFormat("2025-8-19");
        String newDate = dateFormat.format(date);
        System.out.println("New date created: " + newDate);
    }

    public static void areDatesEqual() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date (YYYY-MM-DD): ");
        String firstDateInput = scanner.nextLine();

        System.out.println("Enter another date (YYYY-MM-DD): ");
        String secondDateInput = scanner.nextLine();
        scanner.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);
        LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);

        String result = (firstDate.equals(secondDate)) ? "True" : "False";
        System.out.println("The dates are equal: " + result);
    }

    public static void isTodaySpecificDate() {
        LocalDate today = LocalDate.now();
        LocalDate givenDate = LocalDate.parse("2019-12-10");

        String result = (givenDate.equals(today)) ? "True" : "False";
        System.out.println("Today's date is 2019-12-10: " + result);
    }

    public static void displayCurrentTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String time = formatter.format(currentDateTime);

        System.out.println("The current time is: " + time);
    }

    public static void addWeeksToToday(int numberOfWeeks) {
        LocalDate today = LocalDate.now();

        LocalDate current = today.plusWeeks(numberOfWeeks);
        System.out.println("Three weeks after today it will be: " + current);
    }

    public static void findDayOfWeek() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date (YYYY-MM-DD): ");
        String inputDate = scanner.nextLine();
        scanner.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate formattedDate = LocalDate.parse(inputDate, formatter);

        System.out.println("Today is: " + formattedDate.getDayOfWeek());
    }

    public static void daysBetween() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date (YYYY-MM-DD): ");
        String firstDateInput = scanner.nextLine();

        System.out.println("Enter another date (YYYY-MM-DD): ");
        String secondDateInput = scanner.nextLine();
        scanner.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);
        LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);

        System.out.println("Days between first date and the second date: " + secondDate.compareTo(firstDate));
    }

    public static void isValidDate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date: ");
        String dateInput = scanner.nextLine();
        scanner.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedInput = LocalDate.parse(dateInput, formatter);

        if (false) {
            System.out.println("Your input date should be of format: YYYY-MM-DD.");
        }

        String isLeapYear = (parsedInput.isLeapYear()) ? "it is a leap year." : "it is not a leap year.";

        System.out.println("You entered the correct date format and " + isLeapYear);
    }

    public static void elapsedTimeSince() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter time (HH:MM:SS) : ");
        String inputTime = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime timeConverted = LocalTime.parse(inputTime, formatter);
        LocalDateTime localDateTime = LocalDateTime.now();

        localDateTime = localDateTime.withHour(timeConverted.getHour());
        localDateTime = localDateTime.withMinute(timeConverted.getMinute());
        localDateTime = localDateTime.withSecond(timeConverted.getSecond());

        Duration duration = Duration.between(localDateTime, LocalDateTime.now());
        System.out.println("Elapsed time is: ");
        System.out.print("hours = " + duration.toHours());
        System.out.print(", minutes = " + duration.toMinutesPart());
        System.out.print(", seconds = " + duration.toSecondsPart());
    }

    public static void convertToTimeZone() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date (YYYY-MM-DD HH:MM:SS): ");
        String inputDateTime = scanner.nextLine();
        System.out.println("Enter a timezone: ");
        String inputTimeZone = scanner.nextLine();
        scanner.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(inputDateTime, formatter);

        TimeZone timeZone = TimeZone.getTimeZone(inputTimeZone);

        dateTime = dateTime.atZone(ZoneId.of("UTC")).withZoneSameInstant(timeZone.toZoneId()).toLocalDateTime();

        System.out.println("Your date at the specified timezone is: " + dateTime.format(formatter));
    }
}
