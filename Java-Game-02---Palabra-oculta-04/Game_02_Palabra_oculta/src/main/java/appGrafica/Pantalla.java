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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

/**
 * @author Víctor Lozano
 *
 */
public class Pantalla extends JFrame {
	private static int foto = 1;
	private static String palabra;
	private static String letrasRestantes;
	private static JLabel palabraSecreta;
	private static JLabel imagenLabel;
	private JPanel contentPane;
	private static JPanel pistasPanel;
	private static JButton btnA;
	private static JButton btnB;
	private static JButton btnC;
	private static JButton btnD;
	private static JButton btnE;
	private static JButton btnF;
	private static JButton btnG;
	private static JButton btnH;
	private static JButton btnI;
	private static JButton btnJ;
	private static JButton btnK;
	private static JButton btnL;
	private static JButton btnM;
	private static JButton btnN;
	private static JButton btnÑ;
	private static JButton btnO;
	private static JButton btnP;
	private static JButton btnQ;
	private static JButton btnR;
	private static JButton btnS;
	private static JButton btnT;
	private static JButton btnU;
	private static JButton btnV;
	private static JButton btnW;
	private static JButton btnX;
	private static JButton btnY;
	private static JButton btnZ;
	private static JPanel palabraSecretaPanel;
	private static JPanel tecladoPanel;
	private static JPanel menuPanel;
	private static JButton btnResolver;
	private static JPanel imagenesPanel;
	private static JList<String> list;
	private static DefaultListModel<String> listaDiez;
	private static JButton btnIniciarJuego;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla frame = new Pantalla();
					btnIniciarJuego.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							palabraSecreta.setText("");
							tecladoPanel.setVisible(true);
							imagenesPanel.setVisible(true);
							pistasPanel.setVisible(true);
							int random = (int) (Math.random() * listaDiez.getSize());
							palabra = listaDiez.get(random);
							letrasRestantes = palabra;
							System.out.println(palabra);
							for (int i = 0; i < palabra.length(); i++) {
								palabraSecreta.setText(palabraSecreta.getText() + " _");
							}
						}
					});
					ActionListener click = new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							String letra;
							JButton boton = (JButton) e.getSource();
							letra = boton.getText();
							System.out.println(letra);
							compruebaLetra(letra);
						}
					};
					btnA.addActionListener(click);
					btnB.addActionListener(click);
					btnC.addActionListener(click);
					btnD.addActionListener(click);
					btnE.addActionListener(click);
					btnF.addActionListener(click);
					btnG.addActionListener(click);
					btnH.addActionListener(click);
					btnI.addActionListener(click);
					btnJ.addActionListener(click);
					btnK.addActionListener(click);
					btnL.addActionListener(click);
					btnM.addActionListener(click);
					btnN.addActionListener(click);
					btnÑ.addActionListener(click);
					btnO.addActionListener(click);
					btnP.addActionListener(click);
					btnQ.addActionListener(click);
					btnR.addActionListener(click);
					btnS.addActionListener(click);
					btnT.addActionListener(click);
					btnU.addActionListener(click);
					btnV.addActionListener(click);
					btnW.addActionListener(click);
					btnX.addActionListener(click);
					btnY.addActionListener(click);
					btnZ.addActionListener(click);
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

		tecladoPanel = new JPanel();
		tecladoPanel.setBounds(10, 361, 221, 189);
		tecladoPanel.setToolTipText("Teclado");
		contentPane.add(tecladoPanel);
		tecladoPanel.setLayout(null);

		btnA = new JButton("A");
		btnA.setBounds(0, 0, 39, 39);
		tecladoPanel.add(btnA);

		btnB = new JButton("B");
		btnB.setBounds(38, 0, 39, 39);
		tecladoPanel.add(btnB);

		btnC = new JButton("C");
		btnC.setBounds(74, 0, 39, 39);
		tecladoPanel.add(btnC);

		btnD = new JButton("D");
		btnD.setBounds(110, 0, 39, 39);
		tecladoPanel.add(btnD);

		btnE = new JButton("E");
		btnE.setBounds(147, 0, 39, 39);
		tecladoPanel.add(btnE);

		btnF = new JButton("F");
		btnF.setBounds(183, 0, 39, 39);
		tecladoPanel.add(btnF);

		btnG = new JButton("G");
		btnG.setBounds(0, 40, 39, 39);
		tecladoPanel.add(btnG);

		btnH = new JButton("H");
		btnH.setBounds(38, 40, 39, 39);
		tecladoPanel.add(btnH);

		btnI = new JButton("I");
		btnI.setBounds(74, 40, 39, 39);
		tecladoPanel.add(btnI);

		btnJ = new JButton("J");
		btnJ.setBounds(110, 40, 39, 39);
		tecladoPanel.add(btnJ);

		btnK = new JButton("K");
		btnK.setBounds(147, 40, 39, 39);
		tecladoPanel.add(btnK);

		btnL = new JButton("L");
		btnL.setBounds(183, 40, 39, 39);
		tecladoPanel.add(btnL);

		btnM = new JButton("M");
		btnM.setBounds(0, 78, 39, 39);
		btnM.setFont(new Font("Arial", Font.PLAIN, 9));
		tecladoPanel.add(btnM);

		btnN = new JButton("N");
		btnN.setBounds(38, 78, 39, 39);
		tecladoPanel.add(btnN);

		btnÑ = new JButton("Ñ");
		btnÑ.setBounds(74, 78, 39, 39);
		tecladoPanel.add(btnÑ);

		btnO = new JButton("O");
		btnO.setBounds(110, 78, 39, 39);
		btnO.setFont(new Font("Arial", Font.PLAIN, 9));
		tecladoPanel.add(btnO);

		btnP = new JButton("P");
		btnP.setBounds(147, 78, 39, 39);
		tecladoPanel.add(btnP);

		btnQ = new JButton("Q");
		btnQ.setBounds(183, 78, 39, 39);
		btnQ.setFont(new Font("Arial", Font.PLAIN, 9));
		tecladoPanel.add(btnQ);

		btnR = new JButton("R");
		btnR.setBounds(0, 116, 39, 39);
		tecladoPanel.add(btnR);

		btnS = new JButton("S");
		btnS.setBounds(38, 116, 39, 39);
		tecladoPanel.add(btnS);

		btnT = new JButton("T");
		btnT.setBounds(74, 116, 39, 39);
		tecladoPanel.add(btnT);

		btnU = new JButton("U");
		btnU.setBounds(110, 116, 39, 39);
		tecladoPanel.add(btnU);

		btnV = new JButton("V");
		btnV.setBounds(147, 116, 39, 39);
		tecladoPanel.add(btnV);

		btnW = new JButton("W");
		btnW.setBounds(183, 116, 39, 39);
		btnW.setFont(new Font("Arial", Font.PLAIN, 8));
		tecladoPanel.add(btnW);

		btnX = new JButton("X");
		btnX.setBounds(61, 150, 39, 39);
		tecladoPanel.add(btnX);

		btnY = new JButton("Y");
		btnY.setBounds(98, 150, 39, 39);
		tecladoPanel.add(btnY);

		btnZ = new JButton("Z");
		btnZ.setBounds(134, 150, 39, 39);
		tecladoPanel.add(btnZ);

		pistasPanel = new JPanel();
		pistasPanel.setBounds(10, 182, 221, 158);
		contentPane.add(pistasPanel);
		pistasPanel.setLayout(null);

		palabraSecretaPanel = new JPanel();
		palabraSecretaPanel.setBounds(10, 93, 201, 54);
		pistasPanel.add(palabraSecretaPanel);
		palabraSecretaPanel.setLayout(null);

		palabraSecreta = new JLabel();
		palabraSecreta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		palabraSecreta.setBounds(10, 11, 181, 32);
		palabraSecretaPanel.add(palabraSecreta);

		menuPanel = new JPanel();
		menuPanel.setBounds(10, 11, 221, 158);
		contentPane.add(menuPanel);
		menuPanel.setLayout(null);

		btnResolver = new JButton("Resolver");
		btnResolver.setBounds(10, 77, 201, 55);
		menuPanel.add(btnResolver);

		imagenesPanel = new JPanel();
		imagenesPanel.setBounds(241, 11, 333, 539);
		contentPane.add(imagenesPanel);
		imagenesPanel.setLayout(null);

		imagenLabel = new JLabel();
		elegirImagen(foto);
		imagenLabel.setBounds(10, 11, 313, 517);
		imagenesPanel.add(imagenLabel);

		list = new JList<String>();
		listaDiez = new DefaultListModel<String>();
		listaDiez.addElement("TARRAGONA");
		listaDiez.addElement("BARCELONA");
		listaDiez.addElement("LLEIDA");
		listaDiez.addElement("GIRONA");
		listaDiez.addElement("FUTBOL");
		listaDiez.addElement("BALONCESTO");
		listaDiez.addElement("MACARRONES");
		listaDiez.addElement("ALBONDIGAS");
		listaDiez.addElement("TECLADO");
		list.setModel(listaDiez);
		list.setVisible(false);
		list.setBounds(10, 170, 1, 1);
		contentPane.add(list);

		btnIniciarJuego = new JButton("Iniciar juego");
		btnIniciarJuego.setBounds(10, 11, 201, 55);
		menuPanel.add(btnIniciarJuego);
		tecladoPanel.setVisible(false);
		imagenesPanel.setVisible(false);
		pistasPanel.setVisible(false);

	}

	public static void elegirImagen(int numero) {
		ImageIcon img = new ImageIcon(Pantalla.class.getResource("/Imagenes/Vida" + numero + ".jpg"));
		Image imagen = img.getImage();
		Image newSize = imagen.getScaledInstance(440, 400, Image.SCALE_SMOOTH);
		img = new ImageIcon(newSize);
		imagenLabel.setIcon(img);
		imagenLabel.repaint();

	}

	public static void compruebaLetra(String letra) {
		String resultado = "";
		boolean esta = false;
		
		for (int j = 0; j < palabra.length(); j++) {		//Por cada letra de la palabra comprueba si la otra letra es correcta
			if (palabra.charAt(j) == letra.charAt(0)) {		//Si es correcta escribela
				resultado = resultado + " " + letra;
				esta = true;
			} else if(palabraSecreta.getText().charAt(j)) {
				
			} else {
				resultado = resultado + " _";
			}
		}
		palabraSecreta.setText(resultado);
		if (!esta) {
			foto++;
			elegirImagen(foto);
		}
		System.out.println(palabra);
		System.out.println(palabraSecreta.getText());
	}
}
