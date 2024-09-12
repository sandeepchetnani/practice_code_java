//thread is a sub process inside a process
//extend thread(class) 
//runnable(implements  interface)


class thread6 extends Thread 
{
    @Override
    public void run() {
        for(int i=0;i<100;i++)
        {
            System.out.println("hi");
        }
    }
}
class thread8 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++)
        {
            System.out.println("hello");
        }
    }
}


public class thread7 {
    public static void main(String[] args) {
        thread6 t6=new thread6();
        thread8 t8=new thread8();
         t6.start();
         t8.start();
    }
    
}
