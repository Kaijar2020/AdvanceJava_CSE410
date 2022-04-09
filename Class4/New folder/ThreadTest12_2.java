


class ClassA extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
			if(i==1) Thread.yield();
            System.out.println("\tFrom ThreadA: i= "+i);
        }
        System.out.println("Exit From A");
    }
}
class ClassB extends Thread{
    public void run(){
        for(int j=1; j<=5; j++){
            System.out.println("\tFrom ThreadB: j= "+j);
            if(j==3) stop();
        }
        System.out.println("Exit From B");
    }
}
class ClassC extends Thread{
    public void run(){
        for(int k=1; k<=5; k++){
			System.out.println("\tFrom ThreadB: k= "+k);
			if(k==1){
				try{
					sleep(5000);
				}catch (Exception e){

				}
			}
        }
        System.out.println("Exit From C");
    }
}
public class ThreadTest12_2{
    public static void main(String args[]){

        ClassA threadA = new ClassA();
        ClassB threadB = new ClassB();
        ClassC threadC = new ClassC();

        System.out.println("Start Thread A");
        threadA.start();
        System.out.println("Start Thread B");
        threadB.start();
        System.out.println("Start Thread C");
        threadC.start();

        System.out.println("End of main thread");

    }
}