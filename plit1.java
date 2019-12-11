import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class plit1 extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField width;
	private JTextField lplit;
	private JTextField wplit;
	private JTextField wsh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					plit1 frame = new plit1();
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
	public plit1() {
		setTitle("\u041F\u043B\u0438\u0442\u043A\u0430");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0414\u043B\u0438\u043D\u0430 \u043F\u043E\u043A\u0440\u044B\u0432\u0435\u043C\u043E\u0439 \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0438, \u0441\u043C");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel.setBounds(23, 24, 438, 36);
		contentPane.add(lblNewLabel);
		
		length = new JTextField();
		length.setFont(new Font("Tahoma", Font.PLAIN, 18));
		length.setBounds(477, 24, 165, 36);
		contentPane.add(length);
		length.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u0428\u0438\u0440\u0438\u043D\u0430 \u043F\u043E\u043A\u0440\u044B\u0432\u0435\u043C\u043E\u0439 \u043F\u043E\u0432\u0435\u0440\u0445\u043D\u043E\u0441\u0442\u0438, \u0441\u043C");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(23, 99, 444, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("\u0414\u043B\u0438\u043D\u0430 \u043F\u043B\u0438\u0442\u043A\u0438, \u0441\u043C");
		label.setFont(new Font("Arial", Font.PLAIN, 24));
		label.setBounds(23, 177, 450, 36);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0428\u0438\u0440\u0438\u043D\u0430 \u043F\u043B\u0438\u0442\u043A\u0438, \u0441\u043C");
		label_1.setFont(new Font("Arial", Font.PLAIN, 24));
		label_1.setBounds(23, 252, 438, 36);
		contentPane.add(label_1);
		
		width = new JTextField();
		width.setFont(new Font("Tahoma", Font.PLAIN, 18));
		width.setColumns(10);
		width.setBounds(477, 99, 165, 36);
		contentPane.add(width);
		
		lplit = new JTextField();
		lplit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lplit.setColumns(10);
		lplit.setBounds(477, 177, 165, 36);
		contentPane.add(lplit);
		
		wplit = new JTextField();
		wplit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		wplit.setColumns(10);
		wplit.setBounds(477, 252, 165, 36);
		contentPane.add(wplit);
		
		JButton btn = new JButton("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String l = length.getText().trim();
				String w = width.getText().trim();
				String lp = lplit.getText().trim();
				String wp = wplit.getText().trim();
				String shov = wsh.getText().trim();
				if(!(l.isEmpty() || w.isEmpty() || lp.isEmpty() || wp.isEmpty() || shov.isEmpty()))
					try
				{
				float A,B,a,b,h;
				double N,dA,dB,cA,cB;
				A = new Float(l);
				B = new Float(w);
				a = new Float(lp);
				b = new Float(wp);
				h = new Float(shov);
				if ((A / (a + h)) == (int)(A / (a + h)) && (B / (b + h)) == (int)(B / (b + h))) {
		            N = (A * B) / ((a + h) * (b + h));
		            
				}
				else {
					dA = getFraction(A/(a+h));
					cA = Math.floor(A/(a+h));		
					dB = getFraction(B/(b+h));
					cB = Math.floor(B/(b+h));
					if ((A / (a + h)) != ((int)(A / (a + h)))) {
						if ((B / (b + h)) != ((int)(B / (b + h)))) {
							if (dA >= 0.5 && dB >= 0.5) {
								 N = cA * cB + Math.ceil(B / (2 * (b + h))) + Math.ceil(A / (2 * (a + h)));
								 
							}
							 else if (dB < 0.5 && dA >= 0.5) {
								 N = cA * cB + Math.ceil(A / (2 * (a + h))) + Math.ceil(B /(b + h));
								 
							 }
							 else if (dA < 0.5 && dA >= 0.5) {
								 N = cA * cB + Math.ceil(B / (2*(b + h))) + Math.ceil(A /(a + h));
								
							 }
							 else {
								 N = cA * cB + Math.ceil(A / (a + h)) + Math.ceil(B / (b + h));
								 
							 }
						}
						else {
							if (dA >= 0.5)N = (B / (b + h)) * cA + Math.ceil(B / (2 * (b + h)));
							else  N = (B / (b + h)) * cA + Math.ceil(B / (b + h));
							
						}
					}
					else {
						if (dB >= 0.5)N = (A / (a + h)) * cB + Math.ceil(A / (2 * (a + h)));
						else  N = (A / (a + h)) * cB + Math.ceil(A / (a + h));
						
					}
				}
					JOptionPane.showMessageDialog(null, "Вам потребуется плитка в количестве "+(int)N+" шт","Результат",1);
				}
				catch(Exception w1) {
					JOptionPane.showMessageDialog(null, "Заполните все поля корректно","Ошибка",0);
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Заполните все поля","Ошибка",0);
				}
			}
			
		});
			
		btn.setFont(new Font("Arial", Font.PLAIN, 24));
		btn.setBounds(290, 429, 171, 36);
		contentPane.add(btn);
		
		JLabel label_3 = new JLabel("\u0428\u0438\u0440\u0438\u043D\u0430 \u0448\u0432\u0430, \u0441\u043C");
		label_3.setFont(new Font("Arial", Font.PLAIN, 24));
		label_3.setBounds(23, 331, 438, 36);
		contentPane.add(label_3);
		
		wsh = new JTextField();
		wsh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		wsh.setColumns(10);
		wsh.setBounds(477, 331, 165, 36);
		contentPane.add(wsh);
	}
	public double getFraction(double n) {
		if (n > 0) {
	        return n - Math.floor(n);
	    } else {
	        return ((n - Math.ceil(n)) * -1);
	    }
	}
}
