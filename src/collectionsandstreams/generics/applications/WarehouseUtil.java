package collectionsandstreams.generics.applications;

import java.util.List;

/*
 * Class: WarehouseUtil
 * Description: Utility class to display warehouse items
 * using wildcard generics.
 */
public class WarehouseUtil {

    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(
                    item.getItemType() + " : " + item.getItemName()
            );
        }
    }
}
