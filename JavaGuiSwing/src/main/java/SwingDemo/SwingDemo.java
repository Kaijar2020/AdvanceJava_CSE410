
package SwingDemo;
import javax.swing.*;
class SwingDemo {
    SwingDemo(){
        JFrame jfrm = new JFrame("A simple swing Application");
        jfrm.setSize(400, 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab = new JLabel(" Swing means powerful GUIs");
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }
    public static void main (String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new SwingDemo();
            }
        });
    }
}
