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

public class TelaVendas extends JFrame {

	private JPanel contentPane;
	private JTextField vendedorTextField;
	private JTextField cfpClienteTextField;
	private JTextField quantidadeText;

	 static final String DB_URL = "jdbc:mysql://localhost/sistemainternoloja";
	   static final String USER = "root";
	   static final String PASS = "root";
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
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInfo telaInfo = new TelaInfo();
				telaInfo.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(1107, 731, 89, 23);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(193, 219, 221));
		panel.setBounds(10, 21, 1186, 709);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VENDAS");
		lblNewLabel.setBounds(1003, 23, 99, 14);
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
		
		JLabel lblNewLabel_3 = new JLabel("Cliente");
		lblNewLabel_3.setBounds(165, 151, 46, 14);
		panel.add(lblNewLabel_3);
		
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
		
		JLabel lblNewLabel_5 = new JLabel("QUANTIDADE");
		lblNewLabel_5.setBounds(464, 231, 75, 14);
		panel.add(lblNewLabel_5);
		
		quantidadeText = new JTextField();
		quantidadeText.setBounds(555, 228, 105, 20);
		panel.add(quantidadeText);
		quantidadeText.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Pagamento");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton_1.setBounds(981, 646, 121, 37);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Consultar Preço");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton_2.setBounds(278, 646, 138, 37);
		panel.add(btnNewButton_2);
		
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
		
		JLabel itemLabel = new JLabel("");
		itemLabel.setOpaque(true);
		itemLabel.setForeground(new Color(255, 255, 255));
		itemLabel.setBackground(new Color(255, 255, 255));
		itemLabel.setBounds(85, 326, 66, 245);
		panel.add(itemLabel);
		
		JLabel quantLabel = new JLabel("");
		quantLabel.setHorizontalAlignment(SwingConstants.CENTER);
		quantLabel.setVerticalAlignment(SwingConstants.TOP);
		quantLabel.setOpaque(true);
		quantLabel.setBackground(Color.WHITE);
		quantLabel.setBounds(631, 326, 56, 245);
		panel.add(quantLabel);
		
		JLabel precoUnLabel = new JLabel("");
		precoUnLabel.setOpaque(true);
		precoUnLabel.setBackground(Color.WHITE);
		precoUnLabel.setBounds(697, 326, 99, 245);
		panel.add(precoUnLabel);
		
		JLabel precoTotalLabel = new JLabel("");
		precoTotalLabel.setOpaque(true);
		precoTotalLabel.setBackground(Color.WHITE);
		precoTotalLabel.setBounds(806, 326, 99, 245);
		panel.add(precoTotalLabel);
		
		JLabel lblNewLabel_6 = new JLabel("ítem");
		lblNewLabel_6.setBounds(85, 313, 46, 14);
		panel.add(lblNewLabel_6);
		
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
				            	 
				            	Opcao telaOp = new Opcao();
				 				telaOp.setVisible(true);
				            	
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
		
		
		JButton pesquisarProdutoBtn = new JButton("pesquisar");
		pesquisarProdutoBtn.setBounds(672, 227, 89, 23);
		panel.add(pesquisarProdutoBtn);
		
		JTextPane produtosLabel2 = new JTextPane();
		produtosLabel2.setBounds(157, 327, 464, 245);
		panel.add(produtosLabel2);
		pesquisarProdutoBtn.addActionListener(new ActionListener() {
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
				            	 String produtoAnterior = produtosLabel2.getText();
				            	 	
				            	 
				            	 String nome = rs.getString("nome");
				            	 int cor = rs.getInt("cor");				            	
				            	 String tamanho = rs.getString("tamanho");
//				            	 String prodAnterior = nome + " " + tamanho + " " + cor;
				            	 
				            	 String prodAtual = nome + " " + tamanho + " " + cor;
				            	 System.out.println("pane:" +produtoAnterior);
				            	 System.out.println("bd: " + nome);
				            	 String prodAtual_2 = produtoAnterior  + "\n " + nome;
				            	 System.out.println("atual: " + prodAtual_2);
				            	 
				            	 produtosLabel2.setText(prodAtual_2);
				            	 
				            	 
				            	 if (!quantidade.isEmpty()) {
				                        quantLabel.setText(quantidade);
				                    } else {
				                    	quantLabel.setText("1");
				                    }
				            	 
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
		
	}
}
