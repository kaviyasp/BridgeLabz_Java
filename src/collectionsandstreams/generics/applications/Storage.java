package collectionsandstreams.generics.applications;

import java.util.ArrayList;
import java.util.List;

/*
 * Class: Storage
 * Description: Generic storage class that stores
 * items extending WarehouseItem.
 */
public class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}
