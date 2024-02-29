package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class movieticket {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movieticket window = new movieticket();
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
	public movieticket() {
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
		
		JLabel lblNewLabel = new JLabel("MOVIEAPP");
		lblNewLabel.setBounds(181, 22, 89, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBounds(89, 75, 74, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE");
		lblNewLabel_2.setBounds(89, 117, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel ticketsno = new JLabel("NO OF TICKETS");
		ticketsno.setBounds(89, 156, 99, 14);
		frame.getContentPane().add(ticketsno);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = tb1.getText();
				String movie=(String) cb1.getSelectedItem();
				String ticketsno =(String) cb2.getSelectedItem();
				int nt = Integer.parseInt(ticketsno);
				int bill=0;
				if(movie.equals("HI NANA"))
				{
					bill=nt*150;
				}
				if(movie.equals("MAJNU"))
				{
					bill=nt*200;
				}
				if(movie.equals("NINU KORI"))
				{
					bill=nt*250;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, "Name "+user+"\nMovie"+movie+"no of tickets "+tickets+"\n bill "+bill);
				if(res==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton," booking confirm");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton," booking canclled");
				}
			}
		});
		btnNewButton.setBounds(169, 212, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		tb1 = new JTextField();
		tb1.setBounds(216, 72, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"HI NANA", "MAJNU", "NINU KORI"}));
		cb1.setBounds(216, 113, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cb2.setBounds(216, 152, 54, 22);
		frame.getContentPane().add(cb2);
	}
}
