package thread000011;
public class Thread000011 {
    public static void main(String[] args) {
//        mythread01 obj1 = new mythread01();
//        obj1.start();
//        Thread obj2 = new Thread(new mythread2());
//        obj2.start();
        for(int i=0;i<5;i++){
            mythread01 obj1 = new mythread01(i);
            obj1.start();
        }
//        for(int i=0;i<10;i++){
//            System.out.println("main Loop : "+i);
//        }
    }
    
}
