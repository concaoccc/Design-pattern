package Char3Coffee;

public class StarbuzzCoffee {
    public static void main(String args[]){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                +" $"+ beverage.coust());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        System.out.println(houseBlend.getDescription()
                +" $"+houseBlend.coust());
    }
}
