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
		MedidaBounds valor = new MedidaBounds();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, valor.w, valor.h);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(199, 253, 138));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton vendasBtn = new JButton("Vendas");
		vendasBtn.setFont(new Font("Verdana", Font.BOLD, 12));
		vendasBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVendas telaVendas = new TelaVendas();
				telaVendas.setVisible(true);
				dispose();
			}
		});
		vendasBtn.setBounds(357, 125, 166, 56);
		contentPane.add(vendasBtn);
		
		JButton clientesBtn = new JButton("Clientes ");
		clientesBtn.setFont(new Font("Verdana", Font.BOLD, 12));
		clientesBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaClientes telaClientes = new TelaClientes();
				telaClientes.setVisible(true);
				dispose();
			}
		});
		clientesBtn.setBounds(357, 203, 166, 56);
		contentPane.add(clientesBtn);
		
		JButton estoqueBtn = new JButton("Estoque");
		estoqueBtn.setFont(new Font("Verdana", Font.BOLD, 12));
		estoqueBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEstoque telaEstoque = new TelaEstoque();
				telaEstoque.setVisible(true);
				dispose();
			}
		});
		estoqueBtn.setBounds(357, 283, 166, 56);
		contentPane.add(estoqueBtn);
		
		JButton consultaVendasBtn = new JButton("Consulta Vendas");
		consultaVendasBtn.setFont(new Font("Verdana", Font.BOLD, 12));
		consultaVendasBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaConsulta telaConsulta = new TelaConsulta();
				telaConsulta.setVisible(true);
				dispose();
			}
		});
		consultaVendasBtn.setBounds(357, 364, 166, 56);
		contentPane.add(consultaVendasBtn);
		
		JButton sairBtn = new JButton("Sair");
		sairBtn.setFont(new Font("Verdana", Font.PLAIN, 12));
		sairBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin telaLogin = new TelaLogin();
				telaLogin.setVisible(true);
				dispose();
			}
		});
		sairBtn.setBounds(787, 530, 89, 23);
		contentPane.add(sairBtn);
		
		
	}
}
