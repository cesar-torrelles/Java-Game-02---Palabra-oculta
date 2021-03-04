/**
 * 
 */
package appGrafica;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

/**
 * @author V√≠ctor Lozano
 *
 */
public class Pantalla extends JFrame {
	private static int foto = 1;
	private static String palabra;
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
	private static JButton btn—;
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
							iniciarJuego();
						}

					});
					ActionListener click = new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							String letra;
							JButton boton = (JButton) e.getSource();
							letra = boton.getText();
							boton.setEnabled(false);
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
					btn—.addActionListener(click);
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

	// PANTALLA
	public Pantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// SECCION DE MENUS - CESAR
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu NewMenuJuego = new JMenu("Juego");
		menuBar.add(NewMenuJuego);

		// LOGICA MENU SALIR - CESAR
		JMenuItem MenuItemSalir = new JMenuItem("Salir");
		MenuItemSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});

		NewMenuJuego.add(MenuItemSalir);

		JMenuItem MenuItemNuevoJuego = new JMenuItem("Nuevo Juego");
		NewMenuJuego.add(MenuItemNuevoJuego);

		JMenu NewMenuAyuda1 = new JMenu("Ayuda");
		menuBar.add(NewMenuAyuda1);

		// LOGICA MENU COMO JUGAR - CESAR
		JMenuItem MenuItemComoJugar = new JMenuItem("Como jugar");
		MenuItemComoJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Instrucciones: " + "\n1. Has de darle al boton iniciar juego "
						+ "\n2. Aparecen los espacios de las letras  de una palabra oculta "
						+ "\n3. Has de adivinar la palabra pulsando en el teclado de palabras que hay abajo "
						+ "\n4. Si te equivocas, el ahorcado se ira completando "
						+ "\n5. Tienes 10 intentos antes de que se complete el ahorcado "
						+ "\n6. Puedes usar las pistas las cuales te descubriran una letra, hay un numero limitado de pistas");

			}
		});

		NewMenuAyuda1.add(MenuItemComoJugar);

		// LOGICA MENU 'ACERCA DE' - CESAR
		JMenuItem MenuItemAcercaDe = new JMenuItem("acerca de ");
		MenuItemAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Juego del Ahorcado creado en Java con Swing y AWT "
						+ "\n \nCreadores: \nVictor Lozano, Cesar Torrelles, Giovanny");

			}
		});
		NewMenuAyuda1.add(MenuItemAcercaDe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// JPANELS TECLADO Y BOTONES - VICTOR
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
		tecladoPanel.add(btnM);

		btnN = new JButton("N");
		btnN.setBounds(38, 78, 39, 39);
		tecladoPanel.add(btnN);

		btn— = new JButton("—");
		btn—.setBounds(74, 78, 39, 39);
		tecladoPanel.add(btn—);

		btnO = new JButton("O");
		btnO.setBounds(110, 78, 39, 39);
		tecladoPanel.add(btnO);

		btnP = new JButton("P");
		btnP.setBounds(147, 78, 39, 39);
		tecladoPanel.add(btnP);

		btnQ = new JButton("Q");
		btnQ.setBounds(183, 78, 39, 39);
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
		
		btnA.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnB.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnC.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnD.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnE.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnF.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnG.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnH.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnI.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnJ.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnK.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnL.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnM.setFont(new Font("Calibri", Font.PLAIN, 6));
		btnN.setFont(new Font("Calibri", Font.PLAIN, 8));
		btn—.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnO.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnP.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnQ.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnR.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnS.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnT.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnU.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnV.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnW.setFont(new Font("Calibri", Font.PLAIN, 6));
		btnX.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnY.setFont(new Font("Calibri", Font.PLAIN, 8));
		btnZ.setFont(new Font("Calibri", Font.PLAIN, 8));
		
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

		// VIDAS PANEL - CESAR
		JPanel vidasPanel = new JPanel();
		vidasPanel.setBounds(10, 6, 205, 75);
		pistasPanel.add(vidasPanel);
		vidasPanel.setLayout(null);

		JToggleButton vida1 = new JToggleButton("1");
		vida1.setForeground(Color.RED);
		vida1.setBackground(Color.RED);
		vida1.setBounds(6, 6, 44, 22);
		vidasPanel.add(vida1);

		JToggleButton vida2 = new JToggleButton("2");
		vida2.setBounds(76, 6, 44, 22);
		vidasPanel.add(vida2);
		vida2.setForeground(Color.RED);
		vida2.setBackground(Color.RED);

		JToggleButton vida3 = new JToggleButton("3");
		vida3.setForeground(Color.RED);
		vida3.setBackground(Color.RED);
		vida3.setBounds(155, 6, 44, 22);
		vidasPanel.add(vida3);

		JToggleButton vida4 = new JToggleButton("4");
		vida4.setForeground(Color.RED);
		vida4.setBackground(Color.RED);
		vida4.setBounds(41, 47, 44, 22);
		vidasPanel.add(vida4);

		JToggleButton vida5 = new JToggleButton("5");
		vida5.setForeground(Color.RED);
		vida5.setBackground(Color.RED);
		vida5.setBounds(118, 47, 44, 22);
		vidasPanel.add(vida5);
		// HASTA AQUI LAS VIDAS

		// PANEL DE PISTAS - VICTOR
		menuPanel = new JPanel();
		menuPanel.setBounds(10, 11, 221, 158); // revisar luego dimensiones
		contentPane.add(menuPanel);
		menuPanel.setLayout(null);

		// boton resolver que luego sera boton pistas
		// btnResolver = new JButton("Resolver");
		// btnResolver.setBounds(10, 77, 201, 55); //modificar luego
		// menuPanel.add(btnResolver);

		// BOTON PISTA, (MODIFICADO DE 'btnResolver')
		JButton btnPista = new JButton("Pista");
		btnPista.setBounds(10, 77, 201, 55);
		menuPanel.add(btnPista);

		imagenesPanel = new JPanel();
		imagenesPanel.setBounds(241, 11, 333, 539);
		contentPane.add(imagenesPanel);
		imagenesPanel.setLayout(null);

		// imagenlABEL - VICTOR
		imagenLabel = new JLabel();
		imagenLabel.setBounds(10, 11, 313, 517);
		imagenesPanel.add(imagenLabel);

		// JLIST DE PALABRAS PARA ACERTAR - VICTOR
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

	// METODO ELECCION DE IMAGEN - VICTOR
	public static void elegirImagen(int numero) {
		ImageIcon img = new ImageIcon(Pantalla.class.getResource("/Imagenes/Vida" + numero + ".jpg"));
		Image imagen = img.getImage();
		Image newSize = imagen.getScaledInstance(440, 400, Image.SCALE_SMOOTH);
		img = new ImageIcon(newSize);
		imagenLabel.setIcon(img);
		imagenLabel.repaint();

	}

	// METODO PARA COMPROBAR LA LETRA - VICTOR
	public static void compruebaLetra(String letra) {
		String resultado = "";
		String palabraLabel = palabraSecreta.getText();
		palabraSecreta.setText("");
		boolean esta = false;
		boolean acertado = true;
		for (int j = 0; j < palabra.length(); j++) {
			if (palabra.charAt(j) == letra.charAt(0)) {
				resultado = resultado + " " + letra;
				esta = true;
			} else if (palabraLabel.charAt(j * 2 + 1) >= 'A' && palabraLabel.charAt(j * 2 + 1) <= 'Z') {
				resultado = resultado + " " + palabraLabel.charAt(j * 2 + 1);
			} else {
				resultado = resultado + " _";
				acertado = false;
			}
		}
		if (acertado) { // Si estan todas las letras correctas pasa true
			ganadorPerdedor(acertado);
		}
		palabraSecreta.setText(resultado);
		if (!esta) {
			foto++;
			if (foto < 10) {
				elegirImagen(foto);
			} else {
				elegirImagen(foto);
				ganadorPerdedor(false); // Si llegas a la imagen 10 pierde
			}
		}
	}

	/**
	 * @param Pone imagen ganador o perdedor
	 */
	private static void ganadorPerdedor(boolean ganador) {
		if (ganador) {
			ImageIcon img = new ImageIcon(Pantalla.class.getResource("/Imagenes/winner.jpg"));
			Image imagen = img.getImage();
			Image newSize = imagen.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
			img = new ImageIcon(newSize);
			imagenLabel.setIcon(img);
			imagenLabel.repaint();
		} else {
			ImageIcon img = new ImageIcon(Pantalla.class.getResource("/Imagenes/perdedor.jpg"));
			Image imagen = img.getImage();
			Image newSize = imagen.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
			img = new ImageIcon(newSize);
			imagenLabel.setIcon(img);
			imagenLabel.repaint();
		}
		int reiniciar = JOptionPane.showConfirmDialog(null, "Quieres reiniciar el juego? ", "Reinicio",
				JOptionPane.YES_NO_OPTION);
		if (reiniciar == JOptionPane.YES_OPTION) {
			iniciarJuego();
		} else {
			System.exit(0);
		}
	}

	private static void iniciarJuego() {
		palabraSecreta.setText("");
		tecladoPanel.setVisible(true);
		imagenesPanel.setVisible(true);
		pistasPanel.setVisible(true);
		int random = (int) (Math.random() * listaDiez.getSize());
		palabra = listaDiez.get(random);
		foto = 1;
		elegirImagen(foto);
		for (int i = 0; i < palabra.length(); i++) {
			palabraSecreta.setText(palabraSecreta.getText() + " _");
		}
		activarBotones();
	}

	private static void activarBotones() {
		btnA.setEnabled(true);
		btnB.setEnabled(true);
		btnC.setEnabled(true);
		btnD.setEnabled(true);
		btnE.setEnabled(true);
		btnF.setEnabled(true);
		btnG.setEnabled(true);
		btnH.setEnabled(true);
		btnI.setEnabled(true);
		btnJ.setEnabled(true);
		btnK.setEnabled(true);
		btnL.setEnabled(true);
		btnM.setEnabled(true);
		btnN.setEnabled(true);
		btn—.setEnabled(true);
		btnO.setEnabled(true);
		btnP.setEnabled(true);
		btnQ.setEnabled(true);
		btnR.setEnabled(true);
		btnS.setEnabled(true);
		btnT.setEnabled(true);
		btnU.setEnabled(true);
		btnV.setEnabled(true);
		btnW.setEnabled(true);
		btnX.setEnabled(true);
		btnY.setEnabled(true);
		btnZ.setEnabled(true);
	}

}
