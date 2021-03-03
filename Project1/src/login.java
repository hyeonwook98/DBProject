import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class login {

	private JFrame loginframe;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.loginframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		loginframe = new JFrame();
		loginframe.getContentPane().setBackground(Color.WHITE);
		loginframe.setBounds(100, 100, 450, 300);
		loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginframe.setLocationRelativeTo(null);  //프레임가운데두기
		loginframe.getContentPane().setLayout(null);
		
		JLabel clogin = new JLabel("\uAD00\uB9AC\uC790 \uB85C\uADF8\uC778");
		clogin.setFont(new Font("굴림", Font.BOLD, 15));
		clogin.setBounds(161, 45, 109, 15);
		loginframe.getContentPane().add(clogin);
		
		JLabel cname = new JLabel("\uC544 \uC774 \uB514");
		cname.setBounds(108, 90, 57, 15);
		loginframe.getContentPane().add(cname);
		
		JLabel phone = new JLabel("\uBE44\uBC00\uBC88\uD638");
		phone.setBounds(108, 115, 57, 15);
		loginframe.getContentPane().add(phone);
		
		textField = new JTextField();
		textField.setBounds(177, 87, 116, 21);
		loginframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(177, 112, 116, 21);
		loginframe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton login = new JButton("\uB85C\uADF8\uC778");
		login.setBounds(137, 158, 80, 23);
		loginframe.getContentPane().add(login);
		
		JButton cancel = new JButton("\uCDE8\uC18C");
		cancel.setBounds(226, 158, 67, 23);
		loginframe.getContentPane().add(cancel);
	}

}
