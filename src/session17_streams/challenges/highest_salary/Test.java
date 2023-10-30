package session17_streams.challenges.highest_salary;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Bob","Marley", 2500, Department.IT),
                new Employee("Alice","Cucumber",2000,Department.IT),
                new Employee("Tom","Ford",1500,Department.HR),
                new Employee("Candace","Candies",1800,Department.HR),
                new Employee("Jake","Jungle",2300,Department.MARKETING),
                new Employee("Janet","Jackson",2100,Department.MARKETING));

        Map.Entry<Department, Double> highestSalaryDepartment = employeeList.stream()
                .collect(Collectors.toMap(Employee::getDepartment, Employee::getSalary, Double::sum))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();

        System.out.println("The highest salary is: " + highestSalaryDepartment);
    }
}
