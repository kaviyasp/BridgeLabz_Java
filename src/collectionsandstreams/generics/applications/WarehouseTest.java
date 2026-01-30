package collectionsandstreams.generics.applications;

/*
 * Class: WarehouseTest
 * Description: Demonstrates Smart Warehouse system
 * using generics and wildcards.
 */
public class WarehouseTest {

    public static void main(String[] args) {

        // Electronics storage
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Mobile"));

        // Groceries storage
        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Oil"));

        // Display items using wildcard
        System.out.println("Electronics Warehouse:");
        WarehouseUtil.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries Warehouse:");
        WarehouseUtil.displayItems(groceryStorage.getItems());
    }
}
