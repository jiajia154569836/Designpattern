package 策略模式;

public class Context {
    Strategy strategy ;
    public Context(Strategy strategy)
    {
        this.strategy=strategy;
    }
    public int executeStrategy(int num1,int num2)
    {
        return  strategy.operate(num1,num2);
    }
}
