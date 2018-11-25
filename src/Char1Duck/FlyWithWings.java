package Char1Duck;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("这只鸭子使用翅膀进行飞行！");
    }
}
