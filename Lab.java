import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab extends JFrame implements ActionListener{
	JTextField text;
	JButton button;
	JTextArea area;
	String s="";

   public Lab(){
   	text = new JTextField (8);
   	button = new JButton ("clear");
   	area = new JTextArea(10,30);

   	setLayout(new FlowLayout());
   	add(text);
   	add(button);
   	add(area);

   	text.addActionListener(this);
   	button.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent c){
		if(c.getSource()==text){
			s=s+text.getText()+"\n";
			area.setText(""+s);
			text.setText("");
		}
		else{
			s="";
			area.setText("");
		}

	}
	public static void main (String[] args){
		Lab frame = new Lab();
		frame.setTitle("Lab");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,250);
		frame.setVisible(true);
	}
}