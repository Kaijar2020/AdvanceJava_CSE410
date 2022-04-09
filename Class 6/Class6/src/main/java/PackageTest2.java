

/**
 *
 * @author ASUS
 */
import package2.ClassB;
class ClassC extends ClassB{
    int n=20;
    void display(){
       System.out.println("Class C");
       System.out.println("m = "+m);
       System.out.println("n = "+n);
    }
}
public class PackageTest2 {
    public static void main(String args[]){
        ClassC objC = new ClassC();
        
        objC.dislayB();
        objC.display();
    }
}
