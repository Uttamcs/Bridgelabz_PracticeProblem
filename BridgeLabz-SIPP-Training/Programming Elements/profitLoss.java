public class profitLoss
{
	public static void main(String[] args) {
	    int cost_price = 129;
	    int selling_price = 191;
	    int profit = selling_price - cost_price;
	    int profit_percentage = (profit/cost_price)*100;
	    System.out.println("The Cost Price is INR "+cost_price+" and Selling Price is INR "+selling_price);
	    System.out.println("The Profit is INR "+profit+" and the Profit Percentage is "+profit_percentage);
	}
}
