public class ThreadEx extends Thread {
     public void run()
     {
         for(int i=1;i<10;i++)
         {
          System.out.println("hi");
         }
    }
      public static void main(String[] args) {
        ThreadEx thread=new ThreadEx();
           thread.start();
           try{
           Thread.sleep(2000);
           }
           catch(Exception E)
           {
            E.printStackTrace();
           }
      }


}
