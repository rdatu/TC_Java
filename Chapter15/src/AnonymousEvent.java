import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class AnonymousEvent{
	
	JLabel jlab;
	AnonymousEvent(){
		JFrame jfrm = new JFrame("Button Example");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(220,90);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton jbtnUp = new JButton("Up");
		JButton jbtnDown = new JButton("Down");
		
		//Add Anonymous function to handle action listener events
		jbtnUp.addActionListener(new ActionListener(){    
			public void actionPerformed(ActionEvent e) {
				jlab.setText("You pressed Up");
			}
		});
		jbtnDown.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				jlab.setText("You pressed Down");
			}
		});
		
		jfrm.add(jbtnUp);
		jfrm.add(jbtnDown);
		
		jlab = new JLabel("Press a Button");
		jfrm.add(jlab);
		
		jfrm.setVisible(true);
	}
	
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new AnonymousEvent();
			}
		});
	}

}
