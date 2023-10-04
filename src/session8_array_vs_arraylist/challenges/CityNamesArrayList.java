package session8_array_vs_arraylist.challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class CityNamesArrayList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Iasi");
        cities.add("Cluj");
        cities.add("Timisoara");
        cities.add("Sibiu");
        cities.add("Galati");
        cities.add("Roman");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a city name: ");
        String cityInput = scanner.nextLine();
        scanner.close();

        if(cities.contains(cityInput)){
            System.out.println("That city is already in the list.");
        }else{
            cities.add(cityInput);
            System.out.println("Now the list looks like this: " + cities);
        }
    }
}
