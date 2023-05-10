package telas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class TelaConsulta extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaConsulta() {
		setLayout(null);
		setBounds(100,100,450,300);
		
		JLabel lblNewLabel = new JLabel("CONSULTAS");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNewLabel.setBounds(26, 25, 98, 14);
		add(lblNewLabel);
	}

}
