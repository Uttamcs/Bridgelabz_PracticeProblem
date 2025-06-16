import java.util.Scanner;

public class kmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        double miles = km * 0.621371;
        System.out.println("the distance in miles is " + miles);
    }
}
