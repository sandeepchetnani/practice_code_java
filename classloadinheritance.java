public class classloadinheritance {
    public static void main(String[] args) {
        child.nurture();

    }
    
}
class parent{
    static{
        System.out.println("parent is loaded");
    }
    static void care(){
        System.out.println("care");
    }

}
class child extends parent{
    static{
        System.out.println("child is loaded");
    }
    static void nurture(){
        System.out.println("nurture");
    }

}

