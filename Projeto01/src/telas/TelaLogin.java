package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Cursor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.DropMode;
import java.awt.ComponentOrientation;

public class TelaVendas extends JFrame {

	private JPanel contentPane;
	private JTextField txtVendedorVenda;
	private JTextField txtCpfClienteVenda;
	private JTextField txtQuantVenda;

	static final String DB_URL = "jdbc:mysql://localhost/sistemainternoloja";
	static final String USER = "root";
	static final String PASS = "root";
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtPesquisaProduto;
	private JTextField txtRefEstoque;
	private JTextField txtProdutoEstoque;
	private JTextField txtPrecoEstoque;
	private JTextField cpfTextField;
	private JTextField nomeTextField;
	private JTextField cepTextField;
	private JTextField enderecoTextField;
	private JTextField numeroTextField;
	private JTextField complementoTextField;
	private JTextField bairroTextField;
	private JTextField cidadeTextField;
	private JTextField ufTextField;
	private JTextField telefoneTextField;
	private JTextField emailTextField;
	private JTextField dataNascTextField;
	private JTextField sexoTextField;
	private JTextField pesquisarClientesTextField;
	private JTextField txtConsultaVenda;
	private JTextField txtCupomFiscal;
	private JTextField txtData;
	private JTextField txtCpf;
	private JTextField txtNomeCliente;
	private JTextField txtTotalDaVenda;
	private JTextField txtVendedor;
	private JTextField txtQuantEstoque;
	private double venda = 0;
	private JTextField txtValorAPagar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVendas frame = new TelaVendas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void limparTextfield() {
		cpfTextField.setText("");
		nomeTextField.setText("");
		dataNascTextField.setText("");
		sexoTextField.setText("");
		cepTextField.setText("");
		enderecoTextField.setText("");
		numeroTextField.setText("");
		complementoTextField.setText("");
		bairroTextField.setText("");
		cidadeTextField.setText("");
		ufTextField.setText("");
		telefoneTextField.setText("");
		emailTextField.setText("");
		pesquisarClientesTextField.setText("");
		pesquisarClientesTextField.grabFocus();
	}

	// TORNAR CAMPOS DA ABA DE CLIENTES EDITÁVEL
	public void tornarCampoEditavel() {
		cpfTextField.setEditable(true);
		nomeTextField.setEditable(true);
		dataNascTextField.setEditable(true);
		sexoTextField.setEditable(true);
		cepTextField.setEditable(true);
		enderecoTextField.setEditable(true);
		numeroTextField.setEditable(true);
		complementoTextField.setEditable(true);
		bairroTextField.setEditable(true);
		cidadeTextField.setEditable(true);
		ufTextField.setEditable(true);
		telefoneTextField.setEditable(true);
		emailTextField.setEditable(true);
	}

	/**
	 * Create the frame.
	 */
	public TelaVendas() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 1222, 804);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Dubai", Font.BOLD, 15));
		tabbedPane.setBackground(new Color(38, 147, 166));
		tabbedPane.setForeground(new Color(255, 207, 134));
		tabbedPane.setBounds(10, 0, 1186, 731);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		panel.setFont(new Font("Dialog", Font.BOLD, 15));
		tabbedPane.addTab("VENDAS", null, panel, null);
		panel.setBackground(new Color(255, 255, 255));
		panel.setLayout(null);

		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(38, 147, 166));
		panel_10.setBounds(0, 667, 1181, 37);
		panel.add(panel_10);
		panel_10.setLayout(null);

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(10, 39, 121, 37);
		panel_8.setBackground(new Color(117, 174, 184));
		panel.add(panel_8);
		panel_8.setLayout(null);

		JLabel lblNewLabel = new JLabel("VENDAS");
		lblNewLabel.setForeground(new Color(255, 207, 134));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 10, 121, 14);
		panel_8.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Dubai", Font.BOLD, 15));

		txtVendedorVenda = new JTextField();
		txtVendedorVenda.setText("2301");
		txtVendedorVenda.setFont(new Font("Dubai", Font.PLAIN, 15));
		txtVendedorVenda.setBorder(new LineBorder(new Color(38, 147, 166), 1, true));
		txtVendedorVenda.setBounds(221, 85, 194, 20);
		panel.add(txtVendedorVenda);
		txtVendedorVenda.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("vendedor");
		lblNewLabel_1.setFont(new Font("Dubai", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(157, 88, 66, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("cpf cliente");
		lblNewLabel_2.setFont(new Font("Dubai", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(130, 119, 81, 14);
		panel.add(lblNewLabel_2);

		txtQuantVenda = new JTextField();
		txtQuantVenda.setHorizontalAlignment(SwingConstants.CENTER);
		txtQuantVenda.setFont(new Font("Dubai", Font.PLAIN, 15));
		txtQuantVenda.setBorder(new LineBorder(new Color(38, 147, 166), 1, true));
		txtQuantVenda.setBounds(454, 229, 46, 20);
		panel.add(txtQuantVenda);
		txtQuantVenda.setColumns(10);
		txtQuantVenda.setText("1");

		txtCpfClienteVenda = new JTextField();
		txtCpfClienteVenda.setText("11122233344");
		txtCpfClienteVenda.setFont(new Font("Dubai", Font.PLAIN, 15));
		txtCpfClienteVenda.setBorder(new LineBorder(new Color(38, 147, 166), 1, true));
		txtCpfClienteVenda.setBounds(221, 116, 194, 20);
		panel.add(txtCpfClienteVenda);
		txtCpfClienteVenda.setColumns(10);

		JButton pesquisarButton = new JButton("pesquisar");
		pesquisarButton.setFont(new Font("Dubai", Font.PLAIN, 15));
		pesquisarButton.setBounds(445, 84, 102, 23);
		pesquisarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String vendedor = txtVendedorVenda.getText();

				String QUERY = "SELECT id, nome FROM funcionarios WHERE id='";
				QUERY = QUERY + String.valueOf(vendedor) + "';";

				try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						Statement stmt = conn.createStatement();

						ResultSet rs = stmt.executeQuery(QUERY);) {

					while (rs.next()) {

						if (Integer.parseInt(vendedor) == rs.getInt("id")) {

							String nome = rs.getString("nome");
							txtVendedorVenda.setText(nome);

							txtCpfClienteVenda.grabFocus();
						} else {

							JOptionPane.showMessageDialog(null, "Funcionário não cadastrado!");

						}
						break;
					}

				} catch (SQLException el) {
					el.printStackTrace();
				}

			}
		});
		pesquisarButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(pesquisarButton);

		JLabel txtTotalVenda = new JLabel("");
		txtTotalVenda.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, null, null), "TOTAL", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		txtTotalVenda.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotalVenda.setBounds(707, 583, 150, 60);
		panel.add(txtTotalVenda);
		
		JTextField txtRefVenda = new JTextField();
		txtRefVenda.setText("1234");
		txtRefVenda.setFont(new Font("Dubai", Font.PLAIN, 15));
		txtRefVenda.setBorder(new LineBorder(new Color(38, 147, 166), 1, true));
		txtRefVenda.setBounds(146, 228, 269, 20);
		
		panel.add(txtRefVenda);
		txtRefVenda.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("referência");
		lblNewLabel_4.setFont(new Font("Dubai", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(76, 231, 67, 14);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("qtd");
		lblNewLabel_5.setFont(new Font("Dubai", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(425, 232, 31, 14);
		panel.add(lblNewLabel_5);

		JLabel lblNomeClienteVenda = new JLabel("");
		lblNomeClienteVenda.setBackground(new Color(255, 255, 255));
		lblNomeClienteVenda.setBounds(221, 151, 194, 20);
		lblNomeClienteVenda.setOpaque(true);
		panel.add(lblNomeClienteVenda);
		

		JButton pesquisarCpf = new JButton("pesquisar");
		pesquisarCpf.setFont(new Font("Dubai", Font.PLAIN, 15));
		pesquisarCpf.setBounds(445, 115, 102, 23);
		pesquisarCpf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = txtCpfClienteVenda.getText();

				String QUERY = "SELECT cpf, nome FROM clientes WHERE cpf='";
				QUERY = QUERY + cpf + "';";

				try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						Statement stmt = conn.createStatement();

						ResultSet rs = stmt.executeQuery(QUERY);) {

					while (rs.next()) {

						if (rs.getString("cpf").equals(cpf)) {

							String nome = rs.getString("nome");

							lblNomeClienteVenda.setText(nome);

						}

						break;
					}

				} catch (SQLException el) {
					el.printStackTrace();
				}
			}
		});
		panel.add(pesquisarCpf);

		JTextPane lblProdutosVenda = new JTextPane();
		lblProdutosVenda.setEditable(false);
		lblProdutosVenda.setFont(new Font("Dubai", Font.PLAIN, 15));
		lblProdutosVenda.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(38, 147, 166), new Color(160, 160, 160)), "PRODUTOS",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 207, 134)));
		lblProdutosVenda.setBounds(76, 304, 545, 268);
		panel.add(lblProdutosVenda);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 0, 0);
		panel_2.setLayout(null);
		panel_2.setForeground(Color.WHITE);
		panel_2.setBackground(new Color(193, 219, 221));
		panel.add(panel_2);

		JLabel estoqueLabel = new JLabel("ESTOQUE");
		estoqueLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		estoqueLabel.setBounds(957, 30, 86, 14);
		panel_2.add(estoqueLabel);

		JTextArea lblRef = new JTextArea();
		lblRef.setBounds(39, 148, 94, 75);
		panel_2.add(lblRef);

		JTextArea lblProduto = new JTextArea();
		lblProduto.setBounds(135, 148, 336, 75);
		panel_2.add(lblProduto);

		JTextArea lblPreco = new JTextArea();
		lblPreco.setBounds(528, 148, 86, 75);
		panel_2.add(lblPreco);

		JTextArea lblQuant = new JTextArea();
		lblQuant.setBounds(473, 148, 53, 75);
		panel_2.add(lblQuant);

		JLabel lblMensagem = new JLabel("");
		lblMensagem.setBounds(39, 91, 293, 14);
		panel_2.add(lblMensagem);

		JButton pesquisaButton = new JButton("PESQUISAR");
		pesquisaButton.setFont(new Font("Verdana", Font.PLAIN, 11));
		pesquisaButton.setBounds(337, 57, 112, 23);
		panel_2.add(pesquisaButton);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 377, 742, 2);
		panel_2.add(separator);

		JLabel lblNewLabel_11 = new JLabel("CADASTRAR NOVO PRODUTO");
		lblNewLabel_11.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_11.setBounds(61, 419, 232, 14);
		panel_2.add(lblNewLabel_11);

		JLabel lblNewLabel_1_1 = new JLabel("REF");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(208, 512, 27, 14);
		panel_2.add(lblNewLabel_1_1);

		JLabel lblNewLabel_2_1 = new JLabel("PRODUTO");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2_1.setBounds(480, 511, 69, 14);
		panel_2.add(lblNewLabel_2_1);

		JLabel lblNewLabel_3_1 = new JLabel("COR");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3_1.setBounds(406, 564, 46, 14);
		panel_2.add(lblNewLabel_3_1);

		JLabel lblNewLabel_4_1 = new JLabel("TAMANHO");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4_1.setBounds(167, 564, 69, 14);
		panel_2.add(lblNewLabel_4_1);

		textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.PLAIN, 11));
		textField.setColumns(10);
		textField.setBounds(245, 508, 196, 20);
		panel_2.add(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(559, 509, 299, 20);
		panel_2.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(739, 562, 119, 20);
		panel_2.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(246, 562, 86, 20);
		panel_2.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(462, 562, 148, 20);
		panel_2.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Verdana", Font.PLAIN, 11));
		textField_5.setColumns(10);
		textField_5.setBounds(39, 57, 288, 20);
		panel_2.add(textField_5);

		JButton salvarButton = new JButton("SALVAR");
		salvarButton.setBounds(957, 640, 89, 35);
		panel_2.add(salvarButton);

		JLabel lblNewLabel_5_1 = new JLabel("PREÇO");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_5_1.setBounds(683, 564, 46, 14);
		panel_2.add(lblNewLabel_5_1);

		JLabel lblNewLabel_6_1 = new JLabel("Referência");
		lblNewLabel_6_1.setOpaque(true);
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_6_1.setAlignmentX(1.0f);
		lblNewLabel_6_1.setBounds(39, 133, 94, 14);
		panel_2.add(lblNewLabel_6_1);

		JLabel lblNewLabel_6_1_1 = new JLabel("Produto");
		lblNewLabel_6_1_1.setOpaque(true);
		lblNewLabel_6_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_6_1_1.setAlignmentX(1.0f);
		lblNewLabel_6_1_1.setBounds(135, 133, 334, 14);
		panel_2.add(lblNewLabel_6_1_1);

		JLabel lblNewLabel_6_2_3 = new JLabel("Qndt.");
		lblNewLabel_6_2_3.setOpaque(true);
		lblNewLabel_6_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_6_2_3.setAlignmentX(1.0f);
		lblNewLabel_6_2_3.setBounds(473, 133, 53, 14);
		panel_2.add(lblNewLabel_6_2_3);

		JLabel lblNewLabel_6_2_4 = new JLabel("Preço");
		lblNewLabel_6_2_4.setOpaque(true);
		lblNewLabel_6_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_4.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_6_2_4.setAlignmentX(1.0f);
		lblNewLabel_6_2_4.setBounds(528, 133, 84, 14);
		panel_2.add(lblNewLabel_6_2_4);

		JButton btnAdicionarProdutoVenda = new JButton("pesquisar");
		btnAdicionarProdutoVenda.setFont(new Font("Dubai", Font.PLAIN, 15));
		btnAdicionarProdutoVenda.setBounds(509, 228, 112, 23);
		JTextArea lblQuantVendas = new JTextArea();
		lblQuantVendas.setEditable(false);
		lblQuantVendas.setFont(new Font("Dubai", Font.PLAIN, 15));
		lblQuantVendas.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.RAISED, new Color(38, 147, 166), new Color(160, 160, 160)), "QTD",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 207, 134)));
		lblQuantVendas.setBounds(629, 304, 58, 267);
		panel.add(lblQuantVendas);

		JTextArea lblPrecoUnVendas = new JTextArea();
		lblPrecoUnVendas.setEditable(false);
		lblPrecoUnVendas.setFont(new Font("Dubai", Font.PLAIN, 15));
		lblPrecoUnVendas.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.RAISED, new Color(38, 147, 166), new Color(160, 160, 160)), "$ UN",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 207, 134)));
		lblPrecoUnVendas.setBounds(697, 304, 75, 268);
		panel.add(lblPrecoUnVendas);

		JTextArea lblPrecoTotVenda = new JTextArea();
		lblPrecoTotVenda.setEditable(false);
		lblPrecoTotVenda.setFont(new Font("Dubai", Font.PLAIN, 15));
		lblPrecoTotVenda.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.RAISED, new Color(38, 147, 166), new Color(160, 160, 160)), "$ TOTAL",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 207, 134)));
		lblPrecoTotVenda.setBounds(782, 304, 75, 268);
		panel.add(lblPrecoTotVenda);
		
		btnAdicionarProdutoVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

				if (!lblNomeClienteVenda.getText().isEmpty() && !txtVendedorVenda.getText().isEmpty()) {
					
					
					String refProduto = txtRefVenda.getText();
					String quantidade = txtQuantVenda.getText();

					String QUERY = "SELECT * FROM produtos WHERE referencia=";
					QUERY = QUERY + refProduto;
					
					
					
					try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
							Statement stmt = conn.createStatement();

							ResultSet rs = stmt.executeQuery(QUERY);) {

						if( rs.next()) {
							
							while (rs.next()) {

								System.out.println("aqui");
								if (Integer.parseInt(refProduto) == rs.getInt("referencia")) {
									txtRefVenda.setText("");

									// printa o produto
									String produtoAnterior = lblProdutosVenda.getText();
									String nome = rs.getString("nome");
									double preco = rs.getDouble("preco");
									String prodAtual = nome;
									String prodAtual_2 = produtoAnterior + "\n " + nome;

									lblProdutosVenda.setText(prodAtual_2);

									// printa quantidade

									String quantAnterior = lblQuantVendas.getText();

									String quantAtual = txtQuantVenda.getText();

									String quantAtual_2 = quantAnterior + "\n " + quantAtual;

									lblQuantVendas.setText(quantAtual_2);

									// printa preco

									String precoAnterior = lblPrecoUnVendas.getText();

									String precoAtual = String.valueOf(preco);

									String precoAtual_2 = precoAnterior + "\n" + precoAtual;

									lblPrecoUnVendas.setText(precoAtual_2 + "0");

									// preco total

									String totalAnterior = lblPrecoTotVenda.getText();

									double totalAtual = Double.parseDouble(precoAtual) * Integer.parseInt(quantAtual);

									lblPrecoTotVenda.setText(totalAnterior + "\n" + String.format("%.2f", totalAtual));

									// venda total

									if (totalAnterior.isEmpty()) {
										venda = venda + totalAtual;
										txtTotalVenda.setText(String.format("%.2f", venda));								

									} else {

										venda = venda + totalAtual;
										txtTotalVenda.setText(String.format("%.2f", venda));

									}
									txtRefVenda.grabFocus();

									break;
								}
							}
						} else {
							JOptionPane.showMessageDialog(null, "Produto não cadastrado.");
							
						}
						

					} catch (SQLException el) {
						el.printStackTrace();
					}
				}
			}
		});
		panel.add(btnAdicionarProdutoVenda);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(0, 0, 1181, 57);
		panel_7.setBackground(new Color(38, 147, 166));
		panel.add(panel_7);
		panel_7.setLayout(null);

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 207, 134));
		panel_9.setBounds(1021, 56, 160, 615);
		panel.add(panel_9);
		panel_9.setLayout(null);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(TelaVendas.class.getResource("7.png")));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setForeground(new Color(255, 207, 134));
		btnNewButton.setBounds(10, 540, 135, 60);
		panel_9.add(btnNewButton);
		btnNewButton.setFont(new Font("Dubai", Font.BOLD, 15));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(38, 147, 166));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin telaLogin = new TelaLogin();
				telaLogin.setVisible(true);
				dispose();
			}
		});

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("CLIENTES", null, panel_3, null);
		panel_3.setLayout(null);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setForeground(Color.WHITE);
		panel_4.setBackground(new Color(193, 219, 221));
		panel_4.setBounds(13, 32, 1186, 709);
		panel_3.add(panel_4);

		JLabel clientesLabel = new JLabel("CADASTRO CLIENTES");
		clientesLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		clientesLabel.setBounds(991, 11, 185, 14);
		panel_4.add(clientesLabel);

		cpfTextField = new JTextField();
		cpfTextField.setEditable(false);
		cpfTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		cpfTextField.setColumns(10);
		cpfTextField.setBounds(48, 102, 196, 20);
		panel_4.add(cpfTextField);

		nomeTextField = new JTextField();
		nomeTextField.setEditable(false);
		nomeTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		nomeTextField.setColumns(10);
		nomeTextField.setBounds(276, 102, 289, 20);
		panel_4.add(nomeTextField);

		cepTextField = new JTextField();
		cepTextField.setEditable(false);
		cepTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		cepTextField.setColumns(10);
		cepTextField.setBounds(48, 149, 196, 20);
		panel_4.add(cepTextField);

		enderecoTextField = new JTextField();
		enderecoTextField.setEditable(false);
		enderecoTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		enderecoTextField.setColumns(10);
		enderecoTextField.setBounds(276, 149, 289, 20);
		panel_4.add(enderecoTextField);

		numeroTextField = new JTextField();
		numeroTextField.setEditable(false);
		numeroTextField.setText("");
		numeroTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		numeroTextField.setColumns(10);
		numeroTextField.setBounds(48, 193, 86, 20);
		panel_4.add(numeroTextField);

		complementoTextField = new JTextField();
		complementoTextField.setEditable(false);
		complementoTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		complementoTextField.setColumns(10);
		complementoTextField.setBounds(276, 193, 166, 20);
		panel_4.add(complementoTextField);

		bairroTextField = new JTextField();
		bairroTextField.setEditable(false);
		bairroTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		bairroTextField.setColumns(10);
		bairroTextField.setBounds(48, 239, 206, 20);
		panel_4.add(bairroTextField);

		cidadeTextField = new JTextField();
		cidadeTextField.setEditable(false);
		cidadeTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		cidadeTextField.setColumns(10);
		cidadeTextField.setBounds(278, 239, 290, 20);
		panel_4.add(cidadeTextField);

		ufTextField = new JTextField();
		ufTextField.setEditable(false);
		ufTextField.setText("");
		ufTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		ufTextField.setColumns(10);
		ufTextField.setBounds(584, 239, 86, 20);
		panel_4.add(ufTextField);

		telefoneTextField = new JTextField();
		telefoneTextField.setEditable(false);
		telefoneTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		telefoneTextField.setColumns(10);
		telefoneTextField.setBounds(45, 282, 206, 20);
		panel_4.add(telefoneTextField);

		emailTextField = new JTextField();
		emailTextField.setEditable(false);
		emailTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		emailTextField.setColumns(10);
		emailTextField.setBounds(276, 282, 289, 20);
		panel_4.add(emailTextField);

		dataNascTextField = new JTextField();
		dataNascTextField.setEditable(false);
		dataNascTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		dataNascTextField.setColumns(10);
		dataNascTextField.setBounds(45, 344, 206, 20);
		panel_4.add(dataNascTextField);

		sexoTextField = new JTextField();
		sexoTextField.setEditable(false);
		sexoTextField.setText("");
		sexoTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		sexoTextField.setColumns(10);
		sexoTextField.setBounds(276, 344, 149, 20);
		panel_4.add(sexoTextField);

		JLabel sexoLabel = new JLabel("SEXO");
		sexoLabel.setBounds(276, 329, 46, 14);
		panel_4.add(sexoLabel);

		JLabel cpfLabel = new JLabel("CPF");
		cpfLabel.setBounds(48, 88, 46, 14);
		panel_4.add(cpfLabel);

		JLabel emailLabel = new JLabel("E-MAIL");
		emailLabel.setBounds(276, 270, 46, 14);
		panel_4.add(emailLabel);

		JLabel ufLabel = new JLabel("UF");
		ufLabel.setBounds(584, 224, 46, 14);
		panel_4.add(ufLabel);

		JLabel nomeClienteLabel_1 = new JLabel("NOME");
		nomeClienteLabel_1.setBounds(276, 88, 46, 14);
		panel_4.add(nomeClienteLabel_1);

		JLabel cepLabel = new JLabel("CEP");
		cepLabel.setBounds(48, 133, 46, 14);
		panel_4.add(cepLabel);

		JLabel enderecoLabel = new JLabel("ENDEREÇO");
		enderecoLabel.setBounds(276, 133, 86, 14);
		panel_4.add(enderecoLabel);

		JLabel numResidenciaLabel = new JLabel("NÚMERO");
		numResidenciaLabel.setBounds(48, 180, 86, 14);
		panel_4.add(numResidenciaLabel);

		JLabel complementoLabel = new JLabel("COMPLEMENTO");
		complementoLabel.setBounds(274, 180, 137, 14);
		panel_4.add(complementoLabel);

		JLabel bairroLabel = new JLabel("BAIRRO");
		bairroLabel.setBounds(48, 224, 66, 14);
		panel_4.add(bairroLabel);

		JLabel cidadeLabel = new JLabel("CIDADE");
		cidadeLabel.setBounds(279, 224, 46, 14);
		panel_4.add(cidadeLabel);

		JLabel telefoneLabel = new JLabel("TELEFONE");
		telefoneLabel.setBounds(45, 270, 66, 14);
		panel_4.add(telefoneLabel);

		JLabel nascimentoLabel = new JLabel("DATA NASC.");
		nascimentoLabel.setBounds(45, 329, 86, 14);
		panel_4.add(nascimentoLabel);

		pesquisarClientesTextField = new JTextField();
		pesquisarClientesTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		pesquisarClientesTextField.setColumns(10);
		pesquisarClientesTextField.setBounds(38, 55, 206, 20);
		panel_4.add(pesquisarClientesTextField);

		JButton limparBtn = new JButton("Limpar");
		limparBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				limparTextfield();

			}
		});
		limparBtn.setFont(new Font("Verdana", Font.PLAIN, 12));
		limparBtn.setBounds(789, 336, 95, 39);
		panel_4.add(limparBtn);

		JPanel excluirOuNaoPanel = new JPanel();
		excluirOuNaoPanel.setBounds(210, 451, 460, 206);
		panel_4.add(excluirOuNaoPanel);
		excluirOuNaoPanel.setLayout(null);
		excluirOuNaoPanel.setVisible(false);

		JButton excluirBtn = new JButton("Excluir");
		excluirBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				excluirOuNaoPanel.setVisible(true);

			}
		});

		excluirBtn.setFont(new Font("Verdana", Font.PLAIN, 12));
		excluirBtn.setBounds(910, 336, 95, 39);
		panel_4.add(excluirBtn);

		JButton salvarClienteBtn = new JButton("Salvar");

		JButton atualizarButton = new JButton(" Atualizar Cadastro");
		atualizarButton.setVisible(false);
		atualizarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				salvarClienteBtn.setVisible(true);
				salvarClienteBtn.setText("Salvar Atualização");

				tornarCampoEditavel();

			}
		});
		atualizarButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		atualizarButton.setBounds(471, 336, 159, 39);
		panel_4.add(atualizarButton);
		limparBtn.setVisible(false);
		excluirBtn.setVisible(false);
		JButton btnNewButton_1_1 = new JButton("Pesquisar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = pesquisarClientesTextField.getText();

				if (!cpf.isEmpty()) {

					String QUERY = "SELECT * From clientes WHERE cpf = '" + cpf + "'";

					try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
							Statement stmt = conn.createStatement();
							ResultSet rs = stmt.executeQuery(QUERY)) {
						if (rs.next()) {

							limparBtn.setVisible(true);
							excluirBtn.setVisible(true);
							salvarClienteBtn.setVisible(false);
							cpfTextField.setText(cpf);

							String nome = rs.getString("nome");
							nomeTextField.setText(nome);

							String dataNasc = rs.getString("data_nasc");
							dataNascTextField.setText(dataNasc);

							String sexo = rs.getString("sexo");
							sexoTextField.setText(sexo);

							String cep = rs.getString("cep");
							cepTextField.setText(cep);

							String endereco = rs.getString("endereco");
							enderecoTextField.setText(endereco);

							String numero = rs.getString("numero");
							numeroTextField.setText(numero);

							String complemento = rs.getString("complemento");
							complementoTextField.setText(complemento);

							String bairro = rs.getString("bairro");
							bairroTextField.setText(bairro);

							String cidade = rs.getString("cidade");
							cidadeTextField.setText(cidade);

							String uf = rs.getString("uf");
							ufTextField.setText(uf);

							String telefone = rs.getString("telefone");
							telefoneTextField.setText(telefone);

							String e_mail = rs.getString("email");
							emailTextField.setText(e_mail);

							atualizarButton.setVisible(true);

						} else {
							// Cliente não encontrado
							JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
						}
					} catch (SQLException e1) {

						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_1_1.setBounds(267, 55, 95, 23);
		panel_4.add(btnNewButton_1_1);

		salvarClienteBtn.setVisible(false);
		salvarClienteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String textBtn = salvarClienteBtn.getText();
				String cpf = cpfTextField.getText();
				String nome = nomeTextField.getText();
				String data_nasc = dataNascTextField.getText();
				String sexo = sexoTextField.getText();
				String cep = cepTextField.getText();
				String endereco = enderecoTextField.getText();
				String numero = numeroTextField.getText();
				String complemento = complementoTextField.getText();
				String bairro = bairroTextField.getText();
				String cidade = cidadeTextField.getText();
				String uf = ufTextField.getText();
				String telefone = telefoneTextField.getText();
				String email = emailTextField.getText();

				try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						Statement stmt = conn.createStatement();) {

					if (textBtn.equals("Salvar Cadastro")) {

						String sql = "INSERT INTO sistemainternoloja.clientes "
								+ "(cpf, nome, cep, endereco, numero, complemento, bairro, cidade, uf, telefone, email, data_nasc, sexo) "
								+ "VALUES ('" + cpf + "', '" + nome + "','" + cep + "','" + endereco + "', '" + numero
								+ "', '" + complemento + "','" + bairro + "','" + cidade + "','" + uf + "','" + telefone
								+ "','" + email + "','" + data_nasc + "','" + sexo + "');";
						stmt.executeUpdate(sql);

						cpfTextField.setEditable(false);
						nomeTextField.setEditable(false);
						dataNascTextField.setEditable(false);
						sexoTextField.setEditable(false);
						cepTextField.setEditable(false);
						enderecoTextField.setEditable(false);
						numeroTextField.setEditable(false);
						complementoTextField.setEditable(false);
						bairroTextField.setEditable(false);
						cidadeTextField.setEditable(false);
						ufTextField.setEditable(false);
						telefoneTextField.setEditable(false);
						emailTextField.setEditable(false);
					}
					if (textBtn.equals("Salvar Atualização")) {

						String sql = "UPDATE sistemainternoloja.clientes " + "SET cpf = '" + cpf + "', nome = '" + nome
								+ "', cep = '" + cep + "', endereco = '" + endereco + "', numero = '" + numero
								+ "', bairro = '" + bairro + "', cidade = '" + cidade + "', uf = '" + uf
								+ "', telefone = '" + telefone + "', email = '" + email + "', data_nasc = '" + data_nasc
								+ "', sexo = '" + sexo + "' WHERE cpf ='" + cpf + "';";
						stmt.executeUpdate(sql);

					}

				} catch (SQLException el) {
					el.printStackTrace();

				}

			}
		});
		salvarClienteBtn.setBounds(640, 337, 123, 39);
		panel_4.add(salvarClienteBtn);

		JButton novoCadastroBtn = new JButton("Novo Cadastro");
		novoCadastroBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salvarClienteBtn.setVisible(true);
				salvarClienteBtn.setText("Salvar Cadastro");

				tornarCampoEditavel();
			}
		});
		novoCadastroBtn.setBounds(406, 56, 123, 23);
		panel_4.add(novoCadastroBtn);

		JLabel lblNewLabel_6_3 = new JLabel("   Tem certeza que deseja excluir este ítem permanentemente ");
		lblNewLabel_6_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_6_3.setBounds(10, 32, 449, 26);
		excluirOuNaoPanel.add(lblNewLabel_6_3);

		JLabel lblDoSeuEstoque_1 = new JLabel("   do seu estoque?");
		lblDoSeuEstoque_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblDoSeuEstoque_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblDoSeuEstoque_1.setBounds(10, 55, 425, 26);
		excluirOuNaoPanel.add(lblDoSeuEstoque_1);

		JLabel lblOtemSer_1 = new JLabel("   O ítem será apagado. Você não poderá desfazer esta ação.");
		lblOtemSer_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblOtemSer_1.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblOtemSer_1.setBounds(10, 98, 392, 26);
		excluirOuNaoPanel.add(lblOtemSer_1);

		JButton simButton_1 = new JButton("Sim");
		simButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String cpf = cpfTextField.getText();

				try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						Statement stmt = conn.createStatement();) {
					// Execute a query
					System.out.println("Inserindo dados em tabela");

					String sql = "DELETE FROM sistemainternoloja.clientes WHERE (cpf = '" + cpf + "');";

					stmt.executeUpdate(sql);
				} catch (SQLException el) {
					el.printStackTrace();
				}
				limparTextfield();

				excluirOuNaoPanel.setVisible(false);
			}

		});


		simButton_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		simButton_1.setActionCommand("OK");
		simButton_1.setBounds(88, 146, 80, 35);
		excluirOuNaoPanel.add(simButton_1);

		JButton cancelButton_1 = new JButton("Não");
		cancelButton_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		cancelButton_1.setActionCommand("Cancel");
		cancelButton_1.setBounds(268, 146, 80, 35);
		excluirOuNaoPanel.add(cancelButton_1);

		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("CONSULTA VENDAS", null, panel_5, null);
		panel_5.setLayout(null);

		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(193, 219, 221));
		panel_6.setBounds(1, 23, 1186, 709);
		panel_5.add(panel_6);

		JLabel lblNewLabel_13 = new JLabel("CONSULTA VENDAS");
		lblNewLabel_13.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_13.setBounds(1006, 11, 170, 14);
		panel_6.add(lblNewLabel_13);

		txtConsultaVenda = new JTextField();
		txtConsultaVenda.setColumns(10);
		txtConsultaVenda.setBounds(70, 68, 233, 20);
		panel_6.add(txtConsultaVenda);

		JLabel cupomFiscalLabel = new JLabel("CUPOM FISCAL");
		cupomFiscalLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
		cupomFiscalLabel.setBounds(70, 143, 115, 14);
		panel_6.add(cupomFiscalLabel);

		txtCupomFiscal = new JTextField();
		txtCupomFiscal.setColumns(10);
		txtCupomFiscal.setBounds(68, 160, 233, 20);
		panel_6.add(txtCupomFiscal);

		JLabel dataLabel = new JLabel("DATA");
		dataLabel.setBounds(347, 144, 46, 14);
		panel_6.add(dataLabel);

		txtData = new JTextField();
		txtData.setColumns(10);
		txtData.setBounds(347, 160, 135, 20);
		panel_6.add(txtData);

		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(68, 216, 233, 20);
		panel_6.add(txtCpf);

		JLabel lblcpf = new JLabel("CPF");
		lblcpf.setBounds(68, 201, 46, 14);
		panel_6.add(lblcpf);

		JLabel lblnomecliente = new JLabel("CLIENTE");
		lblnomecliente.setBounds(347, 201, 64, 14);
		panel_6.add(lblnomecliente);

		txtNomeCliente = new JTextField();
		txtNomeCliente.setColumns(10);
		txtNomeCliente.setBounds(347, 216, 308, 20);
		panel_6.add(txtNomeCliente);

		JButton btnNewButton_1_2 = new JButton("Pesquisar");
		btnNewButton_1_2.setBounds(304, 67, 89, 23);
		panel_6.add(btnNewButton_1_2);

		JButton btnLimparConsVenda = new JButton("Limpar");
		btnLimparConsVenda.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnLimparConsVenda.setBounds(68, 645, 89, 32);
		panel_6.add(btnLimparConsVenda);

		txtTotalDaVenda = new JTextField();
		txtTotalDaVenda.setColumns(10);
		txtTotalDaVenda.setBounds(809, 604, 128, 20);
		panel_6.add(txtTotalDaVenda);

		JLabel lblNewLabel_3_3 = new JLabel("Total");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_3.setBounds(947, 606, 46, 14);
		panel_6.add(lblNewLabel_3_3);

		txtVendedor = new JTextField();
		txtVendedor.setColumns(10);
		txtVendedor.setBounds(68, 604, 192, 20);
		panel_6.add(txtVendedor);

		JLabel lblNewLabel_4_3 = new JLabel("Vendedor");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_3.setBounds(270, 606, 64, 14);
		panel_6.add(lblNewLabel_4_3);

		JLabel panelTxtProduto = new JLabel("");
		panelTxtProduto.setOpaque(true);
		panelTxtProduto.setBackground(Color.WHITE);
		panelTxtProduto.setBounds(177, 330, 509, 212);
		panel_6.add(panelTxtProduto);

		JLabel panelTxtPreco = new JLabel("");
		panelTxtPreco.setOpaque(true);
		panelTxtPreco.setBackground(Color.WHITE);
		panelTxtPreco.setBounds(695, 330, 128, 212);
		panel_6.add(panelTxtPreco);

		JLabel lblref = new JLabel("Ref.");
		lblref.setBounds(68, 314, 46, 14);
		panel_6.add(lblref);

		JLabel lblproduto = new JLabel("Produto");
		lblproduto.setBounds(177, 314, 46, 14);
		panel_6.add(lblproduto);

		JLabel lblNewLabel_9_1 = new JLabel("Preço");
		lblNewLabel_9_1.setBounds(699, 314, 46, 14);
		panel_6.add(lblNewLabel_9_1);

		JTextArea panelTxtRef = new JTextArea();
		panelTxtRef.setBounds(70, 330, 97, 212);
		panel_6.add(panelTxtRef);

		JButton btnExcluirEstoque = new JButton("EXCLUIR");

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("ESTOQUE", null, panel_1, null);
		panel_1.setBackground(new Color(193, 219, 221));
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBounds(10, 11, 1186, 709);
		panel_1.setLayout(null);

		JTextArea lblRef_1 = new JTextArea();
		lblRef_1.setEditable(false);
		lblRef_1.setBounds(48, 114, 94, 75);
		panel_1.add(lblRef_1);

		JLabel lblNewLabel_6_2 = new JLabel("Referência");
		lblNewLabel_6_2.setOpaque(true);
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_6_2.setAlignmentX(1.0f);
		lblNewLabel_6_2.setBounds(48, 99, 94, 14);
		panel_1.add(lblNewLabel_6_2);

		JLabel lblNewLabel_6_1_2 = new JLabel("Produto");
		lblNewLabel_6_1_2.setOpaque(true);
		lblNewLabel_6_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_6_1_2.setAlignmentX(1.0f);
		lblNewLabel_6_1_2.setBounds(144, 99, 334, 14);
		panel_1.add(lblNewLabel_6_1_2);

		JTextArea lblProduto_1 = new JTextArea();
		lblProduto_1.setEditable(false);
		lblProduto_1.setBounds(144, 114, 336, 75);
		panel_1.add(lblProduto_1);

		JTextArea lblQuant_1 = new JTextArea();
		lblQuant_1.setEditable(false);
		lblQuant_1.setBounds(482, 114, 53, 75);
		panel_1.add(lblQuant_1);

		JLabel lblNewLabel_6_2_3_1 = new JLabel("Qndt.");
		lblNewLabel_6_2_3_1.setOpaque(true);
		lblNewLabel_6_2_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_3_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_6_2_3_1.setAlignmentX(1.0f);
		lblNewLabel_6_2_3_1.setBounds(482, 99, 53, 14);
		panel_1.add(lblNewLabel_6_2_3_1);

		JLabel lblNewLabel_6_2_4_1 = new JLabel("Preço");
		lblNewLabel_6_2_4_1.setOpaque(true);
		lblNewLabel_6_2_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_4_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_6_2_4_1.setAlignmentX(1.0f);
		lblNewLabel_6_2_4_1.setBounds(537, 99, 84, 14);
		panel_1.add(lblNewLabel_6_2_4_1);

		JTextArea lblPreco_1 = new JTextArea();
		lblPreco_1.setEditable(false);
		lblPreco_1.setBounds(537, 114, 86, 75);
		panel_1.add(lblPreco_1);

		txtPesquisaProduto = new JTextField();
		txtPesquisaProduto.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtPesquisaProduto.setColumns(10);
		txtPesquisaProduto.setBounds(48, 68, 288, 20);
		panel_1.add(txtPesquisaProduto);

		JButton btnPesquisaProduto = new JButton("PESQUISAR");
		btnPesquisaProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String ref = txtPesquisaProduto.getText();
				String QUERY = "SELECT * FROM produtos WHERE referencia=";
				QUERY = QUERY + ref;

				try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						Statement stmt = conn.createStatement();

						ResultSet rs = stmt.executeQuery(QUERY);) {

					while (rs.next()) {

						if (Integer.parseInt(ref) == rs.getInt("referencia")) {
							txtRefVenda.setText("");

							String nome = rs.getString("nome");
							String preco = rs.getString("preco");
							String quant = rs.getString("quantidade");

							lblRef_1.setText(ref);
							lblProduto_1.setText(nome);
							lblQuant_1.setText(quant);
							lblPreco_1.setText(preco);

						} else {

							JOptionPane.showMessageDialog(null, "Produto não cadastrado!");
							break;
						}

					}

				} catch (SQLException el) {
					el.printStackTrace();
				}

				txtPesquisaProduto.setText("");
			}
		});
		btnPesquisaProduto.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnPesquisaProduto.setBounds(346, 68, 112, 23);
		panel_1.add(btnPesquisaProduto);

		JLabel estoqueLabel_1 = new JLabel("ESTOQUE");
		estoqueLabel_1.setFont(new Font("Verdana", Font.BOLD, 15));
		estoqueLabel_1.setBounds(1085, 11, 86, 14);
		panel_1.add(estoqueLabel_1);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 437, 742, 2);
		panel_1.add(separator_1);

		JButton btnAtualizarEstoque = new JButton("ATUALIZAR");
		btnAtualizarEstoque.setBounds(512, 200, 109, 35);
		panel_1.add(btnAtualizarEstoque);

		JPanel panel_estoque = new JPanel();
		panel_estoque.setBounds(20, 450, 704, 192);
		panel_1.add(panel_estoque);
		panel_estoque.setLayout(null);
		panel_estoque.setVisible(false);

		JLabel lblFuncaoEstoque = new JLabel("");
		lblFuncaoEstoque.setBounds(13, 11, 232, 14);
		panel_estoque.add(lblFuncaoEstoque);
		lblFuncaoEstoque.setFont(new Font("Verdana", Font.BOLD, 12));

		JButton btnSalvarEstoque = new JButton("Salvar");
		btnSalvarEstoque.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String textBtn = btnSalvarEstoque.getText();
				String txtRef = txtRefEstoque.getText();
				String txtProduto = txtProdutoEstoque.getText();
				String txtPreco = txtPrecoEstoque.getText();
				String txtQuant = txtQuantEstoque.getText();

				try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						Statement stmt = conn.createStatement();) {

					if (textBtn.equals("Cadastrar")) {

						String sql = "INSERT INTO sistemainternoloja.produtos (referencia, nome, preco, quantidade) VALUES ('"
								+ txtRef + "', '" + txtProduto + "','" + txtPreco + "','" + txtQuant + "')";
						stmt.executeUpdate(sql);

						lblRef_1.setText(txtRef);
						lblProduto_1.setText(txtProduto);
						lblQuant_1.setText(txtQuant);
						lblPreco_1.setText(txtPreco);
						panel_estoque.setVisible(false);
					}

					if (textBtn.equals("Atualizar")) {

						String sql = "UPDATE sistemainternoloja.produtos SET nome = '" + txtProduto + "', preco = '"
								+ txtPreco + "', quantidade = '" + txtQuant + "' WHERE (referencia = '" + txtRef + "')";
						stmt.executeUpdate(sql);

						lblRef_1.setText(txtRef);
						lblProduto_1.setText(txtProduto);
						lblQuant_1.setText(txtQuant);
						lblPreco_1.setText(txtPreco);
						panel_estoque.setVisible(false);
					}

				} catch (SQLException el) {
					el.printStackTrace();

				}
			}

		});
		btnSalvarEstoque.setBounds(555, 135, 119, 35);
		panel_estoque.add(btnSalvarEstoque);

		btnAtualizarEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_estoque.setVisible(true);
				lblFuncaoEstoque.setText("ATUALIZAR PRODUTO");
				btnSalvarEstoque.setText("Atualizar");

				txtRefEstoque.setText(lblRef_1.getText());
				txtProdutoEstoque.setText(lblProduto_1.getText());
				txtPrecoEstoque.setText(lblPreco_1.getText());
				txtQuantEstoque.setText(lblQuant_1.getText());

			}
		});

		// CADASTRAR NOVO PRODUTO
		JButton btnCadastrarEstoque = new JButton("CADASTRAR NOVO +");
		btnCadastrarEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lblFuncaoEstoque.setText("CADASTRAR NOVO PRODUTO");
				panel_estoque.setVisible(true);
				btnSalvarEstoque.setText("Cadastrar");

			}
		});
		btnCadastrarEstoque.setBounds(795, 200, 182, 35);
		panel_1.add(btnCadastrarEstoque);

		txtRefEstoque = new JTextField();
		txtRefEstoque.setBackground(new Color(255, 255, 255));
		txtRefEstoque.setBounds(127, 51, 196, 20);
		panel_estoque.add(txtRefEstoque);
		txtRefEstoque.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtRefEstoque.setColumns(10);

		JLabel lblNewLabel_1_2 = new JLabel("REF");
		lblNewLabel_1_2.setBounds(79, 55, 27, 14);
		panel_estoque.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);

		JLabel lblNewLabel_2_2 = new JLabel("PRODUTO");
		lblNewLabel_2_2.setBounds(48, 96, 69, 14);
		panel_estoque.add(lblNewLabel_2_2);
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2.setFont(new Font("Verdana", Font.PLAIN, 11));

		txtProdutoEstoque = new JTextField();
		txtProdutoEstoque.setBounds(127, 94, 363, 20);
		panel_estoque.add(txtProdutoEstoque);
		txtProdutoEstoque.setColumns(10);

		JLabel lblNewLabel_5_2 = new JLabel("PREÇO");
		lblNewLabel_5_2.setBounds(60, 144, 46, 14);
		panel_estoque.add(lblNewLabel_5_2);
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5_2.setFont(new Font("Verdana", Font.PLAIN, 11));

		txtPrecoEstoque = new JTextField();
		txtPrecoEstoque.setBounds(126, 138, 119, 20);
		panel_estoque.add(txtPrecoEstoque);
		txtPrecoEstoque.setColumns(10);

		JLabel lblNewLabel_5_2_2 = new JLabel("QNTD.");
		lblNewLabel_5_2_2.setBounds(317, 145, 46, 14);
		panel_estoque.add(lblNewLabel_5_2_2);
		lblNewLabel_5_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5_2_2.setFont(new Font("Verdana", Font.PLAIN, 11));

		txtQuantEstoque = new JTextField();
		txtQuantEstoque.setBounds(373, 142, 119, 20);
		panel_estoque.add(txtQuantEstoque);
		txtQuantEstoque.setColumns(10);

		JPanel panelExcluir = new JPanel();
		panelExcluir.setBounds(136, 255, 485, 171);
		panel_1.add(panelExcluir);
		panelExcluir.setLayout(null);
		panelExcluir.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelExcluir.setVisible(false);

		btnExcluirEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelExcluir.setVisible(true);

			}
		});
		btnExcluirEstoque.setBounds(414, 200, 89, 35);
		panel_1.add(btnExcluirEstoque);

		JLabel lblNewLabel_6 = new JLabel("   Tem certeza que deseja excluir este ítem permanentemente ");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_6.setBounds(10, 11, 449, 26);
		panelExcluir.add(lblNewLabel_6);

		JButton simButton = new JButton("Sim");
		simButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ref = txtPesquisaProduto.getText();

				try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						Statement stmt = conn.createStatement();) {
					// Execute a query
					System.out.println("Inserindo dados em tabela");

					String sql = "DELETE FROM sistemainternoloja.produtos WHERE (referencia = '" + ref + "');";

					stmt.executeUpdate(sql);
				} catch (SQLException el) {
					el.printStackTrace();
				}

				lblRef_1.setText("");
				lblProduto_1.setText("");
				lblQuant_1.setText("");
				lblPreco_1.setText("");
				txtPesquisaProduto.setText("");
				panelExcluir.setVisible(false);
			}
		});
		simButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		simButton.setActionCommand("OK");
		simButton.setBounds(88, 125, 80, 35);
		panelExcluir.add(simButton);

		JButton cancelButton = new JButton("Não");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelExcluir.setVisible(false);
			}
		});
		cancelButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		cancelButton.setActionCommand("Cancel");
		cancelButton.setBounds(268, 125, 80, 35);
		panelExcluir.add(cancelButton);

		JLabel lblDoSeuEstoque = new JLabel("   do seu estoque?");
		lblDoSeuEstoque.setHorizontalAlignment(SwingConstants.LEFT);
		lblDoSeuEstoque.setFont(new Font("Dialog", Font.BOLD, 15));
		lblDoSeuEstoque.setBounds(10, 34, 425, 26);
		panelExcluir.add(lblDoSeuEstoque);

		JLabel lblOtemSer = new JLabel("   O ítem será apagado. Você não poderá desfazer esta ação.");
		lblOtemSer.setHorizontalAlignment(SwingConstants.LEFT);
		lblOtemSer.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblOtemSer.setBounds(10, 77, 392, 26);
		panelExcluir.add(lblOtemSer);

		JPanel panel_pagamento = new JPanel();
		tabbedPane.addTab("PAGAMENTO", null, panel_pagamento, null);
		panel_pagamento.setLayout(null);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(229, 229, 229));
		panel_1_1.setBounds(281, 105, 514, 265);
		panel_pagamento.add(panel_1_1);

		JComboBox boxMetodoPag = new JComboBox();
		boxMetodoPag.setBounds(250, 79, 154, 32);
		panel_1_1.add(boxMetodoPag);
		boxMetodoPag.setModel(
				new DefaultComboBoxModel(new String[] { "Método Pagamento", "Dinheiro", "Débito", "Crédito" }));

		JComboBox boxBandeira = new JComboBox();
		boxBandeira.setBounds(250, 131, 154, 21);
		panel_1_1.add(boxBandeira);
		boxBandeira.setModel(
				new DefaultComboBoxModel(new String[] { "Bandeira Cartão", "MasterCard", "Visa", "Elo", "Amex" }));
		boxBandeira.setVisible(false);

		JComboBox boxParcelas = new JComboBox();
		boxParcelas.setBounds(62, 130, 154, 22);
		panel_1_1.add(boxParcelas);
		boxParcelas.setModel(new DefaultComboBoxModel(new String[] { "Parcelas", "2x", "3x", "4x", "5x" }));
		boxParcelas.setVisible(false);
		
		JLabel lblNewLabel_3 = new JLabel("F9");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(15, 212, 31, 14);
		panel_9.add(lblNewLabel_3);
		
		
		// VAI PARA ABA DE PAGAMENTO
		JButton btnPagamentoVenda = new JButton("");
		btnPagamentoVenda.setIcon(new ImageIcon(TelaVendas.class.getResource("1.png")));
		
		btnPagamentoVenda.setBorder(null);
		btnPagamentoVenda.setBackground(new Color(38, 147, 166));
		btnPagamentoVenda.setForeground(new Color(255, 207, 134));
		btnPagamentoVenda.setBounds(10, 209, 135, 60);
		panel_9.add(btnPagamentoVenda);
		btnPagamentoVenda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPagamentoVenda.setFont(new Font("Dubai", Font.BOLD, 15));
		
		JLabel lblNewLabel_3_2 = new JLabel("F10");
		lblNewLabel_3_2.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNewLabel_3_2.setBounds(15, 289, 31, 14);
		panel_9.add(lblNewLabel_3_2);
		
				// LIMPA PRODUTOS ADICIONADOS NA VENDA
				JButton btnNewButton_4 = new JButton("");
				btnNewButton_4.setIcon(new ImageIcon(TelaVendas.class.getResource("8 (2).png")));
				btnNewButton_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						lblProdutosVenda.setText("");
						lblQuantVendas.setText("");
						lblPrecoUnVendas.setText("");
						lblPrecoTotVenda.setText("");
						txtTotalVenda.setText("");
					}
				});
				
				btnNewButton_4.setBorder(null);
				btnNewButton_4.setBackground(new Color(38, 147, 166));
				btnNewButton_4.setForeground(new Color(255, 207, 134));
				btnNewButton_4.setBounds(10, 280, 135, 60);
				panel_9.add(btnNewButton_4);
				btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnNewButton_4.setFont(new Font("Dubai", Font.BOLD, 15));
				
				JLabel lblNewLabel_3_4 = new JLabel("F11");
				lblNewLabel_3_4.setFont(new Font("Dialog", Font.PLAIN, 13));
				lblNewLabel_3_4.setBounds(15, 366, 31, 14);
				panel_9.add(lblNewLabel_3_4);
				
						// CANCELA TUDO
						JButton btnNewButton_3 = new JButton("");
						btnNewButton_3.setIcon(new ImageIcon(TelaVendas.class.getResource("6.png")));
						btnNewButton_3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								txtVendedorVenda.setText("");
								txtCpfClienteVenda.setText("");
								lblProdutosVenda.setText("");
								lblQuantVendas.setText("");
								lblPrecoUnVendas.setText("");
								lblPrecoTotVenda.setText("");
								txtTotalVenda.setText("");
								lblNomeClienteVenda.setText("");
							}
						});
						btnNewButton_3.setBorder(null);
						btnNewButton_3.setBackground(new Color(38, 147, 166));
						btnNewButton_3.setForeground(new Color(255, 207, 134));
						btnNewButton_3.setBounds(10, 355, 135, 60);
						panel_9.add(btnNewButton_3);
						btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnNewButton_3.setFont(new Font("Dubai", Font.BOLD, 15));
						
						JLabel lblNewLabel_3_5 = new JLabel("F12");
						lblNewLabel_3_5.setBounds(15, 440, 31, 14);
						panel_9.add(lblNewLabel_3_5);
						lblNewLabel_3_5.setFont(new Font("Dialog", Font.PLAIN, 13));
						
								// CONSULTA PREÇO
								JButton btnConsultarPreco = new JButton("");
								btnConsultarPreco.setIcon(new ImageIcon(TelaVendas.class.getResource("5.png")));
								btnConsultarPreco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
								btnConsultarPreco.setBorder(null);
								btnConsultarPreco.setBackground(new Color(38, 147, 166));
								btnConsultarPreco.setForeground(new Color(255, 207, 134));
								btnConsultarPreco.setBounds(10, 430, 135, 60);
								panel_9.add(btnConsultarPreco);
								btnConsultarPreco.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {

										new ConsultaPreco().setVisible(true);
									}
								});
								btnConsultarPreco.setFont(new Font("Dubai", Font.BOLD, 15));
		
		

		JLabel lblAgradecimento = new JLabel("");
		lblAgradecimento.setBounds(298, 592, 326, 27);
		panel_pagamento.add(lblAgradecimento);

		// VOLTA PARA ABA DE VENDAS E LIMPA
		JButton btnVoltaParaVenda = new JButton("OK");
		btnVoltaParaVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);

				lblProdutosVenda.setText("");
				lblQuantVendas.setText("");
				lblPrecoUnVendas.setText("");
				lblPrecoTotVenda.setText("");
				txtTotalVenda.setText("");
				txtVendedorVenda.setText("");
				txtCpfClienteVenda.setText("");
				lblNomeClienteVenda.setText("");

				txtVendedorVenda.grabFocus();
			}
		});
		btnVoltaParaVenda.setBounds(706, 592, 89, 27);
		btnVoltaParaVenda.setVisible(false);
		panel_pagamento.add(btnVoltaParaVenda);

		// FINALIZA VENDA
		JButton btnFinalizarVenda = new JButton("Finalizar Venda");

		btnFinalizarVenda.setBounds(160, 174, 159, 32);
		panel_1_1.add(btnFinalizarVenda);

		JLabel lblNewLabel_14 = new JLabel("Valor Total da Venda");
		lblNewLabel_14.setBounds(62, 56, 118, 13);
		panel_1_1.add(lblNewLabel_14);

		txtValorAPagar = new JTextField();
		txtValorAPagar.setHorizontalAlignment(SwingConstants.CENTER);
		txtValorAPagar.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtValorAPagar.setEditable(false);
		txtValorAPagar.setColumns(10);
		txtValorAPagar.setBounds(62, 79, 154, 32);
		panel_1_1.add(txtValorAPagar);

		JLabel lblNewLabel_16 = new JLabel("PAGAMENTO");
		lblNewLabel_16.setBounds(62, 22, 142, 13);
		panel_1_1.add(lblNewLabel_16);
		
		JTextArea txtParcelasValor = new JTextArea();
		txtParcelasValor.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtParcelasValor.setEditable(false);
		txtParcelasValor.setBounds(281, 364, 514, 255);
		panel_pagamento.add(txtParcelasValor);

		txtCpfClienteVenda.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if (e.getKeyCode() == 10) {
				String cpf = txtCpfClienteVenda.getText();

				String QUERY = "SELECT cpf, nome FROM clientes WHERE cpf='";
				QUERY = QUERY + cpf + "';";

				try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						Statement stmt = conn.createStatement();

						ResultSet rs = stmt.executeQuery(QUERY);) {

					while (rs.next()) {

						if (rs.getString("cpf").equals(cpf)) {

							String nome = rs.getString("nome");

							lblNomeClienteVenda.setText(nome);

							txtRefVenda.grabFocus();
						}

						break;
					}

				} catch (SQLException el) {
					el.printStackTrace();
				}
				}
			}
		});

		txtVendedorVenda.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 10) {
					String vendedor = txtVendedorVenda.getText();

					String QUERY = "SELECT id, nome FROM funcionarios WHERE id='";
					QUERY = QUERY + String.valueOf(vendedor) +"';";

					try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
							Statement stmt = conn.createStatement();

							ResultSet rs = stmt.executeQuery(QUERY);) {

						while (rs.next()) {

							if (Integer.parseInt(vendedor) == rs.getInt("id")) {

								String nome = rs.getString("nome");
								txtVendedorVenda.setText(nome);

								txtCpfClienteVenda.grabFocus();
							} else {

								JOptionPane.showMessageDialog(null, "Funcionário não cadastrado!");

							}
							break;
						}

					} catch (SQLException el) {
						el.printStackTrace();
					}
				}
			}
		});
		
		txtRefVenda.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 10) {
					txtQuantVenda.grabFocus();
					txtQuantVenda.selectAll();

				}
				
				if (e.getKeyCode() == 120) {
					if (!txtTotalVenda.getText().isEmpty()) {

						tabbedPane.setSelectedIndex(4);

						String valorVenda = txtTotalVenda.getText();
						txtValorAPagar.setText(valorVenda);
						String v = valorVenda.replace(',', '.');

						double vDouble = Double.parseDouble(v);
						double p2 = vDouble / 2;
						double p3 = vDouble / 3;
						double p4 = vDouble / 4;
						double p5 = vDouble / 5;

						txtParcelasValor.setText("Valor à vista: " + v + "\n" + "2x: " + String.format("%.2f", p2) + "\n"
								+ "3x: " + String.format("%.2f", p3) + "\n" + "4x: " + String.format("%.2f", p4) + "\n"
								+ "5x: " + String.format("%.2f", p5));
					}
				}
				
				if(e.getKeyCode() == 121) {
					lblProdutosVenda.setText("");
					lblQuantVendas.setText("");
					lblPrecoUnVendas.setText("");
					lblPrecoTotVenda.setText("");
					txtTotalVenda.setText("");
				}
				
				if(e.getKeyCode() == 122) {
					txtVendedorVenda.setText("");
					txtCpfClienteVenda.setText("");
					lblProdutosVenda.setText("");
					lblQuantVendas.setText("");
					lblPrecoUnVendas.setText("");
					lblPrecoTotVenda.setText("");
					txtTotalVenda.setText("");
					lblNomeClienteVenda.setText("");
				}
				
				if(e.getKeyCode() == 123) {
					new ConsultaPreco().setVisible(true);
				}
			}
		});

		txtQuantVenda.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				if (!lblNomeClienteVenda.getText().isEmpty() && !txtVendedorVenda.getText().isEmpty()) {
					if (e.getKeyCode() == 10) {

						String refProduto = txtRefVenda.getText();
						String quantidade = txtQuantVenda.getText();

						String QUERY = "SELECT * FROM produtos WHERE referencia=";
						QUERY = QUERY + refProduto;

						try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
								Statement stmt = conn.createStatement();

								ResultSet rs = stmt.executeQuery(QUERY);) {

							while (rs.next()) {

								System.out.println( Integer.parseInt(refProduto) );
								System.out.println(  rs.getInt("referencia") );
								
								if (Integer.parseInt(refProduto) == rs.getInt("referencia")) {
									txtRefVenda.setText("");

									// printa o produto
									String produtoAnterior = lblProdutosVenda.getText();
									String nome = rs.getString("nome");
									double preco = rs.getDouble("preco");
									String prodAtual = nome;
									String prodAtual_2 = produtoAnterior + "\n " + nome;

									lblProdutosVenda.setText(prodAtual_2);

									// printa quantidade

									String quantAnterior = lblQuantVendas.getText();

									String quantAtual = txtQuantVenda.getText();

									String quantAtual_2 = quantAnterior + "\n " + quantAtual;

									lblQuantVendas.setText(quantAtual_2);

									// printa preco

									String precoAnterior = lblPrecoUnVendas.getText();

									String precoAtual = String.valueOf(preco);

									String precoAtual_2 = precoAnterior + "\n" + precoAtual;

									lblPrecoUnVendas.setText(precoAtual_2 + "0");

									// preco total

									String totalAnterior = lblPrecoTotVenda.getText();

									double totalAtual = Double.parseDouble(precoAtual) * Integer.parseInt(quantAtual);

									lblPrecoTotVenda.setText(totalAnterior + "\n" + String.format("%.2f", totalAtual));

									// venda total

									if (totalAnterior.isEmpty()) {
										venda = venda + totalAtual;
										txtTotalVenda.setText(String.format("%.2f", venda));

									} else {

										venda = venda + totalAtual;
										txtTotalVenda.setText(String.format("%.2f", venda));

									}

									txtRefVenda.grabFocus();

									break;

								} else {

									JOptionPane.showMessageDialog(null, "Produto não cadastrado!");
									break;
								}

							}

						} catch (SQLException el) {
							el.printStackTrace();
						}
						
						txtQuantVenda.setText("1");
					}
				}
			}
		});
		
		boxMetodoPag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String metodoPag = boxMetodoPag.getSelectedItem().toString();
				
				if(metodoPag.equals("Crédito")) {
					boxParcelas.setVisible(true);
					boxBandeira.setVisible(true);
				}
				
				if (metodoPag.equals("Débito")) {
					boxBandeira.setVisible(true);
					boxParcelas.setVisible(false);
				}
			}
		});
		
		btnPagamentoVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtTotalVenda.getText().isEmpty()) {

					tabbedPane.setSelectedIndex(4);

					String valorVenda = txtTotalVenda.getText();
					txtValorAPagar.setText(valorVenda);
					String v = valorVenda.replace(',', '.');

					double vDouble = Double.parseDouble(v);
					double p2 = vDouble / 2;
					double p3 = vDouble / 3;
					double p4 = vDouble / 4;
					double p5 = vDouble / 5;
					
					txtParcelasValor.setText("Valor à vista: " + v + "\n" + "2x: " + String.format("%.2f", p2) + "\n"
							+ "3x: " + String.format("%.2f", p3) + "\n" + "4x: " + String.format("%.2f", p4) + "\n"
							+ "5x: " + String.format("%.2f", p5));
				}
			}
		});
		
		btnFinalizarVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnVoltaParaVenda.setVisible(true);
				String metodoPag = boxMetodoPag.getSelectedItem().toString();
				String parcelas = boxParcelas.getSelectedItem().toString();
				double v;

				
				if (metodoPag.equals("Crédito")) {

					if (parcelas.equals("2x")) {
						v = venda / 2;

						txtParcelasValor.setText("Parcelado em 2 vezes de: " + String.format("%.2f", v));

					}

					if (parcelas.equals("3x")) {
						v = venda / 3;

						txtParcelasValor.setText("Parcelado em 3 vezes de: " + String.format("%.2f", v));
					}

					if (parcelas.equals("4x")) {
						v = venda / 4;

						txtParcelasValor.setText("Parcelado em 4 vezes de: " + String.format("%.2f", v));
					}

					if (parcelas.equals("5x")) {
						v = venda / 5;

						txtParcelasValor.setText("Parcelado em 5 vezes de: " + String.format("%.2f", v));
					}

				}

				if (metodoPag.equals("Dinheiro")) {

					txtParcelasValor.setText("Pagamento em Dinheiro.");
				}

				if (metodoPag.equals("Débito")) {

					txtParcelasValor.setText("Pagamento em Débito.");
				}

				lblAgradecimento.setText("Venda finalizada!");
			}

		});

	}
}
