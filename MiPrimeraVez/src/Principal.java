import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, -10, 6, 7));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		lblNewLabel.setVisible(false);
		
		btnNewButton_1 = new JButton("Tibio...");
		btnNewButton_1.setBackground(new Color(255, 128, 64));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton_1.setVisible(false);
				btnNewButton_2.setVisible(true);
			}
		});
		btnNewButton_1.setVisible(false);
		
		btnNewButton_2 = new JButton("HotHotHot!");
		btnNewButton_2.setVisible(false);
		btnNewButton_2.setBackground(new Color(255, 0, 0));
		btnNewButton_2.setBounds(181, 24, 194, 360);
		contentPane.add(btnNewButton_2);
		btnNewButton_1.setBounds(625, 455, 447, 72);
		contentPane.add(btnNewButton_1);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\estudiante\\Downloads\\frio.jpg"));
		lblNewLabel.setBounds(488, 40, 612, 390);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("Frizado...");
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton.setVisible(false);
				lblNewLabel.setVisible(true);
				btnNewButton_1.setVisible(true);
				
			}
		});
		btnNewButton.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
			}
		});
		btnNewButton.setBounds(416, 11, 114, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		contentPane.add(btnNewButton);
		
	
	}
}
