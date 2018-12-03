package Char3Coffee;

public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double coust() {
        return 1.99;
    }
}
