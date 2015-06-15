import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CBDemo implements ItemListener{
	JLabel jlabSelected, jlabChanged;
	JCheckBox jcbAlpha, jcbBeta, jcbGamma;
	JFrame jfrm;
	
	CBDemo(){
		jfrm = new JFrame("Demonstrate CheckBoxes");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(280,120);
		
		jlabSelected = new JLabel("");
		jlabChanged = new JLabel("");
		
		jcbAlpha = new JCheckBox("Alpha");
		jcbBeta = new JCheckBox("Beta");
		jcbGamma = new JCheckBox("Gamma");
		
		jcbAlpha.addItemListener(this);
		jcbBeta.addItemListener(this);
		jcbGamma.addItemListener(this);
		
		jfrm.add(jcbAlpha);
		jfrm.add(jcbBeta);
		jfrm.add(jcbGamma);
		jfrm.add(jlabChanged);
		jfrm.add(jlabSelected);
		
		jfrm.setVisible(true);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String str = "";
		JCheckBox cb = (JCheckBox) e.getItem();
		if(cb.isSelected())
			jlabChanged.setText(cb.getText() + " was just selected");
		else
			jlabChanged.setText(cb.getText() +  " was just cleared");
		
		if(jcbAlpha.isSelected())
			str += "Alpha ";
		if(jcbBeta.isSelected())
			str += "Beta ";
		if(jcbGamma.isSelected())
			str += "Gamma";
		jlabSelected.setText("Selected CheckBoxes: " + str);
	}
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new CBDemo();
			}
		});
	}

}
