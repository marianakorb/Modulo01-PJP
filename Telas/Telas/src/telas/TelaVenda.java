package telas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class TelaVenda extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaVenda() {
		setLayout(null);
		setBounds(100, 100, 450, 300);
		
		
		JLabel vendasLabel = new JLabel("VENDAS");
		vendasLabel.setFont(new Font("Verdana", Font.BOLD, 13));
		vendasLabel.setBounds(23, 25, 66, 14);
		add(vendasLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(23, 83, 89, 23);
		add(btnNewButton);

	}

}
