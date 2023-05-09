package programa;

import java.awt.EventQueue;
import javax.swing.border.Border;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JList;

public class Testes {

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
	private JTextField nomeVendedorField;
	private JButton salvarBtn;
	private JLabel vendedorLabel;
	private JLabel cpfClienteLabel;
	private JTextField cpfClienteField;
	private JLabel clienteLabel;
	private JTextField clienteField;
	private JButton pagamentoBtn;
	private JButton cancelarBtn;
	private JButton consultarPrecoBtn;
	private JButton limparBtn;
	private JTextField produtoBuscaField;
	private JLabel produtoBuscaLabel;
	private JLabel quantidadeLabel;
	private JTextField quantidadeField;
	private JLabel itemLabel;
	private JLabel produtoPLabel;
	private JLabel pecasLabel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Testes window = new Testes();
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
	public Testes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(770, 655);
		frame.getContentPane().setLayout(null);
		
		tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 744, 605);
		frame.getContentPane().add(tabbedPane_1);
		
		panel_1 = new JPanel();
		tabbedPane_1.addTab("Clientes", null, panel_1, null);
		panel_1.setLayout(null);
		
		clientesLabel = new JLabel("CADASTRO CLIENTE");
		clientesLabel.setBounds(10, 11, 126, 15);
		clientesLabel.setHorizontalAlignment(SwingConstants.LEFT);
		clientesLabel.setForeground(Color.DARK_GRAY);
		clientesLabel.setFont(new Font("Verdana", Font.BOLD, 11));
		panel_1.add(clientesLabel);
		
		panel_2 = new JPanel();
		tabbedPane_1.addTab("Estoque", null, panel_2, null);
		panel_2.setLayout(null);
		
		estoqueLabel = new JLabel("ESTOQUE");
		estoqueLabel.setBounds(10, 11, 59, 15);
		estoqueLabel.setHorizontalAlignment(SwingConstants.LEFT);
		estoqueLabel.setBackground(Color.BLACK);
		estoqueLabel.setForeground(Color.DARK_GRAY);
		estoqueLabel.setFont(new Font("Verdana", Font.BOLD, 11));
		panel_2.add(estoqueLabel);
		
		panel_3 = new JPanel();
		tabbedPane_1.addTab("Consulta Vendas", null, panel_3, null);
		panel_3.setLayout(null);
		
		consultaLabel = new JLabel("CONSULTA VENDAS");
		consultaLabel.setBounds(10, 11, 122, 15);
		consultaLabel.setHorizontalAlignment(SwingConstants.LEFT);
		consultaLabel.setForeground(Color.DARK_GRAY);
		consultaLabel.setFont(new Font("Verdana", Font.BOLD, 11));
		panel_3.add(consultaLabel);
		
		panel = new JPanel();
		tabbedPane_1.addTab("Venda", null, panel, null);
		panel.setLayout(null);
		
		salvarBtn = new JButton("Salvar");
		salvarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		salvarBtn.setBounds(627, 526, 89, 23);
		panel.add(salvarBtn);
		
		novaVendaLabel = new JLabel("NOVA VENDA");
		novaVendaLabel.setBounds(615, 0, 124, 23);
		novaVendaLabel.setForeground(Color.DARK_GRAY);
		novaVendaLabel.setHorizontalAlignment(SwingConstants.LEFT);
		novaVendaLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		panel.add(novaVendaLabel);
		
		nomeVendedorField = new JTextField();
		nomeVendedorField.setBounds(128, 40, 146, 20);
		panel.add(nomeVendedorField);
		nomeVendedorField.setColumns(10);
		
		vendedorLabel = new JLabel("Vendedor");
		vendedorLabel.setBounds(72, 43, 46, 14);
		panel.add(vendedorLabel);
		
		cpfClienteLabel = new JLabel("CPF Cliente");
		cpfClienteLabel.setBounds(63, 72, 55, 14);
		panel.add(cpfClienteLabel);
		
		cpfClienteField = new JTextField();
		cpfClienteField.setBounds(128, 69, 146, 20);
		panel.add(cpfClienteField);
		cpfClienteField.setColumns(10);
		
		clienteLabel = new JLabel("Cliente");
		clienteLabel.setBounds(72, 103, 46, 14);
		panel.add(clienteLabel);
		
		clienteField = new JTextField();
		clienteField.setBounds(128, 100, 146, 20);
		panel.add(clienteField);
		clienteField.setColumns(10);
		
		pagamentoBtn = new JButton("Pagamento");
		pagamentoBtn.setBorder(new LineBorder(new Color(0, 0, 0)));
		pagamentoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pagamentoBtn.setBounds(23, 526, 62, 23);
		panel.add(pagamentoBtn);
		
		cancelarBtn = new JButton("Cancelar");
		cancelarBtn.setBounds(105, 526, 75, 23);
		panel.add(cancelarBtn);
		
		consultarPrecoBtn = new JButton("Consultar Preço");
		consultarPrecoBtn.setBounds(190, 526, 109, 23);
		panel.add(consultarPrecoBtn);
		
		limparBtn = new JButton("Limpar");
		limparBtn.setBounds(309, 526, 75, 23);
		panel.add(limparBtn);
		
		produtoBuscaField = new JTextField();
		produtoBuscaField.setBounds(128, 154, 203, 20);
		panel.add(produtoBuscaField);
		produtoBuscaField.setColumns(10);
		
		produtoBuscaLabel = new JLabel("Produto");
		produtoBuscaLabel.setBounds(72, 160, 46, 14);
		panel.add(produtoBuscaLabel);
		
		quantidadeLabel = new JLabel("Quantidade");
		quantidadeLabel.setBounds(450, 157, 62, 14);
		panel.add(quantidadeLabel);
		
		quantidadeField = new JTextField();
		quantidadeField.setBounds(510, 154, 86, 20);
		panel.add(quantidadeField);
		quantidadeField.setColumns(10);
		
		itemLabel = new JLabel("item");
		itemLabel.setBounds(23, 207, 46, 14);
		panel.add(itemLabel);
		
		produtoPLabel = new JLabel("Produto");
		produtoPLabel.setBounds(87, 207, 46, 14);
		panel.add(produtoPLabel);
		
		pecasLabel = new JLabel("Peças");
		pecasLabel.setBounds(427, 207, 46, 14);
		panel.add(pecasLabel);
		
		lblNewLabel = new JLabel("Preço un.");
		lblNewLabel.setBounds(510, 207, 55, 14);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Preço Total");
		lblNewLabel_1.setBounds(615, 207, 75, 14);
		panel.add(lblNewLabel_1);
		
		JList itemList = new JList();
		itemList.setBounds(23, 232, 46, 243);
		panel.add(itemList);
		
		JList produtoList = new JList();
		produtoList.setBounds(87, 232, 309, 243);
		panel.add(produtoList);
		
		JList list = new JList();
		list.setBounds(427, 232, 67, 243);
		panel.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(511, 232, 75, 243);
		panel.add(list_1);
		
		JList list_2 = new JList();
		list_2.setBounds(615, 232, 89, 243);
		panel.add(list_2);
	}
}