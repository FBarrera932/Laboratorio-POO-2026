package Swing;

import java.awt.EventQueue;
import Paneles.PanelPersonaje;
import Paneles.PanelMundo;
import Modelo.Mundo;
import Modelo.Persona;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.SwingConstants;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import java.awt.Toolkit;
import javax.swing.JToolBar;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private PanelPersonaje pp;
	private PanelMundo pm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\estudiante\\Downloads\\Hamburguesa.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menú");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(254, 46, 245, 50);
		contentPane.add(lblNewLabel);
		
		JButton Boton_CrearP = new JButton("...");
		Boton_CrearP.setBackground(new Color(240, 240, 240));
		Boton_CrearP.setBounds(123, 175, 123, 50);
		contentPane.add(Boton_CrearP);
		
		Boton_CrearP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PanelPersonaje p = new PanelPersonaje();
				setContentPane(p);
				PanelMundo panelMundo = new PanelMundo();
				panelMundo.setVisible(true);
			}
		});
		/**
		 * Texto de crear personiggas
		 */
		JLabel TextoCrear = new JLabel("Crear y cargar Personaje");
		TextoCrear.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		TextoCrear.setBounds(51, 138, 286, 26);
		contentPane.add(TextoCrear);
		
		JButton BotonMundo = new JButton("...");
		BotonMundo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PanelMundo pm = new PanelMundo();
				setContentPane(pm);
			}
		});
		BotonMundo.setBackground(UIManager.getColor("Button.background"));
		BotonMundo.setBounds(449, 175, 123, 50);
		contentPane.add(BotonMundo);
		
		//-----------------boton mundo-----------------------------
		JLabel TextoMundo = new JLabel("Mundo");
		TextoMundo.setHorizontalAlignment(SwingConstants.CENTER);
		TextoMundo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		TextoMundo.setBounds(419, 138, 189, 26);
		contentPane.add(TextoMundo);
		//---------------------------------------------------------
		
		//-----------------tool bar--------------------------------
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 784, 16);
		contentPane.add(toolBar);
		
		JButton btnNewButton = new JButton("6");
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("7");
		toolBar.add(btnNewButton_1);
	}
	
	
	private void Eventos() {
		
	}
}
