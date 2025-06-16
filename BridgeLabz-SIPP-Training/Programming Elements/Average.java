import java.util.Scanner;
public class Average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Sam in Maths, Physics and Chemistry");
        int maths = sc.nextInt();
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int average = (maths + physics + chemistry)/3;
        System.out.println("Sam's average mark in PCM is " + average);
    }
}
