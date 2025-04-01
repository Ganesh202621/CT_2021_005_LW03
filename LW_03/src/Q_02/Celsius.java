package Q_02;

import java.util.Scanner;
import Q_01.Temperature ;


public class Celsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        Temperature temp =new Temperature();
        temp.setFahrenheit(fahrenheit);

        System.out.printf("%.2f°F is equivalent to %.2f°C\n",fahrenheit,temp.toCelsius());
    }

}
