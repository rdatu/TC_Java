import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SwingApplet extends JApplet{

	JButton jbtnUp, jbtnDown;
	JLabel jlab;
	
	public void init(){
		try{
			SwingUtilities.invokeAndWait(new Runnable(){
				public void run(){
					makeGUI();
				}
			});
		}catch(Exception exc){
			System.out.println("Can't Create because of: " + exc);
		}
	}
	
	private void makeGUI(){
		setLayout(new FlowLayout());
		jbtnUp = new JButton("Up");
		jbtnDown = new JButton("Down");
		
		jbtnUp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jlab.setText("Up");
			}
		});
		jbtnDown.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				jlab.setText("Down");
			}
		});
		add(jbtnUp);
		add(jbtnDown);
		
		jlab = new JLabel("Press a Button");
		add(jlab);
	}
	
}
