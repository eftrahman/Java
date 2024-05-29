/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author ALL
 */
public class JavaApplication8 {
    public static void checkEligiblity(double Height, int Age){
        if(Age<15 && Height>5.7){
            throw new ArithmeticException("too much younger");
        }
        else if(Age<15 && Height<5.7){
            throw new ArithmeticException("too short");
        }
        else if(Age<50 && Height>5.7){
        throw new ArithmeticException("too older");
        }
        else{
        System.out.println("eligible!");
        }
    }
    public static void main(String[] args) {
        String Name = "The Ugly";
        double Height = 5.7;
        int Age = 45;
        checkEligiblity (Height, Age);
        System.out.println("\nName: "+Name+"\nHeight:"+Height+"\nAge: " +Age);
    }
    
}
