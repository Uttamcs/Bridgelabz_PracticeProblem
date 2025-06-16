import java.util.Scanner;
public class kmToMilesCovert {
    public static void main(String[] args) {
        double km;
        System.out.println("Enter the distance in kilometers: ");
        Scanner sc = new Scanner(System.in);
        km = sc.nextDouble();
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}
