class thread5 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
            try{Thread.sleep(1000);}catch(Exception e){}

        }

    }

}

class thread6 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }

}

public class thread2{
    public static void main(String[] args) {
        //Runnable obj1=new thread5();
       // Runnable obj2=new thread6();

        Thread t1=new Thread(){
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("hi");
                    try{Thread.sleep(1000);}catch(Exception e){}
        
                }
        
        }};
        Thread t2=new Thread(() -> {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    });
        t1.start();
        t2.start();
        try {t1.join();}catch(Exception e){}
        try {t2.join();}catch(Exception e){}
        System.out.println("main");
    }
}
