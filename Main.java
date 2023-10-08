public class Main {
    public static void main(String[] args) {
        Cake baseCake = new BaseCake();
        System.out.println("Description: " + baseCake.getDescription());

        Cake frostingCake = new FrostingDecorator(new BaseCake());
        System.out.println("Description: " + frostingCake.getDescription());

        Cake sprinklesFrostingCake = new SprinklesDecorator(new FrostingDecorator(new BaseCake()));
        System.out.println("Description: " + sprinklesFrostingCake.getDescription());
    }
}
