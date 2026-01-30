package collectionsandstreams.generics.applications;

/*
 * Class: Furniture
 * Description: Represents furniture items in the warehouse.
 */
public class Furniture extends WarehouseItem {

    public Furniture(String itemName) {
        super(itemName);
    }

    @Override
    public String getItemType() {
        return "Furniture";
    }
}
