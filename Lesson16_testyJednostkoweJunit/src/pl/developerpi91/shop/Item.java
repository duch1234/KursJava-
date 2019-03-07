package pl.developerpi91.shop;

public class Item {
    private String name;
    private Double pricePerUnit;

    public Item(String name, Double pricePerUnit) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public Double getPricePerUnit() {
        return pricePerUnit;
    }

    @Override
    public String toString() {
        return ("Name: "+ this.name + " " +
                "Price: " + this.pricePerUnit) ;
    }
}
