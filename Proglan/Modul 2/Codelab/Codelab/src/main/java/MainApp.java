public class MainApp {
    public static void main(String[] args) {
        Product product = new Product("Smartphone", 699.99, 50);
        Inventory inv = new Inventory(product, "Warehouse A");

        inv.showInventory();
        product.applyStockAdjustment(10);
        inv.showInventory();
    }
}