package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class AddON extends JFrame {

	private JPanel contentPane;

	public AddON() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 650);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.red);
		contentPane.add(panel);
		
		JPanel panelw = new JPanel();
		panelw.setBackground(Color.blue);
		contentPane.add(panelw);

		/*JLabel BannerCar = new JLabel("");
		BannerCar.setIcon(new ImageIcon(AddON.class.getResource("/icon/carBrand.png")));
		PictureName.add(BannerCar, BorderLayout.NORTH);
		contentPane.setLayout(new BorderLayout(0, 0));
		InfoCar.setLayout(new BorderLayout(0, 0));*/

	}

}
