package stackswitchcase001;

import java.util.Stack;
import java.util.Scanner;

/**
 *
 * @Rinzler 06.04.2022
 */
public class StackSwitchcase001 {

    public static void main(String[] args) {
        Stack<Float> st1 = new Stack<Float>();
        st1.push(1.1f);
        st1.push(1.2f);
        st1.push(1.3f);
        st1.push(1.4f);
        st1.push(1.5f);

        int option;
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();
        boolean b = false;
        while (!b) {
            System.out.println("Enter Option - 1 : Push");
            System.out.println("Enter Option - 2 : Pop");
            System.out.println("Enter Option - 3 : Show top value");
            System.out.println("Enter Option - 4 : exit");
            switch (option) {
                case 1:
                    System.out.print("Enter a float value to push :");
                    float f1 = sc.nextFloat();
                    st1.push(f1);
                    break;
                case 2:
                    if (st1.empty()) {
                        System.out.println("Stack is empty");
                    } else {
                        st1.pop();
                    }
                    break;
                case 3:
                    if (st1.empty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Top value : "+st1.peek());
                    }
                    break;
                case 4:
                    b = true;
            }
        }

    }

}
