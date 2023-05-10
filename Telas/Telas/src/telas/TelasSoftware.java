package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelasSoftware extends JFrame {

	private JPanel contentPane;
	private JTextField loginField;
	private JTextField senhaField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelasSoftware frame = new TelasSoftware();
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
	public TelasSoftware() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton entrarBtn = new JButton("ENTRAR");
		entrarBtn.setBounds(150, 150, 89, 23);
		contentPane.add(entrarBtn);
		
		JLabel loginLabel = new JLabel("Login");
		loginLabel.setBounds(129, 56, 46, 14);
		contentPane.add(loginLabel);
		
		loginField = new JTextField();
		loginField.setBounds(129, 70, 121, 20);
		contentPane.add(loginField);
		loginField.setColumns(10);
		
		senhaField = new JTextField();
		senhaField.setBounds(129, 118, 121, 20);
		contentPane.add(senhaField);
		senhaField.setColumns(10);
		
		JLabel senhaLabel = new JLabel("Senha");
		senhaLabel.setBounds(129, 101, 46, 14);
		contentPane.add(senhaLabel);
		
		JButton sairBtn = new JButton("Sair");
		sairBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		sairBtn.setBounds(335, 227, 89, 23);
		contentPane.add(sairBtn);
		
		entrarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(new TelaInfo());
				contentPane.revalidate();
				contentPane.repaint();
			}
		});

		
		
			
		
	}

}
