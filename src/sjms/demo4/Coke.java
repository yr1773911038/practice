package sjms.demo4;

public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "coke ";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
