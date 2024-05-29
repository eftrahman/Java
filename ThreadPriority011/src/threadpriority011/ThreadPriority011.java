package threadpriority011;
/**
 *
 * @Ringler 03.04.2022
 */
public class ThreadPriority011 {
    public static void main(String[] args)throws Exception {
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i = 1;i<10;i+=2){
                    System.out.println("Odd : "+i);
                }
            }
        },"Thread01");
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i = 2;i<10;i+=2){
                    System.out.println("Even : "+i);
                }
            }
        },"Thread02");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }    
}
