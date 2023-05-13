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
		MedidaBounds valor = new MedidaBounds();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, valor.w, valor.h);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInfo telaInfo = new TelaInfo();
				telaInfo.setVisible(true);
				dispose();
			}
			
		});
		btnNewButton.setBounds(802, 543, 89, 23);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(199, 253, 138));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 881, 521);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel clientesLabel = new JLabel("CADASTRO CLIENTES");
		clientesLabel.setBounds(686, 11, 185, 14);
		panel.add(clientesLabel);
		clientesLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		
		cpfClienteField = new JTextField();
		cpfClienteField.setFont(new Font("Verdana", Font.PLAIN, 14));
		cpfClienteField.setBounds(69, 84, 162, 20);
		panel.add(cpfClienteField);
		cpfClienteField.setColumns(10);
		
		nomeClienteField = new JTextField();
		nomeClienteField.setFont(new Font("Verdana", Font.PLAIN, 14));
		nomeClienteField.setBounds(349, 84, 225, 20);
		panel.add(nomeClienteField);
		nomeClienteField.setColumns(10);
		
		cepClienteField = new JTextField();
		cepClienteField.setFont(new Font("Verdana", Font.PLAIN, 14));
		cepClienteField.setBounds(69, 150, 196, 20);
		panel.add(cepClienteField);
		cepClienteField.setColumns(10);
		
		enderecoField = new JTextField();
		enderecoField.setFont(new Font("Verdana", Font.PLAIN, 14));
		enderecoField.setBounds(275, 150, 289, 20);
		panel.add(enderecoField);
		enderecoField.setColumns(10);
		
		numResidenciaField = new JTextField();
		numResidenciaField.setFont(new Font("Verdana", Font.PLAIN, 14));
		numResidenciaField.setText("");
		numResidenciaField.setBounds(69, 195, 86, 20);
		panel.add(numResidenciaField);
		numResidenciaField.setColumns(10);
		
		complementoField = new JTextField();
		complementoField.setFont(new Font("Verdana", Font.PLAIN, 14));
		complementoField.setBounds(165, 195, 166, 20);
		panel.add(complementoField);
		complementoField.setColumns(10);
		
		bairroField = new JTextField();
		bairroField.setFont(new Font("Verdana", Font.PLAIN, 14));
		bairroField.setBounds(69, 238, 206, 20);
		panel.add(bairroField);
		bairroField.setColumns(10);
		
		cidadeField = new JTextField();
		cidadeField.setFont(new Font("Verdana", Font.PLAIN, 14));
		cidadeField.setBounds(285, 238, 196, 20);
		panel.add(cidadeField);
		cidadeField.setColumns(10);
		
		ufField = new JTextField();
		ufField.setFont(new Font("Verdana", Font.PLAIN, 14));
		ufField.setText("");
		ufField.setBounds(491, 238, 86, 20);
		panel.add(ufField);
		ufField.setColumns(10);
		
		telefoneField = new JTextField();
		telefoneField.setFont(new Font("Verdana", Font.PLAIN, 14));
		telefoneField.setBounds(69, 322, 206, 20);
		panel.add(telefoneField);
		telefoneField.setColumns(10);
		
		emailField = new JTextField();
		emailField.setFont(new Font("Verdana", Font.PLAIN, 14));
		emailField.setBounds(285, 322, 289, 20);
		panel.add(emailField);
		emailField.setColumns(10);
		
		nascimentoField = new JTextField();
		nascimentoField.setFont(new Font("Verdana", Font.PLAIN, 14));
		nascimentoField.setBounds(69, 367, 206, 20);
		panel.add(nascimentoField);
		nascimentoField.setColumns(10);
		
		sexoField = new JTextField();
		sexoField.setFont(new Font("Verdana", Font.PLAIN, 14));
		sexoField.setText("");
		sexoField.setBounds(285, 367, 149, 20);
		panel.add(sexoField);
		sexoField.setColumns(10);
		
		JLabel sexoLabel = new JLabel("SEXO");
		sexoLabel.setBounds(285, 353, 46, 14);
		panel.add(sexoLabel);
		
		JLabel cpfLabel = new JLabel("CPF");
		cpfLabel.setBounds(69, 71, 46, 14);
		panel.add(cpfLabel);
		
		JLabel emailLabel = new JLabel("E-MAIL");
		emailLabel.setBounds(285, 309, 46, 14);
		panel.add(emailLabel);
		
		JLabel ufLabel = new JLabel("UF");
		ufLabel.setBounds(491, 226, 46, 14);
		panel.add(ufLabel);
		
		JLabel nomeClienteLabel = new JLabel("NOME");
		nomeClienteLabel.setBounds(349, 71, 46, 14);
		panel.add(nomeClienteLabel);
		
		JLabel cepLabel = new JLabel("CEP");
		cepLabel.setBounds(69, 135, 46, 14);
		panel.add(cepLabel);
		
		JLabel enderecoLabel = new JLabel("ENDEREÇO");
		enderecoLabel.setBounds(276, 135, 86, 14);
		panel.add(enderecoLabel);
		
		JLabel numResidenciaLabel = new JLabel("NÚMERO");
		numResidenciaLabel.setBounds(69, 181, 86, 14);
		panel.add(numResidenciaLabel);
		
		JLabel complementoLabel = new JLabel("COMPLEMENTO");
		complementoLabel.setBounds(165, 181, 137, 14);
		panel.add(complementoLabel);
		
		JLabel bairroLabel = new JLabel("BAIRRO");
		bairroLabel.setBounds(69, 226, 66, 14);
		panel.add(bairroLabel);
		
		JLabel cidadeLabel = new JLabel("CIDADE");
		cidadeLabel.setBounds(285, 226, 46, 14);
		panel.add(cidadeLabel);
		
		JLabel telefoneLabel = new JLabel("TELEFONE");
		telefoneLabel.setBounds(69, 309, 66, 14);
		panel.add(telefoneLabel);
		
		JLabel nascimentoLabel = new JLabel("DATA NASC.");
		nascimentoLabel.setBounds(69, 353, 86, 14);
		panel.add(nascimentoLabel);
		
		pesquisaField = new JTextField();
		pesquisaField.setFont(new Font("Verdana", Font.PLAIN, 14));
		pesquisaField.setBounds(69, 25, 206, 20);
		panel.add(pesquisaField);
		pesquisaField.setColumns(10);
		
		JButton comprasBtn = new JButton("Compras");
		comprasBtn.setFont(new Font("Verdana", Font.PLAIN, 12));
		comprasBtn.setBounds(69, 457, 95, 39);
		panel.add(comprasBtn);
		
		JButton limparBtn = new JButton("Limpar");
		limparBtn.setFont(new Font("Verdana", Font.PLAIN, 12));
		limparBtn.setBounds(189, 457, 95, 39);
		panel.add(limparBtn);
		
		JButton excluirBtn = new JButton("Excluir");
		excluirBtn.setFont(new Font("Verdana", Font.PLAIN, 12));
		excluirBtn.setBounds(308, 457, 95, 39);
		panel.add(excluirBtn);
		
		JButton salvarBtn = new JButton("SALVAR");
		salvarBtn.setFont(new Font("Verdana", Font.PLAIN, 14));
		salvarBtn.setBounds(704, 457, 95, 39);
		panel.add(salvarBtn);
	}
}
