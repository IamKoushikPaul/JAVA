package AnisulIslam;

import java.util.Scanner;
public class Triangle_Demo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double area,height,base;

        System.out.print("Enter Base:");
        base = input.nextDouble();

        System.out.print("Enter Height:");
        height = input.nextDouble();

        area = 0.5 * base * height;
        System.out.println("Area of Triangle is: " + area);

        input.close();
    }
}
