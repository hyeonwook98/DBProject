import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class saleinsert {

	private JFrame saleframe;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					saleinsert window = new saleinsert();
					window.saleframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public saleinsert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		saleframe = new JFrame();
		saleframe.setBounds(100, 100, 301, 434);
		saleframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		saleframe.getContentPane().setLayout(null);
		
		JLabel saleinsert = new JLabel("\uD310\uB9E4\uB4F1\uB85D");
		saleinsert.setHorizontalAlignment(SwingConstants.CENTER);
		saleinsert.setBounds(41, 10, 194, 22);
		saleframe.getContentPane().add(saleinsert);
		
		JLabel date = new JLabel("\uC2DC\uACF5\uC77C");
		date.setBounds(56, 53, 51, 22);
		saleframe.getContentPane().add(date);
		
		textField = new JTextField();
		textField.setBounds(119, 54, 116, 21);
		saleframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel productname = new JLabel("\uBB3C\uD488\uBA85");
		productname.setBounds(56, 85, 57, 15);
		saleframe.getContentPane().add(productname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 82, 116, 21);
		saleframe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel details = new JLabel("\uC2DC\uACF5\uB0B4\uC6A9");
		details.setBounds(56, 110, 57, 15);
		saleframe.getContentPane().add(details);
		
		textField_2 = new JTextField();
		textField_2.setBounds(119, 107, 116, 21);
		saleframe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel model = new JLabel("\uC2DC\uACF5\uBAA8\uB378");
		model.setBounds(56, 135, 57, 15);
		saleframe.getContentPane().add(model);
		
		textField_3 = new JTextField();
		textField_3.setBounds(119, 132, 116, 21);
		saleframe.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel part = new JLabel("\uBD80\uC18D\uD488");
		part.setBounds(56, 160, 57, 15);
		saleframe.getContentPane().add(part);
		
		textField_4 = new JTextField();
		textField_4.setBounds(119, 157, 116, 21);
		saleframe.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel price = new JLabel("\uAC00\uACA9");
		price.setBounds(56, 185, 57, 15);
		saleframe.getContentPane().add(price);
		
		textField_5 = new JTextField();
		textField_5.setText("");
		textField_5.setBounds(119, 182, 116, 21);
		saleframe.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel payment = new JLabel("\uC9C0\uBD88\uBC29\uBC95");
		payment.setBounds(56, 210, 57, 15);
		saleframe.getContentPane().add(payment);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Çö±Ý","Ä«µå","°èÁÂÀÌÃ¼","¹Ì³³"}));
		comboBox.setBounds(119, 206, 116, 23);
		saleframe.getContentPane().add(comboBox);
		
		JLabel salesperson = new JLabel("\uC601\uC5C5\uC0AC\uC6D0");
		salesperson.setBounds(56, 235, 57, 15);
		saleframe.getContentPane().add(salesperson);
		
		textField_6 = new JTextField();
		textField_6.setBounds(119, 232, 116, 21);
		saleframe.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton save = new JButton("\uC800 \uC7A5");
		save.setBounds(119, 272, 116, 23);
		saleframe.getContentPane().add(save);
	}
}
