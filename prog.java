import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class prog extends JFrame {

	private JPanel contentPane;
	String[] items = {
			"Выберите",
		    "Ламинированные панели",
		    "Плитка",
		    "Рулоны обоев"
		};
	String lamp = items[1];
	String plit = items[2];
	String ob = items[3];
			
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prog frame = new prog();
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
	public prog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 149);
		setTitle("Выберите тип материала");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf = new JTextField();
		tf.setBounds(10, 24, 194, 20);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JComboBox comboBox = new JComboBox(items);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox box = (JComboBox)e.getSource();
                String item = (String)box.getSelectedItem();
                if(item!="Выберите") {
                	tf.setText(item);
                	if(item==items[1]) {
                		lamp1.main(null);
                	}
                	if(item==items[2]) {
                		plit1.main(null);
                	}
                	if(item==items[3]) {
                		ob1.main(null);
                	}
                }
                else {
                	JOptionPane.showMessageDialog(null, "Выберите одно из трех");
                }
                	
			}
		});
		comboBox.setBounds(214, 24, 188, 20);
		contentPane.add(comboBox);
		
		
	}
	
}
