import java.util.*;

public class Problem {

    private List<Item> availableItems;
    private Backpack backpack;


    public Problem() {
        availableItems = new ArrayList<Item>();
    }

    public List<Item> getAvailableItems() {
        return availableItems;
    }

    public void setAvailableItems(List<Item> availableItems) {
        this.availableItems = availableItems;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public void addAvailableItem(Item item) {
        this.availableItems.add(item);
    }

    public double getTotalWeightOfItemsInBackpack() {

        return backpack.getTotalWeightOfItems();

    }

    public void moveItemToBackpack(){

        for (int index = 0; index < availableItems.size(); index++){

            Item currentItem = availableItems.get(index);

            backpack.add(currentItem);

        }
    }

    public int getNumberOfRemainingItemsAfterMovingSomeOfThemToBackpack(){

       int remainingItem = availableItems.size() - getNumberOfItemsInBackpack();

       return remainingItem;
    }

    public void moveProfitableItemsToBackpack(){

        Set<Item> itemSet = new TreeSet<>(availableItems);

        //System.out.println(itemSet);

        Iterator <Item> iterator = itemSet.iterator();

        while (iterator.hasNext()){

            backpack.add(iterator.next());
        }
    }

    public void moveLightItemsToBackpack() {

        ItemComparatorByWeight comparator = new ItemComparatorByWeight();

        Set<Item> itemSet = new TreeSet<>(comparator);

        itemSet.addAll(availableItems);

        //System.out.println(itemSet);

        Iterator<Item> iterator = itemSet.iterator();

        while (iterator.hasNext()) {

            backpack.add(iterator.next());
        }
    }

    public void moveFractionsItemsToBackpack( ){

        Set<Item> itemSet = new TreeSet<>(availableItems);

        //System.out.println(itemSet);

        Iterator <Item> iterator = itemSet.iterator();

        while (iterator.hasNext()){

            backpack.addFractionsItem(iterator.next());
        }

    }

    public double getTotalValueOfItemsInBackpack() {

        return backpack.getTotalValueOfItems();
    }

    public double getAvailableCapacityInBackpack(){

        return backpack.getAvailableCapacity();
    }


    public double getBackpackCapacity() {

        return backpack.getCapacity();
    }

    public double getBackpackValue() {

        return backpack.getTotalValueOfItems();
    }


    public int getNumberOfItemsInBackpack() {

        return backpack.getNumberOfItems();
    }
}
