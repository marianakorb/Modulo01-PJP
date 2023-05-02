package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI implements ActionListener {
		
		private int count = 0;
		private JLabel label;
		private JFrame frame;
		private JPanel panel;
	
		public GUI( ) {
			
			frame = new JFrame();
			
			JButton button = new JButton("Click me");
			button.addActionListener(this);
			
			label = new JLabel("Numero de cliques: 0");
			
			panel = new JPanel();
			panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
			panel.setLayout(new GridLayout(0, 1));
			panel.add(button);
			panel.add(label);
			
			frame.add(panel, BorderLayout.CENTER);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("Nosso GUI");
			frame.pack();
			frame.setVisible(true);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Numero de cliques: " + count);
		
	}
	
}
