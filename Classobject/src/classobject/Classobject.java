package classobject;
import java.util.Scanner;

/**
 *
 *@Rinzler 
 * 7th February 2024
 */
import java.util.Scanner;

class Employee {
    String name;
    int age;
    int salary;
        
}

public class Classobject {

    public static void main(String[] args) {
        Employee[] employee = new Employee[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            employee[i] = new Employee(); // Create a new Employee object
            System.out.println("Enter details for employee #" + (i + 1) + ":");
            System.out.print("Name: ");
            employee[i].name = sc.nextLine(); // Set the name field
            System.out.print("Age: ");
            employee[i].age = sc.nextInt(); // Set the age field
            System.out.print("Salary: ");
            employee[i].salary = sc.nextInt(); // Set the salary field
            
            // Consume the newline character after reading the integer
            sc.nextLine();
        }
        
        // Print out details of an employee for 
        int B=0;
        int f=0;
        for(int i=0;i<3;i++){
            if(employee[i].salary>B){
                B=employee[i].salary;
                f=i;
            }
        }
        
        System.out.println("Details of employee with the highest salary :");
        System.out.println("Name: " + employee[f].name);
        System.out.println("Age: " + employee[f].age);
        System.out.println("Salary: " + employee[f].salary);
        
        // Close the scanner to prevent resource leak
        sc.close();
    }
}

