package AnisulIslam;

import java.util.Scanner;

public class Input_demo {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
     String name;
     System.out.print("Enter your name: ");
    name = input.nextLine();
    System.out.println("You entered: " + name); 
    
    
    input.close();
    }
    
}
