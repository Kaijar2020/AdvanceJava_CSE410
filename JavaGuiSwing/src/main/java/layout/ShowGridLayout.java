
package layout;

import javax.swing.*;
import java.awt.GridLayout;
public class ShowGridLayout extends JFrame {
    public ShowGridLayout(){
        setLayout(new GridLayout(4, 2, 3, 3));
        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("MI"));
        add(new JTextField("1"));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
        add(new JButton("Submit"));
    }
    public static void main(String args[]){
        ShowGridLayout frame = new ShowGridLayout();
        frame.setTitle("ShowGridLayout");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
