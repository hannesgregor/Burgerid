package burgers;

import java.util.ArrayList;

public class Lisandid {

    private ArrayList<String> lisandid = new ArrayList<String>();
    private double price;

    public Lisandid(ArrayList<String> sides) {
        for (int i = 0; i < sides.size(); i++) {
            this.price += 0.5;
            this.lisandid.add(sides.get(i));
        }
    }

    public Lisandid() {
        this.price = 0;
    }

    public int getLisandidAmount() {
        return lisandid.size();
    }

    public ArrayList<String> getLisandid() {
        return lisandid;
    }

    public double getPrice() {
        return price;
    }
}