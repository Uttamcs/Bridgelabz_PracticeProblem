import java.util.*;
public class CylinderVol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();
        double volume = Math.PI * r * r * h;
        System.out.println("the volume of cylinder is " + volume);
}

}
