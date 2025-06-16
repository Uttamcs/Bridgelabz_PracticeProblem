
import java.util.Scanner;

public class footToInch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in cm");
        int height = sc.nextInt();
        double feet = height / 30.48;
        double inch = (height / 2.54) % 12;
        System.out.println("Your height in cm is " + height + " while in feet is " + feet + " and inches is " + inch);
    }
}
