package exception03;
import java.util.Scanner;
/**
 *
 * @author ALL
 */
class myException01 extends Exception{
    @Override
    public String toString(){
        return "Too Small";
    }
    @Override
    public String getMessage(){
        return "Too Small";
    }
}
public class Exception03 {
    public static void checksz(int sz) throws myException01{
        if(sz<8){
            throw new myExceptio01();
        }
        else{
            System.out.println("All Okay");
        }        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = str.length();
        try{
            checksz(a);
        }
        catch(myException01 e){
            System.out.println("Exceptio : "+e);
        }
        
    }
    
}
