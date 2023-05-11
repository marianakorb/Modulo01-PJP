package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 655, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton vendasBtn = new JButton("Vendas");
		vendasBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVendas telaVendas = new TelaVendas();
				telaVendas.setVisible(true);
				dispose();
			}
		});
		vendasBtn.setBounds(85, 281, 89, 23);
		contentPane.add(vendasBtn);
		
		JButton clientesBtn = new JButton("Clientes ");
		clientesBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaClientes telaClientes = new TelaClientes();
				telaClientes.setVisible(true);
				dispose();
			}
		});
		clientesBtn.setBounds(204, 281, 89, 23);
		contentPane.add(clientesBtn);
		
		JButton estoqueBtn = new JButton("Estoque");
		estoqueBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEstoque telaEstoque = new TelaEstoque();
				telaEstoque.setVisible(true);
				dispose();
			}
		});
		estoqueBtn.setBounds(321, 281, 89, 23);
		contentPane.add(estoqueBtn);
		
		JButton consultaVendasBtn = new JButton("Consulta Vendas");
		consultaVendasBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaConsulta telaConsulta = new TelaConsulta();
				telaConsulta.setVisible(true);
				dispose();
			}
		});
		consultaVendasBtn.setBounds(441, 281, 121, 23);
		contentPane.add(consultaVendasBtn);
		
		JButton sairBtn = new JButton("Sair");
		sairBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelasSoftware telaSoft = new TelasSoftware();
				telaSoft.setVisible(true);
				dispose();
			}
		});
		sairBtn.setBounds(540, 425, 89, 23);
		contentPane.add(sairBtn);
		
		
	}
}
