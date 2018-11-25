package Char1Duck;

public class FlyNoway implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("这只鸭子不会飞行！");
    }
}
