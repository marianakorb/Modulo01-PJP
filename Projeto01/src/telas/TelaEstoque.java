package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import java.awt.Component;

public class TelaEstoque extends JFrame {

	private JPanel contentPane;
	private JTextField pesquisatextField;
	private JTextField refText;
	private JTextField prodText;
	private JTextField precoText;
	private JTextField tamanhoText;
	private JTextField corText;
	private JTextField txtPesquisaProd;

	   static final String DB_URL = "jdbc:mysql://127.0.0.1/escola";
	   static final String USER = "root";
	   static final String PASS = "root";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEstoque frame = new TelaEstoque();
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
	public TelaEstoque() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1222, 804);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 214, 213));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 1186, 709);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel estoqueLabel = new JLabel("ESTOQUE");
		estoqueLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		estoqueLabel.setBounds(957, 30, 86, 14);
		panel.add(estoqueLabel);
		
		pesquisatextField = new JTextField();
		pesquisatextField.setBounds(161, 49, 152, 20);
		contentPane.add(pesquisatextField);
		pesquisatextField.setColumns(10);
		
		JTextArea lblRef = new JTextArea();
		lblRef.setBounds(39, 148, 94, 212);
		panel.add(lblRef);
		
		JTextArea lblProduto = new JTextArea();
		lblProduto.setBounds(135, 148, 336, 212);
		panel.add(lblProduto);
		
		JTextArea lblP = new JTextArea();
		lblP.setBounds(473, 148, 46, 212);
		panel.add(lblP);
		
		JTextArea lblPreco = new JTextArea();
		lblPreco.setBounds(665, 148, 86, 212);
		panel.add(lblPreco);
		
		JTextArea lblM = new JTextArea();
		lblM.setBounds(521, 148, 46, 212);
		panel.add(lblM);
		
		JTextArea lblG = new JTextArea();
		lblG.setBounds(569, 148, 46, 212);
		panel.add(lblG);
		
		JTextArea lblGG = new JTextArea();
		lblGG.setBounds(617, 148, 46, 212);
		panel.add(lblGG);
		
	// procura produto no BD e exibe na tabela as informações do estoque
		JButton pesquisaButton = new JButton("PESQUISAR");
		pesquisaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent el) {
				 int ref = Integer.parseInt(txtPesquisaProd.getText());
				 
				 String QUERY = "SELECT * FROM produtos";
				 try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				         Statement stmt = conn.createStatement();
				         ResultSet rs = stmt.executeQuery(QUERY);
				      ) {		      
				         while(rs.next()){				        	 				        	 
				        	 
				            if (ref == rs.getInt("referencia")) {
				            	String nome = rs.getString("nome");				  
				            	String cor = retornaCor(rs.getInt("cor"));
				            	String preco = String.valueOf(rs.getBigDecimal("preco"));
				            	
				            	// area referencia				           
				            	lblProduto.setText(String.valueOf(ref));
				            	
				            	// area nome do produto				           
				            	lblProduto.setText(nome + " " + cor);
				            	
				            	// area tamanho P
				            	
				            	// area tamanho M
				            	
				            	// area tamanho G
				            	
				            	// area tamanho GG
				            	
				            	// area preço
				            	lblPreco.setText(preco);
				            } else {
				            	lblProduto.setText("Produto não encontrado.");
				            }
				         }
				         
				      } catch (SQLException e) {
				         e.printStackTrace();
				      } 								 
				 }
			
			public String retornaCor(int cor) {
				String cores[] = {"Bege", "Preto", "Branco", "Azul", "Verde", "Cinza"};
				
				String c = cores[cor];
					
				return c;
			}
		});
		pesquisaButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pesquisaButton.setFont(new Font("Verdana", Font.PLAIN, 11));
		pesquisaButton.setBounds(337, 57, 112, 23);
		panel.add(pesquisaButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 377, 742, 2);
		panel.add(separator);
		
		JLabel lblNewLabel = new JLabel("CADASTRAR NOVO PRODUTO");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel.setBounds(61, 419, 232, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("REF");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(208, 512, 27, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PRODUTO");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(480, 511, 69, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("COR");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(406, 564, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TAMANHO");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(167, 564, 69, 14);
		panel.add(lblNewLabel_4);
		
		refText = new JTextField();
		refText.setFont(new Font("Verdana", Font.PLAIN, 11));
		refText.setBounds(245, 508, 196, 20);
		panel.add(refText);
		refText.setColumns(10);
		
		prodText = new JTextField();
		prodText.setBounds(559, 509, 299, 20);
		panel.add(prodText);
		prodText.setColumns(10);
		
		precoText = new JTextField();
		precoText.setBounds(739, 562, 119, 20);
		panel.add(precoText);
		precoText.setColumns(10);
		
		tamanhoText = new JTextField();
		tamanhoText.setBounds(246, 562, 86, 20);
		panel.add(tamanhoText);
		tamanhoText.setColumns(10);
		
		corText = new JTextField();
		corText.setBounds(462, 562, 148, 20);
		panel.add(corText);
		corText.setColumns(10);
		
		txtPesquisaProd = new JTextField();
		txtPesquisaProd.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtPesquisaProd.setBounds(39, 57, 288, 20);
		panel.add(txtPesquisaProd);
		txtPesquisaProd.setColumns(10);
		
		// Adiciona novo produto no banco de dados
		JButton salvarButton = new JButton("SALVAR");
		salvarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent el) {
					String QUERY = "SELECT referencia FROM produtos";
				
					int ref = Integer.parseInt(refText.getText());
					int cor = Integer.parseInt(corText.getText());
					String nomeProd = prodText.getText();
					String tamanho = tamanhoText.getText();
					float preco = Float.parseFloat(precoText.getText());
					
					// Open a connection
			      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			    	Statement stmt = conn.createStatement();
			    	ResultSet rs = stmt.executeQuery(QUERY);
			      ) {		      
			         // Execute a query
			    	  while(rs.next()){
			    		  if(ref == rs.getInt("referencia") ) {
			    			  System.out.println("Número de referência em uso.");
			    		  } else {
			    			  
			    			  System.out.println("Inserindo dados em tabela");
			    			  
			    			  String sql = "INSERT INTO produtos VALUES (" + ref + "," + cor + "," +  nomeProd + "," + tamanho + "," + preco + ")";
			    			  stmt.executeUpdate(sql);  	  
			    		  }
			    	  }
			         
			      } catch (SQLException e) {
			         e.printStackTrace();
			      } 
			}
		});
		salvarButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		salvarButton.setBounds(957, 640, 89, 35);
		panel.add(salvarButton);
		
		JLabel lblNewLabel_5 = new JLabel("PREÇO");
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(683, 564, 46, 14);
		panel.add(lblNewLabel_5);
		
		
		JLabel lblNewLabel_6 = new JLabel("Referência");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_6.setBackground(new Color(192, 192, 192));
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBounds(39, 133, 94, 14);
		panel.add(lblNewLabel_6);
		
		
		JLabel lblNewLabel_6_1 = new JLabel("Produto");
		lblNewLabel_6_1.setOpaque(true);
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_6_1.setAlignmentX(1.0f);
		lblNewLabel_6_1.setBounds(137, 133, 334, 14);
		panel.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("P");
		lblNewLabel_6_2.setOpaque(true);
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_6_2.setAlignmentX(1.0f);
		lblNewLabel_6_2.setBounds(473, 133, 46, 14);
		panel.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("M");
		lblNewLabel_6_2_1.setOpaque(true);
		lblNewLabel_6_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_6_2_1.setAlignmentX(1.0f);
		lblNewLabel_6_2_1.setBounds(521, 133, 46, 14);
		panel.add(lblNewLabel_6_2_1);
		
		JLabel lblNewLabel_6_2_2 = new JLabel("G");
		lblNewLabel_6_2_2.setOpaque(true);
		lblNewLabel_6_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_6_2_2.setAlignmentX(1.0f);
		lblNewLabel_6_2_2.setBounds(569, 133, 46, 14);
		panel.add(lblNewLabel_6_2_2);
		
		JLabel lblNewLabel_6_2_3 = new JLabel("GG");
		lblNewLabel_6_2_3.setOpaque(true);
		lblNewLabel_6_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_6_2_3.setAlignmentX(1.0f);
		lblNewLabel_6_2_3.setBounds(617, 133, 46, 14);
		panel.add(lblNewLabel_6_2_3);
		
		JLabel lblNewLabel_6_2_4 = new JLabel("Preço");
		lblNewLabel_6_2_4.setOpaque(true);
		lblNewLabel_6_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_4.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_6_2_4.setAlignmentX(1.0f);
		lblNewLabel_6_2_4.setBounds(665, 133, 84, 14);
		panel.add(lblNewLabel_6_2_4);
		
	}
}
