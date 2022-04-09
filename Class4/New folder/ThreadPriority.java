


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
public class ThreadPriority{
    public static void main(String args[]){
        ClassA threadA = new ClassA();
        ClassB threadB = new ClassB();
        ClassC threadC = new ClassC();

        threadA.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(6);
        threadC.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Start Thread A");
		  threadA.start();
		  System.out.println("Start Thread B");
		  threadB.start();
		  System.out.println("Start Thread C");
		  threadC.start();

        System.out.println("End of main thread");
    }
}