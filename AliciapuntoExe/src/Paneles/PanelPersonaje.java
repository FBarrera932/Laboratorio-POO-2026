package Paneles;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.SpinnerNumberModel;
import javax.swing.JToolBar;
import java.awt.ComponentOrientation;

public class PanelPersonaje extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelPersonaje() {
		setBackground(new Color(255, 128, 192));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cree a su personaje");
		lblNewLabel.setBounds(132, 27, 159, 19);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel);
		
		JLabel labelLocura = new JLabel("Establecer su locura (mín 0 - max 100):");
		labelLocura.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		labelLocura.setHorizontalAlignment(SwingConstants.LEFT);
		labelLocura.setBounds(10, 63, 230, 37);
		add(labelLocura);
		
		JSpinner spinnerLocura = new JSpinner();
		spinnerLocura.setModel(new SpinnerNumberModel(0, null, 100, 1));
		spinnerLocura.setBounds(250, 71, 30, 20);
		add(spinnerLocura);
		
		JLabel labelSecret = new JLabel("Establecer su cantidad de secretos:");
		labelSecret.setHorizontalAlignment(SwingConstants.LEFT);
		labelSecret.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		labelSecret.setBounds(10, 114, 230, 37);
		add(labelSecret);
		
		JSpinner spinnerSecret = new JSpinner();
		spinnerSecret.setBounds(250, 122, 30, 20);
		add(spinnerSecret);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		toolBar.setBounds(0, 0, 450, 16);
		add(toolBar);
		
		JLabel lblDondeSeUbica = new JLabel("Donde se ubica?");
		lblDondeSeUbica.setHorizontalAlignment(SwingConstants.LEFT);
		lblDondeSeUbica.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblDondeSeUbica.setBounds(10, 162, 151, 37);
		add(lblDondeSeUbica);
		
		JSpinner spinnerSecret_1 = new JSpinner();
		spinnerSecret_1.setBounds(160, 170, 30, 20);
		add(spinnerSecret_1);

	}
}
