
package javaapplication6;

abstract class Bird{
String Feathers = "Yes";
String Beak = "Yes";
String Eggs = "Yes";
String Skeleton = "Yes";

     abstract void owner();   
     abstract void  price();
    
}        
class Blackbird extends Bird{
    @Override
        void owner(){
          
     System.out.println("Bird Name: "+"Blackbird\n"+"characteristics:\n"+"Feathers : "+"Beak :"+"Eggs : ");   
     }
    @Override
        void price(){
      System.out.println("Price: "+"500\n");   
     }
}
class Penguin extends Bird{
   @Override
        void owner(){
          
     System.out.println("Bird Name: "+"Penguin\n"+"characteristics:\n"+"Feathers : "+"Beak :"+"Eggs : ");   
     }
    @Override
        void price(){
      System.out.println("Price: "+"1000\n");   
     }

}
class Starling extends Bird{
    @Override
        void owner(){
          
     System.out.println("Bird Name: "+"Starling\n"+"characteristics:\n"+"Feathers : "+"Beak :"+"Eggs : ");   
     }
    @Override
        void price(){
      System.out.println("Price: "+"1500\n");   
     }

}        
public class JavaApplication6 {


    public static void main(String[] args) {
        Blackbird bd = new Blackbird();
        Penguin  pg=new Penguin();
        Starling st =new Starling();
        bd.owner();
        bd.price();
        
        pg.owner();
         pg.price();
         
        st.owner();
        st.price();
    }
    
}
