package Swing;
import java.awt.EventQueue;
import Paneles.PersonajePanel;
import Paneles.PanelMundo;
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

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private PersonajePanel pp;
	private PanelMundo pm;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
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
	public Window() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\estudiante\\Downloads\\Hamburguesa.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		
		CardLayout cl = new CardLayout();
		getContentPane().setLayout(cl);
		//-------------------------------------------------------------------------------
		
		/*
		 * Menú
		 */
		JLabel lblNewLabel = new JLabel("Menú");
		lblNewLabel.setBounds(30, 50, 89, 37);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		contentPane.add(lblNewLabel);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 784, 37);
		contentPane.add(toolBar);
		
		JButton btnMundobar = new JButton("Mundardo");
		toolBar.add(btnMundobar);
		
		JButton btnCargar = new JButton("Cargar Personiggas");
		toolBar.add(btnCargar);
		
		JButton btnCrear = new JButton("Crear Personiggas");
		toolBar.add(btnCrear);
		
		JLabel lblSaludo = new JLabel("Hola este es el menú!");
		lblSaludo.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSaludo.setBounds(10, 147, 191, 25);
		contentPane.add(lblSaludo);
		
		JLabel lblGuia = new JLabel("En la toolbar de arriba tenes las opciones...");
		lblGuia.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblGuia.setBounds(10, 202, 378, 25);
		contentPane.add(lblGuia);
		
		JLabel lblConsejo = new JLabel("Recomiendo empezar por crear un personaje primero...");
		lblConsejo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblConsejo.setBounds(10, 238, 411, 25);
		contentPane.add(lblConsejo);
		
		JLabel lblQuizas = new JLabel("Si ya tenes personajes creados,");
		lblQuizas.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuizas.setBounds(10, 267, 289, 25);
		contentPane.add(lblQuizas);
		
		JLabel lblQuzias2 = new JLabel("Podes verlos directamente en mundo...");
		lblQuzias2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuzias2.setBounds(10, 285, 289, 25);
		contentPane.add(lblQuzias2);
		//---------------------------------------------------------------------
	}
}
