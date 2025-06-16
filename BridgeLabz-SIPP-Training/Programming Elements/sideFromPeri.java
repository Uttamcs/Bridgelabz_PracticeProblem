
import java.util.Scanner;

public class sideFromPeri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the perimeter of the square: ");
        int peri = sc.nextInt();
        System.out.println("The length of the side is "+ peri/4.0 +" whose perimeter is"+ peri);
    }
}
