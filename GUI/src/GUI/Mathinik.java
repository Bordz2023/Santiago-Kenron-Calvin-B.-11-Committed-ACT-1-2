package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mathinik extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JLabel lblNewLabelAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mathinik frame = new Mathinik();
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
	public Mathinik() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Arial", Font.ITALIC, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1 + num2;
					lblNewLabelAns.setText (Integer.toString(ans));
					
				}catch(Exception e1) {
						
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnNewButton.setBounds(10, 235, 111, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SUBSTRACT");
		btnNewButton_1.setFont(new Font("Arial", Font.ITALIC, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1 - num2;
					lblNewLabelAns.setText (Integer.toString(ans));
					
				}catch(Exception el) {
					
				}
			}
		});
		btnNewButton_1.setBounds(158, 235, 108, 34);
		contentPane.add(btnNewButton_1);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(13, 123, 108, 34);
		contentPane.add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(158, 123, 111, 34);
		contentPane.add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("The Answer is:");
		lblNewLabel.setFont(new Font("Arial", Font.ITALIC, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(27, 331, 94, 34);
		contentPane.add(lblNewLabel);
		
		lblNewLabelAns = new JLabel("");
		lblNewLabelAns.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabelAns.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelAns.setBounds(137, 329, 116, 36);
		contentPane.add(lblNewLabelAns);
		
		JLabel lblNewLabel_1 = new JLabel("BASIC MATH");
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei UI", Font.ITALIC, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(13, 39, 253, 34);
		contentPane.add(lblNewLabel_1);
		
		
	}
}
