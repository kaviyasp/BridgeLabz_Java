package collectionsandstreams.generics.applications;

/*
 * Abstract Class: WarehouseItem
 * Description: Base class for all items stored in the warehouse.
 */
public abstract class WarehouseItem {

    private String itemName;

    public WarehouseItem(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public abstract String getItemType();
}
