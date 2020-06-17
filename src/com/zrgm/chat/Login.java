package com.zrgm.chat;

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
//import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAddr;
	private JLabel lblIpAddress;
	private JLabel lblPort;
	private JTextField txtPort;
	
	
	public Login() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 380);
		setLocationRelativeTo(null);
		//setBounds(100, 100, 300, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(62, 59, 170, 31);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(108, 34, 78, 20);
		contentPane.add(lblNewLabel);
		
		txtAddr = new JTextField();
		txtAddr.setColumns(10);
		txtAddr.setBounds(62, 138, 170, 31);
		contentPane.add(txtAddr);
		
		lblIpAddress = new JLabel("IP Address:");
		lblIpAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIpAddress.setBounds(108, 113, 78, 20);
		contentPane.add(lblIpAddress);
		
		lblPort = new JLabel("Port:");
		lblPort.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPort.setBounds(129, 194, 36, 20);
		contentPane.add(lblPort);
		
		txtPort = new JTextField();
		txtPort.setColumns(10);
		txtPort.setBounds(62, 219, 170, 31);
		contentPane.add(txtPort);
		
		JButton loginBtn= new JButton("Login");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String address = txtAddr.getText();
				int port = Integer.parseInt(txtPort.getText());
				
				login(name, address, port);
			}
		});
		loginBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		loginBtn.setBounds(102, 299, 89, 23);
		contentPane.add(loginBtn);
	}
	
	private void login(String name, String address, int port) {
		dispose();
		System.out.println(name + ", " + address + ", " + port);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
