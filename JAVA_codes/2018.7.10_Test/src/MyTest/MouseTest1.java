package MyTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseTest1 extends JFrame {
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseTest1 frame = new MouseTest1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public MouseTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
 
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel label = new JLabel("�˴���ʾ����Ҽ����������");
		label.setBounds(5, 5, 424, 31);
		label.setOpaque(true);//���ÿؼ���͸��
		label.setBackground(Color.GREEN); //<span style="font-family:Verdana;">���ñ����ɫ</span>
		contentPane.add(label);
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==e.BUTTON1){
					int x=e.getX();
					int y=e.getY();
					String str="����������������굱ǰ���λ�õ�������(" + x + "," + y+")";
					label.setText(str);
				}else if(e.getButton()==e.BUTTON2){
					int x=e.getX();
					int y=e.getY();
					String str="��������ǻ��֣���굱ǰ���λ�õ�������(" + x + "," + y+")";
					label.setText(str);	
				}
				else if(e.getButton()==e.BUTTON3){
					int x=e.getX();
					int y=e.getY();
					String str="����������Ҽ�����굱ǰ���λ�õ�������(" + x + "," + y+")";
					label.setText(str);		
				}
			}
		});
	}
}
