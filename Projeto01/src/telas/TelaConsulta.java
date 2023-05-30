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
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import java.awt.Cursor;

public class TelaConsulta extends JFrame {

	private JPanel contentPane;
	private JTextField consultaVendasField;
	private JTextField cupomFiscalField;
	private JTextField dataCompraField;
	private JTextField cpfField;
	private JTextField clienteField;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConsulta frame = new TelaConsulta();
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
	public TelaConsulta() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1222, 804);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 12));
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
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.setBackground(new Color(193, 219, 221));
		panel.setBounds(10, 11, 1186, 709);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONSULTA VENDAS");
		lblNewLabel.setBounds(1006, 11, 170, 14);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		
		consultaVendasField = new JTextField();
		consultaVendasField.setBounds(70, 68, 233, 20);
		panel.add(consultaVendasField);
		consultaVendasField.setColumns(10);
		
		JLabel cupomFiscalLabel = new JLabel("CUPOM FISCAL");
		cupomFiscalLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
		cupomFiscalLabel.setBounds(70, 143, 115, 14);
		panel.add(cupomFiscalLabel);
		
		cupomFiscalField = new JTextField();
		cupomFiscalField.setBounds(68, 160, 233, 20);
		panel.add(cupomFiscalField);
		cupomFiscalField.setColumns(10);
		
		JLabel dataLabel = new JLabel("DATA");
		dataLabel.setBounds(347, 144, 46, 14);
		panel.add(dataLabel);
		
		dataCompraField = new JTextField();
		dataCompraField.setBounds(347, 160, 135, 20);
		panel.add(dataCompraField);
		dataCompraField.setColumns(10);
		
		cpfField = new JTextField();
		cpfField.setBounds(68, 216, 233, 20);
		panel.add(cpfField);
		cpfField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setBounds(68, 201, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CLIENTE");
		lblNewLabel_2.setBounds(347, 201, 64, 14);
		panel.add(lblNewLabel_2);
		
		clienteField = new JTextField();
		clienteField.setBounds(347, 216, 308, 20);
		panel.add(clienteField);
		clienteField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Pesquisar");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBounds(304, 67, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Limpar");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton_2.setBounds(68, 645, 89, 32);
		panel.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(809, 604, 128, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Total");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(947, 606, 46, 14);
		panel.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(68, 604, 192, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Vendedor");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(270, 606, 64, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBackground(new Color(255, 255, 255));
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setBounds(177, 330, 100, 212);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setOpaque(true);
		lblNewLabel_5_1.setBackground(Color.WHITE);
		lblNewLabel_5_1.setBounds(68, 330, 99, 212);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("");
		lblNewLabel_5_2.setOpaque(true);
		lblNewLabel_5_2.setBackground(Color.WHITE);
		lblNewLabel_5_2.setBounds(290, 330, 509, 212);
		panel.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("");
		lblNewLabel_5_3.setOpaque(true);
		lblNewLabel_5_3.setBackground(Color.WHITE);
		lblNewLabel_5_3.setBounds(809, 330, 128, 212);
		panel.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_6 = new JLabel("Ref.");
		lblNewLabel_6.setBounds(68, 314, 46, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Cor");
		lblNewLabel_7.setBounds(177, 314, 46, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Produto");
		lblNewLabel_8.setBounds(290, 314, 46, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Preço");
		lblNewLabel_9.setBounds(809, 314, 46, 14);
		panel.add(lblNewLabel_9);
	}
}
