import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNumber2;
	private JTextField textNumber1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNumber1 = new JTextField();
		textNumber1.setForeground(Color.MAGENTA);
		textNumber1.setFont(new Font("Tahoma", Font.BOLD, 13));
		textNumber1.setBounds(96, 55, 96, 29);
		contentPane.add(textNumber1);
		textNumber1.setColumns(10);
		
		textNumber2 = new JTextField();
		textNumber2.setForeground(Color.MAGENTA);
		textNumber2.setFont(new Font("Tahoma", Font.BOLD, 13));
		textNumber2.setBounds(318, 55, 96, 29);
		contentPane.add(textNumber2);
		textNumber2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("1st Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 52, 76, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2nd Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(219, 56, 85, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Calculator Program");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(176, 10, 132, 19);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Addition");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1,n2,c;
				n1=Integer.parseInt(textNumber1.getText());
				n2=Integer.parseInt(textNumber2.getText());
				
				c=n1+n2;
				textField_2.setText(Integer.toString(c));
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(10, 101, 107, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Substraction");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1,n2,c;
				n1=Integer.parseInt(textNumber1.getText());
				n2=Integer.parseInt(textNumber2.getText());
				if(n1>n2)
					c=n1-n2;
				else
					c=n2-n1;
				textField_2.setText(Integer.toString(c));
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(10, 143, 107, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Multiple");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1,n2,c;
				n1=Integer.parseInt(textNumber1.getText());
				n2=Integer.parseInt(textNumber2.getText());
				
				c=n1*n2;
				textField_2.setText(Integer.toString(c));
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(10, 188, 107, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Divide");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1,n2,c;
				n1=Integer.parseInt(textNumber1.getText());
				n2=Integer.parseInt(textNumber2.getText());
				
				if(n1>n2)
					c=n1/n2;
				else
					c=n2/n1;
				textField_2.setText(Integer.toString(c));
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(10, 232, 107, 21);
		contentPane.add(btnNewButton_3);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.RED);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2.setBounds(350, 155, 76, 40);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNumber1.setText("");
				textNumber2.setText("");
				textField_2.setText("");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(207, 160, 85, 34);
		contentPane.add(btnReset);
	}
}
