package scratches;

public class Return {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Return(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // get price with tax method
    public double getPriceWithTax()
    {
        double totalPrice = price + price * 0.08;
        return totalPrice;
    }

    // main method
    public static void main(String[] args) {
        Return lemonadeStand = new Return("Lemonade", 3.75);
        double lemonadePrice = lemonadeStand.getPriceWithTax();
        System.out.println(lemonadePrice);

    }
}