public class FrostingDecorator extends CakeDecorator {
    public FrostingDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Frosting";
    }
}
