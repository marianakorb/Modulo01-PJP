package telas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class TelaEstoque extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaEstoque() {
		setLayout(null);
		setBounds(100,100,450,300);
		
		JLabel estoqueLabel = new JLabel("ESTOQUE");
		estoqueLabel.setFont(new Font("Verdana", Font.BOLD, 13));
		estoqueLabel.setBounds(33, 31, 67, 14);
		add(estoqueLabel);
	}

}
