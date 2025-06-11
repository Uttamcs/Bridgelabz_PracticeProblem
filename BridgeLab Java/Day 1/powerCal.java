
import java.util.*;

public class powerCal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        double result = Math.pow(base, exponent);
        System.out.println("the result of base raised to the exponent is " + result);
    }
}
