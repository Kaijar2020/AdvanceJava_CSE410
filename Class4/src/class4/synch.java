
package class4;

import java.util.logging.Level;
import java.util.logging.Logger;

class Callme{
    void call(String[] msg){
        System.out.println("["+msg);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
//            
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }

    void call(String msg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
class Caller implements Runnable{
  String msg;
  Callme target;
  Thread t;
  public Caller(Callme targ,String s){
      target=targ;
      msg=s;
      t=new Thread(this);
      t.start();
  }
  public void run(){
      synchronized(target){
          target.call(msg);
      }
  }
}

  

public class synch{
        

        public static void main(String[] args) {
        Callme target=new Callme();
        Caller ob1=new Caller (target,"Hello");
        Caller ob2=new Caller (target,"Synchronized");
        Caller ob3=new Caller (target,"World");
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }   catch (InterruptedException ex) {
//                Logger.getLogger(synch.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Interrupted");
            }
        
    
    }
      
    
    
}
