
public class earthVol {
    public static void main(String[] args) {
        double pi = Math.PI;
        double r = 6378.0;
        double volKm = (4.0/3.0) * pi * r * r * r;
        double volMi = volKm * 0.621371;
        System.out.println("The volume of earth in cubic kilometers is " + volKm + " and cubic miles is " + volMi);
    }
}
