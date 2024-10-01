import Product from './Item.js';
import InventoryManager from './Inventory.js';

const inventory = new InventoryManager();

const laptop = new Product(1, 'Laptop', 10, 1000);
const mouse = new Product(2, 'Mouse', 50, 20);

inventory.addNewItem(laptop);
inventory.addNewItem(mouse);

console.log('Initial Inventory:');
console.log(inventory.showAllItems());
/**
 * Output yang diharapkan:
 * Initial Inventory:
 * ID: 1, Name: Laptop, Quantity: 10, Price: 1000
 * ID: 2, Name: Mouse, Quantity: 50, Price: 20
 */

laptop.modifyDetails('Laptop', 8, 950);
console.log('\nInventory after update:');
console.log(inventory.showAllItems());

/**
 * Output yang diharapkan:
 * Inventory after update:
 * ID: 1, Name: Laptop, Quantity: 8, Price: 950
 * ID: 2, Name: Mouse, Quantity: 50, Price: 20
 */

inventory.deleteItemById(2);
console.log('\nInventory after removal:');
console.log(inventory.showAllItems());

/**
 * Output yang diharapkan:
 * Inventory after removal:
 * ID: 1, Name: Laptop, Quantity: 8, Price: 950
 */
