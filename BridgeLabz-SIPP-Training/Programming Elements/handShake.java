
import java.util.Scanner;

public class handShake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        int handShakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println(handShakes);
    }
}
