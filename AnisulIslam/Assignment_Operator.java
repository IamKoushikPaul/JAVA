package AnisulIslam;
    import java.util.Scanner;
public class Assignment_Operator {
    public static void main(String[] args) {
        int x,y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        x=input.nextInt();
        System.out.print("Enter your second number: ");
        y=input.nextInt();
       

        x+=y;
        System.out.println("X = "+x);
        x-=y;
        System.out.println("X = "+x);
        x*=y;
        System.out.println("X = "+x);
        x/=y;
        System.out.println("X = "+x);
        x%=y;
        System.out.println("X = "+x);

        input.close();
    }
}
