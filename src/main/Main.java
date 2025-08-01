package main;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.IOException;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main extends JFrame {

	/**
	 * Attribute
	 */

	private JPanel contentPane;
	private JLabel txtDDcar;
	private JTextField input_txtemail;
	private JPasswordField input_txtpass_hide;
	int xx;
	int xy;

	/**
	 * Create the frame.
	 */
	public Main() {
		
		//--------------------------------------FRAME--------------------------------------//
		setUndecorated(true);
		setTitle("DD RentalCar Login");
		setBounds(100, 100, 1000, 650);
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/logo.png")));
		setLocationRelativeTo(null);
		// setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),20,20));

		contentPane = new JPanel();
		contentPane.setBackground(new Color(251, 234, 235));
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
				xy = e.getY();
			}
		});

		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x = arg0.getXOnScreen();
				int y = arg0.getYOnScreen();
				Main.this.setLocation(x - xx, y - xy);
			}

		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		RoundPanel MainFrame = new RoundPanel(150, new Color(251, 234, 235));
		MainFrame.setOpaque(false);
		MainFrame.setBounds(10, 11, 980, 578);
		setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
		contentPane.setLayout(null);
		contentPane.add(MainFrame);
		MainFrame.setLayout(null);
		JLabel txt_pass_placeholder = new JLabel("กรอกรหัสผ่าน");
		txt_pass_placeholder.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txt_pass_placeholder.setForeground(Color.GRAY);
		txt_pass_placeholder.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_pass_placeholder.setBounds(481, 248, 90, 20);
		MainFrame.add(txt_pass_placeholder);
		
		RoundPanel Board = new RoundPanel(150, new Color(47, 60, 126));
		Board.setBounds(-2, -3, 270, 583);
		MainFrame.add(Board);
		Board.setLayout(null);
		Board.setOpaque(false);
		//--------------------------------------Label LOGO------------------------------------//
		
		JLabel logo = new JLabel("");
		logo.setBounds(43, 67, 200, 200);
		Board.add(logo);
		logo.setIcon(new ImageIcon(Main.class.getResource("/icon/logo.png")));
				
		JPanel inBoard = new JPanel(); //Panel
		inBoard.setBounds(213, 3, 62, 578);
		Board.add(inBoard);
		inBoard.setBackground(new Color(47, 60, 126));
		inBoard.setLayout(null);
		
		//--------------------------------------Label Text-------------------------------------//
			
		txtDDcar = new JLabel("DD Rental Car");
		txtDDcar.setBounds(70, 278, 143, 33);
		Board.add(txtDDcar);
		txtDDcar.setHorizontalAlignment(SwingConstants.CENTER);
		txtDDcar.setForeground(new Color(251, 234, 235));
		txtDDcar.setFont(new Font("Impact", Font.PLAIN, 26));
		
		JLabel txt_number = new JLabel("Tel.012-345-6789");
		txt_number.setHorizontalAlignment(SwingConstants.CENTER);
		txt_number.setForeground(new Color(251, 234, 235));
		txt_number.setFont(new Font("Impact", Font.PLAIN, 14));
		txt_number.setBounds(97, 324, 106, 18);
		Board.add(txt_number);

		JLabel txt_email = new JLabel("Email");
		txt_email.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txt_email.setBounds(479, 94, 44, 24);
		MainFrame.add(txt_email);
		txt_email.setHorizontalAlignment(SwingConstants.CENTER);
		txt_email.setForeground(Color.BLACK);
		txt_email.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		//--------------------------------------Label Icon-------------------------------------//
		
		JLabel icon_exit = new JLabel("");
		icon_exit.setIcon(new ImageIcon(Main.class.getResource("/icon/close_16px.png")));
		icon_exit.setBounds(924, 45, 16, 17);
		MainFrame.add(icon_exit);
		icon_exit.setHorizontalAlignment(SwingConstants.CENTER);
		icon_exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		icon_exit.setForeground(Color.DARK_GRAY);
		icon_exit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		icon_exit.setBackground(Color.WHITE);

		JLabel icon_mini = new JLabel("");
		icon_mini.setIcon(new ImageIcon(Main.class.getResource("/icon/subtract_16px.png")));
		icon_mini.setBounds(926, 73, 14, 17);
		MainFrame.add(icon_mini);
		icon_mini.setHorizontalAlignment(SwingConstants.CENTER);
		icon_mini.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		icon_mini.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(Main.ICONIFIED);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				icon_mini.setIcon(new ImageIcon(Main.class.getResource("/icon/subtract2_16px.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				icon_mini.setIcon(new ImageIcon(Main.class.getResource("/icon/subtract_16px.png")));
			}
		});
		icon_mini.setForeground(Color.DARK_GRAY);
		icon_mini.setFont(new Font("Tahoma", Font.PLAIN, 25));
		icon_mini.setBackground(Color.WHITE);
		
		JLabel icon_person = new JLabel("");
		icon_person.setBounds(754, 136, 16, 16);
		MainFrame.add(icon_person);
		icon_person.setIcon(new ImageIcon(Main.class.getResource("/icon/user_16px.png")));
		
		JLabel icon_hide = new JLabel("");
		JLabel icon_show = new JLabel("");
		icon_hide.setBounds(754, 253, 16, 16);
		icon_hide.setIcon(new ImageIcon(Main.class.getResource("/icon/hide_16px.png")));
		MainFrame.add(icon_hide);
		icon_hide.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		icon_hide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				input_txtpass_hide.setEchoChar((char) 0);
				icon_hide.setVisible(false);
				icon_hide.setEnabled(false);
				icon_show.setEnabled(true);

			}
		});
		icon_show.setIcon(new ImageIcon(Main.class.getResource("/icon/eye_16px.png")));
		icon_show.setBounds(754, 253, 16, 16);
		MainFrame.add(icon_show);
		icon_show.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		icon_show.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				input_txtpass_hide.setEchoChar('●');
				icon_hide.setVisible(true);
				icon_hide.setEnabled(true);
				icon_show.setEnabled(false);

			}
		});
		
		icon_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int ans = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the application?",
						"DD Car Rental", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (ans == 0)
					dispose();

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				icon_exit.setIcon(new ImageIcon(Main.class.getResource("/icon/close3_16px.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				icon_exit.setIcon(new ImageIcon(Main.class.getResource("/icon/close_16px.png")));
			}
		});
		
		JLabel lblCautionLogin = new JLabel("* Username or Password is incorrect.");
		lblCautionLogin.setBounds(480, 279, 264, 14);
		lblCautionLogin.setForeground(Color.red);
		lblCautionLogin.setVisible(false);
		MainFrame.add(lblCautionLogin);

		
		//--------------------------------------Label Button-------------------------------------//
		
		JLabel button_signin = new JLabel("");
		button_signin.setIcon(new ImageIcon(Main.class.getResource("/button/button_signin.png")));
		button_signin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_signin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button_signin.setIcon(new ImageIcon(Main.class.getResource("/button/button_signin2.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button_signin.setIcon(new ImageIcon(Main.class.getResource("/button/button_signin.png")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				Account acc = new Account();
				try {
					if(acc.login(input_txtemail.getText(),input_txtpass_hide.getText())) {
						Homepage hp = new Homepage(input_txtemail.getText());
						setVisible(false);
						hp.setVisible(true);
					}
				
				if(!acc.login(input_txtemail.getText(),input_txtpass_hide.getText())){
					lblCautionLogin.setVisible(true);
				}else lblCautionLogin.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_signin.setBounds(535, 341, 168, 44);
		MainFrame.add(button_signin);
		JLabel button_signup = new JLabel("<html><u><p style=\"color:blue \">Create a new account</u></html></p>");
		button_signup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Regis BacktoRegis = new Regis();
				setVisible(false);
				BacktoRegis.setVisible(true);
			}
		});
		button_signup.setHorizontalAlignment(SwingConstants.CENTER);
		button_signup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_signup.setBounds(562, 396, 128, 24);
		MainFrame.add(button_signup);
	
		//--------------------------------------INPUT-------------------------------------//
		
		JLabel txt_email_underline = new JLabel("____________________________________________");
		txt_email_underline.setBounds(480, 141, 264, 11);
		MainFrame.add(txt_email_underline);
		txt_email_underline.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txt_email_underline.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		input_txtemail = new JTextField();	
		input_txtemail.setBounds(481, 130, 259, 20);
		MainFrame.add(input_txtemail);
		input_txtemail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		input_txtemail.setBorder(null);
		input_txtemail.setBackground(new java.awt.Color(0, 0, 0, 1));
		input_txtemail.setColumns(10);
		
		JLabel txt_email_placeholder = new JLabel("กรอกอีเมล");
		txt_email_placeholder.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		input_txtemail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				txt_email_placeholder.setVisible(false);
			}
		});
		txt_email_placeholder.setForeground(Color.GRAY);
		txt_email_placeholder.setFont(input_txtemail.getFont());
		txt_email_placeholder.setBounds(481, 132, 70, 20);
		MainFrame.add(txt_email_placeholder);
		
		input_txtpass_hide = new JPasswordField();
		input_txtpass_hide.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				txt_pass_placeholder.setVisible(false);
			}
		});
		
		input_txtpass_hide.setBounds(480, 242, 264, 24);
		MainFrame.add(input_txtpass_hide);
		input_txtpass_hide.setEchoChar('●');
		input_txtpass_hide.setFont(new Font("Tahoma", Font.PLAIN, 16));
		input_txtpass_hide.setColumns(10);
		input_txtpass_hide.setBorder(null);
		input_txtpass_hide.setBackground(new Color(0, 0, 0, 1));

		JLabel txt_pass_underline = new JLabel("____________________________________________");
		txt_pass_underline.setBounds(480, 255, 264, 14);
		MainFrame.add(txt_pass_underline);
		txt_pass_underline.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txt_pass_underline.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel txt_pass = new JLabel("Password");
		txt_pass.setBounds(479, 213, 79, 24);
		MainFrame.add(txt_pass);
		txt_pass.setHorizontalAlignment(SwingConstants.CENTER);
		txt_pass.setForeground(Color.BLACK);
		txt_pass.setFont(new Font("Tahoma", Font.PLAIN, 18));

	}
}
