package sjms.demo2;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String colorType) {
        if(colorType == null){
            return null;
        }
        if(colorType.equalsIgnoreCase("RED")){
            return new Red();
        }
        return null;
    }
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
