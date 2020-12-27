import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class SimpleCalculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator window = new SimpleCalculator();
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
	public SimpleCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(23, 13, 163, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(249, 13, 171, 45);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textField.getText());
					num2 = Integer.parseInt(textField_1.getText());
					
					ans = num1 + num2;
					textFieldAns.setText(Integer.toString(ans));
					}catch(Exception e) {
						
						JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnNewButton.setBounds(23, 71, 163, 48);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MINUS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textField.getText());
					num2 = Integer.parseInt(textField_1.getText());
					
					ans = num1 - num2;
					textFieldAns.setText(Integer.toString(ans));
					}catch(Exception e1) {
						
						JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
			}
		}});
		btnNewButton_1.setBounds(249, 71, 171, 48);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MULTIPLY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textField.getText());
					num2 = Integer.parseInt(textField_1.getText());
					
					ans = num1 * num2;
					textFieldAns.setText(Integer.toString(ans));
					}catch(Exception e2) {
						
						JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
			}
		}});
		btnNewButton_2.setBounds(23, 123, 163, 48);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DIVIDE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textField.getText());
					num2 = Integer.parseInt(textField_1.getText());
					
					ans = num1 / num2;
					textFieldAns.setText(Integer.toString(ans));
					}catch(Exception e3) {
						
						JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
			}
		}});
		btnNewButton_3.setBounds(249, 123, 171, 48);
		frame.getContentPane().add(btnNewButton_3);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(219, 204, 181, 30);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblTheAnsweIs = new JLabel("The Answer is");
		lblTheAnsweIs.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTheAnsweIs.setBounds(47, 204, 107, 33);
		frame.getContentPane().add(lblTheAnsweIs);
	}

}
