
import java.util.Scanner;

public class feetsToYards{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance in feet:");
        int distanceInFeet = sc.nextInt();

        int distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760.0;

        System.out.println("Your distance in yards is " + distanceInYards);
        System.out.println("Your distance in miles is " + distanceInMiles);
        System.out.println("Your distance in feet is " + distanceInFeet + " and in inches is " + (distanceInFeet * 12));
    }
}
