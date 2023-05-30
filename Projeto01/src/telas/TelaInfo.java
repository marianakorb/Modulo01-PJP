package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;

public class TelaInfo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInfo frame = new TelaInfo();
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
	public TelaInfo() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1222, 804);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(193, 219, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton vendasBtn = new JButton("Vendas");
		vendasBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		vendasBtn.setFont(new Font("Verdana", Font.BOLD, 12));
		vendasBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVendas telaVendas = new TelaVendas();
				telaVendas.setVisible(true);
				dispose();
			}
		});
		vendasBtn.setBounds(111, 422, 166, 56);
		contentPane.add(vendasBtn);
		
		JButton clientesBtn = new JButton("Clientes ");
		clientesBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		clientesBtn.setFont(new Font("Verdana", Font.BOLD, 12));
		clientesBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaClientes telaClientes = new TelaClientes();
				telaClientes.setVisible(true);
				dispose();
			}
		});
		clientesBtn.setBounds(365, 422, 166, 56);
		contentPane.add(clientesBtn);
		
		JButton estoqueBtn = new JButton("Estoque");
		estoqueBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		estoqueBtn.setFont(new Font("Verdana", Font.BOLD, 12));
		estoqueBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEstoque telaEstoque = new TelaEstoque();
				telaEstoque.setVisible(true);
				dispose();
			}
		});
		estoqueBtn.setBounds(627, 422, 166, 56);
		contentPane.add(estoqueBtn);
		
		JButton consultaVendasBtn = new JButton("Consulta Vendas");
		consultaVendasBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		consultaVendasBtn.setFont(new Font("Verdana", Font.BOLD, 12));
		consultaVendasBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaConsulta telaConsulta = new TelaConsulta();
				telaConsulta.setVisible(true);
				dispose();
			}
		});
		consultaVendasBtn.setBounds(873, 422, 166, 56);
		contentPane.add(consultaVendasBtn);
		
		JButton sairBtn = new JButton("Sair");
		sairBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sairBtn.setFont(new Font("Verdana", Font.PLAIN, 12));
		sairBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin telaLogin = new TelaLogin();
				telaLogin.setVisible(true);
				dispose();
			}
		});
		sairBtn.setBounds(1079, 710, 89, 23);
		contentPane.add(sairBtn);
		
		
	}
}
