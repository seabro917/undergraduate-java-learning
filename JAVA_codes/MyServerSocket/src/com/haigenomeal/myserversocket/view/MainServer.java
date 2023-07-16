package com.haigenomeal.myserversocket.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSeparator;

public class MainServer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public JTextArea text_mess;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public MainServer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		text_mess = new JTextArea();
		
		JLabel label = new JLabel("\u6D77\u54E5\u6628\u665A\u6CA1\u5403\u996D");
		
		JLabel lb_2 = new JLabel("\u5F53\u524D\u88AB\u76D1\u542C\u7684\u7AEF\u53E3\u53F7\u4E3A\uFF1A");
		
		textField = new JTextField();
		textField.setText("12345");
		textField.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(text_mess, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(label)
					.addGap(37)
					.addComponent(lb_2, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(lb_2)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(text_mess, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
