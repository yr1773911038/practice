package sjms.demo1;

/**
 * 工厂模式
 * 主要解决的问题：接口选择
 */
public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

    }
}
