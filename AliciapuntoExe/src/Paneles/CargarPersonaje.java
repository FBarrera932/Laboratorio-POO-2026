package Paneles;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class CargarPersonaje extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public CargarPersonaje() {
		setBackground(new Color(192, 192, 192));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cargar Personaje");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(129, 11, 185, 28);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("...");
		btnNewButton.setBounds(168, 191, 89, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Cargar");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(168, 144, 89, 28);
		add(lblNewLabel_1);

	}

}
