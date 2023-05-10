package telas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class TelaClientes extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaClientes() {
		setLayout(null);
		setBounds(100,100,450,300);
		
		JLabel clientesLabel = new JLabel("CLIENTES");
		clientesLabel.setFont(new Font("Verdana", Font.BOLD, 13));
		clientesLabel.setBounds(47, 43, 78, 14);
		add(clientesLabel);
	}

}
