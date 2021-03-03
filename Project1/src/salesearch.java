import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class salesearch {

	private JFrame saleframe;
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
					salesearch window = new salesearch();
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
	public salesearch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		saleframe = new JFrame("판매조회");
		saleframe.setBounds(100, 100, 753, 348);
		saleframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		saleframe.getContentPane().setLayout(null);
		
		JLabel salesearch = new JLabel("\uD310\uB9E4\uC870\uD68C");
		salesearch.setHorizontalAlignment(SwingConstants.CENTER);
		salesearch.setBounds(0, 0, 737, 29);
		saleframe.getContentPane().add(salesearch);
		
		JLabel from = new JLabel("\uC77C\uC790From");
		from.setBounds(10, 38, 69, 29);
		saleframe.getContentPane().add(from);
		
		textField = new JTextField();
		textField.setBounds(79, 42, 134, 21);
		saleframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uC77C\uC790To");
		lblNewLabel.setBounds(225, 39, 69, 28);
		saleframe.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(280, 42, 127, 21);
		saleframe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("\uAC80 \uC0C9");
		btnNewButton.setBounds(460, 41, 97, 23);
		saleframe.getContentPane().add(btnNewButton);
		
		table = new JTable();
		
		saleframe.getContentPane().add(table);
		
		String header[]= {"시공일","차종","시공명","시공내용","시공모델","부속품","가격","지불방법","고객명"};
		String contents[][]= {};
		DefaultTableModel saleModel = new DefaultTableModel(contents,header);
		JTable saletable = new JTable(saleModel);
		JScrollPane scrollpane = new JScrollPane(saletable); //스크롤기능
		scrollpane.setBounds(10, 91, 715, 208);
		saleframe.getContentPane().add(scrollpane);
		saleframe.setVisible(true);
	}
}
