import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class MouseEvents extends Applet implements MouseListener, MouseMotionListener{
	String msg = "";
	int mouseX = 0,mouseY = 0;
	
	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "*";
		showStatus("Dragging Mouse at " + mouseX + ", " + mouseY);
		repaint();		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		showStatus("moving mouse at " + e.getX() + ", " + e.getY());
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		mouseX = 0;
		mouseY = 10;
		msg = "MouseClicked";
		repaint();		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "DOWN";
		repaint();
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "UP";
		repaint();
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse Entered";
		repaint();		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse Exited";
		repaint();			
	}
	public void paint(Graphics g){
		g.drawString(msg, mouseX, mouseY);
	}
	
}
