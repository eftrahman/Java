package stack011;
import java.util.ArrayList;

public class Stack011 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();   
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(1); //3
        al.add(4);
        al.add(5);        
        al.remove(3);//remove       
        System.out.println("Contents of al : "+al);
        
        //covert to array :
        
        Integer A[] = new Integer[al.size()];
        A= al.toArray(A);
        
        int sum =0;
        for(int i :A) sum+=i;
        System.out.println("Sum : "+sum);        
    }    
}
