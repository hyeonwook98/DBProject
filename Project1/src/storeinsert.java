import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class storeinsert {

	private JFrame storeframe;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					storeinsert window = new storeinsert();
					window.storeframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public storeinsert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		storeframe = new JFrame();
		storeframe.setTitle("\uC785\uACE0\uB4F1\uB85D");
		storeframe.setBounds(100, 100, 239, 295);
		storeframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		storeframe.getContentPane().setLayout(null);
		
		JLabel pname = new JLabel("\uD488\uBA85");
		pname.setBounds(12, 10, 57, 15);
		storeframe.getContentPane().add(pname);
		
		JLabel standard = new JLabel("\uADDC\uACA9");
		standard.setBounds(12, 35, 57, 15);
		storeframe.getContentPane().add(standard);
		
		JLabel number = new JLabel("\uC218\uB7C9");
		number.setBounds(12, 60, 57, 15);
		storeframe.getContentPane().add(number);
		
		JLabel unit = new JLabel("\uB2E8\uC704");
		unit.setBounds(12, 86, 57, 15);
		storeframe.getContentPane().add(unit);
		
		JLabel unitPrice = new JLabel("\uB2E8\uAC00");
		unitPrice.setBounds(12, 111, 57, 15);
		storeframe.getContentPane().add(unitPrice);
		
		JLabel storeDate = new JLabel("\uC785\uACE0\uC77C\uC790");
		storeDate.setBounds(12, 136, 57, 15);
		storeframe.getContentPane().add(storeDate);
		
		JLabel salePrice = new JLabel("\uD310\uB9E4\uAC00\uACA9");
		salePrice.setBounds(12, 161, 57, 15);
		storeframe.getContentPane().add(salePrice);
		
		JLabel note = new JLabel("\uBE44\uACE0");
		note.setBounds(12, 186, 57, 15);
		storeframe.getContentPane().add(note);
		
		textField = new JTextField();
		textField.setBounds(68, 7, 138, 21);
		storeframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(68, 32, 138, 21);
		storeframe.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(68, 57, 138, 21);
		storeframe.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(68, 83, 138, 21);
		storeframe.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(68, 108, 138, 21);
		storeframe.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(68, 133, 138, 21);
		storeframe.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(68, 158, 138, 21);
		storeframe.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(68, 183, 138, 21);
		storeframe.getContentPane().add(textField_7);
		
		JButton save = new JButton("\uC800 \uC7A5");
		save.setBounds(109, 222, 97, 23);
		storeframe.getContentPane().add(save);
	}

}
