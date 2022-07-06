package com.bridgelabz_junit;

public class Util {
    public double FahrenheitToCelsius(double temperatureInFerenheit) {
        double temperatureInCelcius;
        temperatureInCelcius = ((temperatureInFerenheit - 32) * 5) / 9;
        return temperatureInCelcius;
    }
    public double CelsiusToFahrenheit(double temperatureInCelsius) {
        double temperatureInFahrenheit;
        temperatureInFahrenheit = ((temperatureInCelsius * 9) / 5) + 32;
        return temperatureInFahrenheit;
    }
}

