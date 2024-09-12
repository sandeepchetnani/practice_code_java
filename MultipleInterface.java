interface MultipleInterface {
    public void demo();
    
}
/**
 * InnerMultipleInterface
 */
interface InnerMultipleInterface extends MultipleInterface {
 
    
}

class Test implements InnerMultipleInterface{
    public void demo(){
        System.out.println("hello");
    }
}
class Main{
    public static void main(String[] args) {
        InnerMultipleInterface m=new Test();

        m.demo();
    }
}

