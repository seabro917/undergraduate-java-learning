package MyTest;

import java.awt.event.MouseEvent; 
import java.awt.event.MouseListener; 
 
import javax.swing.JButton; 
import javax.swing.JFrame; 
public class ActionTest extends JFrame { 
	    private JButton jb; 
	 
	    public ActionTest() { 
	        jb = new JButton("确定"); 
	        jb.addMouseListener(new MouseListener() { 
	            public void mouseClicked(MouseEvent e) { //事件源不同的操作对应不同的事件处理方法
	                jb.setText("事件响应了"); 
	            } 
	 
	            public void mouseEntered(MouseEvent e) { 
	            } 
	 
	            public void mouseExited(MouseEvent e) { 
	            } 
	 
	            public void mousePressed(MouseEvent e) { 
	            } 
	 
	            public void mouseReleased(MouseEvent e) { 
	            } 
	        });
	        this.add(jb); 
	        this.setSize(300, 200); 
	        this.setDefaultCloseOperation(3); 
	        this.setVisible(true); 
	 
	    } 
	 
	    public static void main(String[] args) { 
	        new ActionTest(); 
	    } 
	}


