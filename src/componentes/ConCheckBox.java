package componentes;

import java.awt.EventQueue;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConCheckBox {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConCheckBox window = new ConCheckBox();
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
	public ConCheckBox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inicioConCheck();
		
	}

	private void inicioConCheck() {
		 JCheckBox checkBox1 = new JCheckBox("C++");  
         checkBox1.setBounds(75,30, 70,50);  
         JCheckBox checkBox2 = new JCheckBox("Java", true);  
         checkBox2.setBounds(75,44, 70,104); 
         frame.getContentPane().add(checkBox1);  
         frame.getContentPane().add(checkBox2);  
         
         
		
		
		JButton btnNewButton = new JButton("ACEPTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox1.isSelected() ) {
				JOptionPane.showMessageDialog(frame, "C++ ha sido seleccionado");
			}
				if (checkBox2.isSelected() ) {
				JOptionPane.showMessageDialog(frame, "Java ha sido seleccionado");
			}
				}
		});
		btnNewButton.setBounds(168, 69, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		frame.setLayout(null);
	}
}
