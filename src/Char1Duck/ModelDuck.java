package Char1Duck;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoway();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I am a model duck");
    }
}
