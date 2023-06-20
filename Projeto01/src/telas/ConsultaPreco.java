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
import javax.swing.SwingConstants;

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
		contentPane.setBackground(new Color(38, 147, 166));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(31, 25, 735, 477);
		contentPane.add(panel);
		
		txtProduto = new JTextField();
		txtProduto.setBorder(new LineBorder(new Color(38, 147, 166), 1, true));
		
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
		lblProduto.setBorder(new LineBorder(new Color(38, 147, 166), 1, true));
		lblProduto.setOpaque(true);
		lblProduto.setBackground(Color.WHITE);
		lblProduto.setBounds(40, 176, 635, 135);
		panel.add(lblProduto);
		
		JLabel lblPreco = new JLabel("");
		lblPreco.setBorder(new LineBorder(new Color(38, 147, 166), 1, true));
		lblPreco.setOpaque(true);
		lblPreco.setBackground(Color.WHITE);
		lblPreco.setBounds(508, 334, 164, 40);
		panel.add(lblPreco);
		
		//pesquisa produto
		JButton PesquisarPrecoButton = new JButton("Pesquisar");
		PesquisarPrecoButton.setFont(new Font("Dubai", Font.PLAIN, 15));
		PesquisarPrecoButton.setBounds(575, 118, 97, 30);
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
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Dubai", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(462, 334, 45, 40);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Dubai", Font.PLAIN, 15));
		btnNewButton.setBounds(575, 412, 100, 30);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("CONSULTA DE PREÇO");
		lblNewLabel_3.setForeground(new Color(255, 207, 134));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dubai", Font.BOLD, 20));
		lblNewLabel_3.setBounds(228, 66, 279, 22);
		panel.add(lblNewLabel_3);
	}
}
