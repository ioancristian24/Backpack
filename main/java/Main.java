

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        //CAZUL SORTAT DUPA PROFIT

        Problem problem = new Problem();

        problem.setBackpack(new Backpack(12));

        List<Item> generatedItems = Util.generateItems(100);

        problem.setAvailableItems(generatedItems);

        System.out.println("SORTED BY PROFIT");

        problem.moveProfitableItemsToBackpack();

        double totalWeightOfItemsInBackpack = problem.getTotalWeightOfItemsInBackpack();

        double backpackCapacity = problem.getBackpackCapacity();

        System.out.println("Capacity: " + backpackCapacity + ", total weight in backpack: " + totalWeightOfItemsInBackpack
                + ", number of items in backpack: " + problem.getNumberOfItemsInBackpack());

        double totalValue = problem.getBackpackValue();

        System.out.println("Total value: " + totalValue);

        System.out.println("The Number of available objects after moving some of them to backpack is : "
                + problem.getNumberOfRemainingItemsAfterMovingSomeOfThemToBackpack());

        ///////////////////////////////////////////////////////////
        System.out.println("\n\n");

        //CAZUL NESORTAT

        problem.setBackpack(new Backpack(12));//resetam rucsacul;

        System.out.println("NOT SORTED");

        problem.moveItemToBackpack();

        totalWeightOfItemsInBackpack = problem.getTotalWeightOfItemsInBackpack();

        backpackCapacity = problem.getBackpackCapacity();

        System.out.println("Capacity: " + backpackCapacity + ", total weight in backpack: " + totalWeightOfItemsInBackpack
                + ", number of items in backpack: " + problem.getNumberOfItemsInBackpack());

        totalValue = problem.getBackpackValue();

        System.out.println("Total value: " + totalValue);

        System.out.println("The Number of available objects after moving some of them to backpack is : "
                + problem.getNumberOfRemainingItemsAfterMovingSomeOfThemToBackpack());



        /////////////////////////////////////////////////////////
        System.out.println("\n\n");

        // CAZUL OBIECTE USOARE

        problem.setBackpack(new Backpack(12));

        System.out.println("SORTED BY LIGHT OBJECTS");

        problem.moveLightItemsToBackpack();

        totalWeightOfItemsInBackpack = problem.getTotalWeightOfItemsInBackpack();

        backpackCapacity = problem.getBackpackCapacity();

        System.out.println("Capacity: " + backpackCapacity + ", total weight in backpack: " + totalWeightOfItemsInBackpack
                + ", number of items in backpack: " + problem.getNumberOfItemsInBackpack());

        totalValue = problem.getBackpackValue();

        System.out.println("Total value: " + totalValue);

        System.out.println("The Number of available objects after moving some of them to backpack is : "
                + problem.getNumberOfRemainingItemsAfterMovingSomeOfThemToBackpack());

        //////////////////////////////////////////////////////
        System.out.println("\n\n");

        //CAZUL FRACTII DE OBIECTE

        problem.setBackpack(new Backpack(12));

        System.out.println("FRACTION OF OBJECTS");

        problem.moveFractionsItemsToBackpack();

        totalWeightOfItemsInBackpack = problem.getTotalWeightOfItemsInBackpack();

        backpackCapacity = problem.getBackpackCapacity();

        System.out.println("Capacity: " + backpackCapacity + ", total weight in backpack: " + totalWeightOfItemsInBackpack
                + ", number of items in backpack: " + problem.getNumberOfItemsInBackpack());

        totalValue = problem.getBackpackValue();

        System.out.println("Total value: " + totalValue);

        System.out.println("The Number of available objects after moving some of them to backpack is : "
                + problem.getNumberOfRemainingItemsAfterMovingSomeOfThemToBackpack());

    }
}
