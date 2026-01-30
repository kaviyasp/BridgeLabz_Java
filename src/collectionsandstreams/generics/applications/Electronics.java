package collectionsandstreams.generics.applications;

/*
 * Class: Electronics
 * Description: Represents electronic items in the warehouse.
 */
public class Electronics extends WarehouseItem {

    public Electronics(String itemName) {
        super(itemName);
    }

    @Override
    public String getItemType() {
        return "Electronics";
    }
}
