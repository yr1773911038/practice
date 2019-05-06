package sjms.demo1;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null ){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
