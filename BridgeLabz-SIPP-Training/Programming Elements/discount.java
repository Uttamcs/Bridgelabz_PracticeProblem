public class discount {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;
        int discount = (fee * discountPercent) / 100;
        System.out.println("The discount amount is INR " + discount + " and final discounted price is INR " + (fee - discount));
    }
}
