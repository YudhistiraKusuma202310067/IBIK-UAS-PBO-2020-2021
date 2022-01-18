package UAS.soal.tujuh.sampai.sepuluh.dashboard;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import UAS.soal.tujuh.sampai.sepuluh.login.LoginController;
import UAS.soal.tujuh.sampai.sepuluh.login.UsersDao;
import UAS.soal.tujuh.sampai.sepuluh.model.Users;

public class ProfileController extends JFrame {

	private JPanel contentPane;
	private JTextField textNIK;
	private JTextField textFullname;
	private JTextField textPlaceBirth;
	private JTextField textBirthDate;
	private JTextField textGender;
	private JTextField textAddress;
	private JTextField textEmail;
	private JTextField textPassword;
    private Users user;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileController frame = new ProfileController(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProfileController(Users user) {
		contentPane = new JPanel();
		LoginController lc = new LoginController();
		UsersDao ld = new UsersDao();
		this.user = user;
		
		try {
			setTitle("Dashboard");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 500, 646);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Welcome to this application");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel.setBounds(110, 57, 280, 30);
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("NIK");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1.setBounds(60, 169, 46, 14);
			contentPane.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("Fullname");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_2.setBounds(241, 169, 61, 14);
			contentPane.add(lblNewLabel_2);
			
			textNIK = new JTextField();
			textNIK.setBounds(60, 194, 165, 30);
			contentPane.add(textNIK);
			textNIK.setColumns(10);
			
			textFullname = new JTextField();
			textFullname.setColumns(10);
			textFullname.setBounds(241, 194, 165, 30);
			contentPane.add(textFullname);
			
			JLabel lblNewLabel_3 = new JLabel("PlaceBirth");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_3.setBounds(60, 261, 61, 14);
			contentPane.add(lblNewLabel_3);
			
			textPlaceBirth = new JTextField();
			textPlaceBirth.setBounds(60, 286, 127, 30);
			contentPane.add(textPlaceBirth);
			textPlaceBirth.setColumns(10);
			
			JLabel lblNewLabel_4 = new JLabel("BirthDate");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_4.setBounds(199, 261, 61, 14);
			contentPane.add(lblNewLabel_4);
			
			textBirthDate = new JTextField();
			textBirthDate.setBounds(199, 286, 103, 30);
			contentPane.add(textBirthDate);
			textBirthDate.setColumns(10);
			
			JLabel lblNewLabel_5 = new JLabel("Gender");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_5.setBounds(317, 261, 46, 14);
			contentPane.add(lblNewLabel_5);
			
			textGender = new JTextField();
			textGender.setBounds(312, 286, 94, 30);
			contentPane.add(textGender);
			textGender.setColumns(10);
			
			JLabel lblNewLabel_6 = new JLabel("Address");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_6.setBounds(60, 343, 61, 14);
			contentPane.add(lblNewLabel_6);
			
			textAddress = new JTextField();
			textAddress.setBounds(60, 368, 346, 122);
			contentPane.add(textAddress);
			textAddress.setColumns(10);
			
			JLabel lblNewLabel_7 = new JLabel("Email");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_7.setBounds(60, 501, 46, 14);
			contentPane.add(lblNewLabel_7);
			
			textEmail = new JTextField();
			textEmail.setBounds(60, 526, 165, 30);
			contentPane.add(textEmail);
			textEmail.setColumns(10);
			
			JLabel lblNewLabel_8 = new JLabel("Password");
			lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_8.setBounds(241, 501, 79, 14);
			contentPane.add(lblNewLabel_8);
			
			textPassword = new JTextField();
			textPassword.setColumns(10);
			textPassword.setBounds(241, 526, 165, 30);
			contentPane.add(textPassword);
			
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Your profile", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(25, 130, 434, 446);
			contentPane.add(panel);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
