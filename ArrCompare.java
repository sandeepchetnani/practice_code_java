import java.util.Arrays;

class ArrCompare implements Comparable{

public static void main(String[] args) {
    

    Book b[]=new Book[5];
    b[0]=new Book(120,"harry");
    b[1]=new Book(120,"harry");
    b[2]=new Book(120,"harry");
    b[3]=new Book(120,"harry");
    b[4]=new Book(120,"harry");

    Arrays.sort(b);
    


}

@Override
public int compareTo(Object o) {
    
}
}
class Book{
    int price;
    String name;
    Book(int price,String name){
        this.price=price;
        this.name=name;

    }
    public int compareTo(Object o)
    {
        Book t=(Book)o;
    }

}
