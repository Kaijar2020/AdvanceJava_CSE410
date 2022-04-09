
package calculator;

/**
 *
 * @author Mishu Rahman
 */
public class Division {
    public void divide(int x, int y){
        float z = 0;
        try{
            System.out.println("Division is: "+(x/y));
        }catch(ArithmeticException e){
            System.out.println("Can't divide by zero");
        }
        
    }
}
