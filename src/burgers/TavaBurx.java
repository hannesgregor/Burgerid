package burgers;

import java.util.ArrayList;

// Abstraction
public class TavaBurx {

    private String name;
    private double price;
    private ArrayList<String> lisandid = new ArrayList<String>();

    public TavaBurx(String name) {
        this.name = name;
        this.price = 3.00;
    }

    public void burgerOrder(Lisandid lisandid) {
        for (int i = 0; i < lisandid.getLisandidAmount(); i++) {
            this.lisandid.add(lisandid.getLisandid().get(i));
        }
        this.price += lisandid.getPrice();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return this.name + ", hinnaga " + this.price + "€" + ". Lisandid: " + this.lisandid;
    }
}