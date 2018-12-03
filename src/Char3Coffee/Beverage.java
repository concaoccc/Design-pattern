package Char3Coffee;

public abstract class  Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double coust();
}
