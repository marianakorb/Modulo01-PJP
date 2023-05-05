package teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class TentativaGui {

	private JFrame frame;
	private JTabbedPane tabbedPane_1;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel novaVendaLabel;
	private JLabel clientesLabel;
	private JLabel estoqueLabel;
	private JLabel consultaLabel;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TentativaGui window = new TentativaGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TentativaGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(636, 436);
		
		tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane_1, BorderLayout.CENTER);
		
		panel = new JPanel();
		tabbedPane_1.addTab("Venda", null, panel, null);
		
		novaVendaLabel = new JLabel("NOVA VENDA");
		novaVendaLabel.setForeground(Color.DARK_GRAY);
		novaVendaLabel.setHorizontalAlignment(SwingConstants.LEFT);
		novaVendaLabel.setFont(new Font("Verdana", Font.BOLD, 11));
		panel.add(novaVendaLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		panel_1 = new JPanel();
		tabbedPane_1.addTab("Clientes", null, panel_1, null);
		
		clientesLabel = new JLabel("CADASTRO CLIENTE");
		clientesLabel.setHorizontalAlignment(SwingConstants.LEFT);
		clientesLabel.setForeground(Color.DARK_GRAY);
		clientesLabel.setFont(new Font("Verdana", Font.BOLD, 11));
		panel_1.add(clientesLabel);
		
		panel_2 = new JPanel();
		tabbedPane_1.addTab("Estoque", null, panel_2, null);
		
		estoqueLabel = new JLabel("ESTOQUE");
		estoqueLabel.setHorizontalAlignment(SwingConstants.LEFT);
		estoqueLabel.setBackground(Color.BLACK);
		estoqueLabel.setForeground(Color.DARK_GRAY);
		estoqueLabel.setFont(new Font("Verdana", Font.BOLD, 11));
		panel_2.add(estoqueLabel);
		
		panel_3 = new JPanel();
		tabbedPane_1.addTab("Consulta Vendas", null, panel_3, null);
		
		consultaLabel = new JLabel("CONSULTA VENDAS");
		consultaLabel.setHorizontalAlignment(SwingConstants.LEFT);
		consultaLabel.setForeground(Color.DARK_GRAY);
		consultaLabel.setFont(new Font("Verdana", Font.BOLD, 11));
		panel_3.add(consultaLabel);
	}

}
