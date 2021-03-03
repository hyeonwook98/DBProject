import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Color;

public class customermodify {

	private JFrame csrframe;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

		

	/**
	 * Create the application.
	 */
	public customermodify() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		csrframe = new JFrame();
		csrframe.setBounds(100, 100, 415, 464);
		csrframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		csrframe.getContentPane().setLayout(null);
		csrframe.setLocationRelativeTo(null);
		
		JLabel csr = new JLabel("\uACE0\uAC1D\uC870\uD68C\uACB0\uACFC");
		csr.setBounds(161, 21, 88, 15);
		csrframe.getContentPane().add(csr);
		
		JLabel cname = new JLabel("\uC774      \uB984");
		cname.setBounds(32, 58, 57, 15);
		csrframe.getContentPane().add(cname);
		
		textField = new JTextField();
		textField.setBounds(96, 55, 153, 21);
		csrframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel carnumber = new JLabel("\uCC28\uB7C9\uBC88\uD638");
		carnumber.setBounds(32, 83, 57, 15);
		csrframe.getContentPane().add(carnumber);
		
		textField_1 = new JTextField();
		textField_1.setBounds(96, 80, 153, 21);
		csrframe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel carname = new JLabel("\uCC28\uB7C9\uC885\uB958");
		carname.setBounds(32, 108, 57, 15);
		csrframe.getContentPane().add(carname);
		
		textField_2 = new JTextField();
		textField_2.setBounds(96, 105, 153, 21);
		csrframe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel.setBounds(32, 133, 57, 15);
		csrframe.getContentPane().add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(96, 130, 153, 21);
		csrframe.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel purchaseList = new JLabel("\uAD6C\uB9E4\uBAA9\uB85D");
		purchaseList.setBounds(32, 171, 57, 15);
		csrframe.getContentPane().add(purchaseList);
		
		JButton delete = new JButton("\uC0AD \uC81C");
		delete.setBounds(205, 340, 97, 23);
		csrframe.getContentPane().add(delete);
		
		JButton modify = new JButton("\uC218 \uC815");
		modify.setBounds(96, 340, 97, 23);
		csrframe.getContentPane().add(modify);
		
		String header[]= {"상품명","가격","일자"};
		String contents[][]= {};
		DefaultTableModel purchaseModel = new DefaultTableModel(contents,header);
		JTable purchasetable = new JTable(purchaseModel);
		JScrollPane scrollpane = new JScrollPane(purchasetable); //스크롤기능
		scrollpane.setBounds(32, 191, 329, 108);
		csrframe.getContentPane().add(scrollpane);
		csrframe.setVisible(true);
		
	}
}
