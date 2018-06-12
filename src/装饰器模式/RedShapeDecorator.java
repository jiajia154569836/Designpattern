package 装饰器模式;

public  class RedShapeDecorator extends ShapeDecorator {

    public  RedShapeDecorator(Shape shape)
    {
        super(shape);
    }
    public void draw(){
        System.out.println("红色");
        shape.draw();
    }
}
