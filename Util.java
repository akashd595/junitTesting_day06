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
    public int  calculateDayOfWeek(int day, int month, int year) {
        int y1, x, m, d1;
        y1 = year - (14 - month) / 12;
        x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
        m = month + 12 * ((14 - month) / 12) - 2;
        d1 = (day + x + 31 * m / 12) % 7;
        return d1;
    }
}

