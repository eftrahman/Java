package thread00012;
/**
 * 03.04.2022
 * @Rinzler
 */
public class Thread00012 implements Runnable {   
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread loop : "+i);
        }
    }
    public static void main(String[] args) {
        Thread obj01 = new Thread(new Thread00012());
        obj01.start();
        for(int i=0;i<5;i++){
            System.out.println("Main loop : "+i);
        }
    }   
}
