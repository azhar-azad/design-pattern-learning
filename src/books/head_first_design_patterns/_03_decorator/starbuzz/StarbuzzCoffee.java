package books.head_first_design_patterns._03_decorator.starbuzz;

public class StarbuzzCoffee {

    public static void main(String[] args) {

        /*
         Order up an espresso, no condiments,
         and print its description and cost.
         */
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        /*
        Make a DarkRoast object.
        Wrap it with a Mocha.
        Wrap it with a second Mocha.
        Wrap it in a Whip.
         */
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        /*
        HouseBlend with Soy, Mocha and Whip.
         */
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
