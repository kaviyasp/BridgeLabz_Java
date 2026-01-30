package collectionsandstreams.generics.applications;

/*
 * Class: Groceries
 * Description: Represents grocery items in the warehouse.
 */
public class Groceries extends WarehouseItem {

    public Groceries(String itemName) {
        super(itemName);
    }

    @Override
    public String getItemType() {
        return "Groceries";
    }
}
