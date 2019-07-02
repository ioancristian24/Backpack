import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private double capacity;

    private List<Item> itemList;

    public Backpack(double capacity) {
        itemList = new ArrayList<Item>();
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public double getTotalWeightOfItems() {

        double sumOfWeight = 0;

        for (int index = 0; index < itemList.size(); index++) {

            Item currentItem = itemList.get(index);

            sumOfWeight = sumOfWeight + currentItem.getWeight();
        }
        return sumOfWeight;
    }

    public void add(Item item) {

        if (getAvailableCapacity() >= item.getWeight()) {
            itemList.add(item);

        }
    }

    public double getTotalValueOfItems() {

        double sumOfValues = 0;

        for (int index = 0; index < itemList.size(); index++) {

            Item currentItem = itemList.get(index);

            sumOfValues = sumOfValues + currentItem.getValue();
        }
        return sumOfValues;
    }

    public double getAvailableCapacity() {

        double availableCapacity = capacity - getTotalWeightOfItems();

        return availableCapacity;
    }

    public int getNumberOfItems() {
        return itemList.size();
    }



    public void addFractionsItem(Item item) {

        double availableCapacity = getAvailableCapacity();

        if (availableCapacity == 0){
            return;
        }
        if (getAvailableCapacity() >= item.getWeight()) {

            itemList.add(item);

        }else {

          Item fractionItem = new Item(item.getName(),availableCapacity, availableCapacity * item.getValue()/item.getWeight());

          itemList.add(fractionItem);
        }
    }
}