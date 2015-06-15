import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class ButtonDemo implements ActionListener{
	
	JLabel jlab;
	ButtonDemo(){
		JFrame jfrm = new JFrame("Button Example");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(220,90);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton jbtnUp = new JButton("Up");
		JButton jbtnDown = new JButton("Down");
		
		jbtnUp.addActionListener(this);
		jbtnDown.addActionListener(this);
		
		jfrm.add(jbtnUp);
		jfrm.add(jbtnDown);
		
		jlab = new JLabel("Press a Button");
		jfrm.add(jlab);
		
		jfrm.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Up"))
			jlab.setText("You pressed Up");
		else
			jlab.setText("You pressed Down");
	}
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new ButtonDemo();
			}
		});
	}

}
