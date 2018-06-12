package 策略模式;

public class OperationAdd implements Strategy {
    public int operate(int num1,int num2)
    {
        return num1 +num2;
    }
}
