package plate;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.lang.Math;

public class lamp1 extends JFrame {
	private JPanel contentPane;
	private JTextField length;
	private JTextField width;
	private JTextField lpanel;
	private JTextField wpanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lamp1 frame = new lamp1();
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
	public lamp1() {
		setTitle("\u041B\u0430\u043C\u0438\u043D\u0430\u0442");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0414\u043B\u0438\u043D\u0430 \u043F\u043E\u043A\u0440\u044B\u0432\u0430\u0435\u043C\u043E\u0439 \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0438, \u0441\u043C");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel.setBounds(23, 24, 438, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0428\u0438\u0440\u0438\u043D\u0430 \u043F\u043E\u043A\u0440\u044B\u0432\u0430\u0435\u043C\u043E\u0439 \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0438, \u0441\u043C");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(23, 99, 444, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u0414\u043B\u0438\u043D\u0430 \u043B\u0430\u043C\u0438\u043D\u0438\u0440\u043E\u0432\u0430\u043D\u043D\u043E\u0439 \u043F\u0430\u043D\u0435\u043B\u0438, \u0441\u043C");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(23, 177, 450, 36);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u0428\u0438\u0440\u0438\u043D\u0430 \u043B\u0430\u043C\u0438\u043D\u0438\u0440\u043E\u0432\u0430\u043D\u043D\u043E\u0439 \u043F\u0430\u043D\u0435\u043B\u0438, \u0441\u043C");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_3.setBounds(23, 252, 438, 36);
		contentPane.add(lblNewLabel_3);
		
		length = new JTextField();
		length.setFont(new Font("Tahoma", Font.PLAIN, 18));
		length.setBounds(477, 24, 165, 36);
		contentPane.add(length);
		length.setColumns(10);
		
		width = new JTextField();
		width.setFont(new Font("Tahoma", Font.PLAIN, 18));
		width.setBounds(477, 99, 165, 36);
		contentPane.add(width);
		width.setColumns(10);
		
		lpanel = new JTextField();
		lpanel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lpanel.setBounds(477, 177, 165, 36);
		contentPane.add(lpanel);
		lpanel.setColumns(10);
		
		wpanel = new JTextField();
		wpanel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		wpanel.setBounds(477, 252, 165, 36);
		contentPane.add(wpanel);
		wpanel.setColumns(10);
		
		JButton btnNewButton = new JButton("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ls = length.getText().trim();
				String ws = width.getText().trim();
				String lpans = lpanel.getText().trim();
				String wpans = wpanel.getText().trim();
				if(!(ls.isEmpty() || ws.isEmpty() || lpans.isEmpty() || wpans.isEmpty())) {
					try {
					float A,B,a,b;
					double N;
					A = new Float(ls);
					B  = new Float(ws);
					a = new Float(lpans);
					b = new Float(wpans);
					if (((A - 2) / a) == (int)((A - 2) / a) && ((B - 2) / b) == (int)((B - 2) / b)) {
						N = ((A - 2)*(B - 2)) / (a*b);
						
					}
					else if (((A - 2) / a) != ((int)((A - 2) / a))) {
						if (((B - 2) / b) != ((int)((B - 2) / b))) {
							N = Math.ceil(((B - 2) / b) * Math.ceil((A - 2) / a));
							
						}
						else {
							N = Math.ceil(((B - 2) / b) * Math.ceil((A - 2) / a));
							
						}
					}
					else {
						N = Math.ceil(((A - 2)*(B - 2)) / (a*b));
					
					}
					JOptionPane.showMessageDialog(null, "Вам потребуется ламинат в количестве "+(int)N+" шт");
				}
					catch(Exception w) {
						JOptionPane.showMessageDialog(null, "Заполните все поля корректно");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Заполните все поля");
				}
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 24));
		btnNewButton.setBounds(290, 429, 171, 36);
		contentPane.add(btnNewButton);
	}

}
