package 工厂模式;

public class ShapeFactory {

    public static Shape getShape(String name)
    {
        Shape shape;
        if(name.equals("CIRCLE"))
        {
            shape =new Circle();
        }
        else
        {
            shape =new Circle();
        }
        return shape;
    }
}
