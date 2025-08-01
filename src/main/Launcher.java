package main;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.UIManager;

import com.formdev.flatlaf.FlatLightLaf;

/**
 * Launch the application.
 */

public class Launcher {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.put( "Button.arc", 999 );
					UIManager.put( "Component.arc", 999 );
					UIManager.put( "ProgressBar.arc", 999 );
					UIManager.put( "TextComponent.arc", 999 );
					UIManager.put( "TabbedPane.selectedBackground", Color.blue );
					UIManager.put( "ScrollBar.width", 16 );
					UIManager.setLookAndFeel( new FlatLightLaf() );
				//	UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					try {
						UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					} catch (Exception ex) {
						// Ignore exception
					}
				}

			}
		});
	}
}
