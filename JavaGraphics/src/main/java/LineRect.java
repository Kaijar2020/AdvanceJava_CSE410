import java.awt.*;
import javax.swing.JFrame;
public class LineRect extends Canvas {
    public void paint(Graphics g){
        g.drawLine(10, 10, 50, 50);
        g.drawRect(10, 60, 40, 30);
        g.fillRect(60, 10, 30, 80);
        g.drawRoundRect(10, 100, 80, 50, 10, 10);
        g.fillRoundRect(20, 110, 60, 30, 5, 5);
        g.drawLine(100, 10, 230, 140);
        g.drawLine(100, 75, 230, 75);
        g.drawLine(100, 140, 230, 10);
        g.drawLine(165, 140, 165, 10);
        g.drawRect(10, 160, 40, 30);
        g.fillRect(10, 160, 40, 30);
        g.drawRect(10, 200, 40, 30);
        

    }
    public static void main(String[] args){
        LineRect lr= new LineRect();
        JFrame f = new JFrame();
        f.add(lr);
        f.setSize(1000, 1000);
        f.setVisible(true);
    }
}

