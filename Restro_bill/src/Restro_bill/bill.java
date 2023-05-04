package Restro_bill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
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
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 603, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restro bill");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(254, 31, 132, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("menu");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(92, 115, 82, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("quantity");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(92, 194, 82, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Tea-Rs.30", "Frenchfries-Rs.100", "Sandwich-Rs.150", "Mocktail-Rs.200"}));
		c1.setBounds(284, 115, 132, 22);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(284, 194, 119, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String quantity=t1.getText();
				int q=Integer.parseInt(quantity);
				int bill=0;
				if(item.equals("Tea-Rs.30"))
				{
					bill=q*30;
					JOptionPane.showMessageDialog(btnNewButton, "hello\n Selected item:"+item+"\n Quantity: "+q+" \n your bill;"+bill);
				}
				else if(item.equals("Frenchfries-Rs.100"))
				{
					bill=q*100;
					JOptionPane.showMessageDialog(btnNewButton, "hello\n Selected item:"+item+"\n Quantity: "+q+" \n your bill;"+bill);
				}
				else if(item.equals("Sandwich-Rs.150"))
				{
					bill=q*150;
					JOptionPane.showMessageDialog(btnNewButton, "hello\n Selected item:"+item+"\n Quantity: "+q+" \n your bill;"+bill);
				}
				else if(item.equals("Mocktail-Rs.200"))
				{
					bill=q*200;
					JOptionPane.showMessageDialog(btnNewButton, "hello\n Selected item:"+item+"\n Quantity: "+q+" \n your bill;"+bill);
				}	
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(171, 286, 137, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
