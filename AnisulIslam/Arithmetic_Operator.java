package AnisulIslam;

import java.util.Scanner;

public class Arithmetic_Operator {
    public static void main(String[] args) {
      /*   int num1,num2,result;
        num1=10;
        num2=20;
        result=num1+num2;
        System.out.println("The sum of two number is: "+result);
        result=num1-num2;
        System.out.println("The subtraction of two number is: "+result);
        result=num1*num2;
        System.out.println("The multiplication of two number is: "+result);
        result=num1/num2;
        System.out.println("The division of two number is: "+result);

      */

        Scanner input = new Scanner(System.in);
        int num1,num2,result;
        double result2;
        System.out.print("Enter your first number: ");
        num1=input.nextInt();
        System.out.print("Enter your second number: ");
        num2=input.nextInt();

        result=num1+num2;
        System.out.println("The sum of two number is: "+result);
        result=num1-num2;   
        System.out.println("The subtraction of two number is: "+result);
        result=num1*num2;
        System.out.println("The multiplication of two number is: "+result);
        result2= (double) num1/num2;
        System.out.println("The division of two number is: "+result2);
        result=num1%num2;
        System.out.println("The modulus of two number is: "+result);

        input.close();


        }
}
