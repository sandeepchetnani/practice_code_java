public class thisExampleDriver {
    public static void main(String[] args) {
        thisExample bike=new thisExample();
        bike.bhp=12;
        bike.brand="Ktm";
        bike.color="Orange";
        bike.price=230000;
        bike.details();

        thisExample bike2=new thisExample();
        bike2.bhp=12;
        bike2.brand=bike.brand;
        bike2.color="red";
        bike2.price=210000;
        bike2.details();

    }
    
}
