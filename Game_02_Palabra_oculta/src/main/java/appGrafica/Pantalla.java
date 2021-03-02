/**
 * 
 */
package appGrafica;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Font;

/**
 * @author Víctor Lozano
 *
 */
public class Pantalla extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla frame = new Pantalla();
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
	public Pantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("Teclado");
		panel.setBounds(10, 361, 221, 189);
		panel.setLayout(null);
		contentPane.add(panel);
		
		JButton btnNewButton_1 = new JButton("A");
		btnNewButton_1.setBounds(0, 0, 39, 39);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("B");
		btnNewButton_1_1.setBounds(38, 0, 39, 39);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("C");
		btnNewButton_1_2.setBounds(74, 0, 39, 39);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("D");
		btnNewButton_1_3.setBounds(110, 0, 39, 39);
		panel.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("E");
		btnNewButton_1_4.setBounds(147, 0, 39, 39);
		panel.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("F");
		btnNewButton_1_5.setBounds(183, 0, 39, 39);
		panel.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("G");
		btnNewButton_1_6.setBounds(0, 40, 39, 39);
		panel.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_1_1 = new JButton("H");
		btnNewButton_1_1_1.setBounds(38, 40, 39, 39);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("I");
		btnNewButton_1_2_1.setBounds(74, 40, 39, 39);
		panel.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_3_1 = new JButton("J");
		btnNewButton_1_3_1.setBounds(110, 40, 39, 39);
		panel.add(btnNewButton_1_3_1);
		
		JButton btnNewButton_1_4_1 = new JButton("K");
		btnNewButton_1_4_1.setBounds(147, 40, 39, 39);
		panel.add(btnNewButton_1_4_1);
		
		JButton btnNewButton_1_5_1 = new JButton("L");
		btnNewButton_1_5_1.setBounds(183, 40, 39, 39);
		panel.add(btnNewButton_1_5_1);
		
		JButton btnNewButton_1_7 = new JButton("M");
		btnNewButton_1_7.setFont(new Font("Arial", Font.PLAIN, 9));
		btnNewButton_1_7.setBounds(0, 78, 39, 39);
		panel.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_1_2 = new JButton("N");
		btnNewButton_1_1_2.setBounds(38, 78, 39, 39);
		panel.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_2_2 = new JButton("Ñ");
		btnNewButton_1_2_2.setBounds(74, 78, 39, 39);
		panel.add(btnNewButton_1_2_2);
		
		JButton btnNewButton_1_3_2 = new JButton("O");
		btnNewButton_1_3_2.setFont(new Font("Arial", Font.PLAIN, 9));
		btnNewButton_1_3_2.setBounds(110, 78, 39, 39);
		panel.add(btnNewButton_1_3_2);
		
		JButton btnNewButton_1_4_2 = new JButton("P");
		btnNewButton_1_4_2.setBounds(147, 78, 39, 39);
		panel.add(btnNewButton_1_4_2);
		
		JButton btnNewButton_1_5_2 = new JButton("Q");
		btnNewButton_1_5_2.setFont(new Font("Arial", Font.PLAIN, 9));
		btnNewButton_1_5_2.setBounds(183, 78, 39, 39);
		panel.add(btnNewButton_1_5_2);
		
		JButton btnNewButton_1_8 = new JButton("R");
		btnNewButton_1_8.setBounds(0, 116, 39, 39);
		panel.add(btnNewButton_1_8);
		
		JButton btnNewButton_1_1_3 = new JButton("S");
		btnNewButton_1_1_3.setBounds(38, 116, 39, 39);
		panel.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_2_3 = new JButton("T");
		btnNewButton_1_2_3.setBounds(74, 116, 39, 39);
		panel.add(btnNewButton_1_2_3);
		
		JButton btnNewButton_1_3_3 = new JButton("U");
		btnNewButton_1_3_3.setBounds(110, 116, 39, 39);
		panel.add(btnNewButton_1_3_3);
		
		JButton btnNewButton_1_4_3 = new JButton("V");
		btnNewButton_1_4_3.setBounds(147, 116, 39, 39);
		panel.add(btnNewButton_1_4_3);
		
		JButton btnNewButton_1_5_3 = new JButton("W");
		btnNewButton_1_5_3.setFont(new Font("Arial", Font.PLAIN, 8));
		btnNewButton_1_5_3.setBounds(183, 116, 39, 39);
		panel.add(btnNewButton_1_5_3);
		
		JButton btnNewButton_1_9 = new JButton("X");
		btnNewButton_1_9.setBounds(61, 150, 39, 39);
		panel.add(btnNewButton_1_9);
		
		JButton btnNewButton_1_1_4 = new JButton("Y");
		btnNewButton_1_1_4.setBounds(98, 150, 39, 39);
		panel.add(btnNewButton_1_1_4);
		
		JButton btnNewButton_1_2_4 = new JButton("Z");
		btnNewButton_1_2_4.setBounds(134, 150, 39, 39);
		panel.add(btnNewButton_1_2_4);
	}
}
