package 单利模式;

public class SingleObject1 {
    private static SingleObject1 singleObject1 = null;
    private SingleObject1() {

    }
    public static SingleObject1 getInstance()
    {
        if(singleObject1==null)
        {
            singleObject1 = new  SingleObject1();

        }
        return singleObject1;
    }
    public void message()
    {
        System.out.println("单利懒汉模式1");
    }
}
