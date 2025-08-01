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
import java.util.Scanner;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Regis extends JFrame {

	/**
	 * Attribute
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel txtDDcar;
	private JTextField input_txtemail;
	private JPasswordField input_txtpass_hide;
	private JPasswordField input_txtpassconfirm_hide;
	int xx;
	int xy;
	Account acc = new Account();
	Bill bill = new Bill();
	private JTextField input_fName;
	private JTextField input_LName;

	/**
	 * Create the frame.
	 */
	public Regis() {

		// --------------------------------------FRAME--------------------------------------//

		setUndecorated(true);
		setTitle("DD RentalCar Register");
		setBounds(100, 100, 1000, 650);
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/logo.png")));
		// setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),20,20));

		contentPane = new JPanel();
		contentPane.setBackground(new Color(251, 234, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
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
				Regis.this.setLocation(x - xx, y - xy);
			}

		});

		RoundPanel RegisFrame = new RoundPanel(150, new Color(251, 234, 235));
		RegisFrame.setOpaque(false);
		RegisFrame.setBounds(10, 11, 980, 578);
		setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
		contentPane.setLayout(null);
		contentPane.add(RegisFrame);
		RegisFrame.setLayout(null);

		RoundPanel Board = new RoundPanel(150, new Color(47, 60, 126));
		Board.setBounds(-2, -3, 270, 583);
		RegisFrame.add(Board);
		Board.setLayout(null);
		Board.setOpaque(false);

		// --------------------------------------LOGO--------------------------------------//

		JLabel logo = new JLabel("");
		logo.setBounds(35, 29, 200, 200);
		Board.add(logo);
		logo.setIcon(new ImageIcon(Regis.class.getResource("/icon/logo.png")));

		// --------------------------------------Label
		// Text--------------------------------------//

		txtDDcar = new JLabel("DD Rental Car");
		txtDDcar.setBounds(63, 230, 143, 33);
		Board.add(txtDDcar);
		txtDDcar.setHorizontalAlignment(SwingConstants.CENTER);
		txtDDcar.setForeground(new Color(251, 234, 235));
		txtDDcar.setFont(new Font("Impact", Font.PLAIN, 26));

		RoundPanel Deccorate = new RoundPanel(100, new Color(67, 79, 142));
		Deccorate.setBounds(10, 245, 250, 280);
		Board.add(Deccorate);
		Deccorate.setLayout(null);
		Deccorate.setOpaque(false);

		JLabel txt_numberINFO = new JLabel("Contact Information");
		txt_numberINFO.setHorizontalAlignment(SwingConstants.CENTER);
		txt_numberINFO.setForeground(new Color(251, 234, 235));
		txt_numberINFO.setFont(new Font("UD Digi Kyokasho NP-R", Font.PLAIN, 14));
		txt_numberINFO.setBounds(54, 47, 139, 17);
		Deccorate.add(txt_numberINFO);

		JLabel txt_number = new JLabel("Tel.012-345-6789");
		txt_number.setBounds(81, 101, 106, 18);
		Deccorate.add(txt_number);
		txt_number.setHorizontalAlignment(SwingConstants.CENTER);
		txt_number.setForeground(new Color(251, 234, 235));
		txt_number.setFont(new Font("Impact", Font.PLAIN, 14));

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(52, 101, 24, 24);
		Deccorate.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Regis.class.getResource("/icon/phone_24px.png")));

		JLabel txt_numberWWW = new JLabel("www.dd-rentalcar.com");
		txt_numberWWW.setHorizontalAlignment(SwingConstants.CENTER);
		txt_numberWWW.setForeground(new Color(251, 234, 235));
		txt_numberWWW.setFont(new Font("Impact", Font.PLAIN, 15));
		txt_numberWWW.setBounds(85, 148, 144, 20);
		Deccorate.add(txt_numberWWW);

		JLabel lblwebsite = new JLabel("");
		lblwebsite.setIcon(new ImageIcon(Regis.class.getResource("/icon/website_21px.png")));
		lblwebsite.setBounds(54, 146, 24, 24);
		Deccorate.add(lblwebsite);

		JPanel inBoard = new JPanel(); // Panel
		inBoard.setBounds(213, 3, 62, 578);
		Board.add(inBoard);
		inBoard.setBackground(new Color(47, 60, 126));
		inBoard.setLayout(null);

		// --------------------------------------Label
		// Icon--------------------------------------//

		JLabel icon_exit = new JLabel("");
		icon_exit.setIcon(new ImageIcon(Regis.class.getResource("/icon/close_16px.png")));
		icon_exit.setBounds(924, 45, 16, 17);
		RegisFrame.add(icon_exit);
		icon_exit.setHorizontalAlignment(SwingConstants.CENTER);
		icon_exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		icon_exit.setForeground(Color.DARK_GRAY);
		icon_exit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		icon_exit.setBackground(Color.WHITE);

		JLabel icon_mini = new JLabel("");
		icon_mini.setIcon(new ImageIcon(Regis.class.getResource("/icon/subtract_16px.png")));
		icon_mini.setBounds(926, 73, 14, 17);
		RegisFrame.add(icon_mini);
		icon_mini.setHorizontalAlignment(SwingConstants.CENTER);
		icon_mini.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		icon_mini.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(Regis.ICONIFIED);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				icon_mini.setIcon(new ImageIcon(Regis.class.getResource("/icon/subtract2_16px.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				icon_mini.setIcon(new ImageIcon(Regis.class.getResource("/icon/subtract_16px.png")));
			}
		});
		icon_mini.setForeground(Color.DARK_GRAY);
		icon_mini.setFont(new Font("Tahoma", Font.PLAIN, 25));
		icon_mini.setBackground(Color.WHITE);

		JLabel icon_fName = new JLabel("");
		icon_fName.setBounds(944, 303, 16, 16);
		RegisFrame.add(icon_fName);
		icon_fName.setIcon(new ImageIcon(Regis.class.getResource("/icon/user_16px.png")));

		JLabel icon_showconfirm = new JLabel("");
		JLabel icon_show = new JLabel("");
		JLabel icon_hideconfirm = new JLabel("");
		JLabel icon_hide = new JLabel("");
		icon_hide.setBounds(592, 205, 16, 16);
		icon_hideconfirm.setBounds(592, 303, 16, 16);
		RegisFrame.add(icon_hide);
		RegisFrame.add(icon_hideconfirm);
		icon_hide.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		icon_hideconfirm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		icon_hide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				input_txtpass_hide.setEchoChar((char) 0);
				icon_hide.setVisible(false);
				icon_hide.setEnabled(false);
				icon_show.setEnabled(true);

			}
		});

		icon_hide.setIcon(new ImageIcon(Regis.class.getResource("/icon/hide_16px.png")));
		icon_show.setBounds(592, 205, 16, 16);
		RegisFrame.add(icon_show);
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
		icon_hideconfirm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				input_txtpassconfirm_hide.setEchoChar((char) 0);
				icon_hideconfirm.setVisible(false);
				icon_hideconfirm.setEnabled(false);
				icon_showconfirm.setEnabled(true);

			}
		});

		icon_hideconfirm.setIcon(new ImageIcon(Regis.class.getResource("/icon/hide_16px.png")));
		icon_showconfirm.setBounds(592, 303, 16, 16);
		RegisFrame.add(icon_showconfirm);
		icon_showconfirm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		icon_showconfirm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				input_txtpassconfirm_hide.setEchoChar('●');
				icon_hideconfirm.setVisible(true);
				icon_hideconfirm.setEnabled(true);
				icon_showconfirm.setEnabled(false);

			}
		});
		icon_show.setIcon(new ImageIcon(Regis.class.getResource("/icon/eye_16px.png")));
		icon_showconfirm.setIcon(new ImageIcon(Regis.class.getResource("/icon/eye_16px.png")));

		JLabel icon_IdCard = new JLabel("");
		icon_IdCard.setIcon(new ImageIcon(Regis.class.getResource("/icon/driver_license_16px.png")));
		icon_IdCard.setBounds(592, 518, 16, 16);
		RegisFrame.add(icon_IdCard);

		JLabel icon_backtoLogin = new JLabel("");
		icon_backtoLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main BacktoRegis = new Main();
				setVisible(false);
				BacktoRegis.setVisible(true);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				icon_backtoLogin.setIcon(new ImageIcon(Regis.class.getResource("/icon/return2_15px.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				icon_backtoLogin.setIcon(new ImageIcon(Regis.class.getResource("/icon/return_15px.png")));
			}
		});
		icon_backtoLogin.setIcon(new ImageIcon(Regis.class.getResource("/icon/return_15px.png")));
		icon_backtoLogin.setBounds(924, 100, 19, 19);
		icon_backtoLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		RegisFrame.add(icon_backtoLogin);

		JLabel icon_IdLicense = new JLabel("");
		icon_IdLicense.setIcon(new ImageIcon(Regis.class.getResource("/icon/Magnetic Card_16px.png")));
		icon_IdLicense.setBounds(592, 407, 16, 16);
		RegisFrame.add(icon_IdLicense);

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
				icon_exit.setIcon(new ImageIcon(Regis.class.getResource("/icon/close3_16px.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				icon_exit.setIcon(new ImageIcon(Regis.class.getResource("/icon/close_16px.png")));
			}
		});

		// --------------------------------------INPUT-------------------------------------//

		/*
		 * JLabel txt_email_placeholder = new JLabel("กรอกอีเมล");
		 * txt_email_placeholder.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR
		 * )); txt_email_placeholder.addKeyListener(new KeyAdapter() {
		 * 
		 * @Override public void keyTyped(KeyEvent e) {
		 * txt_email_placeholder.setVisible(false); if(txt_email_placeholder.equals(""))
		 * txt_email_placeholder.setVisible(true);; } });
		 */

		JLabel txt_driverLicense_placeholder = new JLabel("กรอกเลขใบขับขี่");
		txt_driverLicense_placeholder.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txt_driverLicense_placeholder.setForeground(Color.GRAY);
		txt_driverLicense_placeholder.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_driverLicense_placeholder.setBounds(320, 514, 107, 20);
		RegisFrame.add(txt_driverLicense_placeholder);

		JLabel txt_IDcard_placeholder = new JLabel("กรอกเลขบัตรประชาชน");
		txt_IDcard_placeholder.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txt_IDcard_placeholder.setForeground(Color.GRAY);
		txt_IDcard_placeholder.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_IDcard_placeholder.setBounds(320, 403, 149, 20);
		RegisFrame.add(txt_IDcard_placeholder);

		JLabel txt_confirmpass_placeholder = new JLabel("กรอกรหัสผ่านอีกครั้ง");
		txt_confirmpass_placeholder.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txt_confirmpass_placeholder.setForeground(Color.GRAY);
		txt_confirmpass_placeholder.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_confirmpass_placeholder.setBounds(320, 298, 134, 20);
		RegisFrame.add(txt_confirmpass_placeholder);

		JLabel txt_pass_placeholder = new JLabel("กรอกรหัสผ่าน");
		txt_pass_placeholder.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txt_pass_placeholder.setForeground(Color.GRAY);
		txt_pass_placeholder.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_pass_placeholder.setBounds(320, 199, 90, 20);
		RegisFrame.add(txt_pass_placeholder);

		JLabel txt_email = new JLabel("Email :");
		txt_email.setBounds(320, 56, 54, 24);
		RegisFrame.add(txt_email);
		txt_email.setHorizontalAlignment(SwingConstants.CENTER);
		txt_email.setForeground(Color.BLACK);
		txt_email.setFont(new Font("Tahoma", Font.PLAIN, 18));

		input_txtemail = new JTextField("กรอกอีเมล");
		input_txtemail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				input_txtemail.setForeground(Color.BLACK);
			}
		});
		input_txtemail.setForeground(Color.GRAY);
		input_txtemail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (input_txtemail.getText().equals("กรอกอีเมล")) {
					input_txtemail.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (input_txtemail.getText().equals("")) {
					input_txtemail.setText("กรอกอีเมล");
					input_txtemail.setForeground(Color.GRAY);
				}
			}
		});
		input_txtemail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		input_txtemail.setBorder(null);
		input_txtemail.setBackground(new java.awt.Color(0, 0, 0, 1));
		input_txtemail.setColumns(10);
		input_txtemail.setBounds(320, 100, 259, 19);
		RegisFrame.add(input_txtemail);

		JLabel txt_email_underline = new JLabel("____________________________________________");
		txt_email_underline.setBounds(320, 110, 264, 11);
		RegisFrame.add(txt_email_underline);
		txt_email_underline.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txt_email_underline.setFont(new Font("Tahoma", Font.PLAIN, 11));

		input_txtpass_hide = new JPasswordField();
		input_txtpass_hide.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				txt_pass_placeholder.setVisible(false);
			}
		});
		input_txtpass_hide.setBounds(320, 202, 259, 14);
		RegisFrame.add(input_txtpass_hide);
		input_txtpass_hide.setEchoChar('●');
		input_txtpass_hide.setFont(new Font("Tahoma", Font.PLAIN, 16));
		input_txtpass_hide.setColumns(10);
		input_txtpass_hide.setBorder(null);
		input_txtpass_hide.setBackground(new Color(0, 0, 0, 1));

		JLabel txt_pass_underline = new JLabel("____________________________________________");
		txt_pass_underline.setBounds(320, 205, 264, 14);
		RegisFrame.add(txt_pass_underline);
		txt_pass_underline.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txt_pass_underline.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel pass = new JLabel("Password :");
		pass.setBounds(320, 150, 89, 24);
		RegisFrame.add(pass);
		pass.setHorizontalAlignment(SwingConstants.CENTER);
		pass.setForeground(Color.BLACK);
		pass.setFont(new Font("Tahoma", Font.PLAIN, 18));

		input_txtpassconfirm_hide = new JPasswordField();
		input_txtpassconfirm_hide.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				txt_confirmpass_placeholder.setVisible(false);
			}
		});
		input_txtpassconfirm_hide.setBounds(320, 302, 259, 14);

		RegisFrame.add(input_txtpassconfirm_hide);
		input_txtpassconfirm_hide.setEchoChar('●');
		input_txtpassconfirm_hide.setFont(new Font("Tahoma", Font.PLAIN, 16));
		input_txtpassconfirm_hide.setColumns(10);
		input_txtpassconfirm_hide.setBorder(null);
		input_txtpassconfirm_hide.setBackground(new Color(0, 0, 0, 1));

		JLabel txt_passConfirm = new JLabel("Confirm Password :");
		txt_passConfirm.setHorizontalAlignment(SwingConstants.CENTER);
		txt_passConfirm.setForeground(Color.BLACK);
		txt_passConfirm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_passConfirm.setBounds(320, 250, 156, 24);
		RegisFrame.add(txt_passConfirm);

		JLabel txt_pass_underline_1 = new JLabel("____________________________________________");
		txt_pass_underline_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txt_pass_underline_1.setBounds(320, 305, 264, 14);
		RegisFrame.add(txt_pass_underline_1);

		JLabel txt_IdCard = new JLabel("Identification Number :");
		txt_IdCard.setHorizontalAlignment(SwingConstants.CENTER);
		txt_IdCard.setForeground(Color.BLACK);
		txt_IdCard.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_IdCard.setBounds(320, 354, 183, 22);
		RegisFrame.add(txt_IdCard);

		JTextField input_TextIdCard = new JTextField();
		input_TextIdCard.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				txt_IDcard_placeholder.setVisible(false);
			}
		});
		input_TextIdCard.setFont(new Font("Tahoma", Font.PLAIN, 16));
		input_TextIdCard.setColumns(10);
		input_TextIdCard.setBorder(null);
		input_TextIdCard.setBackground(new Color(0, 0, 0, 1));
		input_TextIdCard.setBounds(320, 406, 259, 14);
		RegisFrame.add(input_TextIdCard);

		JLabel txt_idcard_underline = new JLabel("____________________________________________");
		txt_idcard_underline.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txt_idcard_underline.setBounds(320, 409, 264, 14);
		RegisFrame.add(txt_idcard_underline);

		JLabel txt_DriverLicense = new JLabel("Driver License Number :");
		txt_DriverLicense.setHorizontalAlignment(SwingConstants.CENTER);
		txt_DriverLicense.setForeground(Color.BLACK);
		txt_DriverLicense.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_DriverLicense.setBounds(320, 458, 193, 24);
		RegisFrame.add(txt_DriverLicense);

		JTextField input_TextDriverID = new JTextField();
		input_TextDriverID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				txt_driverLicense_placeholder.setVisible(false);
			}
		});
		input_TextDriverID.setFont(new Font("Tahoma", Font.PLAIN, 16));
		input_TextDriverID.setColumns(10);
		input_TextDriverID.setBorder(null);
		input_TextDriverID.setBackground(new Color(0, 0, 0, 1));
		input_TextDriverID.setBounds(320, 517, 259, 14);
		RegisFrame.add(input_TextDriverID);

		JLabel txt_idLicense_underline = new JLabel("____________________________________________");
		txt_idLicense_underline.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txt_idLicense_underline.setBounds(320, 520, 264, 14);
		RegisFrame.add(txt_idLicense_underline);

		JLabel lblCautionEmail = new JLabel("* อีเมลไม่ถูกต้อง");
		lblCautionEmail.setBounds(376, 61, 131, 17);
		lblCautionEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCautionEmail.setForeground(Color.red);
		lblCautionEmail.setVisible(false);
		RegisFrame.add(lblCautionEmail);

		JLabel lblCautionPassword = new JLabel("* รหัสผ่านสั้นเกินไป");
		lblCautionPassword.setBounds(412, 156, 131, 17);
		lblCautionPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCautionPassword.setForeground(Color.red);
		lblCautionPassword.setVisible(false);
		RegisFrame.add(lblCautionPassword);

		JLabel lblCautionPassnotmatch = new JLabel("* รหัสผ่านไม่ตรงกัน");
		lblCautionPassnotmatch.setBounds(477, 256, 131, 17);
		lblCautionPassnotmatch.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCautionPassnotmatch.setForeground(Color.red);
		lblCautionPassnotmatch.setVisible(false);
		RegisFrame.add(lblCautionPassnotmatch);

		JLabel lblCautionID = new JLabel("* บัตรประชาชนไม่ถูกต้อง");
		lblCautionID.setBounds(507, 359, 204, 16);
		lblCautionID.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCautionID.setForeground(Color.red);
		lblCautionID.setVisible(false);
		RegisFrame.add(lblCautionID);

		JLabel lblCautionDL = new JLabel("* เลขใบขับขี่ไม่ถูกต้อง");
		lblCautionDL.setBounds(513, 463, 131, 17);
		lblCautionDL.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCautionDL.setForeground(Color.red);
		lblCautionDL.setVisible(false);
		RegisFrame.add(lblCautionDL);

		// --------------------------------------Label
		// Button-------------------------------------//

		JLabel button_signup = new JLabel("");
		button_signup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_signup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button_signup.setIcon(new ImageIcon(Regis.class.getResource("/button/button_signup2.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button_signup.setIcon(new ImageIcon(Regis.class.getResource("/button/button_signup.png")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				Main nextMain = new Main();
				String text;
				try {
					text = acc.chkData(input_fName.getText(), input_LName.getText(), input_txtemail.getText(),
							input_txtpass_hide.getText(), input_txtpassconfirm_hide.getText(),
							input_TextIdCard.getText(), input_TextDriverID.getText());

					if (text.equals("email"))
						lblCautionEmail.setVisible(true);
					else
						lblCautionEmail.setVisible(false);
					if (text.equals("shortPassword"))
						lblCautionPassword.setVisible(true);
					else
						lblCautionPassword.setVisible(false);
					if (text.equals("password"))
						lblCautionPassnotmatch.setVisible(true);
					else
						lblCautionPassnotmatch.setVisible(false);
					if (text.equals("ID"))
						lblCautionID.setVisible(true);
					else
						lblCautionID.setVisible(false);
					if (text.equals("DL"))
						lblCautionDL.setVisible(true);
					else
						lblCautionDL.setVisible(false);
					if (text.equals("blank"))
						JOptionPane.showMessageDialog(null, "The field cannot be left blank.", "Error to registation",
								JOptionPane.ERROR_MESSAGE);
					if (text.equals("file"))
						JOptionPane.showMessageDialog(null, "The account already exists !!", "Error to registation",
								JOptionPane.ERROR_MESSAGE);
					if (text.equals("correct")) {
						acc.register();
						JOptionPane.showMessageDialog(null, "Account created successfully!!", "Registation",
								JOptionPane.INFORMATION_MESSAGE);
						setVisible(false);
						nextMain.setVisible(true);
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		button_signup.setIcon(new ImageIcon(Regis.class.getResource("/button/button_signup.png")));
		button_signup.setBounds(732, 497, 166, 43);
		RegisFrame.add(button_signup);

		JLabel txt_fName = new JLabel("First Name :");
		txt_fName.setHorizontalAlignment(SwingConstants.CENTER);
		txt_fName.setForeground(Color.BLACK);
		txt_fName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_fName.setBounds(672, 250, 96, 24);
		RegisFrame.add(txt_fName);

		JLabel txt_fName_placeholder = new JLabel("กรอกชื่อจริง");
		txt_fName_placeholder.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txt_fName_placeholder.setForeground(Color.GRAY);
		txt_fName_placeholder.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_fName_placeholder.setBounds(673, 298, 79, 20);
		RegisFrame.add(txt_fName_placeholder);

		JLabel txt_fName_underline = new JLabel("____________________________________________");
		txt_fName_underline.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txt_fName_underline.setBounds(672, 305, 264, 14);
		RegisFrame.add(txt_fName_underline);

		input_fName = new JTextField();
		input_fName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				txt_fName_placeholder.setVisible(false);
			}
		});
		input_fName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		input_fName.setColumns(10);
		input_fName.setBorder(null);
		input_fName.setBackground(new Color(0, 0, 0, 1));
		input_fName.setBounds(674, 298, 259, 19);
		RegisFrame.add(input_fName);
		JLabel txt_LName_placeholder = new JLabel("กรอกนามสกุล");
		input_LName = new JTextField();
		input_LName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				txt_LName_placeholder.setVisible(false);
			}
		});
		input_LName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		input_LName.setColumns(10);
		input_LName.setBorder(null);
		input_LName.setBackground(new Color(0, 0, 0, 1));
		input_LName.setBounds(674, 403, 259, 18);
		RegisFrame.add(input_LName);

		JLabel txt_LName = new JLabel("Last Name :");
		txt_LName.setHorizontalAlignment(SwingConstants.CENTER);
		txt_LName.setForeground(Color.BLACK);
		txt_LName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_LName.setBounds(671, 354, 95, 22);
		RegisFrame.add(txt_LName);

		txt_LName_placeholder.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txt_LName_placeholder.setForeground(Color.GRAY);
		txt_LName_placeholder.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_LName_placeholder.setBounds(673, 403, 92, 20);
		RegisFrame.add(txt_LName_placeholder);

		JLabel txt_LName_underline = new JLabel("____________________________________________");
		txt_LName_underline.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txt_LName_underline.setBounds(672, 409, 264, 14);
		RegisFrame.add(txt_LName_underline);

		JLabel icon_LName = new JLabel("");
		icon_LName.setIcon(new ImageIcon(Regis.class.getResource("/icon/user_16px.png")));
		icon_LName.setBounds(944, 407, 16, 16);
		RegisFrame.add(icon_LName);

		JLabel icon_email = new JLabel("");
		icon_email.setIcon(new ImageIcon(Regis.class.getResource("/icon/Open email_16px.png")));
		icon_email.setBounds(592, 105, 16, 16);
		RegisFrame.add(icon_email);

		// --------------------------------------Label
		// BG-------------------------------------//

		// JLabel bg_regis = new JLabel("");
		// bg_regis.setIcon(new
		// ImageIcon(Regis.class.getResource("/icon/bg_regis.png")));
		// bg_regis.setBounds(402, 0, 580, 633);
		// RegisFrame.add(bg_regis);

	}
}
