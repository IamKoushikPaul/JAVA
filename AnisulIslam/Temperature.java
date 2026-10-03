package AnisulIslam;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double celsius,fahrenheit;

        System.out.print("Enter Celsius:");
        celsius = input.nextDouble();

        fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Fahrenheit is: " + fahrenheit);

        input.close();

    }
}
