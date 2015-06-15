import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ListDemo implements ListSelectionListener {

	JList<String> jlst;
	JLabel jlab;
	JScrollPane jscrlp;
	String names[] = {
			"Sherry", "Jon","Rachel",
			"Sasha", "Josselyn", "Randy",
			"Tom", "Mary", "Ken", 
			"Andrew", "Matt", "Todd"			
	};
	ListDemo(){
		JFrame jfrm = new JFrame("JList Demo");
		jfrm.setSize(200, 160);
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlst = new JList<String>(names);
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		jscrlp = new JScrollPane(jlst);
		jscrlp.setPreferredSize(new Dimension(120,90));
		
		jlab = new JLabel("Please choose a name");
		
		jlst.addListSelectionListener(this);
		
		jfrm.add(jscrlp);
		jfrm.add(jlab);
		
		jfrm.setVisible(true);
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		int idx = jlst.getSelectedIndex();
		if(idx != -1)
			jlab.setText("Current Selection: " + names[idx]);
		else
			jlab.setText("Please choose a name");
	}
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new ListDemo();
			}
		});
	}

}
