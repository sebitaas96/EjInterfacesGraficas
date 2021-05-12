package componentes;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConRadioButton {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConRadioButton window = new ConRadioButton();
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
	public ConRadioButton() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("VENTANA DE PRUEBA DE RADIO BUTTON");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		insercionCompomentes();
	}

	private void insercionCompomentes() {
		 JRadioButton r1,r2,r3;
		 r1=new JRadioButton("A) Rojo");    
         r2=new JRadioButton("B) Azul");  
         r3=new JRadioButton("C) Verde");  
         r1.setBounds(75,30,100,30);    
         r2.setBounds(75,80,100,30); 
         r3.setBounds(75,130,100,30);
         ButtonGroup bg=new ButtonGroup();    
         bg.add(r1);
         bg.add(r2); 
         bg.add(r3); 
         frame.getContentPane().add(r1);
         frame.getContentPane().add(r2);
         frame.getContentPane().add(r3);
         
         
         JButton b=new JButton("ACEPTAR");    
         b.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		if(r1.isSelected()){    
            		JOptionPane.showMessageDialog(frame,"Has elegido rojo");    
            		}    
            	else if(r2.isSelected()){    
            		JOptionPane.showMessageDialog(frame,"Has elegido azul"); 
            		String nombre=JOptionPane.showInputDialog(frame,"DI QUIEN ERAS"); 
            		JOptionPane.showMessageDialog(frame,"BIEN HECHO "+ nombre,"Alert",JOptionPane.WARNING_MESSAGE);
            		  
            		} 
            	else if(r3.isSelected()){   
            		JOptionPane.showMessageDialog(frame,"Has elegido verde"); 
            	}
         	}
         });
         b.setBounds(190,60,120,30);
         frame.getContentPane().add(b);
         frame.setLayout(null);
	}
	

}
