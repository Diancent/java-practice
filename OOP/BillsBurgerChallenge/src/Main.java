public class Main {

    public static void main(String[] args) {

        MealOrder deluxeOrder = new MealOrder("deluxe", "7-up", "chili");
        deluxeOrder.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        deluxeOrder.setDrinkSize("SMALL");
        deluxeOrder.printItemizedList();
    }
}
