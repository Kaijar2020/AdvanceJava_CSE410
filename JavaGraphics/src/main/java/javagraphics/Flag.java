import java.awt.*;
import javax.swing.JFrame;
public class Flag extends Canvas {
    public void paint(Graphics g){

        
        g.setColor(Color.black);
        g.fillRect(10,35,15,500);
        g.setColor(new Color(46, 139, 89));
        g.fillRect(40,50,300,170);
        g.setColor(Color.red);
        g.fillOval(120,80,120,120);
    }
    public static void main(String[] args){
        Flag lr= new Flag();
        JFrame f = new JFrame();
        f.add(lr);
        f.setSize(1000, 1000);
        f.setVisible(true);
    }
}

