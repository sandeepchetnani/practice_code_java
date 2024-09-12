public class exobjectinh {
    public static void main(String[] args) {
        new child();
    }
    
}
class parent{
    int i;
    parent(){
        System.out.println("parent is loaded");
    }


}
class child extends parent{
        int j;
        
        child(){
            super();
          System.out.println("child is loaded");
        }
}

