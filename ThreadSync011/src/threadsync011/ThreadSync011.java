package threadsync011;
/**
 *
 * @Rinzler 03.04.2022
 */
class mythread01 extends Thread {
    @Override
    public void run(){
        for(int i=1;i<=15;i++){
            System.out.println("**myThread01 Loop : "+i);
        }
    }
} 
class mythread02 implements Runnable {
    @Override
    public void run(){
        for(int i=1;i<=15;i++){
            System.out.println("##myThread02 Loop : "+i);
        }
    }
}    
public class ThreadSync011 {
    public static void main(String[] args)throws Exception {
            mythread01 obj1 = new mythread01();
            Thread obj2 = new Thread(new mythread02());
            obj1.start();
           // obj1.join();
            System.out.println("-----------------------");
            obj2.start();
        }    
    }
