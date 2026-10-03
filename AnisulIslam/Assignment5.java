package AnisulIslam;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num;

        System.out.print("A person Age:");
        num = number.nextInt();

        if (num >=18){
            System.out.println("You are eligible for voting");
        } 
        else {
            System.out.println("You are not eligible for voting");
        }
   number.close();
    }
}
