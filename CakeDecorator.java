public abstract class CakeDecorator implements Cake {
    protected Cake decoratedCake;

    public CakeDecorator(Cake cake) {
        this.decoratedCake = cake;
    }

    @Override
    public String getDescription() {
        return decoratedCake.getDescription();
    }
}
