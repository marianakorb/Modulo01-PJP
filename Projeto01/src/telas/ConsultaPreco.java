package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ConsultaPreco extends JFrame {

	private JPanel contentPane;
	private JTextField txtProduto;

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
					ConsultaPreco frame = new ConsultaPreco();
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
	public ConsultaPreco() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(32, 11, 735, 491);
		contentPane.add(panel);
		
		txtProduto = new JTextField();
		
		txtProduto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 10) {
				
					
				}
				
			}
		});
		txtProduto.setColumns(10);
		txtProduto.setBounds(40, 118, 525, 30);
		panel.add(txtProduto);
		
		JLabel lblProduto = new JLabel("");
		lblProduto.setOpaque(true);
		lblProduto.setBackground(Color.WHITE);
		lblProduto.setBounds(40, 188, 635, 135);
		panel.add(lblProduto);
		
		JLabel lblPreco = new JLabel("");
		lblPreco.setOpaque(true);
		lblPreco.setBackground(Color.WHITE);
		lblPreco.setBounds(508, 334, 164, 40);
		panel.add(lblPreco);
		
		//pesquisa produto
		JButton PesquisarPrecoButton = new JButton("Pesquisar");
		PesquisarPrecoButton.setBounds(575, 123, 97, 21);
		panel.add(PesquisarPrecoButton);
		
		PesquisarPrecoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String refproduto = txtProduto.getText();
				String QUERY = "SELECT * FROM produtos WHERE referencia=";
				QUERY = QUERY + refproduto;
				
				try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				         Statement stmt = conn.createStatement();
						
				         ResultSet rs = stmt.executeQuery(QUERY);
				      ) {		      
					
						while(rs.next()){	
							
							String nome = rs.getString("nome");
							String preco = rs.getString("preco");							
								
				             if (rs.getString("referencia").equals(refproduto)) {				            	 
				            	 
				            	 lblProduto.setText(nome);
				            	 lblPreco.setText(preco);
				            	 
				            	 break;
				             } else {
				            	 
				            	 JOptionPane.showMessageDialog(null, "PRODUTO NÃO ENCONTRADO");			             
				             }				            	 
				             
				       } 
				         
				      } catch (SQLException el) {
				         el.printStackTrace();
				      }
			}
		});
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Valor");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(446, 352, 45, 13);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(40, 446, 100, 30);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("CONSULTA DE PREÇO");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(250, 53, 153, 22);
		panel.add(lblNewLabel_3);
	}
}
