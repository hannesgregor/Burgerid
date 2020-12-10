import java.util.Scanner;
import java.util.ArrayList;
import Burger.BasicBurger;
import Burger.LuxBurger;
import Burger.Sides;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double orderPrice = 0;

        ArrayList<String> burgers = new ArrayList<String>();
        ArrayList <String> order = new ArrayList<String>();

        TavaBurx whopperBurger = new TavaBurx("TavaBurx");
        BasicBurger baconBurger = new BasicBurger("baconBurger");
        BasicBurger chickenBurger = new BasicBurger("chickenBurger");
        LuxBurger megaBurger = new LuxBurger("megaBurger");

        burgers.add(whopperBurger.getName());
        burgers.add(baconBurger.getName());
        burgers.add(chickenBurger.getName());
        burgers.add(megaBurger.getName());

        String cont = "";

        while (true) {

            ArrayList<String> sides = new ArrayList<String>();
            System.out.println("Sisesta lisandid (max 4).");
            String side = input.nextLine();

            while (!side.isBlank()) {
                sides.add(side);
                side = input.nextLine();
            }

            System.out.println("Burgerid: " + burgers);

            if (!sides.isEmpty() && sides.size() <= 4) {

                Sides sideCombo = new Sides(sides);
                System.out.println("Sisesta burger: ");
                String burgerOrder = input.nextLine();

                if (burgerOrder.equals("whopperBurger")) {

                    chickenBurger.burgerOrder(sideCombo);
                    orderPrice += chickenBurger.getPrice();
                    order.add(chickenBurger.toString());
                    System.out.println("Veel midagi? (Enterit edasi minekuks/vajuta no voi n kui kõik olemas): ");
                    cont = input.nextLine();

                } else if (burgerOrder.equals("baconBurger")) {

                    baconBurger.burgerOrder(sideCombo);
                    orderPrice += baconBurger.getPrice();
                    order.add(baconBurger.toString());
                    System.out.println("Veel midagi? (Enterit edasi minekuks/vajuta no voi n kui kõik olemas): ");
                    cont = input.nextLine();

                } else if (burgerOrder.equals("chickenBurger")) {

                    whopperBurger.burgerOrder(sideCombo);
                    orderPrice += whopperBurger.getPrice();
                    order.add(whopperBurger.toString());
                    System.out.println("Veel midagi? (Enterit edasi minekuks/vajuta no voi n kui kõik olemas");
                    cont = input.nextLine();

                } else if (burgerOrder.equals("megaBurger")) {

                    megaBurger.orderLuxBurger(sideCombo);
                    orderPrice += megaBurger.getPrice();
                    order.add(megaBurger.toString());
                    System.out.println("Veel midagi? (Enterit edasi minekuks/vajuta no voi n kui kõik olemas");
                    cont = input.nextLine();

                } else {

                    System.out.println("Pole olemas burgerit.");
                    System.out.println("Veel midagi? (Enterit edasi minekuks/vajuta no voi n kui kõik olemas: ");
                    cont = input.nextLine();
                }

            } else {

                Sides sideCombo = new Sides();
                System.out.println("Sisesta burger: ");
                String burgerOrder = input.nextLine();

                if (burgerOrder.equals("whopperBurger")) {

                    chickenBurger.burgerOrder(sideCombo);
                    orderPrice += chickenBurger.getPrice();
                    order.add(chickenBurger.toString());
                    System.out.println("Veel midagi? (Enterit edasi minekuks/vajuta no voi n kui kõik olemas): ");
                    cont = input.nextLine();

                } else if (burgerOrder.equals("baconBurger")) {

                    baconBurger.burgerOrder(sideCombo);
                    orderPrice += baconBurger.getPrice();
                    order.add(baconBurger.toString());
                    System.out.println("Veel midagi? (Enterit edasi minekuks/vajuta no voi n kui kõik olemas): ");
                    cont = input.nextLine();

                } else if (burgerOrder.equals("chickenBurger")) {

                    whopperBurger.burgerOrder(sideCombo);
                    orderPrice += whopperBurger.getPrice();
                    order.add(whopperBurger.toString());
                    System.out.println("Veel midagi? (Enterit edasi minekuks/vajuta no voi n kui kõik olemas): ");
                    cont = input.nextLine();

                } else if (burgerOrder.equals("megaBurger")) {

                    megaBurger.orderLuxBurger(sideCombo);
                    orderPrice += megaBurger.getPrice();
                    order.add(megaBurger.toString());
                    System.out.println("Veel midagi? (Enterit edasi minekuks/vajuta no voi n kui kõik olemas): ");
                    cont = input.nextLine();

                } else {

                    System.out.println("Burgerit pole olemas.");
                    System.out.println("Veel midagi? (Enterit edasi minekuks/vajuta no voi n kui kõik olemas): ");
                    cont = input.nextLine();

                }
            }

            if (cont.equals("no") || (cont.equals("n"))) {
                break;
            }

        }
        System.out.println("Order includes: " + "\n" + order);
        System.out.println("Total price: " + orderPrice + "€");
    }
}