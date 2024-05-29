package thread000011;

import java.util.logging.Level;
import java.util.logging.Logger;

public class mythread2 implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
        System.out.println("Thread02 loop no : "+i);
        try {
            Thread.sleep(700);
        } catch (InterruptedException ex) {
            Logger.getLogger(mythread2.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }    
}
