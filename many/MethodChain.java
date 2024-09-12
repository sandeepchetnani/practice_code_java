class MethodChain {
    
    static MethodChain a(){
      System.out.println("from a");
      return new MethodChain();
    }
    static MethodChain b()
    {
        System.out.println("from b");
        return new MethodChain();
 
    }

    public static void main(String[] args) {
        MethodChain M=new MethodChain();
        M.a().b();
    }
}
