package MyTest;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * 外部类作为事件监听器
 */

public class OuterClassEvent extends JFrame{ 
	    JButton btn;

	    public OuterClassEvent(){
	        super("Java事件监听机制");
	        setLayout(new FlowLayout());
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        btn=new JButton("点击");
	        btn.addActionListener(new OuterClass(this));  //自动执行外部类里面的actionPerformed方法？
	        getContentPane().add(btn);

	        setBounds(200,200,300,160);
	        setVisible(true);
	    }

	    public static void main(String args[]){
	        new OuterClassEvent();
	    }
	} 

	/*外部类*********************************/
	class OuterClass implements ActionListener{
	    OuterClassEvent oce;

	    public OuterClass(OuterClassEvent oce){
	        this.oce = oce;
	    }

	    public void actionPerformed(ActionEvent e){
	        Container c=oce.getContentPane();
	        c.setBackground(Color.red);
	    }
	}

