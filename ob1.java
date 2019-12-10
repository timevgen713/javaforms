
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

public class ob1 extends JFrame {

	private JPanel contentPane;
	private JTextField height;
	private JTextField length;
	private JTextField lrulss;
	private JTextField wrulss;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ob1 frame = new ob1();
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
	public ob1() {
		setTitle("\u041E\u0431\u043E\u0438");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 784, 562);
		contentPane.add(panel);
		
		JLabel label = new JLabel("\u0412\u044B\u0441\u043E\u0442\u0430 \u0441\u0442\u0435\u043D, \u0441\u043C");
		label.setFont(new Font("Arial", Font.PLAIN, 24));
		label.setBounds(23, 24, 438, 36);
		panel.add(label);
		
		height = new JTextField();
		height.setFont(new Font("Tahoma", Font.PLAIN, 18));
		height.setColumns(10);
		height.setBounds(477, 24, 165, 36);
		panel.add(height);
		
		JLabel label_1 = new JLabel("\u0421\u0443\u043C\u043C\u0430 \u0434\u043B\u0438\u043D \u0441\u0442\u0435\u043D \u043A\u043E\u043C\u043D\u0430\u0442\u044B, \u0441\u043C");
		label_1.setFont(new Font("Arial", Font.PLAIN, 24));
		label_1.setBounds(23, 99, 444, 36);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u0414\u043B\u0438\u043D\u0430 \u0440\u0443\u043B\u043E\u043D\u0430 \u043E\u0431\u043E\u0435\u0432, \u0441\u043C");
		label_2.setFont(new Font("Arial", Font.PLAIN, 24));
		label_2.setBounds(23, 177, 450, 36);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\u0428\u0438\u0440\u0438\u043D\u0430 \u0440\u0443\u043B\u043E\u043D\u0430 \u043E\u0431\u043E\u0435\u0432, \u0441\u043C");
		label_3.setFont(new Font("Arial", Font.PLAIN, 24));
		label_3.setBounds(23, 252, 438, 36);
		panel.add(label_3);
		
		length = new JTextField();
		length.setFont(new Font("Tahoma", Font.PLAIN, 18));
		length.setColumns(10);
		length.setBounds(477, 99, 165, 36);
		panel.add(length);
		
		lrulss = new JTextField();
		lrulss.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lrulss.setColumns(10);
		lrulss.setBounds(477, 177, 165, 36);
		panel.add(lrulss);
		
		wrulss = new JTextField();
		wrulss.setFont(new Font("Tahoma", Font.PLAIN, 18));
		wrulss.setColumns(10);
		wrulss.setBounds(477, 252, 165, 36);
		panel.add(wrulss);
		
		JButton btn = new JButton("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hs = height.getText().trim();
				String ls = length.getText().trim();
				String lrs = lrulss.getText().trim();
				String wrs = wrulss.getText().trim();
				if(!(hs.isEmpty() || ls.isEmpty() || lrs.isEmpty() || wrs.isEmpty())) {
					try {
					float A,P,a,b;
					double N,cP,dP;
					A = new Float(hs);
					P = new Float(ls);
					a = new Float(lrs);
					b = new Float(wrs);
					dP = getFraction(a/A);
					cP = Math.floor(a/A);
					if(a/A==cP) {
						N = Math.ceil(P/(a/A*b));
						
					}
					else {
						if(dP>=0.95 && dP<=0.99) N = Math.ceil(P/(Math.ceil(a/A)*b));
						else N=Math.ceil(P / (cP * b));
						
					}
					JOptionPane.showMessageDialog(null, "Вам потребуется обои в количестве "+(int)N+" рулонов","Результат",1);
				}
				
				catch(Exception w) {
					JOptionPane.showMessageDialog(null, "Заполните все поля корректно","Ошибка",0);
				}
				}
				else {
					JOptionPane.showMessageDialog(null, "Заполните все поля","Ошибка",0);
				}
			}
		});
		btn.setFont(new Font("Arial", Font.PLAIN, 24));
		btn.setBounds(290, 429, 171, 36);
		panel.add(btn);
	}
	public double getFraction(double n) {
		if (n > 0) {
	        return n - Math.floor(n);
	    } else {
	        return ((n - Math.ceil(n)) * -1);
	    }
	}

}
