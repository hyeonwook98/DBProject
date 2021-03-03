import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class storesearch {

	private JFrame storeframe;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					storesearch window = new storesearch();
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
	public storesearch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		storeframe = new JFrame();
		storeframe.setTitle("\uC785\uACE0\uC870\uD68C");
		storeframe.setBounds(100, 100, 722, 362);
		storeframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		storeframe.getContentPane().setLayout(null);
		
		JLabel storesearch = new JLabel("\uC785\uACE0\uC870\uD68C");
		storesearch.setHorizontalAlignment(SwingConstants.CENTER);
		storesearch.setBounds(0, 0, 706, 28);
		storeframe.getContentPane().add(storesearch);
		
		JLabel lblNewLabel = new JLabel("\uC2DC\uC791");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 39, 71, 28);
		storeframe.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(77, 42, 154, 24);
		storeframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uB05D");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(243, 39, 71, 28);
		storeframe.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(318, 42, 159, 24);
		storeframe.getContentPane().add(textField_1);
		
		JButton search = new JButton("\uAC80 \uC0C9");
		search.setBounds(535, 39, 105, 29);
		storeframe.getContentPane().add(search);
		
		String header[]= {"번호","품명","규격","수량","단위","단가","총구매액","입고일자","판매가격","업체","비고"};
		String contents[][]= {};
		DefaultTableModel saleModel = new DefaultTableModel(contents,header);
		JTable saletable = new JTable(saleModel);
		JScrollPane scrollpane = new JScrollPane(saletable); //스크롤기능
		scrollpane.setBounds(10, 91, 684, 156);
		storeframe.getContentPane().add(scrollpane);
		storeframe.setVisible(true);
		
		
	}

}
