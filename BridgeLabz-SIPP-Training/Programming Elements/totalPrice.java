
import java.util.Scanner;

public class totalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit price of the item");
        int unitPrice = sc.nextInt();
        System.out.println("Enter the quantity to be bought");
        int quantity = sc.nextInt();
        int totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}
