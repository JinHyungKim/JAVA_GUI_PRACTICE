import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		JButton btn2 = new JButton("EXIT");
		JTextArea txtArea = new JTextArea();
		JPanel btn_panel = new JPanel();

		btn_panel.add(btn1);
		btn_panel.add(btn2);
		panel.setLayout(new BorderLayout());
		panel.add(label, BorderLayout.NORTH);
		panel.add(btn_panel, BorderLayout.WEST);
		panel.add(txtArea, BorderLayout.CENTER);

		btn1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				label.setText(txtArea.getText());
			}
		});

		btn2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});

		frame.add(panel);

		frame.setResizable(false);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(600, 600));
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
