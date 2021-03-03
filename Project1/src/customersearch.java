import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import java.awt.TextArea;

public class customersearch {

	private JFrame frame;
	private JTextField cname1;
	private JTextField cphone1;
	private JTable table;

	String header[] = {"�̸�","������ȣ","��������","��ȭ��ȣ"};
	String contents[][]= {};
	DefaultTableModel model = new DefaultTableModel(contents,header) {    //JTable ����Ŭ�� ��������
		public boolean isCellEditable(int i,int c) {
			return false;
		}
	};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customersearch window = new customersearch();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public customersearch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 491, 339);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel csearch = new JLabel("\uACE0\uAC1D\uC870\uD68C");
		csearch.setBounds(186, 10, 57, 15);
		frame.getContentPane().add(csearch);
		
		JLabel cname = new JLabel("\uC774      \uB984");
		cname.setBounds(36, 47, 57, 15);
		frame.getContentPane().add(cname);
		
		JLabel cphone = new JLabel("\uC804\uD654\uBC88\uD638");
		cphone.setBounds(36, 72, 57, 15);
		frame.getContentPane().add(cphone);
		
		JLabel clist = new JLabel("\uACE0\uAC1D\uBAA9\uB85D");
		clist.setBounds(36, 139, 57, 15);
		frame.getContentPane().add(clist);
		
		cname1 = new JTextField();
		cname1.setBounds(99, 44, 116, 21);
		frame.getContentPane().add(cname1);
		cname1.setColumns(10);
		
		cphone1 = new JTextField();
		cphone1.setBounds(99, 69, 116, 21);
		frame.getContentPane().add(cphone1);
		cphone1.setColumns(10);
		
		JButton search = new JButton("\uAC80 \uC0C9");
		search.setBounds(99, 100, 116, 23);
		search.addActionListener(new ButtonListener());
		frame.getContentPane().add(search);
		
		
		JTable ctable = new JTable(model);
		JScrollPane scrollpane = new JScrollPane(ctable); //��ũ�ѱ��
		scrollpane.setBounds(36, 165, 404, 105);
		ctable.addMouseListener(new MyMouseListener());
		frame.getContentPane().add(scrollpane);
	    frame.setVisible(true);
	}
	class ButtonListener implements ActionListener{
        //Ű���带 ���� ������ ��ȸ
		DB db = new DB();// DB ������ ���� ��ü ����
		Connection conn = db.conn(); // �ڹٿ� DB ������� ��ü�� Connection ��ü ����
		PreparedStatement pstmt;//�Ķ���͸� ����ǥ�� ���� �� ����. � ������ ����(����ǥ)�� ���� ���������� �� �����ϰ� ��� ����. �������� ���� ���ϰ� ����ϱ����� ���. 
		ResultSet rs; //���� ������ ��� ��ü�� ��ȯ�ϱ�����
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String inputStr[]=new String[4];
			JButton b = (JButton)e.getSource();
			
			if(b.getText().equals("�� ��")) {
				
				String sql="select cId,cName,cNumber,cType,cPhone from carcustomer where cName like ? and cPhone like ? ;";
				try {
					pstmt = conn.prepareStatement(sql); //sql���� conn�� �̿��� ����, sql���� DB�� �����Ѵٰ� �����ϸ� �ɵ�! try catch���� �ʿ��� ����
					pstmt.setString(1, cname1.getText());
					pstmt.setString(2, '%'+cphone1.getText());
					
					rs = pstmt.executeQuery(); // Statement�� �־������,�տ� �־����Ƿ� ����� �ȳ���
					
					while(rs.next()) { // ���� ���ڵ尡 ������
						int cId= rs.getInt(1);                  //�����ӿ� ��� �ֱ�
						inputStr[0]=rs.getString(2);
						inputStr[1]=rs.getString(3);
						inputStr[2]=rs.getString(4);
						inputStr[3]=rs.getString(5);
						model.addRow(inputStr);
						/*String cName=rs.getString(2);
						String cNumber=rs.getString(3); 
						String cType=rs.getString(4); 
						String cPhone=rs.getString(5);*/
						/*int bookid = rs.getInt("bookid"); // �÷� �ѹ��� �ʵ��̸� �� �����Ͽ� �Ѵ�. ����� �ʵ��̸�������.
						String bookname = rs.getString("bookname");
						String publisher = rs.getString("publisher");
						int price = rs.getInt("price");
						*/
						System.out.println(cId + "\t" + inputStr[0] + "\t" + inputStr[1] + "\t" + inputStr[2]+"\t"+inputStr[3]);
						
					}
					pstmt.close();
				} catch(SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	
	class MyMouseListener extends MouseAdapter{
		@Override
	    public void mouseClicked(MouseEvent e) {
	    //if (e.getButton() == 1) { } //Ŭ��
	    if (e.getClickCount() == 2) {
	    	frame.setVisible(false);
	    	customermodify window = new customermodify();
	    	} // ����Ŭ��
	    }
	    //if (e.getButton() == 3) { } // ������ Ŭ��

	}
}
