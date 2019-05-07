package sjms.demo5;

import javafx.scene.shape.Circle;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) throws CloneNotSupportedException {
        Shape shape = shapeMap.get(shapeId);
        return (Shape) shape.clone();
    }

    public static void loadCache(){
       Rectangle rectangle = new Rectangle();
       rectangle.setId("1");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
