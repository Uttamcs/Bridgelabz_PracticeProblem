
import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();
        int area = (base * height) / 2;
        System.out.println("Area of Triangle in square inches is " + area);
    }
}
