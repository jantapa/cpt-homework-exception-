import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Gui3 extends JFrame{
 
      String s = "";

	public Gui3(){
   
	JTextField fl = new JTextField(10);
	JButton btn = new JButton("Clear");
	JTextArea a = new JTextArea(10,30);
	
	setLayout(new FlowLayout());

	add(fl);
	add(btn);
	add(a); 
    
     fl.addActionListener(
        new ActionListener(){

         @Override

         public void actionPerformed(ActionEvent e)
         {   

         	if(e.getSource() == fl ){
			s = fl.getText();
            a.append(s + "\n");
			fl.setText(" ");

		  }
        }

    });

     btn.addActionListener(

     	new ActionListener(){

     		@Override

         public void actionPerformed(ActionEvent e)
         {   
         	if (e.getSource() == btn ){
         	 a.setText(" ");
         	 fl.setText(" ");
              }
         }

     	});

}
  
    public static void main(String[] args) {
        
        Gui3 frame = new Gui3();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        
  }

}
