import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class CheckBoxAndRadioButton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBoxAndRadioButton frame = new CheckBoxAndRadioButton();
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
	public CheckBoxAndRadioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		chckbxNewCheckBox = new JCheckBox("B.Tech");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					chckbxNewCheckBox_1.setSelected(false);
					chckbxNewCheckBox_2.setSelected(false);
				}
			}
		});
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxNewCheckBox.setBounds(18, 65, 93, 21);
		contentPane.add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("M.Tech");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox_1.isSelected()) {
					 chckbxNewCheckBox.setSelected(false);
					 chckbxNewCheckBox_2.setSelected(false);
				}
			}
		});
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxNewCheckBox_1.setBounds(18, 108, 93, 21);
		contentPane.add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("PHD");
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox_2.isSelected()) {
					chckbxNewCheckBox.setSelected(false);
					chckbxNewCheckBox_1.setSelected(false);
				}
			}
		});
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxNewCheckBox_2.setBounds(18, 150, 93, 21);
		contentPane.add(chckbxNewCheckBox_2);
		
		rdbtnNewRadioButton = new JRadioButton("20-25");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnNewRadioButton.setBounds(327, 65, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("30-35");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    if(rdbtnNewRadioButton_1.isSelected()) {
                    	
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnNewRadioButton_1.setBounds(327, 108, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("35-40");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                    if(rdbtnNewRadioButton_2.isSelected()) {
					
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnNewRadioButton_2.setBounds(327, 150, 103, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel = new JLabel("Student Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(162, 10, 149, 30);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected() && rdbtnNewRadioButton.isSelected()) {
					JOptionPane.showMessageDialog(null,"You have selected B.tech and age Required 20-25");
				}
				if(chckbxNewCheckBox_1.isSelected() && rdbtnNewRadioButton_1.isSelected()) {
					JOptionPane.showMessageDialog(null,"You have selected M.tech and age Required 30-35 ");
				}
				if(chckbxNewCheckBox_2.isSelected() && rdbtnNewRadioButton_2.isSelected()) {
					JOptionPane.showMessageDialog(null,"You have selected PHD and age Required 35-40");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(162, 192, 103, 30);
		contentPane.add(btnNewButton);
	}
}
