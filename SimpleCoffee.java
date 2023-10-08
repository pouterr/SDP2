public class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 2.0;  // Base cost of a simple coffee
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
