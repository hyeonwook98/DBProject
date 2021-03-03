import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class customerinsert {

	private JFrame frame;
	private JTextField name;
	private JTextField carnum;
	private JTextField ctype;
	private JTextField phonenum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerinsert window = new customerinsert();
					 
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
	public customerinsert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 259, 260);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		JPanel insertpanel = new JPanel();
		insertpanel.setBounds(0, 0, 243, 221);
		frame.getContentPane().add(insertpanel);
		insertpanel.setLayout(null);
		
		JLabel insertLabel = new JLabel("\uACE0\uAC1D\uB4F1\uB85D");
		insertLabel.setBounds(96, 20, 57, 15);
		insertpanel.add(insertLabel);
		
		JLabel cname = new JLabel("\uC774      \uB984");
		cname.setBounds(26, 55, 48, 22);
		insertpanel.add(cname);
		
		JLabel carnumber = new JLabel("\uCC28\uB7C9\uBC88\uD638");
		carnumber.setBounds(26, 87, 57, 15);
		insertpanel.add(carnumber);
		
		JLabel cartype = new JLabel("\uCC28\uB7C9\uC885\uB958");
		cartype.setBounds(26, 115, 57, 15);
		insertpanel.add(cartype);
		
		JLabel phone = new JLabel("\uC804\uD654\uBC88\uD638");
		phone.setBounds(26, 143, 57, 15);
		insertpanel.add(phone);
		
		name = new JTextField();
		name.setBounds(96, 56, 116, 21);
		insertpanel.add(name);
		name.setColumns(10);
		
		carnum = new JTextField();
		carnum.setBounds(96, 84, 116, 21);
		insertpanel.add(carnum);
		carnum.setColumns(10);
		
		ctype = new JTextField();
		ctype.setBounds(96, 112, 116, 21);
		insertpanel.add(ctype);
		ctype.setColumns(10);
		
		phonenum = new JTextField();
		phonenum.setBounds(96, 140, 116, 21);
		insertpanel.add(phonenum);
		phonenum.setColumns(10);
		
		JButton savebutton = new JButton("�� ��");
		savebutton.setBounds(96, 171, 116, 23);
		
		
		savebutton.addActionListener(new ButtonListener());
		insertpanel.add(savebutton);
		
	}
	class ButtonListener implements ActionListener{

		DB db = new DB();// DB ������ ���� ��ü ����
		Connection conn = db.conn(); // �ڹٿ� DB ������� ��ü�� Connection ��ü ����
		PreparedStatement pstmt;//�Ķ���͸� ����ǥ�� ���� �� ����. � ������ ����(����ǥ)�� ���� ���������� �� �����ϰ� ��� ����. �������� ���� ���ϰ� ����ϱ����� ���. 
		ResultSet rs; //���� ������ ��� ��ü�� ��ȯ�ϱ�����
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();
			
			if(b.getText().equals("�� ��")) {
				
				String sql="insert into carcustomer(cName,cNumber,cType,cPhone)values(?,?,?,?);";
				try {
					pstmt = conn.prepareStatement(sql); //sql���� conn�� �̿��� ����, sql���� DB�� �����Ѵٰ� �����ϸ� �ɵ�! try catch���� �ʿ��� ����
					pstmt.setString(1, name.getText()); // ����ǥ�� �ִ� ��ġ ������ ��ȣ�� ������. ����ǥ�� ������ŭ ����������.(���� �ȸ��߸� ������ ����!)
					pstmt.setString(2, carnum.getText());
					pstmt.setString(3, ctype.getText());
					pstmt.setString(4, phonenum.getText());
					
					//WORD�� String���� ���� String�� cname, cphone, ctype, cnumber�� �����ؼ� �����ؼ� �����ϵ��� ����.
					//cname, cphone, ctype, cnumber�� �ش�Ǵ� �κ��� JTextField���� ���� ������ �޾ƿ;���!(�ؽ�Ʈ�ʵ� ����.getText(););
					
					int result = pstmt.executeUpdate(); //���� ������ ��� ��ü�� ��ȯ�ϱ�����. 0�̸� ����, 1�̸� ����� ����� ��.
					// executeUpdate�� insert, update, delete ������ ���
					// executeQuery�� select������ ���.
					System.out.println("result = "+result);
					
					pstmt.close(); // ����
					conn.close(); // ����
				}catch(SQLException e1) {		
					System.out.println("�����Դϴ�.");
				}
			}
		}
	}
}
