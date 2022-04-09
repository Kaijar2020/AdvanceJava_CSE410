
package calculator;

/**
 *
 * @author Kaijar Akib
 */
public class Calculator {
    public static void main(String args[]){
        Addition addobj = new Addition();
        Subtractor subobj = new Subtractor();
        Multiplication mulobj = new Multiplication();
        Division divobj = new Division(); 
        
      //  addobj.add(3, 5);
      //  subobj.subtract(5,3);
      //  mulobj.multiply(4,4);
        divobj.divide(10, 2);
    }
 
    
    
}
