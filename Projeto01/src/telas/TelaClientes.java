package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Cursor;

public class TelaClientes extends JFrame {

	private JPanel contentPane;
	private JTextField cpfClienteField;
	private JTextField nomeClienteField;
	private JTextField cepClienteField;
	private JTextField enderecoField;
	private JTextField numResidenciaField;
	private JTextField complementoField;
	private JTextField bairroField;
	private JTextField cidadeField;
	private JTextField ufField;
	private JTextField telefoneField;
	private JTextField emailField;
	private JTextField nascimentoField;
	private JTextField sexoField;
	private JTextField pesquisaField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaClientes frame = new TelaClientes();
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
	public TelaClientes() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1222, 804);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
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
		
		JLabel clientesLabel = new JLabel("CADASTRO CLIENTES");
		clientesLabel.setBounds(969, 28, 185, 14);
		panel.add(clientesLabel);
		clientesLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		
		cpfClienteField = new JTextField();
		cpfClienteField.setFont(new Font("Verdana", Font.PLAIN, 14));
		cpfClienteField.setBounds(54, 199, 196, 20);
		panel.add(cpfClienteField);
		cpfClienteField.setColumns(10);
		
		nomeClienteField = new JTextField();
		nomeClienteField.setFont(new Font("Verdana", Font.PLAIN, 14));
		nomeClienteField.setBounds(282, 199, 289, 20);
		panel.add(nomeClienteField);
		nomeClienteField.setColumns(10);
		
		cepClienteField = new JTextField();
		cepClienteField.setFont(new Font("Verdana", Font.PLAIN, 14));
		cepClienteField.setBounds(54, 294, 196, 20);
		panel.add(cepClienteField);
		cepClienteField.setColumns(10);
		
		enderecoField = new JTextField();
		enderecoField.setFont(new Font("Verdana", Font.PLAIN, 14));
		enderecoField.setBounds(282, 294, 289, 20);
		panel.add(enderecoField);
		enderecoField.setColumns(10);
		
		numResidenciaField = new JTextField();
		numResidenciaField.setFont(new Font("Verdana", Font.PLAIN, 14));
		numResidenciaField.setText("");
		numResidenciaField.setBounds(54, 338, 86, 20);
		panel.add(numResidenciaField);
		numResidenciaField.setColumns(10);
		
		complementoField = new JTextField();
		complementoField.setFont(new Font("Verdana", Font.PLAIN, 14));
		complementoField.setBounds(282, 338, 166, 20);
		panel.add(complementoField);
		complementoField.setColumns(10);
		
		bairroField = new JTextField();
		bairroField.setFont(new Font("Verdana", Font.PLAIN, 14));
		bairroField.setBounds(54, 384, 206, 20);
		panel.add(bairroField);
		bairroField.setColumns(10);
		
		cidadeField = new JTextField();
		cidadeField.setFont(new Font("Verdana", Font.PLAIN, 14));
		cidadeField.setBounds(284, 384, 290, 20);
		panel.add(cidadeField);
		cidadeField.setColumns(10);
		
		ufField = new JTextField();
		ufField.setFont(new Font("Verdana", Font.PLAIN, 14));
		ufField.setText("");
		ufField.setBounds(590, 384, 86, 20);
		panel.add(ufField);
		ufField.setColumns(10);
		
		telefoneField = new JTextField();
		telefoneField.setFont(new Font("Verdana", Font.PLAIN, 14));
		telefoneField.setBounds(54, 464, 206, 20);
		panel.add(telefoneField);
		telefoneField.setColumns(10);
		
		emailField = new JTextField();
		emailField.setFont(new Font("Verdana", Font.PLAIN, 14));
		emailField.setBounds(285, 464, 289, 20);
		panel.add(emailField);
		emailField.setColumns(10);
		
		nascimentoField = new JTextField();
		nascimentoField.setFont(new Font("Verdana", Font.PLAIN, 14));
		nascimentoField.setBounds(54, 526, 206, 20);
		panel.add(nascimentoField);
		nascimentoField.setColumns(10);
		
		sexoField = new JTextField();
		sexoField.setFont(new Font("Verdana", Font.PLAIN, 14));
		sexoField.setText("");
		sexoField.setBounds(285, 526, 149, 20);
		panel.add(sexoField);
		sexoField.setColumns(10);
		
		JLabel sexoLabel = new JLabel("SEXO");
		sexoLabel.setBounds(285, 511, 46, 14);
		panel.add(sexoLabel);
		
		JLabel cpfLabel = new JLabel("CPF");
		cpfLabel.setBounds(54, 185, 46, 14);
		panel.add(cpfLabel);
		
		JLabel emailLabel = new JLabel("E-MAIL");
		emailLabel.setBounds(285, 452, 46, 14);
		panel.add(emailLabel);
		
		JLabel ufLabel = new JLabel("UF");
		ufLabel.setBounds(590, 369, 46, 14);
		panel.add(ufLabel);
		
		JLabel nomeClienteLabel = new JLabel("NOME");
		nomeClienteLabel.setBounds(282, 185, 46, 14);
		panel.add(nomeClienteLabel);
		
		JLabel cepLabel = new JLabel("CEP");
		cepLabel.setBounds(54, 278, 46, 14);
		panel.add(cepLabel);
		
		JLabel enderecoLabel = new JLabel("ENDEREÇO");
		enderecoLabel.setBounds(282, 278, 86, 14);
		panel.add(enderecoLabel);
		
		JLabel numResidenciaLabel = new JLabel("NÚMERO");
		numResidenciaLabel.setBounds(54, 325, 86, 14);
		panel.add(numResidenciaLabel);
		
		JLabel complementoLabel = new JLabel("COMPLEMENTO");
		complementoLabel.setBounds(280, 325, 137, 14);
		panel.add(complementoLabel);
		
		JLabel bairroLabel = new JLabel("BAIRRO");
		bairroLabel.setBounds(54, 369, 66, 14);
		panel.add(bairroLabel);
		
		JLabel cidadeLabel = new JLabel("CIDADE");
		cidadeLabel.setBounds(285, 369, 46, 14);
		panel.add(cidadeLabel);
		
		JLabel telefoneLabel = new JLabel("TELEFONE");
		telefoneLabel.setBounds(54, 452, 66, 14);
		panel.add(telefoneLabel);
		
		JLabel nascimentoLabel = new JLabel("DATA NASC.");
		nascimentoLabel.setBounds(54, 511, 86, 14);
		panel.add(nascimentoLabel);
		
		pesquisaField = new JTextField();
		pesquisaField.setFont(new Font("Verdana", Font.PLAIN, 14));
		pesquisaField.setBounds(54, 99, 206, 20);
		panel.add(pesquisaField);
		pesquisaField.setColumns(10);
		
		JButton comprasBtn = new JButton("Compras");
		comprasBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comprasBtn.setFont(new Font("Verdana", Font.PLAIN, 12));
		comprasBtn.setBounds(49, 641, 95, 39);
		panel.add(comprasBtn);
		
		JButton limparBtn = new JButton("Limpar");
		limparBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		limparBtn.setFont(new Font("Verdana", Font.PLAIN, 12));
		limparBtn.setBounds(165, 641, 95, 39);
		panel.add(limparBtn);
		
		JButton excluirBtn = new JButton("Excluir");
		excluirBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		excluirBtn.setFont(new Font("Verdana", Font.PLAIN, 12));
		excluirBtn.setBounds(275, 641, 95, 39);
		panel.add(excluirBtn);
		
		JButton salvarBtn = new JButton("SALVAR");
		salvarBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		salvarBtn.setFont(new Font("Verdana", Font.PLAIN, 14));
		salvarBtn.setBounds(1062, 640, 95, 39);
		panel.add(salvarBtn);
		
		JButton btnNewButton_1 = new JButton("Pesquisar");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(270, 99, 95, 23);
		panel.add(btnNewButton_1);
	}
}
