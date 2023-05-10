package telas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInfo extends JPanel {

	/**
	 * Create the panel.
	 */

	
	public TelaInfo() {

		setVisible(true);
		setBounds(100, 100, 450, 300);
		setLayout(null);
		
		JButton vendaBtn = new JButton("Venda");
		vendaBtn.setBounds(10, 108, 89, 23);
		vendaBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				add(new TelaVenda());
				validate();
				repaint();
			}
		});
		add(vendaBtn);
		
		JButton clientesBtn = new JButton("Clientes");
		clientesBtn.setBounds(109, 108, 89, 23);
		clientesBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				add(new TelaClientes());
				revalidate();
				repaint();
			}
		});
		add(clientesBtn);
		
		JButton estoqueBtn = new JButton("Estoque");
		estoqueBtn.setBounds(214, 108, 89, 23);
		estoqueBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				add(new TelaEstoque());
				revalidate();
				repaint();
			}
		});
		add(estoqueBtn);
		
		
		JButton consultaVendasBtn = new JButton("Consulta Vendas");
		consultaVendasBtn.setBounds(313, 108, 113, 23);
		consultaVendasBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				add(new TelaConsulta());
				revalidate();
				repaint();
				
			}
		});
		add(consultaVendasBtn);

	}
}
