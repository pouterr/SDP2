public class SprinklesDecorator extends CakeDecorator {
    public SprinklesDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sprinkles";
    }
}
