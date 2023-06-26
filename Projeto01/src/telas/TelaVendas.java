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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

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

	public void limparTextfield(String l) {
		cpfTextField.setText(l);
		nomeTextField.setText(l);
		dataNascTextField.setText(l);
		sexoTextField.setText(l);
		cepTextField.setText(l);
		enderecoTextField.setText(l);
		numeroTextField.setText(l);
		complementoTextField.setText(l);
		bairroTextField.setText(l);
		cidadeTextField.setText(l);
		ufTextField.setText(l);
		telefoneTextField.setText(l);
		emailTextField.setText(l);
		pesquisarClientesTextField.setText(l);
		pesquisarClientesTextField.grabFocus();
	}

	// TORNAR CAMPOS DA ABA DE CLIENTES EDITÁVEL
	public void tornarCampoEditavel(boolean b) {
		cpfTextField.setEditable(b);
		nomeTextField.setEditable(b);
		dataNascTextField.setEditable(b);
		sexoTextField.setEditable(b);
		cepTextField.setEditable(b);
		enderecoTextField.setEditable(b);
		numeroTextField.setEditable(b);
		complementoTextField.setEditable(b);
		bairroTextField.setEditable(b);
		cidadeTextField.setEditable(b);
		ufTextField.setEditable(b);
		telefoneTextField.setEditable(b);
		emailTextField.setEditable(b);
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
		panel_10.setBounds(0, 660, 1181, 37);
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
		txtVendedorVenda.setFont(new Font("Dialog", Font.PLAIN, 13));
		txtVendedorVenda.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(38, 147, 166), null));
		txtVendedorVenda.setBounds(221, 85, 194, 20);
		panel.add(txtVendedorVenda);
		txtVendedorVenda.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("vendedor");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(157, 88, 66, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("cpf cliente");
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(157, 118, 66, 14);
		panel.add(lblNewLabel_2);

		txtQuantVenda = new JTextField();
		txtQuantVenda.setHorizontalAlignment(SwingConstants.CENTER);
		txtQuantVenda.setFont(new Font("Dialog", Font.PLAIN, 13));
		txtQuantVenda.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(38, 147, 166), null));
		txtQuantVenda.setBounds(454, 250, 46, 20);
		panel.add(txtQuantVenda);
		txtQuantVenda.setColumns(10);
		txtQuantVenda.setText("1");

		txtCpfClienteVenda = new JTextField();
		txtCpfClienteVenda.setFont(new Font("Dialog", Font.PLAIN, 13));
		txtCpfClienteVenda.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(38, 147, 166), null));
		txtCpfClienteVenda.setBounds(221, 116, 194, 20);
		panel.add(txtCpfClienteVenda);
		txtCpfClienteVenda.setColumns(10);

		JButton pesquisarButton = new JButton("pesquisar");
		pesquisarButton.setFont(new Font("Dialog", Font.PLAIN, 15));
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
		txtTotalVenda.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(38, 147, 166), null),
				"TOTAL", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 207, 134)));
		txtTotalVenda.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotalVenda.setBounds(707, 576, 150, 60);
		panel.add(txtTotalVenda);

		JTextField txtRefVenda = new JTextField();
		txtRefVenda.setFont(new Font("Dialog", Font.PLAIN, 13));
		txtRefVenda.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(38, 147, 166), null));
		txtRefVenda.setBounds(146, 249, 269, 20);

		panel.add(txtRefVenda);
		txtRefVenda.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("referência");
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(76, 252, 67, 14);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("qtd");
		lblNewLabel_5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(425, 253, 31, 14);
		panel.add(lblNewLabel_5);

		JLabel lblNomeClienteVenda = new JLabel("");
		lblNomeClienteVenda.setBackground(new Color(255, 255, 255));
		lblNomeClienteVenda.setBounds(221, 151, 194, 20);
		lblNomeClienteVenda.setOpaque(true);
		panel.add(lblNomeClienteVenda);

		JButton pesquisarCpf = new JButton("pesquisar");
		pesquisarCpf.setFont(new Font("Dialog", Font.PLAIN, 15));
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
		lblProdutosVenda.setBounds(76, 297, 545, 268);
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
		btnAdicionarProdutoVenda.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnAdicionarProdutoVenda.setBounds(509, 249, 112, 23);
		JTextArea lblQuantVendas = new JTextArea();
		lblQuantVendas.setEditable(false);
		lblQuantVendas.setFont(new Font("Dubai", Font.PLAIN, 15));
		lblQuantVendas.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.RAISED, new Color(38, 147, 166), new Color(160, 160, 160)), "QTD",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 207, 134)));
		lblQuantVendas.setBounds(629, 297, 58, 267);
		panel.add(lblQuantVendas);

		JTextArea lblPrecoUnVendas = new JTextArea();
		lblPrecoUnVendas.setEditable(false);
		lblPrecoUnVendas.setFont(new Font("Dubai", Font.PLAIN, 15));
		lblPrecoUnVendas.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.RAISED, new Color(38, 147, 166), new Color(160, 160, 160)), "$ UN",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 207, 134)));
		lblPrecoUnVendas.setBounds(697, 297, 75, 268);
		panel.add(lblPrecoUnVendas);

		JTextArea lblPrecoTotVenda = new JTextArea();
		lblPrecoTotVenda.setEditable(false);
		lblPrecoTotVenda.setFont(new Font("Dubai", Font.PLAIN, 15));
		lblPrecoTotVenda.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.RAISED, new Color(38, 147, 166), new Color(160, 160, 160)), "$ TOTAL",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 207, 134)));
		lblPrecoTotVenda.setBounds(782, 297, 75, 268);
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

						if (rs.next()) {

							do {

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
							} while (rs.next());

						} else {
							JOptionPane.showMessageDialog(null, "Produto não cadastrado.");
							txtRefVenda.setText("");
							txtRefVenda.grabFocus();

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

		LocalDate date = LocalDate.now();
		DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu");
		String textDate = date.format(formatters);

		Calendar data = Calendar.getInstance();
		int hora = data.get(Calendar.HOUR_OF_DAY);
		int min = data.get(Calendar.MINUTE);

		JLabel lblData = new JLabel(textDate);
		lblData.setBounds(1029, 11, 70, 14);
		panel_10.add(lblData);
		lblData.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblData.setForeground(new Color(255, 255, 255));
		// int seg = data.get(Calendar.SECOND);

		JLabel lblHora = new JLabel(hora + ":" + min + " ");
		lblHora.setBounds(1136, 11, 70, 14);
		panel_10.add(lblHora);
		lblHora.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHora.setForeground(new Color(255, 255, 255));

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 207, 134));
		panel_9.setBounds(1021, 56, 160, 615);
		panel.add(panel_9);
		panel_9.setLayout(null);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(TelaVendas.class.getResource("7.png")));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setForeground(new Color(255, 207, 134));
		btnNewButton.setBounds(10, 522, 135, 60);
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
		panel_3.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("CLIENTES", null, panel_3, null);
		panel_3.setLayout(null);

		JPanel panelExcluirCliente = new JPanel();
		panelExcluirCliente.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(38, 147, 166), null));
		panelExcluirCliente.setBounds(276, 222, 478, 251);
		panel_3.add(panelExcluirCliente);
		panelExcluirCliente.setLayout(null);
		panelExcluirCliente.setVisible(false);

		JButton btnNewButton_2 = new JButton("SIM");
		btnNewButton_2.setFont(new Font("Dialog", Font.PLAIN, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
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
				limparTextfield("");

				panelExcluirCliente.setVisible(false);
			}

		});

		btnNewButton_2.setBounds(92, 146, 100, 40);
		panelExcluirCliente.add(btnNewButton_2);

		JButton btnNewButton_5 = new JButton("NÃO");
		btnNewButton_5.setFont(new Font("Dialog", Font.PLAIN, 13));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelExcluirCliente.setVisible(false);
			}
		});
		btnNewButton_5.setBounds(284, 146, 100, 40);
		panelExcluirCliente.add(btnNewButton_5);

		JLabel lblNewLabel_7 = new JLabel("   Tem certeza que deseja excluir este cliente permanentemente ");
		lblNewLabel_7.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_7.setBounds(10, 57, 458, 13);
		panelExcluirCliente.add(lblNewLabel_7);

		JLabel lblNewLabel_7_1 = new JLabel("do seu banco de dados?");
		lblNewLabel_7_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_7_1.setBounds(10, 80, 458, 13);
		panelExcluirCliente.add(lblNewLabel_7_1);

		JLabel lblNewLabel_8 = new JLabel("   O cliente será apagado. Você não poderá desfazer esta ação.");
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(10, 103, 458, 13);
		panelExcluirCliente.add(lblNewLabel_8);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(38, 147, 166));
		panel_4.setBounds(0, 0, 478, 30);
		panelExcluirCliente.add(panel_4);

		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(new Color(38, 147, 166));
		panel_4_1.setBounds(0, 221, 478, 30);
		panelExcluirCliente.add(panel_4_1);

		JPanel panel_8_1 = new JPanel();
		panel_8_1.setLayout(null);
		panel_8_1.setBackground(new Color(117, 174, 184));
		panel_8_1.setBounds(10, 39, 121, 37);
		panel_3.add(panel_8_1);

		JLabel lblClientesz = new JLabel("CLIENTES");
		lblClientesz.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientesz.setForeground(new Color(255, 207, 134));
		lblClientesz.setFont(new Font("Dialog", Font.BOLD, 15));
		lblClientesz.setBounds(0, 10, 121, 14);
		panel_8_1.add(lblClientesz);

		JPanel panel_7_1 = new JPanel();
		panel_7_1.setLayout(null);
		panel_7_1.setBackground(new Color(38, 147, 166));
		panel_7_1.setBounds(0, 0, 1181, 57);
		panel_3.add(panel_7_1);

		pesquisarClientesTextField = new JTextField();
		pesquisarClientesTextField.setBorder(new LineBorder(new Color(38, 147, 166), 2));
		pesquisarClientesTextField.setBounds(72, 145, 253, 20);
		panel_3.add(pesquisarClientesTextField);
		pesquisarClientesTextField.setFont(new Font("Dialog", Font.PLAIN, 13));
		pesquisarClientesTextField.setColumns(10);

		JLabel cpfLabel = new JLabel("cpf");
		cpfLabel.setFont(new Font("Dialog", Font.PLAIN, 13));
		cpfLabel.setBounds(72, 197, 46, 14);
		panel_3.add(cpfLabel);

		cpfTextField = new JTextField();
		cpfTextField.setBorder(new LineBorder(new Color(38, 147, 166), 2));
		cpfTextField.setBounds(71, 215, 242, 20);
		panel_3.add(cpfTextField);
		cpfTextField.setEditable(false);
		cpfTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		cpfTextField.setColumns(10);

		JLabel nomeClienteLabel_1 = new JLabel("nome");
		nomeClienteLabel_1.setFont(new Font("Dialog", Font.PLAIN, 13));
		nomeClienteLabel_1.setBounds(356, 197, 46, 14);
		panel_3.add(nomeClienteLabel_1);

		nomeTextField = new JTextField();
		nomeTextField.setBorder(new LineBorder(new Color(38, 147, 166), 2));
		nomeTextField.setBounds(353, 215, 434, 20);
		panel_3.add(nomeTextField);
		nomeTextField.setEditable(false);
		nomeTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		nomeTextField.setColumns(10);

		cepTextField = new JTextField();
		cepTextField.setBorder(new LineBorder(new Color(38, 147, 166), 2));
		cepTextField.setBounds(71, 290, 196, 20);
		panel_3.add(cepTextField);
		cepTextField.setEditable(false);
		cepTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		cepTextField.setColumns(10);

		JLabel cepLabel = new JLabel("cep");
		cepLabel.setFont(new Font("Dialog", Font.PLAIN, 13));
		cepLabel.setBounds(72, 275, 193, 14);
		panel_3.add(cepLabel);

		JLabel enderecoLabel = new JLabel("endereço");
		enderecoLabel.setFont(new Font("Dialog", Font.PLAIN, 13));
		enderecoLabel.setBounds(300, 275, 86, 14);
		panel_3.add(enderecoLabel);

		enderecoTextField = new JTextField();
		enderecoTextField.setBorder(new LineBorder(new Color(38, 147, 166), 2));
		enderecoTextField.setBounds(299, 290, 488, 20);
		panel_3.add(enderecoTextField);
		enderecoTextField.setEditable(false);
		enderecoTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		enderecoTextField.setColumns(10);

		JLabel numResidenciaLabel = new JLabel("número");
		numResidenciaLabel.setFont(new Font("Dialog", Font.PLAIN, 13));
		numResidenciaLabel.setBounds(72, 320, 86, 14);
		panel_3.add(numResidenciaLabel);

		numeroTextField = new JTextField();
		numeroTextField.setBorder(new LineBorder(new Color(38, 147, 166), 2));
		numeroTextField.setBounds(72, 334, 86, 20);
		panel_3.add(numeroTextField);
		numeroTextField.setEditable(false);
		numeroTextField.setText("");
		numeroTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		numeroTextField.setColumns(10);

		JLabel complementoLabel = new JLabel("complemento");
		complementoLabel.setFont(new Font("Dialog", Font.PLAIN, 13));
		complementoLabel.setBounds(301, 320, 137, 14);
		panel_3.add(complementoLabel);

		complementoTextField = new JTextField();
		complementoTextField.setBorder(new LineBorder(new Color(38, 147, 166), 2));
		complementoTextField.setBounds(300, 334, 305, 20);
		panel_3.add(complementoTextField);
		complementoTextField.setEditable(false);
		complementoTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		complementoTextField.setColumns(10);

		JLabel bairroLabel = new JLabel("bairro");
		bairroLabel.setFont(new Font("Dialog", Font.PLAIN, 13));
		bairroLabel.setBounds(73, 364, 75, 14);
		panel_3.add(bairroLabel);

		bairroTextField = new JTextField();
		bairroTextField.setBorder(new LineBorder(new Color(38, 147, 166), 2));
		bairroTextField.setBounds(72, 378, 206, 20);
		panel_3.add(bairroTextField);
		bairroTextField.setEditable(false);
		bairroTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		bairroTextField.setColumns(10);

		JLabel cidadeLabel = new JLabel("cidade");
		cidadeLabel.setFont(new Font("Dialog", Font.PLAIN, 13));
		cidadeLabel.setBounds(301, 364, 58, 14);
		panel_3.add(cidadeLabel);

		cidadeTextField = new JTextField();
		cidadeTextField.setBorder(new LineBorder(new Color(38, 147, 166), 2));
		cidadeTextField.setBounds(302, 378, 290, 20);
		panel_3.add(cidadeTextField);
		cidadeTextField.setEditable(false);
		cidadeTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		cidadeTextField.setColumns(10);

		JLabel ufLabel = new JLabel("uf");
		ufLabel.setFont(new Font("Dialog", Font.PLAIN, 13));
		ufLabel.setBounds(608, 364, 56, 14);
		panel_3.add(ufLabel);

		ufTextField = new JTextField();
		ufTextField.setBorder(new LineBorder(new Color(38, 147, 166), 2));
		ufTextField.setBounds(608, 378, 86, 20);
		panel_3.add(ufTextField);
		ufTextField.setEditable(false);
		ufTextField.setText("");
		ufTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		ufTextField.setColumns(10);

		JLabel telefoneLabel = new JLabel("telefone");
		telefoneLabel.setFont(new Font("Dialog", Font.PLAIN, 13));
		telefoneLabel.setBounds(72, 444, 66, 14);
		panel_3.add(telefoneLabel);

		telefoneTextField = new JTextField();
		telefoneTextField.setBorder(new LineBorder(new Color(38, 147, 166), 2));
		telefoneTextField.setBounds(72, 458, 206, 20);
		panel_3.add(telefoneTextField);
		telefoneTextField.setEditable(false);
		telefoneTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		telefoneTextField.setColumns(10);

		JLabel emailLabel = new JLabel("e-mail");
		emailLabel.setFont(new Font("Dialog", Font.PLAIN, 13));
		emailLabel.setBounds(303, 444, 46, 14);
		panel_3.add(emailLabel);

		emailTextField = new JTextField();
		emailTextField.setBorder(new LineBorder(new Color(38, 147, 166), 2));
		emailTextField.setBounds(303, 458, 394, 20);
		panel_3.add(emailTextField);
		emailTextField.setEditable(false);
		emailTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		emailTextField.setColumns(10);

		JLabel nascimentoLabel = new JLabel("data de nascimento");
		nascimentoLabel.setFont(new Font("Dialog", Font.PLAIN, 13));
		nascimentoLabel.setBounds(72, 488, 206, 14);
		panel_3.add(nascimentoLabel);

		dataNascTextField = new JTextField();
		dataNascTextField.setToolTipText("AAAA-MM-DD");
		dataNascTextField.setBorder(new LineBorder(new Color(38, 147, 166), 2));
		dataNascTextField.setBounds(72, 503, 206, 20);
		panel_3.add(dataNascTextField);
		dataNascTextField.setEditable(false);
		dataNascTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		dataNascTextField.setColumns(10);
		

		JLabel sexoLabel = new JLabel("sexo");
		sexoLabel.setFont(new Font("Dialog", Font.PLAIN, 13));
		sexoLabel.setBounds(303, 488, 46, 14);
		panel_3.add(sexoLabel);

		sexoTextField = new JTextField();
		sexoTextField.setBorder(new LineBorder(new Color(38, 147, 166), 2));
		sexoTextField.setBounds(303, 503, 56, 20);
		panel_3.add(sexoTextField);
		sexoTextField.setEditable(false);
		sexoTextField.setText("");
		sexoTextField.setFont(new Font("Verdana", Font.PLAIN, 14));
		sexoTextField.setColumns(10);

		JPanel panel_10_1 = new JPanel();
		panel_10_1.setLayout(null);
		panel_10_1.setBackground(new Color(38, 147, 166));
		panel_10_1.setBounds(0, 654, 1181, 37);
		panel_3.add(panel_10_1);

		JPanel panel_9_1 = new JPanel();
		panel_9_1.setLayout(null);
		panel_9_1.setBackground(new Color(255, 207, 134));
		panel_9_1.setBounds(1021, 56, 160, 615);
		panel_3.add(panel_9_1);
		JButton excluirBtn = new JButton("");
		excluirBtn.setIcon(new ImageIcon(TelaVendas.class.getResource("EXCLUIR.png")));
		excluirBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelExcluirCliente.setVisible(true);

			}
		});
		excluirBtn.setBounds(15, 500, 135, 60);
		panel_9_1.add(excluirBtn);

		excluirBtn.setFont(new Font("Dialog", Font.PLAIN, 12));

		JButton limparBtn = new JButton("");
		limparBtn.setIcon(new ImageIcon(TelaVendas.class.getResource("8 (2).png")));
		limparBtn.setBounds(15, 430, 135, 60);
		panel_9_1.add(limparBtn);
		limparBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				limparTextfield("");

			}
		});
		limparBtn.setFont(new Font("Dialog", Font.PLAIN, 12));

		JButton salvarClienteBtn = new JButton("");
		salvarClienteBtn.setIcon(new ImageIcon(TelaVendas.class.getResource("SALVAR.png")));
		salvarClienteBtn.setFont(new Font("Dialog", Font.PLAIN, 12));
		salvarClienteBtn.setBounds(15, 360, 135, 60);
		panel_9_1.add(salvarClienteBtn);

		JButton atualizarButton = new JButton(" Atualizar Cadastro");
		atualizarButton.setBounds(15, 290, 135, 60);
		panel_9_1.add(atualizarButton);
		atualizarButton.setVisible(false);
		atualizarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				salvarClienteBtn.setVisible(true);
				salvarClienteBtn.setText("Salvar Atualização");
				
				tornarCampoEditavel(true);

			}
		});
		atualizarButton.setFont(new Font("Dialog", Font.PLAIN, 12));

		JButton pesquisarClientesBtn = new JButton("pesquisar");
		pesquisarClientesBtn.setBounds(335, 145, 95, 23);
		panel_3.add(pesquisarClientesBtn);
		pesquisarClientesBtn.addActionListener(new ActionListener() {
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

							tornarCampoEditavel(false);

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
		pesquisarClientesBtn.setFont(new Font("Dialog", Font.PLAIN, 14));

		JButton novoCadastroBtn = new JButton("");
		novoCadastroBtn.setIcon(new ImageIcon(TelaVendas.class.getResource("ADD.png")));
		novoCadastroBtn.setFont(new Font("Dialog", Font.PLAIN, 12));
		novoCadastroBtn.setBounds(15, 220, 135, 60);
		panel_9_1.add(novoCadastroBtn);
		
		JLabel lblNewLabel_9 = new JLabel("AAAA-MM-DD");
		lblNewLabel_9.setForeground(new Color(192, 192, 192));
		lblNewLabel_9.setBounds(139, 525, 86, 14);
		panel_3.add(lblNewLabel_9);
		novoCadastroBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				limparTextfield("");
				salvarClienteBtn.setVisible(true);
				salvarClienteBtn.setText("Salvar Cadastro");

				tornarCampoEditavel(true);
				cpfTextField.grabFocus();
			}
		});

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

						tornarCampoEditavel(false);
					}
					if (textBtn.equals("Salvar Atualização")) {

						String sql = "UPDATE sistemainternoloja.clientes " + "SET cpf = '" + cpf + "', nome = '" + nome
								+ "', cep = '" + cep + "', endereco = '" + endereco + "', numero = '" + numero +"', complemento='"+ complemento
								+ "', bairro = '" + bairro + "', cidade = '" + cidade + "', uf = '" + uf
								+ "', telefone = '" + telefone + "', email = '" + email + "', data_nasc = '" + data_nasc
								+ "', sexo = '" + sexo + "' WHERE cpf ='" + cpf + "';";
						stmt.executeUpdate(sql);
						
						tornarCampoEditavel(false);
					}

				} catch (SQLException el) {
					el.printStackTrace();

				}

			}
		});
		limparBtn.setVisible(false);
		excluirBtn.setVisible(false);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("CONSULTA VENDAS", null, panel_5, null);
		panel_5.setLayout(null);

		JPanel panel_8_1_1 = new JPanel();
		panel_8_1_1.setLayout(null);
		panel_8_1_1.setBackground(new Color(117, 174, 184));
		panel_8_1_1.setBounds(10, 39, 171, 37);
		panel_5.add(panel_8_1_1);

		JLabel lblConsultaVendas = new JLabel("CONSULTA VENDAS");
		lblConsultaVendas.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultaVendas.setForeground(new Color(255, 207, 134));
		lblConsultaVendas.setFont(new Font("Dialog", Font.BOLD, 15));
		lblConsultaVendas.setBounds(0, 10, 171, 14);
		panel_8_1_1.add(lblConsultaVendas);

		JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBackground(new Color(38, 147, 166));
		panel_7_1_1.setBounds(0, 0, 1181, 57);
		panel_5.add(panel_7_1_1);

		JPanel panel_10_1_1 = new JPanel();
		panel_10_1_1.setLayout(null);
		panel_10_1_1.setBackground(new Color(38, 147, 166));
		panel_10_1_1.setBounds(0, 660, 1181, 37);
		panel_5.add(panel_10_1_1);

		JPanel panel_9_2 = new JPanel();
		panel_9_2.setLayout(null);
		panel_9_2.setBackground(new Color(255, 207, 134));
		panel_9_2.setBounds(1021, 55, 160, 607);
		panel_5.add(panel_9_2);

		JButton btnLimparConsVenda = new JButton("");
		btnLimparConsVenda.setIcon(new ImageIcon(TelaVendas.class.getResource("8 (2).png")));
		btnLimparConsVenda.setBounds(12, 502, 135, 60);
		panel_9_2.add(btnLimparConsVenda);
		btnLimparConsVenda.setFont(new Font("Verdana", Font.PLAIN, 12));

		txtConsultaVenda = new JTextField();
		txtConsultaVenda.setBorder(new LineBorder(new Color(38, 147, 166), 2, true));
		txtConsultaVenda.setBounds(61, 116, 233, 20);
		panel_5.add(txtConsultaVenda);
		txtConsultaVenda.setColumns(10);

		JButton btnNewButton_1_2 = new JButton("Pesquisar");
		btnNewButton_1_2.setBounds(304, 115, 89, 23);
		panel_5.add(btnNewButton_1_2);

		txtCupomFiscal = new JTextField();
		txtCupomFiscal.setBorder(new LineBorder(new Color(38, 147, 166), 2, true));
		txtCupomFiscal.setBounds(61, 182, 233, 20);
		panel_5.add(txtCupomFiscal);
		txtCupomFiscal.setColumns(10);

		JLabel cupomFiscalLabel = new JLabel("cupom fiscal");
		cupomFiscalLabel.setBounds(63, 165, 115, 14);
		panel_5.add(cupomFiscalLabel);
		cupomFiscalLabel.setFont(new Font("Dialog", Font.PLAIN, 13));

		JLabel dataLabel = new JLabel("data");
		dataLabel.setFont(new Font("Dialog", Font.PLAIN, 13));
		dataLabel.setBounds(340, 166, 46, 14);
		panel_5.add(dataLabel);

		txtData = new JTextField();
		txtData.setBorder(new LineBorder(new Color(38, 147, 166), 2, true));
		txtData.setBounds(340, 182, 135, 20);
		panel_5.add(txtData);
		txtData.setColumns(10);

		JLabel lblcpf = new JLabel("cpf");
		lblcpf.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblcpf.setBounds(61, 213, 46, 14);
		panel_5.add(lblcpf);

		txtCpf = new JTextField();
		txtCpf.setBorder(new LineBorder(new Color(38, 147, 166), 2, true));
		txtCpf.setBounds(61, 228, 233, 20);
		panel_5.add(txtCpf);
		txtCpf.setColumns(10);

		JLabel lblnomecliente = new JLabel("cliente");
		lblnomecliente.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblnomecliente.setBounds(340, 213, 64, 14);
		panel_5.add(lblnomecliente);

		txtNomeCliente = new JTextField();
		txtNomeCliente.setBorder(new LineBorder(new Color(38, 147, 166), 2, true));
		txtNomeCliente.setBounds(340, 228, 308, 20);
		panel_5.add(txtNomeCliente);
		txtNomeCliente.setColumns(10);

		JTextArea panelTxtRef = new JTextArea();
		panelTxtRef.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(38, 147, 166), null),
				"REF", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 207, 134)));
		panelTxtRef.setBounds(63, 309, 97, 212);
		panel_5.add(panelTxtRef);

		JLabel panelTxtProduto = new JLabel("");
		panelTxtProduto.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(38, 147, 166), null),
				"PRODUTOS", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 207, 134)));
		panelTxtProduto.setBounds(170, 309, 509, 212);
		panel_5.add(panelTxtProduto);
		panelTxtProduto.setOpaque(true);
		panelTxtProduto.setBackground(Color.WHITE);

		JLabel panelTxtPreco = new JLabel("");
		panelTxtPreco.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(38, 147, 166), null),
				"$ UN", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 207, 134)));
		panelTxtPreco.setBounds(688, 309, 128, 212);
		panel_5.add(panelTxtPreco);
		panelTxtPreco.setOpaque(true);
		panelTxtPreco.setBackground(Color.WHITE);

		txtVendedor = new JTextField();
		txtVendedor.setBorder(new LineBorder(new Color(38, 147, 166), 2, true));
		txtVendedor.setBounds(61, 555, 192, 20);
		panel_5.add(txtVendedor);
		txtVendedor.setColumns(10);

		JLabel lblNewLabel_4_3 = new JLabel("vendedor");
		lblNewLabel_4_3.setBounds(263, 557, 64, 14);
		panel_5.add(lblNewLabel_4_3);
		lblNewLabel_4_3.setFont(new Font("Dialog", Font.PLAIN, 13));

		txtTotalDaVenda = new JTextField();
		txtTotalDaVenda.setBorder(new LineBorder(new Color(38, 147, 166), 2, true));
		txtTotalDaVenda.setBounds(688, 555, 128, 20);
		panel_5.add(txtTotalDaVenda);
		txtTotalDaVenda.setColumns(10);

		JLabel lblNewLabel_3_3 = new JLabel("total");
		lblNewLabel_3_3.setBounds(633, 557, 46, 14);
		panel_5.add(lblNewLabel_3_3);
		lblNewLabel_3_3.setFont(new Font("Dialog", Font.PLAIN, 13));

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("ESTOQUE", null, panel_1, null);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBounds(10, 11, 1186, 709);
		panel_1.setLayout(null);

		JPanel panel_8_1_2 = new JPanel();
		panel_8_1_2.setLayout(null);
		panel_8_1_2.setBackground(new Color(117, 174, 184));
		panel_8_1_2.setBounds(10, 42, 121, 37);
		panel_1.add(panel_8_1_2);

		JLabel lblEstoque = new JLabel("ESTOQUE");
		lblEstoque.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstoque.setForeground(new Color(255, 207, 134));
		lblEstoque.setFont(new Font("Dialog", Font.BOLD, 15));
		lblEstoque.setBounds(0, 10, 121, 14);
		panel_8_1_2.add(lblEstoque);

		JPanel panelExcluir = new JPanel();
		panelExcluir.setBounds(276, 222, 478, 251);
		panel_1.add(panelExcluir);
		panelExcluir.setVisible(false);
		panelExcluir.setLayout(null);
		panelExcluir.setBorder(new EmptyBorder(5, 5, 5, 5));

		JLabel lblNewLabel_6 = new JLabel("   Tem certeza que deseja excluir este ítem permanentemente ");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_6.setBounds(10, 57, 458, 13);
		panelExcluir.add(lblNewLabel_6);

		JButton simButton = new JButton("Sim");

		simButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		simButton.setActionCommand("OK");
		simButton.setBounds(92, 146, 100, 40);
		panelExcluir.add(simButton);

		JButton cancelButton = new JButton("Não");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelExcluir.setVisible(false);
			}
		});
		cancelButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		cancelButton.setActionCommand("Cancel");
		cancelButton.setBounds(284, 146, 100, 40);
		panelExcluir.add(cancelButton);

		JLabel lblDoSeuEstoque = new JLabel("   do seu estoque?");
		lblDoSeuEstoque.setHorizontalAlignment(SwingConstants.LEFT);
		lblDoSeuEstoque.setFont(new Font("Dialog", Font.BOLD, 15));
		lblDoSeuEstoque.setBounds(10, 80, 458, 13);
		panelExcluir.add(lblDoSeuEstoque);

		JLabel lblOtemSer = new JLabel("   O ítem será apagado. Você não poderá desfazer esta ação.");
		lblOtemSer.setHorizontalAlignment(SwingConstants.LEFT);
		lblOtemSer.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblOtemSer.setBounds(10, 103, 458, 13);
		panelExcluir.add(lblOtemSer);

		JPanel panel_4_2 = new JPanel();
		panel_4_2.setBackground(new Color(38, 147, 166));
		panel_4_2.setBounds(0, 0, 478, 30);
		panelExcluir.add(panel_4_2);

		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setBounds(0, 221, 478, 30);
		panelExcluir.add(panel_4_1_1);
		panel_4_1_1.setBackground(new Color(38, 147, 166));

		JTextArea lblRef_1 = new JTextArea();
		lblRef_1.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.RAISED, new Color(38, 147, 166), new Color(160, 160, 160)), "REF",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 207, 134)));
		lblRef_1.setEditable(false);
		lblRef_1.setBounds(72, 198, 128, 90);
		panel_1.add(lblRef_1);

		JTextArea lblProduto_1 = new JTextArea();
		lblProduto_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(38, 147, 166), null),
				"PRODUTO", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 207, 134)));
		lblProduto_1.setEditable(false);
		lblProduto_1.setBounds(210, 198, 336, 90);
		panel_1.add(lblProduto_1);

		JTextArea lblQuant_1 = new JTextArea();
		lblQuant_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(38, 147, 166), null),
				"QTD", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 207, 134)));
		lblQuant_1.setEditable(false);
		lblQuant_1.setBounds(556, 198, 67, 90);
		panel_1.add(lblQuant_1);

		JTextArea lblPreco_1 = new JTextArea();
		lblPreco_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(38, 147, 166), null),
				"PRE\u00C7O", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 207, 134)));
		lblPreco_1.setEditable(false);
		lblPreco_1.setBounds(633, 198, 112, 90);
		panel_1.add(lblPreco_1);

		txtPesquisaProduto = new JTextField();
		txtPesquisaProduto.setBorder(new LineBorder(new Color(38, 147, 166), 2));
		txtPesquisaProduto.setFont(new Font("Dialog", Font.PLAIN, 13));
		txtPesquisaProduto.setColumns(10);
		txtPesquisaProduto.setBounds(72, 145, 288, 20);
		panel_1.add(txtPesquisaProduto);

		JButton btnPesquisaProduto = new JButton("pesquisar");

		btnPesquisaProduto.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnPesquisaProduto.setBounds(370, 143, 112, 23);
		panel_1.add(btnPesquisaProduto);

		JPanel panel_estoque = new JPanel();
		panel_estoque.setBackground(new Color(255, 255, 255));
		panel_estoque.setBorder(new LineBorder(new Color(38, 147, 166), 2, true));
		panel_estoque.setBounds(72, 365, 673, 192);
		panel_1.add(panel_estoque);
		panel_estoque.setLayout(null);
		panel_estoque.setVisible(false);

		JLabel lblFuncaoEstoque = new JLabel("");
		lblFuncaoEstoque.setBounds(13, 11, 232, 14);
		panel_estoque.add(lblFuncaoEstoque);
		lblFuncaoEstoque.setFont(new Font("Verdana", Font.BOLD, 12));

		txtRefEstoque = new JTextField();
		txtRefEstoque.setBackground(new Color(255, 255, 255));
		txtRefEstoque.setBounds(127, 51, 196, 20);
		panel_estoque.add(txtRefEstoque);
		txtRefEstoque.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtRefEstoque.setColumns(10);

		JLabel lblNewLabel_1_2 = new JLabel("referência");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(51, 55, 68, 14);
		panel_estoque.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);

		JLabel lblNewLabel_2_2 = new JLabel("produto");
		lblNewLabel_2_2.setBounds(48, 96, 69, 14);
		panel_estoque.add(lblNewLabel_2_2);
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.PLAIN, 13));

		txtProdutoEstoque = new JTextField();
		txtProdutoEstoque.setBounds(127, 94, 363, 20);
		panel_estoque.add(txtProdutoEstoque);
		txtProdutoEstoque.setColumns(10);

		JLabel lblNewLabel_5_2 = new JLabel("preço");
		lblNewLabel_5_2.setBounds(69, 143, 46, 14);
		panel_estoque.add(lblNewLabel_5_2);
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5_2.setFont(new Font("Dialog", Font.PLAIN, 13));

		txtPrecoEstoque = new JTextField();
		txtPrecoEstoque.setBounds(126, 138, 119, 20);
		panel_estoque.add(txtPrecoEstoque);
		txtPrecoEstoque.setColumns(10);

		JLabel lblNewLabel_5_2_2 = new JLabel("qtd");
		lblNewLabel_5_2_2.setBounds(317, 145, 46, 14);
		panel_estoque.add(lblNewLabel_5_2_2);
		lblNewLabel_5_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5_2_2.setFont(new Font("Dialog", Font.PLAIN, 13));

		txtQuantEstoque = new JTextField();
		txtQuantEstoque.setBounds(373, 142, 119, 20);
		panel_estoque.add(txtQuantEstoque);
		txtQuantEstoque.setColumns(10);

		JButton btnSalvarEstoque = new JButton("Salvar");
		btnSalvarEstoque.setBounds(528, 131, 119, 40);
		panel_estoque.add(btnSalvarEstoque);
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

		JPanel panel_7_1_2 = new JPanel();
		panel_7_1_2.setLayout(null);
		panel_7_1_2.setBackground(new Color(38, 147, 166));
		panel_7_1_2.setBounds(0, 0, 1181, 57);
		panel_1.add(panel_7_1_2);

		JPanel panel_10_1_1_1 = new JPanel();
		panel_10_1_1_1.setLayout(null);
		panel_10_1_1_1.setBackground(new Color(38, 147, 166));
		panel_10_1_1_1.setBounds(0, 660, 1181, 37);
		panel_1.add(panel_10_1_1_1);

		JPanel panel_9_2_1 = new JPanel();
		panel_9_2_1.setLayout(null);
		panel_9_2_1.setBackground(new Color(255, 207, 134));
		panel_9_2_1.setBounds(1021, 57, 160, 607);
		panel_1.add(panel_9_2_1);

		// CADASTRAR NOVO PRODUTO
		JButton btnCadastrarEstoque = new JButton("");
		btnCadastrarEstoque.setIcon(new ImageIcon(TelaVendas.class.getResource("ADD.png")));
		btnCadastrarEstoque.setBounds(14, 305, 135, 60);
		panel_9_2_1.add(btnCadastrarEstoque);

		JButton btnExcluirEstoque = new JButton("");
		btnExcluirEstoque.setIcon(new ImageIcon(TelaVendas.class.getResource("EXCLUIR.png")));
		btnExcluirEstoque.setBounds(14, 460, 135, 60);
		panel_9_2_1.add(btnExcluirEstoque);

		JButton btnAtualizarEstoque = new JButton("ATUALIZAR");
		btnAtualizarEstoque.setBounds(14, 376, 135, 60);
		panel_9_2_1.add(btnAtualizarEstoque);
		btnAtualizarEstoque.setVisible(false);

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

		btnExcluirEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelExcluir.setVisible(true);

			}
		});
		btnCadastrarEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtRefEstoque.setText("");
				txtProdutoEstoque.setText("");
				txtPrecoEstoque.setText("");
				txtQuantEstoque.setText("");

				btnSalvarEstoque.setText("Cadastrar");
				lblFuncaoEstoque.setText("CADASTRAR NOVO PRODUTO");
				panel_estoque.setVisible(true);

			}
		});

		JLabel lblNewLabel_3 = new JLabel("F9");
		lblNewLabel_3.setForeground(new Color(255, 207, 134));
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(15, 170, 31, 14);
		panel_9.add(lblNewLabel_3);

		// VAI PARA ABA DE PAGAMENTO
		JButton btnPagamentoVenda = new JButton("");
		btnPagamentoVenda.setIcon(new ImageIcon(TelaVendas.class.getResource("1.png")));

		btnPagamentoVenda.setBorder(null);
		btnPagamentoVenda.setBackground(new Color(38, 147, 166));
		btnPagamentoVenda.setForeground(new Color(255, 207, 134));
		btnPagamentoVenda.setBounds(10, 167, 135, 60);
		panel_9.add(btnPagamentoVenda);
		btnPagamentoVenda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPagamentoVenda.setFont(new Font("Dubai", Font.BOLD, 15));

		JLabel lblNewLabel_3_2 = new JLabel("F10");
		lblNewLabel_3_2.setForeground(new Color(255, 207, 134));
		lblNewLabel_3_2.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNewLabel_3_2.setBounds(15, 247, 31, 14);
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
		btnNewButton_4.setBounds(10, 238, 135, 60);
		panel_9.add(btnNewButton_4);
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4.setFont(new Font("Dubai", Font.BOLD, 15));

		JLabel lblNewLabel_3_4 = new JLabel("F11");
		lblNewLabel_3_4.setForeground(new Color(255, 207, 134));
		lblNewLabel_3_4.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNewLabel_3_4.setBounds(15, 324, 31, 14);
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
		btnNewButton_3.setBounds(10, 313, 135, 60);
		panel_9.add(btnNewButton_3);
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setFont(new Font("Dubai", Font.BOLD, 15));

		JLabel lblNewLabel_3_5 = new JLabel("F12");
		lblNewLabel_3_5.setForeground(new Color(255, 207, 134));
		lblNewLabel_3_5.setBounds(15, 398, 31, 14);
		panel_9.add(lblNewLabel_3_5);
		lblNewLabel_3_5.setFont(new Font("Dialog", Font.PLAIN, 13));

		// CONSULTA PREÇO
		JButton btnConsultarPreco = new JButton("");
		btnConsultarPreco.setIcon(new ImageIcon(TelaVendas.class.getResource("5.png")));
		btnConsultarPreco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConsultarPreco.setBorder(null);
		btnConsultarPreco.setBackground(new Color(38, 147, 166));
		btnConsultarPreco.setForeground(new Color(255, 207, 134));
		btnConsultarPreco.setBounds(10, 388, 135, 60);
		panel_9.add(btnConsultarPreco);
		btnConsultarPreco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				new ConsultaPreco().setVisible(true);
			}
		});
		btnConsultarPreco.setFont(new Font("Dubai", Font.BOLD, 15));

		JPanel panel_pagamento = new JPanel();
		panel_pagamento.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("PAGAMENTO", null, panel_pagamento, null);
		panel_pagamento.setLayout(null);

		JPanel panel_8_1_3 = new JPanel();
		panel_8_1_3.setLayout(null);
		panel_8_1_3.setBackground(new Color(117, 174, 184));
		panel_8_1_3.setBounds(23, 43, 121, 37);
		panel_pagamento.add(panel_8_1_3);

		JLabel lblPagamento = new JLabel("PAGAMENTO");
		lblPagamento.setHorizontalAlignment(SwingConstants.CENTER);
		lblPagamento.setForeground(new Color(255, 207, 134));
		lblPagamento.setFont(new Font("Dialog", Font.BOLD, 15));
		lblPagamento.setBounds(0, 10, 121, 14);
		panel_8_1_3.add(lblPagamento);

		JLabel lblAgradecimento = new JLabel("");
		lblAgradecimento.setBounds(304, 571, 326, 27);
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
				venda = 0;
				txtVendedorVenda.grabFocus();
			}
		});
		btnVoltaParaVenda.setBounds(685, 572, 89, 27);
		btnVoltaParaVenda.setVisible(false);
		panel_pagamento.add(btnVoltaParaVenda);

		JTextArea txtParcelasValor = new JTextArea();
		txtParcelasValor.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(38, 147, 166), null));
		txtParcelasValor.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtParcelasValor.setEditable(false);
		txtParcelasValor.setBounds(279, 356, 514, 255);
		panel_pagamento.add(txtParcelasValor);

		JPanel panel_7_1_2_1 = new JPanel();
		panel_7_1_2_1.setLayout(null);
		panel_7_1_2_1.setBackground(new Color(38, 147, 166));
		panel_7_1_2_1.setBounds(1, 1, 1181, 57);
		panel_pagamento.add(panel_7_1_2_1);

		JPanel panel_9_2_1_1 = new JPanel();
		panel_9_2_1_1.setLayout(null);
		panel_9_2_1_1.setBackground(new Color(255, 207, 134));
		panel_9_2_1_1.setBounds(1021, 58, 160, 607);
		panel_pagamento.add(panel_9_2_1_1);

		// FINALIZA VENDA
		JButton btnFinalizarVenda = new JButton("");
		btnFinalizarVenda.setIcon(new ImageIcon(TelaVendas.class.getResource("1.png")));
		btnFinalizarVenda.setBounds(8, 350, 135, 60);
		panel_9_2_1_1.add(btnFinalizarVenda);

		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.setBounds(10, 427, 135, 60);
		panel_9_2_1_1.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon(TelaVendas.class.getResource("6.png")));
		btnNewButton_1_1.setBounds(11, 502, 135, 60);
		panel_9_2_1_1.add(btnNewButton_1_1);

		JPanel panel_10_1_1_1_1 = new JPanel();
		panel_10_1_1_1_1.setLayout(null);
		panel_10_1_1_1_1.setBackground(new Color(38, 147, 166));
		panel_10_1_1_1_1.setBounds(0, 664, 1181, 37);
		panel_pagamento.add(panel_10_1_1_1_1);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(255, 207, 134)));
		panel_6.setBounds(279, 128, 514, 210);
		panel_pagamento.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblNewLabel_14 = new JLabel("total");
		lblNewLabel_14.setBounds(82, 46, 118, 13);
		panel_6.add(lblNewLabel_14);
		lblNewLabel_14.setFont(new Font("Dialog", Font.PLAIN, 13));

		txtValorAPagar = new JTextField();
		txtValorAPagar.setBounds(82, 70, 154, 32);
		panel_6.add(txtValorAPagar);
		txtValorAPagar.setHorizontalAlignment(SwingConstants.CENTER);
		txtValorAPagar.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtValorAPagar.setEditable(false);
		txtValorAPagar.setColumns(10);

		JComboBox boxMetodoPag = new JComboBox();
		boxMetodoPag.setBounds(270, 70, 154, 32);
		panel_6.add(boxMetodoPag);
		boxMetodoPag.setModel(
				new DefaultComboBoxModel(new String[] { "Método Pagamento", "Dinheiro", "Débito", "Crédito" }));

		JComboBox boxParcelas = new JComboBox();
		boxParcelas.setBounds(82, 133, 154, 22);
		panel_6.add(boxParcelas);
		boxParcelas.setModel(new DefaultComboBoxModel(new String[] { "Parcelas", "2x", "3x", "4x", "5x" }));

		JComboBox boxBandeira = new JComboBox();
		boxBandeira.setBounds(270, 134, 154, 21);
		panel_6.add(boxBandeira);
		boxBandeira.setModel(
				new DefaultComboBoxModel(new String[] { "Bandeira Cartão", "MasterCard", "Visa", "Elo", "Amex" }));
		boxBandeira.setVisible(false);
		boxParcelas.setVisible(false);

		boxMetodoPag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String metodoPag = boxMetodoPag.getSelectedItem().toString();

				if (metodoPag.equals("Crédito")) {
					boxParcelas.setVisible(true);
					boxBandeira.setVisible(true);
				}

				if (metodoPag.equals("Débito")) {
					boxBandeira.setVisible(true);
					boxParcelas.setVisible(false);
				}
			}
		});

		btnFinalizarVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnVoltaParaVenda.setVisible(true);
				String metodoPag = boxMetodoPag.getSelectedItem().toString();
				String parcelas = boxParcelas.getSelectedItem().toString();
				double v;
				if (metodoPag.equals("Método Pagamento")) {

					btnFinalizarVenda.removeActionListener(null);
					lblAgradecimento.setText("Adicione um método de pagamento.");
					btnVoltaParaVenda.setVisible(false);
					btnPagamentoVenda.getAction();
					txtParcelasValor.setText("");

				} else if (metodoPag.equals("Crédito")) {

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

					lblAgradecimento.setText("Venda finalizada!");
					btnVoltaParaVenda.setVisible(true);

				}

				else if (metodoPag.equals("Dinheiro")) {

					txtParcelasValor.setText("Pagamento em Dinheiro.");
					lblAgradecimento.setText("Venda finalizada!");
					btnVoltaParaVenda.setVisible(true);
				}

				else {

					txtParcelasValor.setText("Pagamento em Débito.");
					lblAgradecimento.setText("Venda finalizada!");
					btnVoltaParaVenda.setVisible(true);
				}

			}

		});

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
			}
		});

		btnPesquisaProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAtualizarEstoque.setVisible(true);
				String ref = txtPesquisaProduto.getText();
				String QUERY = "SELECT * FROM produtos WHERE referencia=";
				QUERY = QUERY + ref;

				try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						Statement stmt = conn.createStatement();

						ResultSet rs = stmt.executeQuery(QUERY);) {
					if (rs.next()) {
						do {

							if (Integer.parseInt(ref) == rs.getInt("referencia")) {
								txtRefVenda.setText("");

								String nome = rs.getString("nome");
								String preco = rs.getString("preco");
								String quant = rs.getString("quantidade");

								lblRef_1.setText(ref);
								lblProduto_1.setText(nome);
								lblQuant_1.setText(quant);
								lblPreco_1.setText(preco);

							}

						} while (rs.next());

					} else {

						JOptionPane.showMessageDialog(null, "Produto não cadastrado!");
					}
					
				} catch (SQLException el) {
					el.printStackTrace();
				}

				txtPesquisaProduto.setText("");
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

						txtParcelasValor.setText("Valor à vista: " + v + "\n" + "2x: " + String.format("%.2f", p2)
								+ "\n" + "3x: " + String.format("%.2f", p3) + "\n" + "4x: " + String.format("%.2f", p4)
								+ "\n" + "5x: " + String.format("%.2f", p5));
					}
				}

				if (e.getKeyCode() == 121) {
					lblProdutosVenda.setText("");
					lblQuantVendas.setText("");
					lblPrecoUnVendas.setText("");
					lblPrecoTotVenda.setText("");
					txtTotalVenda.setText("");
				}

				if (e.getKeyCode() == 122) {
					txtVendedorVenda.setText("");
					txtCpfClienteVenda.setText("");
					lblProdutosVenda.setText("");
					lblQuantVendas.setText("");
					lblPrecoUnVendas.setText("");
					lblPrecoTotVenda.setText("");
					txtTotalVenda.setText("");
					lblNomeClienteVenda.setText("");
				}

				if (e.getKeyCode() == 123) {
					new ConsultaPreco().setVisible(true);
				}
			}
		});

		txtQuantVenda.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == 10) {

					if (!lblNomeClienteVenda.getText().isEmpty() && !txtVendedorVenda.getText().isEmpty()) {

						String refProduto = txtRefVenda.getText();
						String quantidade = txtQuantVenda.getText();

						String QUERY = "SELECT * FROM produtos WHERE referencia=";
						QUERY = QUERY + refProduto;

						try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
								Statement stmt = conn.createStatement();

								ResultSet rs = stmt.executeQuery(QUERY);) {

							if (rs.next()) {

								do {

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

										double totalAtual = Double.parseDouble(precoAtual)
												* Integer.parseInt(quantAtual);

										lblPrecoTotVenda
												.setText(totalAnterior + "\n" + String.format("%.2f", totalAtual));

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

								} while (rs.next());

							} else {
								JOptionPane.showMessageDialog(null, "Produto não cadastrado.");
								txtRefVenda.setText("");
								txtRefVenda.grabFocus();

							}

						} catch (SQLException el) {
							el.printStackTrace();
						}

						txtQuantVenda.setText("1");
					}
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

		simButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String ref = lblRef_1.getText();

				try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						Statement stmt = conn.createStatement();) {
					// Execute a query

					String sql = "DELETE FROM sistemainternoloja.produtos WHERE (referencia = '" + ref + "');";

					stmt.executeUpdate(sql);

				} catch (SQLException el) {
					el.printStackTrace();
				}

				lblRef_1.setText("");
				lblProduto_1.setText("");
				lblQuant_1.setText("");
				lblPreco_1.setText("");

				panelExcluir.setVisible(false);
			}
		});

	}
}
