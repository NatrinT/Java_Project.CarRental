package main;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Billpayment extends JFrame {
	private int xx,xy;

	private JPanel contentPane;
	private Bill bill;
	private int second;
	Timer timer;

	public Billpayment(Bill bill) throws IOException{
		this.bill = bill;
		DecimalFormat fm = new DecimalFormat("#,##0.00");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 11, 500, 750);
		setLocationRelativeTo(null);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Billpayment.class.getResource("/icon/inv.png")));
		lblNewLabel.setBounds(56, 28, 381, 120);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 500, 30);
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
				xy = e.getY();
			}
		});

		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x = arg0.getXOnScreen();
				int y = arg0.getYOnScreen();
				Billpayment.this.setLocation(x - xx, y - xy);
			}

		});
		panel.setBackground(new Color(99, 156, 217));
		panel.setBounds(0, 0, 1363, 28);
		getContentPane().add(panel);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel icon_exit = new JLabel("");
		icon_exit.setBounds(477, 6, 16, 16);
		panel.add(icon_exit);
		icon_exit.setIcon(new ImageIcon(Main.class.getResource("/icon/close_16px.png")));
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
		icon_exit.setHorizontalAlignment(SwingConstants.CENTER);
		icon_exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		icon_exit.setForeground(Color.DARK_GRAY);
		icon_exit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		icon_exit.setBackground(Color.WHITE);
		
		JLabel icon_mini = new JLabel("");
		icon_mini.setIcon(new ImageIcon(Main.class.getResource("/icon/subtract_16px.png")));
		icon_mini.setBounds(451, 6, 16, 16);
		panel.add(icon_mini);
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
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 16));
		lblName.setBounds(32, 186, 58, 17);
		contentPane.add(lblName);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 16));
		lblEmail.setBounds(32, 238, 58, 17);
		contentPane.add(lblEmail);
		
		JLabel lblCar = new JLabel("Car :");
		lblCar.setForeground(new Color(255, 0, 0));
		lblCar.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 24));
		lblCar.setBounds(32, 305, 61, 25);
		contentPane.add(lblCar);
		
		JLabel lblPrice = new JLabel("Price :");
		lblPrice.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 16));
		lblPrice.setBounds(34, 356, 58, 17);
		contentPane.add(lblPrice);
		
		JLabel lblBabyseat = new JLabel("Baby seat :");
		lblBabyseat.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 16));
		lblBabyseat.setBounds(248, 356, 93, 17);
		contentPane.add(lblBabyseat);
		
		JLabel lblCarinsur = new JLabel("Car insurance :");
		lblCarinsur.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 16));
		lblCarinsur.setBounds(246, 407, 127, 17);
		contentPane.add(lblCarinsur);
		
		JLabel lblGPS = new JLabel("GPS :");
		lblGPS.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 16));
		lblGPS.setBounds(248, 458, 58, 17);
		contentPane.add(lblGPS);
		
		JLabel lblDiscount = new JLabel("Discount :");
		lblDiscount.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 16));
		lblDiscount.setBounds(32, 632, 84, 17);
		contentPane.add(lblDiscount);
		
		JLabel lblNetprice = new JLabel("Net Price :");
		lblNetprice.setForeground(new Color(255, 0, 0));
		lblNetprice.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 22));
		lblNetprice.setBounds(32, 687, 121, 23);
		contentPane.add(lblNetprice);
		
		JLabel qrCode = new JLabel();
		qrCode.setIcon(new ImageIcon(Billpayment.class.getResource("/icon/QRcodepay.png")));
		qrCode.setBounds(382, 621, 100, 100);
		contentPane.add(qrCode);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(228, 229, 231));
		panel_1.setBounds(9, 545, 480, 3);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(228, 229, 231));
		panel_1_1.setBounds(9, 284, 480, 3);
		contentPane.add(panel_1_1);
		
		JLabel lblDays = new JLabel("Days of rent :");
		lblDays.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 16));
		lblDays.setBounds(32, 406, 114, 17);
		contentPane.add(lblDays);
		
		JLabel showName = new JLabel(bill.getFName()+" "+bill.getLName());
		showName.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 16));
		showName.setBounds(100, 182, 344, 28);
		contentPane.add(showName);
		
		JLabel showEmail = new JLabel(bill.getEmail());
		showEmail.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 16));
		showEmail.setBounds(100, 232, 344, 28);
		contentPane.add(showEmail);
		
		JLabel showCar = new JLabel(bill.getCar().getType());
		showCar.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 20));
		showCar.setBounds(105, 306, 377, 28);
		contentPane.add(showCar);
		
		JLabel showPrice = new JLabel(""+fm.format(bill.getCar().getPrice())+" Baht.");
		showPrice.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 14));
		showPrice.setBounds(93, 352, 166, 28);
		contentPane.add(showPrice);
		
		JLabel showDays = new JLabel(""+bill.getDays()+" Day");
		showDays.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 14));
		showDays.setBounds(154, 401, 104, 28);
		contentPane.add(showDays);
		
		JLabel showBabyseat = new JLabel(""+fm.format(bill.getBabyseat())+" Baht.");
		showBabyseat.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 14));
		showBabyseat.setBounds(351, 351, 119, 28);
		contentPane.add(showBabyseat);
		
		JLabel showCarinsur = new JLabel(""+fm.format(bill.getCarinsur())+" Baht.");
		showCarinsur.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 14));
		showCarinsur.setBounds(380, 402, 114, 28);
		contentPane.add(showCarinsur);
		
		JLabel showGPS = new JLabel(""+fm.format(bill.getGPS())+" Baht.");
		showGPS.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 14));
		showGPS.setBounds(300, 453, 134, 28);
		contentPane.add(showGPS);
		
		JLabel showDiscount = new JLabel(bill.getCouponPrice()+" Baht.");
		showDiscount.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 14));
		showDiscount.setBounds(126, 627, 225, 28);
		contentPane.add(showDiscount);
		
		JLabel showNetprice = new JLabel(""+fm.format(bill.getNetPrice())+" Baht.");
		showNetprice.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 18));
		showNetprice.setBounds(163, 687, 212, 28);
		contentPane.add(showNetprice);
		
		JLabel lblTotal = new JLabel("Total Price :");
		lblTotal.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 16));
		lblTotal.setBounds(32, 578, 100, 17);
		contentPane.add(lblTotal);
		
		JLabel showTotal = new JLabel(""+fm.format(bill.getTotalPrice())+" Baht.");
		showTotal.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 14));
		showTotal.setBounds(141, 573, 225, 28);
		contentPane.add(showTotal);
		
		JLabel showTimeout = new JLabel();
		showTimeout.setFont(new Font("Tahoma", Font.PLAIN, 11));
		showTimeout.setBounds(382, 606, 100, 14);
		contentPane.add(showTimeout);
		
		JLabel lblPlace = new JLabel("Pick Up/Return place :");
		lblPlace.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 16));
		lblPlace.setBounds(32, 458, 187, 17);
		contentPane.add(lblPlace);
		
		JLabel showPlace = new JLabel(bill.getStartReturnPoint());
		showPlace.setFont(new Font("BIZ UDPMincho Medium", Font.PLAIN, 14));
		showPlace.setBounds(68, 486, 414, 48);
		contentPane.add(showPlace);
		
		JPanel textPanel = new JPanel();
		textPanel.setBackground(new Color(249, 249, 249));
		textPanel.setBounds(32, 486, 436, 48);
		contentPane.add(textPanel);
		
		JPanel panelbetween = new JPanel();
		panelbetween.setBackground(new Color(228, 229, 231));
		panelbetween.setBounds(229, 345, 3, 134);
		contentPane.add(panelbetween);
		
		JLabel lblQRcode = new JLabel("QR Payment");
		lblQRcode.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		lblQRcode.setBounds(391, 588, 78, 18);
		contentPane.add(lblQRcode);
		
		
		second = 300;
		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showTimeout.setText("หมดอายุใน 300 วินาที");
				second--;
				showTimeout.setText("หมดอายุใน "+second+" วินาที");
				if(second==0) {
					timer.stop();
					showTimeout.setText("");
					qrCode.setIcon(new ImageIcon(Main.class.getResource("/icon/QRcodepayOut.png")));
				}
			}
		});
		timer.start();
	}
}
