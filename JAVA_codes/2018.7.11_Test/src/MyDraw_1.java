import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyDraw_1 extends JFrame
{
	public MyDraw_1()
	{
		super("Äã±ð¸ãÎÒ°¡");
        this.setBounds(400,300,400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new MyCanvas());     
        this.setVisible(true);
	}
	class MyCanvas extends Canvas implements MouseListener,MouseMotionListener
	{
		Point start,end,middle;
		 public MyCanvas()
		{
			start=end=middle=null;
			this.addMouseListener(this);
			this.addMouseMotionListener(this);
		}
		 public void mousePressed(MouseEvent ev)
		 {
			 start=ev.getPoint();
		 }
		 public void mouseReleased(MouseEvent ev)
		 {
			 end=ev.getPoint();
			 repaint();
		 }
	      public void mouseClicked(MouseEvent ev) {}         
	      public void mouseEntered(MouseEvent ev) {}        
	      public void mouseExited(MouseEvent ev) {}          
	      public void mouseMoved(MouseEvent ev){}       	  
	      public void mouseDragged(MouseEvent ev){}  
     	 public void paint(Graphics g)
	     {
		     if(start!=null&&end!=null)
		    {
			     g.setColor(Color.BLUE);
		    	 g.drawLine(start.x,start.y, end.x, end.y);
		    }
	     }
	      public void update(Graphics g)
	     {
	      	paint(g);
	     }
	 }
	public static void main(String args[])
	{
		MyDraw_1 myc=new MyDraw_1();
	}
	 
		
	

}
