import java.lang.*;
class Box {
    int price;
    Box(int price)
    {
        this.price=price;
    }
    Box(){

    }
    
    @Override
    public boolean equals(java.lang.Object obj) {
        Box box=(Box)obj;
        return this.price==box.price;
    }

}
public class Equals {
    public static void main(String[] args) {
        Box b1=new Box(10);
        Box b2=new Box(10);
        System.out.println(b1.equals(b2));
    }
}
