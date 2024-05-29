package exception01;
import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;

/**
 * 02.04.2022
 * @Rinzler
 */
public class Exception01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[4];
        try{
            for(int i=0;i<N;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = a/b;
            System.out.println("x = "+x);
            arr[7]=7;
            //throw new ArithmeticException();
            }
        }
        catch(ArithmeticException e){
            System.out.println("Exception :"+e);
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("Exception :"+e1);
        }
//        catch(IOException e){
//            System.out.println("error02 ");
//        }
        finally{
            System.out.println("error03 ");
        }
    }
    
}
