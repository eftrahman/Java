package interthreadcom;
class Q{
    boolean value = false;
    int N;
    public void synchronized setN(int N){
        while(value){
            try{
            wait();}catch(Exception e){}
            }
        }
        this.N = N;
        System.out.println("set : "+N);
        value = true;
        notify();
    }
    public void synchronized getN(){
        while(!value){
            try{
                wait();
            }catch(Exception e){
        }
    }
        System.out.println("get : "+N);
        value = false;
        notify();
    }
}
class producer implements Runnable{
    Q q;
    public producer(Q q){
        this.q = q;
        Thread t1 = new Thread(this,"producer");
        t1.start();
    }
    @Override
    public void run() {
        int i=0;
        while(true){
            q.setN(i++);
        }
//        try{Thread.sleep(1000);}
//        catch(InterruptedException e){}
    }   
}
class consumer implements Runnable{
    Q q;
    public consumer(Q q){
        this.q = q;
        Thread t2 = new Thread(this,"consumer");
        t2.start();
    }
    @Override
    public void run() {
        while(true){
            q.getN();
//        try{Thread.sleep(1000);}
//        catch(InterruptedException e){} 
        }
    }
    
}
public class InterThreadCom {

    public static void main(String[] args) {
        Q q = new Q();
        new producer(q);
        new consumer(q);
        
    }    
}
