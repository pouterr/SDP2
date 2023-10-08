public class Main {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: $" + simpleCoffee.cost() + ", Description: " + simpleCoffee.getDescription());

        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        System.out.println("Cost: $" + milkCoffee.cost() + ", Description: " + milkCoffee.getDescription());

        Coffee sweetMilkCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println("Cost: $" + sweetMilkCoffee.cost() + ", Description: " + sweetMilkCoffee.getDescription());
    }
}
