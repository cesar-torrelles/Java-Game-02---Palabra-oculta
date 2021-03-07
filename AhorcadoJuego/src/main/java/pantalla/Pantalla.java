/**
 * 
 */
package pantalla;

import java.awt.Color;
import metodos.Metodos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

/**
 * @author Victor Lozano Cesar Torrelles 
 *
 */
public class Pantalla extends JFrame {
	/**
	 * declaracion de todos los elementos que se usaran
	 */
	private static final long serialVersionUID = 1L;
	public static int foto = 0;
	public static String palabra;
	public static JLabel palabraSecreta;
	public static JLabel imagenLabel;
	private JPanel contentPane;
	public static JPanel pistasPanel;
	public static JButton btnA;
	public static JButton btnB;
	public static JButton btnC;
	public static JButton btnD;
	public static JButton btnE;
	public static JButton btnF;
	public static JButton btnG;
	public static JButton btnH;
	public static JButton btnI;
	public static JButton btnJ;
	public static JButton btnK;
	public static JButton btnL;
	public static JButton btnM;
	public static JButton btnN;
	public static JButton btn—;
	public static JButton btnO;
	public static JButton btnP;
	public static JButton btnQ;
	public static JButton btnR;
	public static JButton btnS;
	public static JButton btnT;
	public static JButton btnU;
	public static JButton btnV;
	public static JButton btnW;
	public static JButton btnX;
	public static JButton btnY;
	public static JButton btnZ;
	public static JButton btnPista;
	protected static JPanel palabraSecretaPanel;
	public static JPanel tecladoPanel;
	protected static JPanel menuPanel;
	public static JPanel imagenesPanel;
	protected static JList<String> list;
	public static DefaultListModel<String> listaDiez;
	public static JButton btnIniciarJuego;
	public static JLabel intentosFallidos;
	public static JToggleButton vida1;
	public static JToggleButton vida2;
	public static JToggleButton vida3;
	public static JToggleButton vida4;
	public static JToggleButton vida5;
	public static JPanel vidasPanel;
	public static int numeroVidasElegido;
	private static String[] eleccionPista = { "No", "Si" };
	public static int pista = 0;
	public static String[] vidas = { "1", "2", "3", "4", "5" };

	// Creacion deL CONTENEDOR PANTALLA
	public Pantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// creacion del MENU PANEL
		menuPanel = new JPanel();
		menuPanel.setBounds(10, 11, 221, 158);
		contentPane.add(menuPanel);
		menuPanel.setLayout(null);

		// Creacion del MENU Archivo
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		// Creacion del MENU JUEGO
		JMenu NewMenuJuego = new JMenu("Juego");
		menuBar.add(NewMenuJuego);

		// Accion del MENU ITEM SALIR
		JMenuItem MenuItemSalir = new JMenuItem("Salir");
		MenuItemSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Preguntamos al usuario se realmente desea salir de la partida
				int salir = JOptionPane.showConfirmDialog(null, "Deseas finalizar el Juego? ", "Salir",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

				if (salir == 0) {
					System.exit(0);
				} else
					;
			}
		});
		NewMenuJuego.add(MenuItemSalir);

		// Accion del NUEVO JUEGO ITEM
		JMenuItem MenuItemNuevoJuego = new JMenuItem("Nuevo Juego");
		MenuItemNuevoJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// llamamos al metodo de iniciar el juego
				Metodos.iniciarJuego();

			}
		});
		NewMenuJuego.add(MenuItemNuevoJuego);

		// Creacion del menu AYUDA
		JMenu NewMenuAyuda1 = new JMenu("Ayuda");
		menuBar.add(NewMenuAyuda1);

		// Creacion del MENU ITEM COMO JUGAR
		JMenuItem MenuItemComoJugar = new JMenuItem("Como jugar");
		MenuItemComoJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// indicamos las instrucciones del juego
				JOptionPane.showMessageDialog(null, "Instrucciones: " + "\n1. Has de darle al boton iniciar juego "
						+ "\n2. Aparecen los espacios de las letras  de una palabra oculta "
						+ "\n3. Has de adivinar la palabra pulsando en el teclado de palabras que hay abajo "
						+ "\n4. Si te equivocas, el ahorcado se ira completando "
						+ "\n5. Tienes 10 intentos antes de que se complete el ahorcado "
						+ "\n6. Puedes usar las pistas las cuales te descubriran una letra, tienes una pista por partida"
						+ "\n7. al principio del juego puedes elegir hasta 5 vidas, cada vez que solicitas una pista perderas una vida "
						+ "\n8. cada vez que pierdes la partida, perderas una vida ");

			}
		});
		NewMenuAyuda1.add(MenuItemComoJugar);

		// Creacion del MENU ITEM ACERCA DE
		JMenuItem MenuItemAcercaDe = new JMenuItem("Acerca de ");
		MenuItemAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// indicamos los creditos del juego
				JOptionPane.showMessageDialog(null, "Juego del Ahorcado creado en Java con Swing y AWT "
						+ "\n \nCreadores: \nVictor Lozano, Cesar Torrelles, Giovanny Rodriguez" + "\n Version 1.0");

			}
		});
		NewMenuAyuda1.add(MenuItemAcercaDe);

		// Creacion del MENU ITEM PALABRAS, para poder introducir palabras en el
		// diccionario
		JMenuItem menuItemAÒadirPalabras = new JMenuItem("AÒadir palabras");
		menuItemAÒadirPalabras.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String palabra = JOptionPane.showInputDialog(null, "Introduce una palabra nueva al diccionario");
				listaDiez.addElement(palabra.toUpperCase());

				// imprimimos la lista para poder verla
				System.out.println(listaDiez);
			}
		});
		NewMenuJuego.add(menuItemAÒadirPalabras);

		// Creacion del BOTON para INICIAR EL JUEGO
		//
		btnIniciarJuego = new JButton("Iniciar juego");
		btnIniciarJuego.setBounds(10, 11, 201, 55);
		menuPanel.add(btnIniciarJuego);

		// creacion del BOTON PISTA
		btnPista = new JButton("Pista");
		btnPista.setBounds(10, 77, 201, 55);
		menuPanel.add(btnPista);
		btnPista.setVisible(false);

		// evento click que da accion al boton
		btnPista.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {

				if (pista == 0) {
					// Pregunta si desea la pista a cambio de una vida
					pista = Metodos.darOpciones(eleccionPista,
							"ADVERTENCIA: øDeseas perder una vida a cambio de una pista? ");

					// En caso de que si la desee sucede el codigo siguiente
					if (pista == 1) {
						foto = foto + pista;
						Metodos.elegirImagen(foto);

						// Da la pista
						int i = 0;
						String pistaLetra;

						do {
							pistaLetra = (palabraSecreta.getText().contains(palabra.substring(i, i + 1))) ? "n"
									: palabra.substring(i, i + 1);
							i++;
						} while (palabraSecreta.getText().contains(palabra.substring(i - 1, i - 1 + 1)));
						Metodos.compruebaLetra(pistaLetra);

						// Al dar la pista se consume una vida
						numeroVidasElegido -= 1;

						// desaparece esa vida mediante el metodo "numeroDeVidas"
						Metodos.numeroDeVidas(numeroVidasElegido);

					}

				} else {
					// Si ya se ha consumido las ayudas de la partida aparecera el siguiente
					// mensaje:
					JOptionPane.showMessageDialog(null, "No hay mas ayudas disponibles");
				}
			}
		});

		// Creacion de JPANELS TECLADO Y BOTONES
		tecladoPanel = new JPanel();
		tecladoPanel.setBounds(10, 361, 221, 189);
		tecladoPanel.setToolTipText("Teclado");
		contentPane.add(tecladoPanel);
		tecladoPanel.setLayout(null);
		tecladoPanel.setVisible(false);

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

		btn— = new JButton("— ");
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

		// creacion del Panel donde va el boton PISTA
		pistasPanel = new JPanel();
		pistasPanel.setBounds(10, 182, 221, 158);
		contentPane.add(pistasPanel);
		pistasPanel.setLayout(null);

		// creacion del Panel donde va la PALABRA SECRETA
		palabraSecretaPanel = new JPanel();
		palabraSecretaPanel.setBounds(10, 93, 201, 54);
		pistasPanel.add(palabraSecretaPanel);
		palabraSecretaPanel.setLayout(null);

		// creacion de la etiqueta donde va la PALABRA SECRETA
		palabraSecreta = new JLabel();
		palabraSecreta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		palabraSecreta.setBounds(10, 11, 181, 32);
		palabraSecretaPanel.add(palabraSecreta);

		// creacion del panel de las VIDAS
		vidasPanel = new JPanel();
		vidasPanel.setBounds(10, 6, 205, 90);
		pistasPanel.add(vidasPanel);
		vidasPanel.setLayout(null);
		vidasPanel.setVisible(false);

		// creacion de la etiqueta de Intentos Fallidos
		intentosFallidos = new JLabel();
		intentosFallidos.setBounds(6, 2, 144, 22);
		vidasPanel.add(intentosFallidos);

		// Creacion de los Botones donde van las VIDAS
		vida1 = new JToggleButton("1");
		vida1.setForeground(Color.RED);
		vida1.setBackground(Color.RED);
		vida1.setBounds(6, 26, 44, 22);
		vidasPanel.add(vida1);

		vida2 = new JToggleButton("2");
		vida2.setBounds(76, 26, 44, 22);
		vidasPanel.add(vida2);
		vida2.setForeground(Color.RED);
		vida2.setBackground(Color.RED);

		vida3 = new JToggleButton("3");
		vida3.setForeground(Color.RED);
		vida3.setBackground(Color.RED);
		vida3.setBounds(155, 26, 44, 22);
		vidasPanel.add(vida3);

		vida4 = new JToggleButton("4");
		vida4.setForeground(Color.RED);
		vida4.setBackground(Color.RED);
		vida4.setBounds(41, 67, 44, 22);
		vidasPanel.add(vida4);

		vida5 = new JToggleButton("5");
		vida5.setForeground(Color.RED);
		vida5.setBackground(Color.RED);
		vida5.setBounds(118, 67, 44, 22);
		vidasPanel.add(vida5);

		// creacion del PANEL DE LAS IMAGENES
		imagenesPanel = new JPanel();
		imagenesPanel.setBounds(241, 11, 333, 539);
		contentPane.add(imagenesPanel);
		imagenesPanel.setLayout(null);
		imagenesPanel.setVisible(false);

		// creacion de la etiqueta de las IMAGENES
		imagenLabel = new JLabel();
		imagenLabel.setBounds(10, 11, 313, 517);
		imagenesPanel.add(imagenLabel);

		// Creacion de un JLIST de palabras que el jugador debe acertar (NO ES VISIBLE)
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

	}

}
