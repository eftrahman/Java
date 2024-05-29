package demobox;
import java.util.*;
/**
 * @Rinzler
 * 05.01.2022
 */
class Box{
    double heigth,width,depth;
    double volume(){
        return heigth*width*depth;
    }
}
public class DemoBox {

    public static void main(String[] args) {
        double vol1,vol2;
        Box obj1 = new Box();
        Box obj2 = new Box();
        Scanner myScan = new Scanner(System.in);
        System.out.println("1st object : ");
        System.out.print("Height : "); 
        obj1.heigth = myScan.nextDouble();
        System.out.print("Widht : ");
        obj1.width = myScan.nextDouble();
        System.out.print("Depht : ");
        obj1.depth = myScan.nextDouble();
        vol1 = obj1.volume();
        System.out.print("Volume : "+vol1);
        System.out.println("2nd object : ");
        System.out.print("Height : "); 
        obj2.heigth = myScan.nextDouble();
        System.out.print("Widht : ");
        obj2.width = myScan.nextDouble();
        System.out.print("Depht : ");
        obj2.depth = myScan.nextDouble();
        vol2 = obj2.volume();
        System.out.println("Volume : "+vol1);
        
    }
    
}
