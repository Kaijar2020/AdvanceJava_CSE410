


class ClassA extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("\tFrom ThreadA: i= "+i);
        }
        System.out.println("Exit From A");
    }
}
class ClassB extends Thread{
    public void run(){
        for(int j=1; j<=5; j++){
            System.out.println("\tFrom ThreadB: j= "+j);
        }
        System.out.println("Exit From B");
    }
}
class ClassC extends Thread{
    public void run(){
        for(int k=1; k<=5; k++){
            System.out.println("\tFrom ThreadB: k= "+k);
        }
        System.out.println("Exit From C");
    }
}
public class ThreadTest{
    public static void main(String args[]){
        new ClassA().start();
        new ClassB().start();
        new ClassC().start();
    }
}