package 单利模式;

public class SingleObject {
    private static SingleObject singleObject=new SingleObject();
    public static SingleObject getInstance()
    {
        return singleObject;
    }
    public void message()
    {
        System.out.println("单利饿汉模式1");
    }

}
