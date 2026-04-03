package cseA;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventPerformed extends JFrame implements MouseListener
{
	JLabel l1;
	
   public MouseEventPerformed() 
   {
	   setVisible(true);
	   setSize(500, 500);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   setLayout(new FlowLayout());
	   l1= new JLabel();
	   
	   add(l1);
	   addMouseListener(this);
   }
	public static void main(String[] args)
	{
		MouseEventPerformed m = new MouseEventPerformed();

	}
	@Override
	public void mouseClicked(MouseEvent e)
	{
		l1.setText("Mouse Clicked");
		
	}
	@Override
	public void mousePressed(MouseEvent e)
	{
		l1.setText("Mouse Pressed");
	}
	@Override
	public void mouseReleased(MouseEvent e) 
	{
		l1.setText("Mouse Released");
	}
	@Override
	public void mouseEntered(MouseEvent e)
	{
		l1.setText("Mouse Entered");
	}
	@Override
	public void mouseExited(MouseEvent e) 
	{
		l1.setText("Mouse Exited");
	}
}