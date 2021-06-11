import javax.swing.*;
import java.awt.*;

class Main{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		String[] heading = new String[] {"ID", "NAME", "COUNTRY"};
		String[][] data = new String[][]{
			{"1", "KIM", "KOREA"},
			{"2", "LEE", "KOREA"},
			{"3", "PARK", "KOREA"}
		};

		JTable table = new JTable(data, heading);
		table.setPreferredScrollableViewportSize(new Dimension(350, 300));
		table.setFillsViewportHeight(true);
		panel.add(new JScrollPane(table));

		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(400, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
