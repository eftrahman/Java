package stackandswitchcase0011;
import java.util.Stack;
import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @Rinzler 06.04.2022
 */
public class StackAndSwitchCase0011 {

    public static void main(String[] args)throws IOException, InterruptedException{
        Stack<Float> st1 = new Stack<Float>();
        st1.push(1.1f);
        st1.push(1.2f);
        st1.push(1.3f);
        st1.push(1.4f);
        st1.push(1.5f);

        int option;
        Scanner sc = new Scanner(System.in);
        char Option;
        
        boolean b = false;
        while (!b) {
            System.out.println("Enter Option - A : Push");
            System.out.println("Enter Option - B : Pop");
            System.out.println("Enter Option - C : Show top value");
            System.out.println("Enter Option - D : exit");
       /**/ Option = sc.next().charAt(0); //Character input in Java.
            switch (Option) {
                case 'A'|'a':
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    System.out.print("Enter a float value to push :");
                    float f1 = sc.nextFloat();
                    st1.push(f1);
                    break;
                case 'B'|'b':
                    if (st1.empty()) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println("Stack is empty");
                    } else {
                        st1.pop();
                    }
                    break;
                case 'C'|'c':
                    if (st1.empty()) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Top value : "+st1.peek());
                    }
                    break;
                case 'D'|'d':
                    b = true;
                    break;
            }
        }
    }
    
}
