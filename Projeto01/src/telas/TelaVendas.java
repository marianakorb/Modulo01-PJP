package telas;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
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

public class TelaVendas extends JFrame {

	private JPanel contentPane;
	private JTextField vendedorTextField;
	private JTextField cfpClienteTextField;
	private JTextField quantidadeText;

	 static final String DB_URL = "jdbc:mysql://localhost/sistemainternoloja";
	   static final String USER = "root";
	   static final String PASS = "root";
	   private JTextField textField;
	   private JTextField textField_1;
	   private JTextField textField_2;
	   private JTextField textField_3;
	   private JTextField textField_4;
	   private JTextField textField_5;
	   private JTextField textField_6;
	   private JTextField textField_7;
	   private JTextField textField_8;
	   private JTextField textField_11;
	   private JTextField textField_12;
	   private JTextField textField_13;
	   private JTextField textField_14;
	   private JTextField textField_15;
	   private JTextField textField_16;
	   private JTextField textField_17;
	   private JTextField textField_18;
	   private JTextField textField_19;
	   private JTextField textField_20;
	   private JTextField textField_21;
	   private JTextField textField_22;
	   private JTextField textField_23;
	   private JTextField textField_24;
	   private JTextField textField_25;
	   private JTextField textField_26;
	   private JTextField textField_27;
	   private JTextField textField_28;
	   private JTextField textField_29;
	   private JTextField textField_30;
	   private JTextField textField_31;
	   private JTextField textField_32;
	   private JTextField txtQuant;
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

	/**
	 * Create the frame.
	 */
	public TelaVendas() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//
//		int screenWidth = (int) screenSize.getWidth();
//
//		int screenHeight = (int) screenSize.getHeight();
//		
//		setBounds(100, 100, screenWidth, screenHeight);
		
		setBounds(100, 100, 1222, 804);
		setLocationRelativeTo(null);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 0, 1186, 731);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("VENDA", null, panel, null);
		panel.setBackground(new Color(193, 219, 221));
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VENDAS");
		lblNewLabel.setBounds(1082, 11, 99, 14);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 13));
		
		vendedorTextField = new JTextField();
		
		vendedorTextField.setBounds(221, 85, 194, 20);
		panel.add(vendedorTextField);
		vendedorTextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Vendedor");
		lblNewLabel_1.setBounds(157, 88, 66, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CPF Cliente");
		lblNewLabel_2.setBounds(145, 119, 66, 14);
		panel.add(lblNewLabel_2);
		
		cfpClienteTextField = new JTextField();
		cfpClienteTextField.setBounds(221, 116, 194, 20);
		panel.add(cfpClienteTextField);
		cfpClienteTextField.setColumns(10);
		
		JButton pesquisarButton = new JButton("Pesquisar");
		pesquisarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String vendedor = vendedorTextField.getText();
				
				String QUERY = "SELECT id, nome FROM funcionarios WHERE id=";
				QUERY = QUERY + String.valueOf(vendedor);
				
				try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				         Statement stmt = conn.createStatement();
						
				         ResultSet rs = stmt.executeQuery(QUERY);
				      ) {		      
					
						while(rs.next()){					           
								
				             if (Integer.parseInt(vendedor) == rs.getInt("id")) {
				            	 
				            	 String nome = rs.getString("nome");
				            	 vendedorTextField.setText(nome);
				            	 
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
		pesquisarButton.setBounds(445, 84, 89, 23);
		panel.add(pesquisarButton);
		
		JTextField produtoTextField = new JTextField();
		
		produtoTextField.setBounds(146, 228, 269, 20);
		panel.add(produtoTextField);
		produtoTextField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("PRODUTO");
		lblNewLabel_4.setBounds(85, 231, 66, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("QTD");
		lblNewLabel_5.setBounds(425, 232, 31, 14);
		panel.add(lblNewLabel_5);
		
		quantidadeText = new JTextField();
		quantidadeText.setBounds(454, 229, 46, 20);
		panel.add(quantidadeText);
		quantidadeText.setColumns(10);
		quantidadeText.setText("1");
		
		JButton btnNewButton_1 = new JButton("Pagamento");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton_1.setBounds(981, 646, 121, 37);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Cancelar");
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton_3.setBounds(161, 646, 105, 37);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Limpar");
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton_4.setBounds(46, 646, 105, 37);
		panel.add(btnNewButton_4);
		
		JLabel lblNewLabel_7 = new JLabel("Produto");
		lblNewLabel_7.setBounds(161, 313, 75, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Peças");
		lblNewLabel_8.setBounds(629, 313, 46, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Preço un.");
		lblNewLabel_9.setBounds(697, 313, 64, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Preço Total");
		lblNewLabel_10.setBounds(811, 313, 75, 14);
		panel.add(lblNewLabel_10);
		
		JLabel nomeClienteLabel = new JLabel("");
		nomeClienteLabel.setOpaque(true);
		nomeClienteLabel.setBounds(221, 151, 194, 20);
		panel.add(nomeClienteLabel);
		
		JButton pesquisarCpf = new JButton("Pesquisar");
		pesquisarCpf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = cfpClienteTextField.getText();
				
				String QUERY = "SELECT cpf, nome FROM clientes WHERE cpf=";
				QUERY = QUERY + cpf;
				
				try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				         Statement stmt = conn.createStatement();
						
				         ResultSet rs = stmt.executeQuery(QUERY);
				      ) {		      
					
						while(rs.next()){					           
								
				             if (rs.getString("cpf").equals(cpf)) {
				            	 
				            	 String nome = rs.getString("nome");
				           
				            	 nomeClienteLabel.setText(nome);
				            	 
				             } else {
				            	 
//				            	Opcao telaOp = new Opcao();
//				 				telaOp.setVisible(true);
				            	
				             }
				             break;
				       } 
				         
				      } catch (SQLException el) {
				         el.printStackTrace();
				      }
			}
		});
		pesquisarCpf.setBounds(445, 115, 89, 23);
		panel.add(pesquisarCpf);
		
		JTextPane produtosLabel2 = new JTextPane();
		produtosLabel2.setBounds(157, 327, 464, 245);
		panel.add(produtosLabel2);
		
		
		JPanel panel_2 = new JPanel();
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
		
		JButton pesquisarProdutoBtn_1 = new JButton("pesquisar");
		JTextArea quantLabel = new JTextArea();
		quantLabel.setBounds(629, 326, 58, 245);
		panel.add(quantLabel);
		
		JTextArea areaPrecoUn = new JTextArea();
		areaPrecoUn.setBounds(697, 327, 75, 234);
		panel.add(areaPrecoUn);
		
		pesquisarProdutoBtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String refProduto = produtoTextField.getText();
				String quantidade = quantidadeText.getText();
				
				String QUERY = "SELECT * FROM produtos WHERE referencia=";
				QUERY = QUERY + refProduto;
				
				try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				         Statement stmt = conn.createStatement();
						
				         ResultSet rs = stmt.executeQuery(QUERY);
				      ) {		      
					
						while(rs.next()){					           
								
				             if (Integer.parseInt(refProduto) == rs.getInt("referencia")) {
				            	 produtoTextField.setText("");
				            	 quantidadeText.setText("1");
				            	 
				            	 String produtoAnterior = produtosLabel2.getText();
				            	 					            	 
				            	 String nome = rs.getString("nome");
				            	 double preco = rs.getDouble("preco");
				            	 
				            	 //int cor = rs.getInt("cor");				            	
				            	// String tamanho = rs.getString("tamanho");
//				            	 String prodAnterior = nome + " " + tamanho + " " + cor;
				            	 
				            	 String prodAtual = nome;
				            	 
				            	 String prodAtual_2 = produtoAnterior  + "\n " + nome;
				            	 System.out.println("atual: " + prodAtual_2);
				            	 
				            	 produtosLabel2.setText(prodAtual_2);
				            	 
				            	 // printa quantidade
				            	 String quantAnterior = quantLabel.getText();
				            	 String quantAtual =quantidadeText.getText();
				            
				            	 String quantAtual_2 = quantAnterior  + "\n " + quantAtual;
				            	 
				            	 quantLabel.setText(quantAtual_2);
				            	 
				            	 // printa preco
				            	 
				            	 String precoAnterior = areaPrecoUn.getText();
				            	 
				            	 String precoAtual = String.valueOf(preco);
				            	 
				            	 String precoAtual_2 = precoAnterior + "\n" + precoAtual;
				            	 
				            	 areaPrecoUn.setText(precoAtual_2);
				            	 
				            	 
				            	 double total = preco * Integer.parseInt(quantidade);
				            	 
				            	 
				            	 
//				            	 if (!quantidade.isEmpty()) {
//				                        quantLabel.setText(quantidade);
//				                    } else {
//				                    	quantLabel.setText("1");
//				                    }
//				            	 
				            	 break;
				             } else {
				             
				            	 JOptionPane.showMessageDialog(null, "Produto não cadastrado!");
				            	 break;
				             }		             			         
				             
				             }
						
			
				      } catch (SQLException el) {
				         el.printStackTrace();
				      }																
				
			}
		});
		pesquisarProdutoBtn_1.setBounds(509, 228, 89, 23);
		panel.add(pesquisarProdutoBtn_1);
		
		JTextArea precoTotaltxt = new JTextArea();
		precoTotaltxt.setBounds(697, 582, 208, 37);
		panel.add(precoTotaltxt);
		
		JLabel lblNewLabel_3 = new JLabel("total");
		lblNewLabel_3.setBounds(629, 587, 46, 14);
		panel.add(lblNewLabel_3);
		
		
		JTextArea areaPrecoTot = new JTextArea();
		areaPrecoTot.setBounds(795, 327, 75, 234);
		panel.add(areaPrecoTot);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Clientes", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setForeground(Color.WHITE);
		panel_4.setBackground(new Color(193, 219, 221));
		panel_4.setBounds(0, 0, 1186, 709);
		panel_3.add(panel_4);
		
		JLabel clientesLabel = new JLabel("CADASTRO CLIENTES");
		clientesLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		clientesLabel.setBounds(991, 11, 185, 14);
		panel_4.add(clientesLabel);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Verdana", Font.PLAIN, 14));
		textField_12.setColumns(10);
		textField_12.setBounds(54, 199, 196, 20);
		panel_4.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Verdana", Font.PLAIN, 14));
		textField_13.setColumns(10);
		textField_13.setBounds(282, 199, 289, 20);
		panel_4.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Verdana", Font.PLAIN, 14));
		textField_14.setColumns(10);
		textField_14.setBounds(54, 294, 196, 20);
		panel_4.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Verdana", Font.PLAIN, 14));
		textField_15.setColumns(10);
		textField_15.setBounds(282, 294, 289, 20);
		panel_4.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setText("");
		textField_16.setFont(new Font("Verdana", Font.PLAIN, 14));
		textField_16.setColumns(10);
		textField_16.setBounds(54, 338, 86, 20);
		panel_4.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Verdana", Font.PLAIN, 14));
		textField_17.setColumns(10);
		textField_17.setBounds(282, 338, 166, 20);
		panel_4.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Verdana", Font.PLAIN, 14));
		textField_18.setColumns(10);
		textField_18.setBounds(54, 384, 206, 20);
		panel_4.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Verdana", Font.PLAIN, 14));
		textField_19.setColumns(10);
		textField_19.setBounds(284, 384, 290, 20);
		panel_4.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setText("");
		textField_20.setFont(new Font("Verdana", Font.PLAIN, 14));
		textField_20.setColumns(10);
		textField_20.setBounds(590, 384, 86, 20);
		panel_4.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setFont(new Font("Verdana", Font.PLAIN, 14));
		textField_21.setColumns(10);
		textField_21.setBounds(54, 464, 206, 20);
		panel_4.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setFont(new Font("Verdana", Font.PLAIN, 14));
		textField_22.setColumns(10);
		textField_22.setBounds(285, 464, 289, 20);
		panel_4.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setFont(new Font("Verdana", Font.PLAIN, 14));
		textField_23.setColumns(10);
		textField_23.setBounds(54, 526, 206, 20);
		panel_4.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setText("");
		textField_24.setFont(new Font("Verdana", Font.PLAIN, 14));
		textField_24.setColumns(10);
		textField_24.setBounds(285, 526, 149, 20);
		panel_4.add(textField_24);
		
		JLabel sexoLabel = new JLabel("SEXO");
		sexoLabel.setBounds(285, 511, 46, 14);
		panel_4.add(sexoLabel);
		
		JLabel cpfLabel = new JLabel("CPF");
		cpfLabel.setBounds(54, 185, 46, 14);
		panel_4.add(cpfLabel);
		
		JLabel emailLabel = new JLabel("E-MAIL");
		emailLabel.setBounds(285, 452, 46, 14);
		panel_4.add(emailLabel);
		
		JLabel ufLabel = new JLabel("UF");
		ufLabel.setBounds(590, 369, 46, 14);
		panel_4.add(ufLabel);
		
		JLabel nomeClienteLabel_1 = new JLabel("NOME");
		nomeClienteLabel_1.setBounds(282, 185, 46, 14);
		panel_4.add(nomeClienteLabel_1);
		
		JLabel cepLabel = new JLabel("CEP");
		cepLabel.setBounds(54, 278, 46, 14);
		panel_4.add(cepLabel);
		
		JLabel enderecoLabel = new JLabel("ENDEREÇO");
		enderecoLabel.setBounds(282, 278, 86, 14);
		panel_4.add(enderecoLabel);
		
		JLabel numResidenciaLabel = new JLabel("NÚMERO");
		numResidenciaLabel.setBounds(54, 325, 86, 14);
		panel_4.add(numResidenciaLabel);
		
		JLabel complementoLabel = new JLabel("COMPLEMENTO");
		complementoLabel.setBounds(280, 325, 137, 14);
		panel_4.add(complementoLabel);
		
		JLabel bairroLabel = new JLabel("BAIRRO");
		bairroLabel.setBounds(54, 369, 66, 14);
		panel_4.add(bairroLabel);
		
		JLabel cidadeLabel = new JLabel("CIDADE");
		cidadeLabel.setBounds(285, 369, 46, 14);
		panel_4.add(cidadeLabel);
		
		JLabel telefoneLabel = new JLabel("TELEFONE");
		telefoneLabel.setBounds(54, 452, 66, 14);
		panel_4.add(telefoneLabel);
		
		JLabel nascimentoLabel = new JLabel("DATA NASC.");
		nascimentoLabel.setBounds(54, 511, 86, 14);
		panel_4.add(nascimentoLabel);
		
		textField_25 = new JTextField();
		textField_25.setFont(new Font("Verdana", Font.PLAIN, 14));
		textField_25.setColumns(10);
		textField_25.setBounds(54, 99, 206, 20);
		panel_4.add(textField_25);
		
		JButton comprasBtn = new JButton("Compras");
		comprasBtn.setFont(new Font("Verdana", Font.PLAIN, 12));
		comprasBtn.setBounds(49, 641, 95, 39);
		panel_4.add(comprasBtn);
		
		JButton limparBtn = new JButton("Limpar");
		limparBtn.setFont(new Font("Verdana", Font.PLAIN, 12));
		limparBtn.setBounds(165, 641, 95, 39);
		panel_4.add(limparBtn);
		
		JButton excluirBtn = new JButton("Excluir");
		excluirBtn.setFont(new Font("Verdana", Font.PLAIN, 12));
		excluirBtn.setBounds(275, 641, 95, 39);
		panel_4.add(excluirBtn);
		
		JButton salvarBtn = new JButton("SALVAR");
		salvarBtn.setFont(new Font("Verdana", Font.PLAIN, 14));
		salvarBtn.setBounds(1062, 640, 95, 39);
		panel_4.add(salvarBtn);
		
		JButton btnNewButton_1_1 = new JButton("Pesquisar");
		btnNewButton_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_1_1.setBounds(270, 99, 95, 23);
		panel_4.add(btnNewButton_1_1);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Consulta Vendas", null, panel_5, null);
		panel_5.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(193, 219, 221));
		panel_6.setBounds(0, 0, 1186, 709);
		panel_5.add(panel_6);
		
		JLabel lblNewLabel_13 = new JLabel("CONSULTA VENDAS");
		lblNewLabel_13.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_13.setBounds(1006, 11, 170, 14);
		panel_6.add(lblNewLabel_13);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(70, 68, 233, 20);
		panel_6.add(textField_26);
		
		JLabel cupomFiscalLabel = new JLabel("CUPOM FISCAL");
		cupomFiscalLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
		cupomFiscalLabel.setBounds(70, 143, 115, 14);
		panel_6.add(cupomFiscalLabel);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(68, 160, 233, 20);
		panel_6.add(textField_27);
		
		JLabel dataLabel = new JLabel("DATA");
		dataLabel.setBounds(347, 144, 46, 14);
		panel_6.add(dataLabel);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(347, 160, 135, 20);
		panel_6.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(68, 216, 233, 20);
		panel_6.add(textField_29);
		
		JLabel lblNewLabel_1_3 = new JLabel("CPF");
		lblNewLabel_1_3.setBounds(68, 201, 46, 14);
		panel_6.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("CLIENTE");
		lblNewLabel_2_3.setBounds(347, 201, 64, 14);
		panel_6.add(lblNewLabel_2_3);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(347, 216, 308, 20);
		panel_6.add(textField_30);
		
		JButton btnNewButton_1_2 = new JButton("Pesquisar");
		btnNewButton_1_2.setBounds(304, 67, 89, 23);
		panel_6.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_1 = new JButton("Limpar");
		btnNewButton_2_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton_2_1.setBounds(68, 645, 89, 32);
		panel_6.add(btnNewButton_2_1);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(809, 604, 128, 20);
		panel_6.add(textField_31);
		
		JLabel lblNewLabel_3_3 = new JLabel("Total");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_3.setBounds(947, 606, 46, 14);
		panel_6.add(lblNewLabel_3_3);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(68, 604, 192, 20);
		panel_6.add(textField_32);
		
		JLabel lblNewLabel_4_3 = new JLabel("Vendedor");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_3.setBounds(270, 606, 64, 14);
		panel_6.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_5_3 = new JLabel("");
		lblNewLabel_5_3.setOpaque(true);
		lblNewLabel_5_3.setBackground(Color.WHITE);
		lblNewLabel_5_3.setBounds(177, 330, 100, 212);
		panel_6.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("");
		lblNewLabel_5_1_1.setOpaque(true);
		lblNewLabel_5_1_1.setBackground(Color.WHITE);
		lblNewLabel_5_1_1.setBounds(68, 330, 99, 212);
		panel_6.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("");
		lblNewLabel_5_2_1.setOpaque(true);
		lblNewLabel_5_2_1.setBackground(Color.WHITE);
		lblNewLabel_5_2_1.setBounds(290, 330, 509, 212);
		panel_6.add(lblNewLabel_5_2_1);
		
		JLabel lblNewLabel_5_3_1 = new JLabel("");
		lblNewLabel_5_3_1.setOpaque(true);
		lblNewLabel_5_3_1.setBackground(Color.WHITE);
		lblNewLabel_5_3_1.setBounds(809, 330, 128, 212);
		panel_6.add(lblNewLabel_5_3_1);
		
		JLabel lblNewLabel_6_3 = new JLabel("Ref.");
		lblNewLabel_6_3.setBounds(68, 314, 46, 14);
		panel_6.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_7_1 = new JLabel("Cor");
		lblNewLabel_7_1.setBounds(177, 314, 46, 14);
		panel_6.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("Produto");
		lblNewLabel_8_1.setBounds(290, 314, 46, 14);
		panel_6.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("Preço");
		lblNewLabel_9_1.setBounds(809, 314, 46, 14);
		panel_6.add(lblNewLabel_9_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Estoque", null, panel_1, null);
		panel_1.setBackground(new Color(193, 219, 221));
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBounds(10, 11, 1186, 709);
		panel_1.setLayout(null);
		
		JTextArea lblRef_1 = new JTextArea();
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
		lblProduto_1.setBounds(144, 114, 336, 75);
		panel_1.add(lblProduto_1);
		
		JTextArea lblQuant_1 = new JTextArea();
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
		lblPreco_1.setBounds(537, 114, 86, 75);
		panel_1.add(lblPreco_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Verdana", Font.PLAIN, 11));
		textField_6.setColumns(10);
		textField_6.setBounds(48, 68, 288, 20);
		panel_1.add(textField_6);
		
		JButton pesquisaButton_1 = new JButton("PESQUISAR");
		pesquisaButton_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		pesquisaButton_1.setBounds(346, 68, 112, 23);
		panel_1.add(pesquisaButton_1);
		
		JLabel estoqueLabel_1 = new JLabel("ESTOQUE");
		estoqueLabel_1.setFont(new Font("Verdana", Font.BOLD, 15));
		estoqueLabel_1.setBounds(1085, 11, 86, 14);
		panel_1.add(estoqueLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 403, 742, 2);
		panel_1.add(separator_1);
		
		JButton salvarButton_1_1 = new JButton("ATUALIZAR");
		salvarButton_1_1.setBounds(346, 241, 89, 35);
		panel_1.add(salvarButton_1_1);
		
		JButton salvarButton_1_1_1 = new JButton("EXCLUIR");
		salvarButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ExcluirOuNao telaExcluir = new ExcluirOuNao();
				telaExcluir.setVisible(true);
				setLocationRelativeTo(null);

			}
		});
		salvarButton_1_1_1.setBounds(53, 241, 89, 35);
		panel_1.add(salvarButton_1_1_1);
		
		JPanel panel_produto = new JPanel();
		panel_produto.setBounds(10, 429, 704, 192);
		panel_1.add(panel_produto);
		panel_produto.setLayout(null);
		panel_produto.setVisible(false);
		
		JLabel lblFuncao = new JLabel("");
		lblFuncao.setBounds(13, 11, 232, 14);
		panel_produto.add(lblFuncao);
		lblFuncao.setFont(new Font("Verdana", Font.BOLD, 12));
		
		salvarButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_produto.setVisible(true);
				lblFuncao.setText("ATUALIZAR PRODUTO");
			}
		});
		
		// CADSTRAR NOVO PRODUTO
		JButton salvarButton_1_1_2 = new JButton("INSERIR");
		salvarButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblFuncao.setText("CADASTRAR NOVO PRODUTO");
				panel_produto.setVisible(true);
			}
		});
		salvarButton_1_1_2.setBounds(211, 241, 89, 35);
		panel_1.add(salvarButton_1_1_2);
		
		
		textField_7 = new JTextField();
		textField_7.setBounds(127, 51, 196, 20);
		panel_produto.add(textField_7);
		textField_7.setFont(new Font("Verdana", Font.PLAIN, 11));
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("REF");
		lblNewLabel_1_2.setBounds(79, 55, 27, 14);
		panel_produto.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNewLabel_2_2 = new JLabel("PRODUTO");
		lblNewLabel_2_2.setBounds(48, 96, 69, 14);
		panel_produto.add(lblNewLabel_2_2);
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		
		textField_8 = new JTextField();
		textField_8.setBounds(127, 94, 363, 20);
		panel_produto.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_5_2 = new JLabel("PREÇO");
		lblNewLabel_5_2.setBounds(60, 144, 46, 14);
		panel_produto.add(lblNewLabel_5_2);
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		
		textField_11 = new JTextField();
		textField_11.setBounds(126, 138, 119, 20);
		panel_produto.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_5_2_2 = new JLabel("QNTD.");
		lblNewLabel_5_2_2.setBounds(317, 145, 46, 14);
		panel_produto.add(lblNewLabel_5_2_2);
		lblNewLabel_5_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5_2_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		
		txtQuant = new JTextField();
		txtQuant.setBounds(373, 142, 119, 20);
		panel_produto.add(txtQuant);
		txtQuant.setColumns(10);
		
		JButton salvarButton_1 = new JButton("SALVAR");
		salvarButton_1.setBounds(585, 135, 89, 35);
		panel_produto.add(salvarButton_1);
		
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin telaLogin = new TelaLogin();
				telaLogin.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(1107, 742, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
