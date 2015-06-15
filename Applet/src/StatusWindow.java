import java.awt.*;
import java.applet.*;

public class StatusWindow extends Applet{
	public void paint(Graphics g){
		g.drawString("This is the Applet Window", 10 , 20);
		showStatus("This is shown in the status window");
	}
}
