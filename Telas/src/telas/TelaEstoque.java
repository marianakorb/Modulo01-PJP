package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class TelaEstoque extends JFrame {

	private JPanel contentPane;
	private JTextField pesquisatextField;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEstoque frame = new TelaEstoque();
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
	public TelaEstoque() {
		MedidaBounds valor = new MedidaBounds();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, valor.w, valor.h);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
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
		
		JLabel estoqueLabel = new JLabel("ESTOQUE");
		estoqueLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		estoqueLabel.setBounds(763, 11, 86, 14);
		panel.add(estoqueLabel);
		
		pesquisatextField = new JTextField();
		pesquisatextField.setBounds(161, 49, 152, 20);
		contentPane.add(pesquisatextField);
		pesquisatextField.setColumns(10);
		
		JButton pesquisaButton = new JButton("PESQUISAR");
		pesquisaButton.setFont(new Font("Verdana", Font.PLAIN, 11));
		pesquisaButton.setBounds(334, 48, 101, 23);
		panel.add(pesquisaButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 96, 472, 139);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "PRODUTO", "COR", "P", "M", "G", "GG", "PRE\u00C7O"
			}
		));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 275, 742, 2);
		panel.add(separator);
		
		JLabel lblNewLabel = new JLabel("CADASTRAR NOVO PRODUTO");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel.setBounds(20, 289, 232, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(74, 353, 27, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PRODUTO");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(236, 353, 69, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("COR");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(260, 410, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TAMANHO");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(36, 410, 69, 14);
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.PLAIN, 11));
		textField.setBounds(118, 350, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(315, 350, 249, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(478, 407, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(118, 407, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton salvarButton = new JButton("SALVAR");
		salvarButton.setBounds(763, 449, 89, 35);
		panel.add(salvarButton);
		
		JLabel lblNewLabel_5 = new JLabel("PREÇO");
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(422, 410, 46, 14);
		panel.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(315, 407, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Verdana", Font.PLAIN, 11));
		textField_5.setBounds(36, 50, 288, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
	}
}
