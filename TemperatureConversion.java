package com.bridgelabz_junit;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        Util utility = new Util();
        double temperatureInFerenheit, temperatureInCelcius;
        Scanner scanner = new Scanner(System.in);

        System.out.println("press 1 for convertion celcius to Ferenheit : ");
        System.out.println("press 2 for convertion Ferenheit to celcius : ");
        int choice = scanner.nextInt();

        if(choice == 1){

            System.out.println("Enter Temperature in Celsius : ");
            temperatureInCelcius = scanner.nextDouble();
            temperatureInFerenheit = utility.CelsiusToFahrenheit(temperatureInCelcius);
            System.out.println("Celcius to Fahrenheit of " + temperatureInCelcius + " is " + temperatureInFerenheit);
        }
        else if (choice == 2) {

            System.out.println("Enter Temperature in Ferenheit : ");
            temperatureInFerenheit = scanner.nextDouble();
            temperatureInCelcius = utility.FahrenheitToCelsius(temperatureInFerenheit);
            System.out.println("Fahrenheit to Celcius of " + temperatureInFerenheit + " is " + temperatureInCelcius);
        }
        else {
            System.out.println("Please choose between 1 and 2 ");
        }

        scanner.close();
    }
}

