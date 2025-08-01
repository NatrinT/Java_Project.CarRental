package main;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentListener;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.Font;


public class testo extends JFrame {
	private JLabel numText;
	private JPanel contentPane;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testo frame = new testo();
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
	public testo() {
		setBounds(100, 100, 1000, 650);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(251, 234, 235));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	    
		JLabel numText = new JLabel("0/500");
		numText.setBounds(525, 214, 59, 21);
		contentPane.add(numText);
		
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField.setBounds(41, 74, 543, 130);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				numText.setText(""+textField.getText().length()+"/500");
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				numText.setText(""+textField.getText().length()+"/500");
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				numText.setText(""+textField.getText().length()+"/500");
			}
		});
		
	
}}