package telas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class TelaInfo extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaInfo() {
		setLayout(null);
		setBounds(100,100,450,300);
		
		JLabel lblNewLabel = new JLabel("nova tela");
		lblNewLabel.setBounds(67, 72, 100, 14);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(176, 42, 89, 23);
		add(btnNewButton);

	}

}
