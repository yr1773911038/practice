package sjms.demo5;

/**
 * 原型模式：用于重复的对象，
 */
public class PrototypePatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();;

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());
    }
}
