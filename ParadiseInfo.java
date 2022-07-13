
package paradiseinfo;
import java.util.Scanner;

public class ParadiseInfo {

    
    public static void main(String[] args) 
    {
        //java page exercise in Jocye Farrel 10th Edition page 132
        double price;
        double discount;
        double savings;
        Scanner keyboard =new Scanner(System.in);
        System.out.println("Enter the cutoff price for discount>>");
        price=keyboard.nextDouble();
        System.out.println("Enter discount rate as a whole numner>>");
        discount=keyboard.nextDouble();
        
       displayInfo();
       savings=DiscountInfo(price,discount);
       System.out.println("Special this week on any services over"+price);
       System.out.println("Discount of "+discount+"percent");
       System.out.println("Thats a savings of at least $"+savings);
    }
    public static void displayInfo()
    {
        System.out.print("Paradise Day Spa wants to pamper you:");
        System.out.print("We will make you look good");
    }
    public static double DiscountInfo(double price ,double discount )
    {
        double savings;
        savings=price * discount/100;
        return savings;
    }
    
}
