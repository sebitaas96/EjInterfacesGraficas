package componentes;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Persona {
	private int id;
	private String nombre;
	public Persona(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
public class ConComboBox {

	private JFrame frame;
	private Persona[] personas= {new Persona(1,"Pepe"), new Persona(1,"Juan"), new Persona(1,"Mónica")};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConComboBox window = new ConComboBox();
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
	public ConComboBox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("COMPONENTE CON COMBO BOX");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inicioConCombo();
	}

	private void inicioConCombo() {
		 String continente[]={"1-América","2-África","Europa","Asia","Oceanía"}; 
		 
		 
         JComboBox<String> cb=new JComboBox<String>(continente);
         cb.setBounds(75, 100,120,30);    
         frame.add(cb);
         
         JButton btnVer=new JButton("COMPROBAR");
         btnVer.setBounds(190,100,120,30);
         
         btnVer.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          		System.out.println(cb.getSelectedIndex());
          		JOptionPane.showMessageDialog(frame, cb.getItemAt(cb.getSelectedIndex())); 
          		}
          	
	 });
         frame.add(btnVer);
         frame.setLayout(null);
         JComboBox<Persona> cb1=new JComboBox<Persona>(personas);
         cb1.setBounds(75, 150,120,30);    
         frame.add(cb1);
		
		
	}

}
