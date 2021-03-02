/**
 * 
 */
package appGrafica;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;

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
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JPanel tecladoPanel = new JPanel();
		tecladoPanel.setBounds(10, 361, 221, 189);
		tecladoPanel.setToolTipText("Teclado");
		contentPane.add(tecladoPanel);
		tecladoPanel.setLayout(null);
		
		final JButton btnA = new JButton("A");
		btnA.setBounds(0, 0, 39, 39);
		tecladoPanel.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.setBounds(38, 0, 39, 39);
		tecladoPanel.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(74, 0, 39, 39);
		tecladoPanel.add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.setBounds(110, 0, 39, 39);
		tecladoPanel.add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.setBounds(147, 0, 39, 39);
		tecladoPanel.add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.setBounds(183, 0, 39, 39);
		tecladoPanel.add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.setBounds(0, 40, 39, 39);
		tecladoPanel.add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.setBounds(38, 40, 39, 39);
		tecladoPanel.add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.setBounds(74, 40, 39, 39);
		tecladoPanel.add(btnI);
		
		JButton btnJ = new JButton("J");
		btnJ.setBounds(110, 40, 39, 39);
		tecladoPanel.add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.setBounds(147, 40, 39, 39);
		tecladoPanel.add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.setBounds(183, 40, 39, 39);
		tecladoPanel.add(btnL);
		
		JButton btnM = new JButton("M");
		btnM.setBounds(0, 78, 39, 39);
		btnM.setFont(new Font("Arial", Font.PLAIN, 9));
		tecladoPanel.add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.setBounds(38, 78, 39, 39);
		tecladoPanel.add(btnN);
		
		JButton btnÑ = new JButton("Ñ");
		btnÑ.setBounds(74, 78, 39, 39);
		tecladoPanel.add(btnÑ);
		
		JButton btnO = new JButton("O");
		btnO.setBounds(110, 78, 39, 39);
		btnO.setFont(new Font("Arial", Font.PLAIN, 9));
		tecladoPanel.add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.setBounds(147, 78, 39, 39);
		tecladoPanel.add(btnP);
		
		JButton btnQ = new JButton("Q");
		btnQ.setBounds(183, 78, 39, 39);
		btnQ.setFont(new Font("Arial", Font.PLAIN, 9));
		tecladoPanel.add(btnQ);
		
		JButton btnR = new JButton("R");
		btnR.setBounds(0, 116, 39, 39);
		tecladoPanel.add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.setBounds(38, 116, 39, 39);
		tecladoPanel.add(btnS);
		
		JButton btnT = new JButton("T");
		btnT.setBounds(74, 116, 39, 39);
		tecladoPanel.add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.setBounds(110, 116, 39, 39);
		tecladoPanel.add(btnU);
		
		JButton btnV = new JButton("V");
		btnV.setBounds(147, 116, 39, 39);
		tecladoPanel.add(btnV);
		
		JButton btnW = new JButton("W");
		btnW.setBounds(183, 116, 39, 39);
		btnW.setFont(new Font("Arial", Font.PLAIN, 8));
		tecladoPanel.add(btnW);
		
		JButton btnX = new JButton("X");
		btnX.setBounds(61, 150, 39, 39);
		tecladoPanel.add(btnX);
		
		JButton btnY = new JButton("Y");
		btnY.setBounds(98, 150, 39, 39);
		tecladoPanel.add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.setBounds(134, 150, 39, 39);
		tecladoPanel.add(btnZ);
		
		final JPanel pistasPanel = new JPanel();
		pistasPanel.setBounds(10, 182, 221, 158);
		contentPane.add(pistasPanel);
		pistasPanel.setLayout(null);
		
		JPanel palabraSecretaPanel = new JPanel();
		palabraSecretaPanel.setBounds(10, 93, 201, 54);
		pistasPanel.add(palabraSecretaPanel);
		palabraSecretaPanel.setLayout(null);
		
		final JLabel palabraSecreta = new JLabel("");
		palabraSecreta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		palabraSecreta.setBounds(10, 11, 181, 32);
		palabraSecretaPanel.add(palabraSecreta);
		
		JPanel menuPanel = new JPanel();
		menuPanel.setBounds(10, 11, 221, 158);
		contentPane.add(menuPanel);
		menuPanel.setLayout(null);
		
		
		JButton btnResolver = new JButton("Resolver");
		btnResolver.setBounds(10, 77, 201, 55);
		menuPanel.add(btnResolver);
		
		final JPanel imagenesPanel = new JPanel();
		imagenesPanel.setBounds(241, 11, 333, 539);
		contentPane.add(imagenesPanel);
		imagenesPanel.setLayout(null);
		
		JLabel imagenLabel = new JLabel("");
		ImageIcon img = new ImageIcon(Pantalla.class.getResource("/Imagenes/Vida1.jpg"));
		Image imagen = img.getImage();
		Image newSize = imagen.getScaledInstance(440, 400, Image.SCALE_SMOOTH);
		img = new ImageIcon(newSize);
		imagenLabel.setIcon(img);
		imagenLabel.setBounds(10, 11, 313, 517);
		imagenesPanel.add(imagenLabel);
		
		JList<String> list = new JList<String>();
		final DefaultListModel<String> listaDiez = new DefaultListModel<String>();
		listaDiez.addElement("Tarragona");
		listaDiez.addElement("Barcelona");
		listaDiez.addElement("Lleida");
		listaDiez.addElement("Girona");
		listaDiez.addElement("Futbol");
		listaDiez.addElement("Baloncesto");
		listaDiez.addElement("Macarrones");
		listaDiez.addElement("Albondigas");
		listaDiez.addElement("Teclado");
		list.setModel(listaDiez);
		list.setVisible(false);
		list.setBounds(10, 170, 1, 1);
		contentPane.add(list);
		
		tecladoPanel.setVisible(false);
		imagenesPanel.setVisible(false);
		pistasPanel.setVisible(false);
		
		JButton btnIniciarJuego = new JButton("Iniciar juego");
		btnIniciarJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				palabraSecreta.setText("");
				tecladoPanel.setVisible(true);
				imagenesPanel.setVisible(true);
				pistasPanel.setVisible(true);
				int random = (int) (Math.random() * listaDiez.getSize());
				final String palabra = listaDiez.get(random);
				for (int i = 0; i < palabra.length(); i++) {
					palabraSecreta.setText(palabraSecreta.getText() + " _");
				}
				
				btnA.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						palabraSecreta.setText("");
						for (int j = 0; j < palabra.length(); j++) {
							if(btnA.getText().equals(palabra.charAt(j))) {	
								palabraSecreta.setText(palabraSecreta.getText() + " " + palabra.charAt(j));
							} else {
								palabraSecreta.setText(palabraSecreta.getText() + " _");
							}
						}
						
					}
					
				});
			}
		});
		btnIniciarJuego.setBounds(10, 11, 201, 55);
		menuPanel.add(btnIniciarJuego);
		
	}
}
