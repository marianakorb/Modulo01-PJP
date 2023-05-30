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
import java.awt.Cursor;

public class TelaEstoque extends JFrame {

	private JPanel contentPane;
	private JTextField pesquisatextField;
	private JTable table;
	private JTextField idtextField;
	private JTextField produtotextField;
	private JTextField precotextField;
	private JTextField tamanhotextField;
	private JTextField cortextField;
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
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1222, 804);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 214, 213));
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
		
		JLabel estoqueLabel = new JLabel("ESTOQUE");
		estoqueLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		estoqueLabel.setBounds(957, 30, 86, 14);
		panel.add(estoqueLabel);
		
		pesquisatextField = new JTextField();
		pesquisatextField.setBounds(161, 49, 152, 20);
		contentPane.add(pesquisatextField);
		pesquisatextField.setColumns(10);
		
		JButton pesquisaButton = new JButton("PESQUISAR");
		pesquisaButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pesquisaButton.setFont(new Font("Verdana", Font.PLAIN, 11));
		pesquisaButton.setBounds(359, 104, 112, 23);
		panel.add(pesquisaButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(61, 163, 691, 203);
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
		separator.setBounds(10, 377, 742, 2);
		panel.add(separator);
		
		JLabel lblNewLabel = new JLabel("CADASTRAR NOVO PRODUTO");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel.setBounds(61, 419, 232, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(208, 512, 27, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PRODUTO");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(480, 511, 69, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("COR");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(406, 564, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TAMANHO");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(167, 564, 69, 14);
		panel.add(lblNewLabel_4);
		
		idtextField = new JTextField();
		idtextField.setFont(new Font("Verdana", Font.PLAIN, 11));
		idtextField.setBounds(245, 508, 196, 20);
		panel.add(idtextField);
		idtextField.setColumns(10);
		
		produtotextField = new JTextField();
		produtotextField.setBounds(559, 509, 299, 20);
		panel.add(produtotextField);
		produtotextField.setColumns(10);
		
		precotextField = new JTextField();
		precotextField.setBounds(739, 562, 119, 20);
		panel.add(precotextField);
		precotextField.setColumns(10);
		
		tamanhotextField = new JTextField();
		tamanhotextField.setBounds(246, 562, 86, 20);
		panel.add(tamanhotextField);
		tamanhotextField.setColumns(10);
		
		JButton salvarButton = new JButton("SALVAR");
		salvarButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		salvarButton.setBounds(957, 640, 89, 35);
		panel.add(salvarButton);
		
		JLabel lblNewLabel_5 = new JLabel("PREÇO");
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(683, 564, 46, 14);
		panel.add(lblNewLabel_5);
		
		cortextField = new JTextField();
		cortextField.setBounds(462, 562, 148, 20);
		panel.add(cortextField);
		cortextField.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Verdana", Font.PLAIN, 11));
		textField_5.setBounds(61, 105, 288, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
	}
}
