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
		
		JButton savebutton = new JButton("저 장");
		savebutton.setBounds(96, 171, 116, 23);
		
		
		savebutton.addActionListener(new ButtonListener());
		insertpanel.add(savebutton);
		
	}
	class ButtonListener implements ActionListener{

		DB db = new DB();// DB 연결을 위해 객체 생성
		Connection conn = db.conn(); // 자바와 DB 연결통로 객체인 Connection 객체 생성
		PreparedStatement pstmt;//파라미터를 물음표로 받을 수 있음. 어떤 정보를 조건(물음표)에 대해 가져오려할 때 유용하게 사용 가능. 쿼리문을 좀더 편하게 사용하기위해 사용. 
		ResultSet rs; //쿼리 전송의 결과 객체를 반환하기위함
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();
			
			if(b.getText().equals("저 장")) {
				
				String sql="insert into carcustomer(cName,cNumber,cType,cPhone)values(?,?,?,?);";
				try {
					pstmt = conn.prepareStatement(sql); //sql문을 conn을 이용해 전달, sql문을 DB에 전달한다고 생각하면 될듯! try catch문이 필요한 문장
					pstmt.setString(1, name.getText()); // 물음표가 있는 위치 순서로 번호가 지정됨. 물음표의 개수만큼 만들어줘야함.(개수 안맞추면 오류가 난다!)
					pstmt.setString(2, carnum.getText());
					pstmt.setString(3, ctype.getText());
					pstmt.setString(4, phonenum.getText());
					
					//WORD는 String으로 받은 String의 cname, cphone, ctype, cnumber를 전달해서 세팅해서 실행하도록 해줌.
					//cname, cphone, ctype, cnumber은 해당되는 부분의 JTextField에서 적힌 정보를 받아와야함!(텍스트필드 변수.getText(););
					
					int result = pstmt.executeUpdate(); //쿼리 전송의 결과 객체를 반환하기위함. 0이면 오류, 1이면 제대로 실행된 것.
					// executeUpdate는 insert, update, delete 문에서 사용
					// executeQuery는 select문에서 사용.
					System.out.println("result = "+result);
					
					pstmt.close(); // 종료
					conn.close(); // 종료
				}catch(SQLException e1) {		
					System.out.println("오류입니다.");
				}
			}
		}
	}
}
