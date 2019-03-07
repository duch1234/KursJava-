package pl.developerpi91.shop;

import java.util.*;
import java.util.stream.Collectors;

public class Basket {
    private Map<Item, Integer> itemList;


    public Basket() {
        this.itemList = new HashMap<>();
    }


    public void addItem(Item item, int amount){
        this.itemList.put(item,amount);
    }
    public void removeItem(Item item, int amount){
        if(itemList.containsKey(item)){

            ///TODO

        }
        else {
            System.out.println("No Such element");
            throw new NoSuchElementException();
        }

    }

    public void viewBasket(){
        Iterator i = this.itemList.entrySet().iterator();
        Double totalCost=0.0;
        Item currentItem=null;

        while (i.hasNext()){
            Map.Entry pair = (Map.Entry)i.next();
            System.out.println(pair.getKey()+"\tUnits: "+ pair.getValue());
            currentItem = (Item)pair.getKey();
            totalCost+= currentItem.getPricePerUnit() * (Integer)pair.getValue();
        }
        System.out.println("Total: " + totalCost);
    }
    public double getOrderValue() {
        double orderValue = 0;

        for(Map.Entry<Item, Integer> itemOrder : itemList.entrySet()) {
            orderValue += itemOrder.getKey().getPricePerUnit() * itemOrder.getValue();
        }

        return orderValue;
    }


    public static void main(String[] args) {
        Item i1 = new Item("jablko", 1.0);
        Item i2 = new Item("gruszka", 1.49);

        Basket b = new Basket();
        b.addItem(i1,1);
        b.addItem(i2,1);
        b.removeItem(i1,1);
        b.viewBasket();

    }
}
