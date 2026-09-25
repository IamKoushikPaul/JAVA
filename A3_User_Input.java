import java.util.Scanner;

public class A3_User_Input {
    public static void main(String[] args) {
Scanner product=new Scanner(System.in);
        int id;
        double price;
        String catagory;
        String discription;
        String title;
        
        System.out.print("Enter your id:");
        id=product.nextInt();
        
        System.out.print("Enter your price;");
        price=product.nextDouble();
        
        Scanner input1=new Scanner(System.in);
        System.out.print("Enter your catagory:");
        catagory=input1.nextLine();
        
        Scanner input2= new Scanner(System.in);
        System.out.print("Enter your discription:");
        discription=input2.nextLine();
        
        Scanner input3=new Scanner(System.in);
        System.out.print("Enter your title:");
        title=input3.nextLine();
        
        
        System.out.println("id ="+id);
        System.out.println("price $ "+price);
        System.out.println("catagory ="+catagory);
        System.out.println("discription ="+discription);
        System.out.println("title ="+title);
      
        product.close();
        input1.close();
        input2.close();
        input3.close();
    }
}
