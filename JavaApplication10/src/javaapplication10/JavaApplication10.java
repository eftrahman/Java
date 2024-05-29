
package javaapplication10;

/**
 *
 * @author ALL
 */
abstract class abst{
    abstract void A();
}
class child extends abst{

    void A(int a) {
    }

    @Override
    void A() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
