package sample;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registeration {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registeration window = new registeration();
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
	public registeration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTERATION");
		lblNewLabel.setBounds(113, 22, 109, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setBounds(76, 62, 59, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setBounds(76, 92, 59, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setBounds(76, 124, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb1 = new JTextField();
		tb1.setBounds(161, 52, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setBounds(161, 92, 86, 20);
		frame.getContentPane().add(p1);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"CSE", "IT", "ECE", "EEE"}));
		cb1.setBounds(161, 120, 74, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setBounds(76, 163, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setSelected(true);
		r1.setBounds(161, 161, 109, 19);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setBounds(283, 159, 109, 23);
		frame.getContentPane().add(r2);
		ButtonGroup rgb=new ButtonGroup();
		rgb.add(r1);
		rgb.add(r2);
		
		JLabel lblNewLabel_5 = new JLabel("CITY");
		lblNewLabel_5.setBounds(76, 200, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"WGL", "HYD", "VJA", "VZG"}));
		cb2.setBounds(166, 196, 59, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=tb1.getText();
				String branch=(String) cb1.getSelectedItem();
				String city=(String) cb2.getSelectedItem();
				String gender=" ";
				if(r1.isSelected())
				{
					gender="male";
				}
				if(r2.isSelected())
				{
					gender="female";
				}
				JOptionPane.showMessageDialog(btnNewButton," name "+user+"\n branch "+branch+"\n city "+city+"\n gender "+gender);
			}
		});
		btnNewButton.setBounds(181, 228, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
