import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

/**
 * 2018.7.13�������
 * @author ��������û�Է�
 *ʵ���ַ��������ѭ������
 */
public class MyThreadTest4 extends JFrame implements ActionListener,Runnable
{
	int sleeptime;
	JPanel MyPanel;
	JTextField show_field,text_sleep;
	JButton button_start,button_end;
	Thread thread;
	String text[];
	
	static int count=0;
	public MyThreadTest4(String text[])
	{	
		super("���ӾͲ����Լ�ѧ����");
		this.text=text;
		this.setBounds(300, 240, 400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		MyPanel=new JPanel();
		MyPanel.setLayout(new GridLayout(2,1));
		this.add(MyPanel);
		show_field=new JTextField();
		MyPanel.add(show_field);
		show_field.setEditable(false);
		if(text.length==0||text==null)
			show_field.setText(String.format("%115s", "�ֵ���ɶ��Ҳû����ѽ��"));
		else
			show_field.setText(String.format("%115s", text[0]));
		JPanel sub_panel=new JPanel();
		MyPanel.add(sub_panel);
		sub_panel.add(new JLabel("sleep"));
		sleeptime=(int)(Math.random()*100);
		text_sleep=new JTextField(""+sleeptime,5);  //����Ҫ��ֱ�Ӱ��ı��е��������ó�sleeptime����ô����
		sub_panel.add(text_sleep);
		text_sleep.addActionListener(this);
		button_start=new JButton("����");
		button_start.setEnabled(true);
		button_end=new JButton("�ж�");
		button_end.setEnabled(false);
		sub_panel.add(button_start);
		sub_panel.add(button_end);
		button_start.addActionListener(this);
		button_end.addActionListener(this);	
		this.setVisible(true);
	}
	public void run()
	{
		while(true)
		{
			if(text==null||text.length==0) //����������ַ�������Ϊ�� ���չ��췽����Ĭ�ϵ��ַ���ѭ������.
			{
				try
				{
					String str=show_field.getText();
					show_field.setText(str.substring(1)+str.substring(0,1));
					Thread.sleep(sleeptime);
				}
				catch(InterruptedException ev)
				{
					break;
				}
			}
			else
			{   
				if(show_field.getText().charAt(0)==' ')
				try
				{
					String str=show_field.getText();
					show_field.setText(str.substring(1)+str.substring(0,1));
					Thread.sleep(sleeptime);
				}
				catch(InterruptedException ev)
				{
					break;
				}
				else if(show_field.getText().charAt(1)!=' ')
				{
					//��ʼ��ʾ��һ���ַ����Ĺ���
					count++;
					if(count==text.length)	
						count=0;
		     		show_field.setText(String.format("%115s", text[count]));
				}
			}
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button_start)
		{
			thread=new Thread(this);
			try
			{
				sleeptime=Integer.parseInt(text_sleep.getText());
			}
			catch(NumberFormatException ev)
			{
				JOptionPane.showMessageDialog(this, "\""+text_sleep.getText()+"\""+"����ת����������");
			}
			thread.start();
			button_start.setEnabled(false);
			button_end.setEnabled(true);
		}
		else if(e.getSource()==button_end)
		{
			thread.interrupt();
			button_start.setEnabled(true);
			button_end.setEnabled(false);
		}
		else if(e.getSource()==text_sleep)
		{
			try
			{
				sleeptime=Integer.parseInt(text_sleep.getText());
			}
			catch(NumberFormatException ev)
			{
				JOptionPane.showMessageDialog(this, "\""+text_sleep.getText()+"\""+"����ת����������");
			}
		}
	}
	
	public static void main(String args[])
	{
		String text[]={};
		MyThreadTest4 fvck=new MyThreadTest4(text);
	}
}
