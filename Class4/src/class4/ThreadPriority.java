
package class4;

class A extends Thread{
    public void run(){
        System.out.println("thread A Started");
        for (int i = 0; i < 10; i++) {
            System.out.println("\t From thread A: i= "+i);
            
        }
        System.out.println("Exist from A");
    }
}
class B extends Thread{
    public void run(){
        System.out.println("thread B Started");
        for (int j= 0; j < 10; j++) {
            System.out.println("\t From thread A: j= "+j);
            
        }
        System.out.println("Exist from B");
    }
}
class C extends Thread{
    public void run(){
        System.out.println("thread C Started");
        for (int k = 0; k < 10; k++) {
            System.out.println("\t From thread A: k= "+k);
            
        }
        System.out.println("Exist from C");
    }
}


public class ThreadPriority {
    public static void main(String[] args) {
        A threadA =new A();
        B threadB =new B();
        C threadC =new C();
        
        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority()+1);
        threadA.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Start thread A");
        threadA.start();
        System.out.println("Start thread B");
         threadB.start();
        System.out.println("Start thread C");
         threadC.start();
         
         System.out.println("Enbd of main thrad");
    }
    
}
