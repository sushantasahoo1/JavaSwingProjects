import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textName;
	private JTextField textAge;
	JLabel lblInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 314);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Name");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setBackground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(83, 33, 114, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Age");
		lblNewLabel_1.setForeground(Color.MAGENTA);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(83, 96, 85, 29);
		contentPane.add(lblNewLabel_1);
		
		textName = new JTextField();
		textName.setForeground(Color.RED);
		textName.setFont(new Font("Tahoma", Font.BOLD, 15));
		textName.setBounds(265, 30, 233, 29);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textAge = new JTextField();
		textAge.setForeground(Color.RED);
		textAge.setFont(new Font("Tahoma", Font.BOLD, 15));
		textAge.setBounds(265, 101, 233, 29);
		contentPane.add(textAge);
		textAge.setColumns(10);
		
		JButton btnOK = new JButton("OK");
		btnOK.setForeground(Color.RED);
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=textName.getText();
				String ageText=textAge.getText();
				try {
					int age=Integer.parseInt(ageText);
					
					if(age>=18)
				    	lblInfo.setText(name+" "+"Elegible for vote!!!");
					else 
						lblInfo.setText(name+" "+"not Elegible for vote!!!");
					
				}
				catch(NumberFormatException ex) {
					
				  }
			   }
			});
		btnOK.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOK.setBounds(204, 164, 85, 21);
		contentPane.add(btnOK);
		
		JButton btnRESET = new JButton("RESET");
		btnRESET.setForeground(Color.RED);
		btnRESET.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText("");
				textAge.setText("");
				lblInfo.setText("");
			}
		});
		btnRESET.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRESET.setBounds(352, 164, 85, 21);
		contentPane.add(btnRESET);
		
		lblInfo = new JLabel("");
		lblInfo.setForeground(Color.ORANGE);
		lblInfo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInfo.setBounds(204, 211, 376, 56);
		contentPane.add(lblInfo);
	}
}
