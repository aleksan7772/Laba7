package Constructor;

public class Pizzeria {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(" fourSeasons", Pizza.fourSeasons(), 100);
        Pizza pizza1 = new Pizza("Margarita", Pizza.margarita(), 80);
        System.out.println("Название пиццы " + pizza.getName());
        System.out.println("Размер " + pizza.getBasis());
        System.out.println("Ингридиенты: ");
        for (String s : Pizza.fourSeasons()) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("Цена" + pizza.getCost() + '$');

        System.out.println();
        System.out.println();
        System.out.println("Название пиццы " + pizza1.getName());
        System.out.println("Размер " + pizza1.getBasis());
        System.out.println("Ингридиенты: ");
        for (String s : Pizza.margarita()) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(pizza1.getCost() + '$');


    }


}
