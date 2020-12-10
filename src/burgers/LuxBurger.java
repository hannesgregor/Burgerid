package burgers;

import java.util.ArrayList;

// Inheritance
public class LuxBurger extends TavaBurx {

    private String name;
    private String bread;
    private double price;
    private ArrayList<String> sides = new ArrayList<String>();

    public LuxBurger(String name) {
        super(name);
        this.name = super.getName();
        this.bread = "Kullast sai";
        this.price = super.getPrice() + 0.65;
    }

    public void orderLuxBurger(Lisandid lisandid) {
        for (int i = 0; i < lisandid.getLisandidAmount(); i++) {
            // Composition
            this.sides.add(lisandid.getLisandid().get(i));
        }
        this.price += lisandid.getPrice();
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.name + " with luxurious bread, priced at " + this.price + "€" + ". Sides: " + this.sides;
    }
}