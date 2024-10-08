public class Product {
    private String name;
    private double price;
    private int stock;
    private static final double DISCOUNT_RATE = 0.1; //10% diskon

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock(){
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public double calculateDiscount(){
        return getPrice() * DISCOUNT_RATE;
    }

    public void displayProduct(){
        double discountedPrice = price * 0.9; //10% diskon
        System.out.println("Product Name              : " + name);
        System.out.println("Price                     : $" + price);
        System.out.println("Discounted Price          : $" + calculateDiscount());
        System.out.println("Stock                     : " + stock);
    }

    public void applyStockAdjustment(int adjusment){
        stock += adjusment;
        System.out.println("Stock Adjusted. New Stock : " + stock);
    }
}
