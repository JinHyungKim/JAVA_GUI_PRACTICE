import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;

class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		panel.add(new JLabel("aaaaaaaaaa"));
		frame.add(panel);

		frame.setResizable(false);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(600, 600));
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
