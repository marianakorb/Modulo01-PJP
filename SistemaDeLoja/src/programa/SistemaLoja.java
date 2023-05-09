package programa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class SistemaLoja extends JFrame {

	private JPanel contentPane;
	private JTextField loginField;
	private JTextField textField_1;
	private JButton entrarButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemaLoja frame = new SistemaLoja();
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
	public SistemaLoja() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel loginLabel = new JLabel("login");
		loginLabel.setBounds(145, 68, 46, 14);
		contentPane.add(loginLabel);
		
		JLabel senhaLabel = new JLabel("Senha");
		senhaLabel.setBounds(145, 114, 46, 14);
		contentPane.add(senhaLabel);
		
		loginField = new JTextField();
		loginField.setBounds(145, 83, 105, 20);
		contentPane.add(loginField);
		loginField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(145, 128, 105, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		entrarButton = new JButton("ENTRAR");
		entrarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel janela = new JPanel();
				janela.setVisible(isShowing());
			}
		});
		
		entrarButton.addComponentListener(new ComponentAdapter() {
		});
		
		entrarButton.setBounds(155, 159, 89, 23);
		contentPane.add(entrarButton);
		
		
		
		
	}

}
