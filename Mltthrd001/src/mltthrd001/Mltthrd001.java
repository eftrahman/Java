/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mltthrd001;

/**
 * 16.02.2022
 * @Rinzler
 */
//class task{
//    void execute(){
//        for(int doc=1;doc<10;doc++){
//            System.out.println("@@@Print Document @@@ "+doc+" Printer_2");
//        }
//    }
//}
class download extends Thread{
    @Override
    public void run()
    {
        for(int doc = 1; doc<6; doc++)
        {
            System.out.println("@@@Downloading@ ");
        }
    }
}
class listen extends Thread{
    @Override
    public void run()
    {
        for(int doc = 1; doc<3; doc++)
        {
            System.out.println(">>>Listening> ");
        }
    }
}
class pause extends Thread{
    @Override
    public void run()
    {
        for(int doc = 1; doc<4; doc++)
        {
            System.out.println("###Paused# ");
        }
    }
}
public class Mltthrd001 {
    public static void main(String[] args) // Main Thread -> deafult
    {
//        thread always run instruction sequally
        System.out.println("-----Program Started----");
        download obj1 = new download();
        obj1.start();
        listen obj2 = new listen();
        obj2.start();
        pause obj3 = new pause();
        obj3.start();
//        task.execute();
        for(int doc = 1; doc<4; doc++)
        {
            System.out.println(">>>Listening> ");
        }
        System.out.println("-----Progam Ended-----");
    }
}
//public class Mltthrd001 {
//
//    public static void main(String[] args) {
//        System.out.println(">>Program_Started<<");
//        task objtask01 = new task();
//        objtask01.execute();
//        for(int doc=1;doc<10;doc++){
//            System.out.println("###Print Document ### "+doc+" Printer_1");
//        }
//        System.out.println(">>Program_Ended<<");
//        
//    }
//    
//}
