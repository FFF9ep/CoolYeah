public class Inventory{
    public Product product;
    public String location;

    public Inventory(Product product, String location) {
        this.product = product;
        this.location = location;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void showInventory(){
        System.out.println("Location                  : " + location);
        product.displayProduct();
    }
}