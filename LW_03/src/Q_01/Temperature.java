package Q_01;

import java.util.Scanner;

public class Temperature {
    private double celsius;

    // No-arg constructor
    public Temperature() {
        this.celsius = 0.0;
    }

    // Parameterized constructor
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Getter for Celsius
    public double toCelsius() {
        return celsius;
    }

    // Getter for Fahrenheit
    public double toFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    // Setter for Celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    // Setter for Fahrenheit
    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsiusInput = scanner.nextDouble();

        Temperature temp = new Temperature(celsiusInput);
        System.out.printf("%.2f°C is equivalent to %.2f°F\n",
                temp.toCelsius(), temp.toFahrenheit());

        scanner.close();


    }
}