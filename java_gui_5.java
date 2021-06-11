import javax.swing.*;
import java.awt.*;

class Main{
	public static void main(String[] args){
		JFrame myPage = new JFrame("MY PAGE");
		JLabel label = new JLabel("HELLO WORLD");

		myPage.setLocation(200, 400);
		myPage.setPreferredSize(new Dimension(500, 300));

		label.setText("setText Test");	
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setHorizontalAlignment(SwingConstants.RIGHT);

		myPage.add(label);
		myPage.pack();
		myPage.setVisible(true);	
		System.out.println(label.getText());
		myPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
