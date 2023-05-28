package telas;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField loginField;
	private JPasswordField passwordField;

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
		
		MedidaBounds valor = new MedidaBounds();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, valor.w, valor.h);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(655, 498));
		contentPane.setMaximumSize(new Dimension(655, 498));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton sairBtn = new JButton("Sair");
		sairBtn.setFont(new Font("Verdana", Font.PLAIN, 12));
		sairBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		sairBtn.setBounds(777, 524, 89, 23);
		contentPane.add(sairBtn);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(199, 253, 138));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(341, 122, 241, 331);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel loginLabel = new JLabel("Login");
		loginLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		loginLabel.setBounds(35, 99, 46, 14);
		panel.add(loginLabel);
		
		loginField = new JTextField();
		loginField.setFont(new Font("Verdana", Font.PLAIN, 12));
		loginField.setBounds(35, 116, 164, 20);
		panel.add(loginField);
		loginField.setColumns(10);
		
		JLabel senhaLabel = new JLabel("Senha");
		senhaLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		senhaLabel.setBounds(35, 157, 46, 14);
		panel.add(senhaLabel);
			
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Verdana", Font.PLAIN, 12));
		passwordField.setBounds(35, 172, 164, 20);
		panel.add(passwordField);
		
		JButton entrarBtn = new JButton("ENTRAR");
		entrarBtn.setFont(new Font("Verdana", Font.PLAIN, 12));
		entrarBtn.setBounds(35, 220, 164, 23);
	
		// Validação de login
		entrarBtn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				if (checkLogin( loginField.getText(), new String(passwordField.getPassword()))) {

					TelaInfo telaInfo = new TelaInfo();
					telaInfo.setVisible(true);
					dispose();
					
				} else {
					JOptionPane.showMessageDialog(null, "Login e/ou senha inválidos.");
					
				}
			}
			
			public boolean checkLogin(String login, String senha) {
					return login.equals("2301") && senha.equals("1234");
				}
		});
		panel.add(entrarBtn);
			
		
	}
}
