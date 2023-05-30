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
import java.awt.Dimension;

import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Cursor;

public class TelaVendas extends JFrame {

	private JPanel contentPane;
	private JTextField vendedorTextField;
	private JTextField cfpClienteTextField;
	private JTextField clienteTextField;
	private JTextField quantidadeTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVendas frame = new TelaVendas();
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
	public TelaVendas() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//
//		int screenWidth = (int) screenSize.getWidth();
//
//		int screenHeight = (int) screenSize.getHeight();
//		
//		setBounds(100, 100, screenWidth, screenHeight);
		
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
		panel.setBackground(new Color(193, 219, 221));
		panel.setBounds(10, 11, 1186, 709);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VENDAS");
		lblNewLabel.setBounds(1003, 23, 99, 14);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 13));
		
		vendedorTextField = new JTextField();
		vendedorTextField.setBounds(221, 85, 194, 20);
		panel.add(vendedorTextField);
		vendedorTextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Vendedor");
		lblNewLabel_1.setBounds(157, 88, 66, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CPF Cliente");
		lblNewLabel_2.setBounds(145, 119, 66, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cliente");
		lblNewLabel_3.setBounds(165, 151, 46, 14);
		panel.add(lblNewLabel_3);
		
		cfpClienteTextField = new JTextField();
		cfpClienteTextField.setBounds(221, 116, 194, 20);
		panel.add(cfpClienteTextField);
		cfpClienteTextField.setColumns(10);
		
		clienteTextField = new JTextField();
		clienteTextField.setBounds(221, 148, 194, 20);
		panel.add(clienteTextField);
		clienteTextField.setColumns(10);
		
		JButton pesquisarButton = new JButton("Pesquisar");
		pesquisarButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pesquisarButton.setBounds(450, 147, 89, 23);
		panel.add(pesquisarButton);
		
		JTextField produtoTextField = new JTextField();
		produtoTextField.setBounds(146, 228, 269, 20);
		panel.add(produtoTextField);
		produtoTextField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("PRODUTO");
		lblNewLabel_4.setBounds(85, 231, 66, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("QUANTIDADE");
		lblNewLabel_5.setBounds(464, 231, 75, 14);
		panel.add(lblNewLabel_5);
		
		quantidadeTextField = new JTextField();
		quantidadeTextField.setBounds(535, 228, 105, 20);
		panel.add(quantidadeTextField);
		quantidadeTextField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Pagamento");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton_1.setBounds(981, 646, 121, 37);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Consultar Preço");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton_2.setBounds(278, 646, 138, 37);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Cancelar");
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton_3.setBounds(161, 646, 105, 37);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Limpar");
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton_4.setBounds(46, 646, 105, 37);
		panel.add(btnNewButton_4);
		
		JLabel protudoLabel = new JLabel("");
		protudoLabel.setOpaque(true);
		protudoLabel.setForeground(new Color(255, 255, 255));
		protudoLabel.setBackground(new Color(255, 255, 255));
		protudoLabel.setBounds(85, 326, 66, 245);
		panel.add(protudoLabel);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setOpaque(true);
		lblNewLabel_5_1.setBackground(Color.WHITE);
		lblNewLabel_5_1.setBounds(164, 326, 457, 245);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("");
		lblNewLabel_5_2.setOpaque(true);
		lblNewLabel_5_2.setBackground(Color.WHITE);
		lblNewLabel_5_2.setBounds(631, 326, 56, 245);
		panel.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("");
		lblNewLabel_5_2_1.setOpaque(true);
		lblNewLabel_5_2_1.setBackground(Color.WHITE);
		lblNewLabel_5_2_1.setBounds(697, 326, 99, 245);
		panel.add(lblNewLabel_5_2_1);
		
		JLabel lblNewLabel_5_2_2 = new JLabel("");
		lblNewLabel_5_2_2.setOpaque(true);
		lblNewLabel_5_2_2.setBackground(Color.WHITE);
		lblNewLabel_5_2_2.setBounds(806, 326, 99, 245);
		panel.add(lblNewLabel_5_2_2);
		
		JLabel lblNewLabel_6 = new JLabel("ítem");
		lblNewLabel_6.setBounds(85, 313, 46, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Produto");
		lblNewLabel_7.setBounds(161, 313, 46, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Peças");
		lblNewLabel_8.setBounds(629, 313, 46, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Preço un.");
		lblNewLabel_9.setBounds(697, 313, 46, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Preço Total");
		lblNewLabel_10.setBounds(811, 313, 66, 14);
		panel.add(lblNewLabel_10);
	}
}
