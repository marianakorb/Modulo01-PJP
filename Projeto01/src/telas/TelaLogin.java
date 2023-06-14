package telas;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Cursor;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField loginField;
	private JPasswordField passwordField;
	
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
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 1222, 804);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 214, 213));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(655, 498));
		contentPane.setMaximumSize(new Dimension(655, 498));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton sairBtn = new JButton("Sair");
		sairBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sairBtn.setFont(new Font("Verdana", Font.PLAIN, 12));
		sairBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		sairBtn.setBounds(1036, 699, 89, 23);
		contentPane.add(sairBtn);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(193, 219, 221));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(451, 183, 282, 355);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		
		JLabel loginLabel = new JLabel("Login");
		loginLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		loginLabel.setBounds(58, 109, 46, 14);
		panel.add(loginLabel);
		
		loginField = new JTextField();
		loginField.setFont(new Font("Verdana", Font.PLAIN, 12));
		loginField.setBounds(57, 124, 164, 20);
		panel.add(loginField);
		loginField.setColumns(10);
		
		JLabel senhaLabel = new JLabel("Senha");
		senhaLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		senhaLabel.setBounds(58, 155, 46, 14);
		panel.add(senhaLabel);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Verdana", Font.PLAIN, 12));
		passwordField.setBounds(58, 175, 164, 20);
		panel.add(passwordField);
		
		// ao pressionar enter foca no textField da senha
		loginField.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 10) {
					passwordField.grabFocus();
					
				}
			}
		});
		
		JButton entrarBtn = new JButton("ENTRAR");
		entrarBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		entrarBtn.setFont(new Font("Verdana", Font.PLAIN, 12));
		entrarBtn.setBounds(57, 220, 164, 23);
		
//		// ao pressionar enter foca no botão
//		passwordField.addKeyListener(new KeyAdapter() {
//			
//			public void keyPressed(KeyEvent e) {
//				if (e.getKeyCode() == 10) {
//					entrarBtn.grabFocus();
//					
//				}
//			}
//			
//		});
		
		//validação de login pressionando 'enter'
		passwordField.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == 10) {
					
					int idUsuario = Integer.parseInt(loginField.getText());
					String QUERY = "SELECT senha FROM funcionarios WHERE id=";
					QUERY = QUERY + String.valueOf(idUsuario);
					String senhaTextField = String.valueOf(passwordField.getPassword());
					
					try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
					         Statement stmt = conn.createStatement();
							
					         ResultSet rs = stmt.executeQuery(QUERY);
					      ) {		      
							while(rs.next()){
								String senha = rs.getString("senha");					            
					        
					             if (senha.equals(senhaTextField)) {
					            	 
					            	 TelaVendas telaVendas = new TelaVendas();
					 				telaVendas.setVisible(true);
					 				dispose();
					            	 
					            	 break;
					             } else {
					            	 JOptionPane.showMessageDialog(null, "Login e/ou senha inválidos.");
					            	 
					             }
							}    
					         
					      } catch (SQLException el) {
					         el.printStackTrace();
					      }
					
				}
			}
			
				
			});	
		
		// Validação de login com click
		entrarBtn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
						
				int idUsuario = Integer.parseInt(loginField.getText());
				String QUERY = "SELECT senha FROM funcionarios WHERE id=";
				QUERY = QUERY + String.valueOf(idUsuario);
				String senhaTextField = String.valueOf(passwordField.getPassword());
				try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				         Statement stmt = conn.createStatement();
						
				         ResultSet rs = stmt.executeQuery(QUERY);
				      ) {		      
						while(rs.next()){
							String senha = String.valueOf(rs.getInt("senha"));
				      
				        
				             if (senha.equals(senhaTextField)) {
				            
				            	 TelaVendas telaVendas = new TelaVendas();
				 				telaVendas.setVisible(true);
				 				dispose();
				 				
				             } else {
				            	 JOptionPane.showMessageDialog(null, "Login e/ou senha inválidos.");
				            	 
				             }
						}    
				         
				      } catch (SQLException el) {
				         el.printStackTrace();
				      }
			}
		});
		panel.add(entrarBtn);
		
		}
}
