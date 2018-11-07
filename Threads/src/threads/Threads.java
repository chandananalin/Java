package threads;

public class Threads {

    public static void main(String[] args) {
        
        Runnable r=new Runnable() {
            @Override
            public void run() {
               task1();
             
            }
        };
        Thread t1=new Thread(r);
        t1.start();
        task2();
    }

    public static void task1() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("No =" + i);
        }
    }

    public static void task2() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Char =" + ((char) i));
        }
    }
}
