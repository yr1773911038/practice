package sjms.demo4;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
