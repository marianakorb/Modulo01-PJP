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
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

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
		
		setBounds(100, 100, 700, 500);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
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
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(38, 147, 166));
		panel.setBorder(null);
		panel.setBounds(178, 10, 330, 443);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		
		JLabel loginLabel = new JLabel("usuário");
		loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginLabel.setForeground(new Color(255, 207, 134));
		loginLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
		loginLabel.setBounds(133, 160, 63, 14);
		panel.add(loginLabel);
		
		loginField = new JTextField();
		loginField.setFont(new Font("Verdana", Font.PLAIN, 12));
		loginField.setBounds(83, 184, 164, 20);
		panel.add(loginField);
		loginField.setColumns(10);
		
		JLabel senhaLabel = new JLabel("senha");
		senhaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		senhaLabel.setForeground(new Color(255, 207, 134));
		senhaLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
		senhaLabel.setBounds(135, 214, 59, 14);
		panel.add(senhaLabel);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Verdana", Font.PLAIN, 12));
		passwordField.setBounds(83, 238, 164, 20);
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
		entrarBtn.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		entrarBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		entrarBtn.setFont(new Font("Dubai", Font.BOLD, 12));
		entrarBtn.setBounds(83, 268, 164, 23);
		
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
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setForeground(new Color(255, 207, 134));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dubai", Font.BOLD, 30));
		lblNewLabel.setBounds(116, 94, 98, 44);
		panel.add(lblNewLabel);
		
		}
}
