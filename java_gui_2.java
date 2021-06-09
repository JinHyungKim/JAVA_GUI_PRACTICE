import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;

class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("some text");
		JButton btn1 = new JButton("click me!!");
		JTextArea txtArea = new JTextArea();

		panel.setLayout(new BorderLayout());
		panel.add(label, BorderLayout.SOUTH);
		panel.add(btn1, BorderLayout.WEST);
		panel.add(txtArea, BorderLayout.CENTER);

		frame.add(panel);

		frame.setResizable(false);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(600, 600));
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
