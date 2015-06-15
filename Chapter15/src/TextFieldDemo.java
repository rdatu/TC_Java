import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class TextFieldDemo implements ActionListener{
	JFrame jfrm;
	JTextField jtf;
	JButton jbtn;
	JLabel jlabPrompt, jlabContent;
	
	TextFieldDemo(){
		jfrm = new JFrame("Use a TextField");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(240, 120);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jtf = new JTextField(10);
		jtf.setActionCommand("myTF");
		
		jbtn = new JButton("Reverse");
		
		jtf.addActionListener(this);
		jbtn.addActionListener(this);
		
		jlabPrompt = new JLabel("Enter Text:");
		jlabContent = new JLabel("");
		
		jfrm.add(jlabPrompt);
		jfrm.add(jtf);
		jfrm.add(jbtn);
		jfrm.add(jlabContent);
		
		jfrm.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Reverse")){
			String orgStr = jtf.getText();
			String revStr = "";
			for(int i = orgStr.length()-1;i >= 0; i--)
				revStr += orgStr.charAt(i);
			jtf.setText(revStr);
		}
		else
			jlabContent.setText("You Pressed ENTER. Text is " + jtf.getText());
	}
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new TextFieldDemo();
			}
		});
	}
}
