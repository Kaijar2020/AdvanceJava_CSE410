package graphics.regform;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {

	// Components of the Form
	private Container c;
	private JLabel title;
	private JLabel name;
	private JTextField tname;
	private JLabel mno;
	private JTextField tmno;
	private JLabel campus;
	private JRadioButton city;
	private JRadioButton perm;
	private ButtonGroup campgrp;
	private JLabel sem;
	private JComboBox date;
	private JComboBox month;
	private JComboBox sembox;
	private JLabel dayLabel;
	private JTextArea tadd;
	private JCheckBox sat, sun, mon, tue, wed, thu, fri;
	private JButton sub;
	private JButton reset;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;
        private JPanel namePanel, idPanel, genderPanel;
        private String semesters[] = {"Summer", "Spring", "Fall"};
	private JPanel dayPanel;

	// constructor, to initialize the components
	// with default values.
	public MyFrame()
	{
		setTitle("Registration Form");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Registration Form");
                title.setSize(300, 40);
                title.setLocation(300, 50);
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		c.add(title);

		name = new JLabel("Name:");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 20);
		name.setLocation(100, 100);
		c.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 20);
		tname.setLocation(200, 100);
		c.add(tname);

		mno = new JLabel("Id:");
		mno.setFont(new Font("Arial", Font.PLAIN, 20));
		mno.setSize(100, 20);
		mno.setLocation(100, 150);
		c.add(mno);

		tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 15));
		tmno.setSize(150, 20);
		tmno.setLocation(200, 150);
		c.add(tmno);

		campus = new JLabel("Campus:");
		campus.setFont(new Font("Arial", Font.PLAIN, 20));
		campus.setSize(100, 20);
		campus.setLocation(100, 200);
		c.add(campus);

		city = new JRadioButton("City");
		city.setFont(new Font("Arial", Font.PLAIN, 15));
		city.setSelected(true);
		city.setSize(60, 20);
		city.setLocation(200, 200);
		c.add(city);

		perm = new JRadioButton("Permanent");
		perm.setFont(new Font("Arial", Font.PLAIN, 15));
		perm.setSelected(false);
		perm.setSize(100, 20);
		perm.setLocation(260, 200);
		c.add(perm);

		campgrp = new ButtonGroup();
		campgrp.add(city);
		campgrp.add(perm);

		sem = new JLabel("Semester:");
		sem.setFont(new Font("Arial", Font.PLAIN, 20));
		sem.setSize(100, 20);
		sem.setLocation(100, 250);
		c.add(sem);

		sembox = new JComboBox(semesters);
		sembox.setFont(new Font("Arial", Font.PLAIN, 15));
		sembox.setSize(100, 20);
		sembox.setLocation(320, 250);
		c.add(sembox);

		        dayPanel = new JPanel();
        dayLabel = new JLabel("Class Day: ");
        		dayLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		dayLabel.setSize(100, 20);
        dayPanel.add(dayLabel);
        sat = new JCheckBox("Sat");
        sun = new JCheckBox("Sun");
        mon = new JCheckBox("Mon");
        tue = new JCheckBox("Tue");
        wed = new JCheckBox("Wed");
        thu = new JCheckBox("Thu");
        fri = new JCheckBox("Fri");
        dayPanel.add(sat);
        dayPanel.add(sun);
        dayPanel.add(mon);
        dayPanel.add(tue);
        dayPanel.add(wed);
        dayPanel.add(thu);
        dayPanel.add(fri);
		dayPanel.setFont(new Font("Arial", Font.PLAIN, 20));
		dayPanel.setSize(100, 20);
		dayPanel.setLocation(100, 300);
		c.add(dayPanel);


               

		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(150, 450);
		sub.addActionListener(this);
		c.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(270, 450);
		reset.addActionListener(this);
		c.add(reset);

		tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(300, 400);
		tout.setLocation(500, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(100, 500);
		c.add(res);

		resadd = new JTextArea();
		resadd.setFont(new Font("Arial", Font.PLAIN, 15));
		resadd.setSize(200, 75);
		resadd.setLocation(580, 175);
		resadd.setLineWrap(true);
		c.add(resadd);

		setVisible(true);
	}

	// method actionPerformed()
	// to get the action performed
	// by the user and act accordingly
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == sub) {
			if (sat.isSelected()) {
				String data1;
				String data = "Name : "
					+ tname.getText() + "\n"
					+ "Mobile : "
					+ tmno.getText() + "\n";
				if (city.isSelected())
					data1 = "Gender : Male" + "\n";
				else
					data1 = "Gender : Female" + "\n";
				String data2
					= "DOB : "
					+ (String)date.getSelectedItem()
					+ "/" + (String)month.getSelectedItem()
					+ "/" + (String)sembox.getSelectedItem()
					+ "\n";

				String data3 = "Address : " + tadd.getText();
				tout.setText(data + data1 + data2 + data3);
				tout.setEditable(false);
				res.setText("Registration Successfully..");
			}
			else {
				tout.setText("");
				resadd.setText("");
				res.setText("Please accept the"
							+ " terms & conditions..");
			}
		}

		else if (e.getSource() == reset) {
			String def = "";
			tname.setText(def);
			tadd.setText(def);
			tmno.setText(def);
			res.setText(def);
			tout.setText(def);
			sun.setSelected(false);
			date.setSelectedIndex(0);
			month.setSelectedIndex(0);
			sembox.setSelectedIndex(0);
			resadd.setText(def);
		}
	}
}

// Driver Code
class RegForm {

	public static void main(String[] args) throws Exception
	{
		MyFrame f = new MyFrame();
	}
}
