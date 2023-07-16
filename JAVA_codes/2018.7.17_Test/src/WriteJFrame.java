import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class WriteJFrame extends JFrame implements ActionListener
{
		private DefaultTableModel tablemodel;
		private JPanel panel;
		private JButton bt_1;
		private JTextField text_1,text_2;
		private String filename;
		private String titles[];
		public WriteJFrame(String filename,String titles[])
		{
			super("���ݴ洢");
			this.setBounds(200,300,400,350);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.filename=filename;
			this.titles=titles;
			panel=new JPanel();
			this.add(panel,"North");
			for(int i=0;i<titles.length;i++)
			{
				titles[i]=(i+1)+"";
			}
			this.tablemodel=new DefaultTableModel(titles,1);
			JTable jtable=new JTable(tablemodel);
			this.add(jtable,"Center");
			bt_1=new JButton("����");
			bt_1.addActionListener(this);
			JLabel jlabel=new JLabel("���������");
			text_1=new JTextField(8);
			text_1.setEditable(true);
			text_1.addActionListener(this);
			text_2=new JTextField(8);
			text_2.setEditable(true);
			this.panel.add(jlabel);
			this.panel.add(text_1);
			this.panel.add(bt_1);
			this.panel.add(text_2);
			text_2.setText(filename);
			this.add(new JScrollPane(jtable));
			this.setVisible(true);			
		}
	public void actionPerformed(ActionEvent ev)
	{
			if(ev.getSource()==text_1)
			{
				try
				{
					random(Integer.parseInt(text_1.getText()));
				}
				catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(this,"\""+text_1.getText()+"\""+"����ת����������");
				}
			}
			else if(ev.getActionCommand().equals("����"))
			{
					WriteTo(this.filename,this.tablemodel);
			}	
	}
	public void WriteTo(String filename,DefaultTableModel tablemode)
	{
		try 
		{
			FileOutputStream fout = new FileOutputStream(filename);
			DataOutputStream dout=new DataOutputStream(fout);
			for(int i=0;i<this.tablemodel.getRowCount();i++)
			{
				for(int j=0;j<this.titles.length;j++)
				{
					Object obj=this.tablemodel.getValueAt(i, j);
					if(obj==null)
						break;
					else if(obj instanceof Integer)
					{
						dout.writeInt(((Integer)obj).intValue());
						dout.writeChars(" ");
					}
					else if(obj instanceof String)
					{
						try
						{
							dout.writeInt(Integer.parseInt((String)obj));
						}
						catch(NumberFormatException ex)
						{
							
						}
					}
				}
			}
		dout.close();
		fout.close();
			
		} 
		catch (IOException e) 
		{
			JOptionPane.showMessageDialog(this, "û���ҵ�Ŀ����Ϊ"+"\""+text_1.getText()+"\""+"���ļ���");
		}
	//���д���û�б�ִ�й�����ô������ʵ�֡����������ʱʹ�õ�filenameָ�����ļ�������ʱ�׳�FileNotFoundException��
	//���ҳ��������Ĵ��ڰ�...
	}
	 
	public void random(int i)
	{
		this.tablemodel.setRowCount((i/this.titles.length)+1);
		for(int n=0;n<this.tablemodel.getRowCount();n++)
		{
			for(int j=0;j<titles.length;j++)
			{
				if(n*10+j<i)
					this.tablemodel.setValueAt((int)(Math.random()*100), n, j);
/*
 * ����һ�д�����һ��ʼû�и�Math.randon()*100�������ţ����н��Ϊ���в������������Ϊ0��Ϊʲô��
 * ��Ϊû�����ţ����� (int)Math.random()*100  �൱���Ƚ�Math��random()���ɵ������ǿ��ת����int,������֪��
 * random������������ķ�ΧΪ...ֱ��ת����int��ȻΪ0���ٳ���100�϶�����0.
 */
				else
					this.tablemodel.setValueAt(null, n, j);
			}
		}
		
	}
	public static void main(String args[])
	{
		String titles[]=new String[10];
		String filename="D:\\Studying\\MyEclipse-MyWork\\2018.7.17_Test\\File_2.txt";
		WriteJFrame wt1=new WriteJFrame(filename,titles);
	}
}
