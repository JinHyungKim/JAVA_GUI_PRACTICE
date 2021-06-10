import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class LogIn extends JFrame{	
	public LogIn(){
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID:  ");
		JLabel pswrd = new JLabel("PW:  ");
		JTextField txtID = new JTextField(10);
		JPasswordField txtpass = new JPasswordField(10);
		JButton loginBtn = new JButton("Log In");

		panel.add(label);
		panel.add(txtID);
		panel.add(pswrd);
		panel.add(txtpass);
		panel.add(loginBtn);
		loginBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String id = "rlawlsgud";
				String pw = "1234";
				if(id.equals(txtID.getText())&& pw.equals(txtpass.getText()))
					JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL!!","RESULT",  JOptionPane.INFORMATION_MESSAGE);
				else	
					JOptionPane.showMessageDialog(null, "LOGIN FAIL", "RESULT" ,JOptionPane.ERROR_MESSAGE);
			}
		});

		add(panel);

		setVisible(true);
		setSize(600, 400);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(null);
	}
}

class Main{
	public static void main(String[] args){
		new LogIn();
	}	
}
