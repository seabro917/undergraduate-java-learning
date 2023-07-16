package MyTest;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * �ⲿ����Ϊ�¼�������
 */

public class OuterClassEvent extends JFrame{ 
	    JButton btn;

	    public OuterClassEvent(){
	        super("Java�¼���������");
	        setLayout(new FlowLayout());
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        btn=new JButton("���");
	        btn.addActionListener(new OuterClass(this));  //�Զ�ִ���ⲿ�������actionPerformed������
	        getContentPane().add(btn);

	        setBounds(200,200,300,160);
	        setVisible(true);
	    }

	    public static void main(String args[]){
	        new OuterClassEvent();
	    }
	} 

	/*�ⲿ��*********************************/
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

