package thread000011;

import java.util.logging.Level;
import java.util.logging.Logger;

public class mythread01 extends Thread {
    private int TN;
    public mythread01(int TN){
        this.TN = TN;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
        System.out.println("loop no : "+i+" From : "+TN);
        if(TN==3){
            throw new RuntimeException(); 
        }
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(mythread01.class.getName()).log(Level.SEVERE, null, ex);
//        }
        }
        
            
        
    }
}
