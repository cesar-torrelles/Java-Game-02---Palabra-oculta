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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

/**
 * @author Víctor Lozano
 *
 */
public class Pantalla extends JFrame {
	private static int foto;
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
	private static JButton btn�;
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
	private static JButton btnPista;
	private static JPanel palabraSecretaPanel;
	private static JPanel tecladoPanel;
	private static JPanel menuPanel;
	private static JPanel imagenesPanel;
	private static JList<String> list;
	private static DefaultListModel<String> listaDiez;
	private static JButton btnIniciarJuego;
	private static JLabel intentosFallidos;
	private static JToggleButton vida1;
	private static JToggleButton vida2;
	private static JToggleButton vida3;
	private static JToggleButton vida4;
	private static JToggleButton vida5;
	
	private static JPanel vidasPanel;
	private static String nivelDelJugador;
	private static int numeroVidasElegido;

	// 16 @giorocor crear opciones de input pista
	private static String[] eleccionPista = { "No", "Si" };
	private static int pista = 0;
	private static String[] vidas = {"1","2","3","4","5" };

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
					
					
					// SE DESHABILITA LA LETRA CUANDO SE PULSA - 7.1
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
					btn�.addActionListener(click);
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

		// LOGICA MENU SALIR - CESAR - 9.1
		JMenuItem MenuItemSalir = new JMenuItem("Salir");
		MenuItemSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 9.2
			int salir =	JOptionPane.showConfirmDialog(null, "Deseas finalizar el programa? ", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				
				if (salir==0) {
				System.exit(0);
				}
				else;
			}
		});

		NewMenuJuego.add(MenuItemSalir);

		//  NUEVO JUEGO EN EL MENU ARCHIVO - CESAR - 9.4
		JMenuItem MenuItemNuevoJuego = new JMenuItem("Nuevo Juego");
		MenuItemNuevoJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				iniciarJuego();
			
			}
		});
		
	
		NewMenuJuego.add(MenuItemNuevoJuego);
		
		
		//MENU DE AYUDA - 11
		JMenu NewMenuAyuda1 = new JMenu("Ayuda");
		menuBar.add(NewMenuAyuda1);

		
		//  MENU COMO JUGAR - CESAR - 11/11.1
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

		// 'ACERCA DE' - CESAR - 12/12.1
		JMenuItem MenuItemAcercaDe = new JMenuItem("Acerca de ");
		MenuItemAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Juego del Ahorcado creado en Java con Swing y AWT "
						+ "\n \nCreadores: \nVictor Lozano, Cesar Torrelles, Giovanny");

			}
		});
		NewMenuAyuda1.add(MenuItemAcercaDe);
		
		
		//ANADIR PALABRAS AL DICCIONARIO. VICTOR - 15
		JMenuItem menuItemAñadirPalabras = new JMenuItem("Anadir palabras");
		menuItemAñadirPalabras.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String palabra = JOptionPane.showInputDialog(null,"Introduce una palabra nueva al diccionario");
				listaDiez.addElement(palabra);
			}
		});
		NewMenuJuego.add(menuItemAñadirPalabras);
		
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		// PANEL DE PISTA - 4.0
				menuPanel = new JPanel();
				menuPanel.setBounds(10, 11, 221, 158); // revisar luego dimensiones
				contentPane.add(menuPanel);
				menuPanel.setLayout(null);

				
				
				
				
				
				
				// BOTON PISTA - 4.1  
				btnPista = new JButton("Pista");
				btnPista.setBounds(10, 77, 201, 55);
				menuPanel.add(btnPista);
				btnPista.setVisible(false);
		
				// 16 @giorocor agrega evento click para dar pista
				btnPista.addMouseListener(new MouseAdapter() {

					@Override
					public void mouseClicked(MouseEvent e) {
							
						//@giorocor Pregunta si desea la pista
					
						//@giorocor En caso de que si la desee sucede el codigo siguiente
						if (pista == 0) {
							//@giorocorQuita una vida
							pista = darOpciones(eleccionPista, "ADVERTENCIA: ¿Deseas perder una vida a cambio de una pista? ");
							
							if (pista == 1) {
								foto = foto + pista;
								elegirImagen(foto);
								
								//@giorocor Da la pista
							    int i=0;
							    String pistaLetra;
							
							    
								do {
									pistaLetra=(palabraSecreta.getText().contains(palabra.substring(i,i+1)))?"n":palabra.substring(i,i+1);
									i++;
								}while(palabraSecreta.getText().contains(palabra.substring(i-1,i-1+1)));
								compruebaLetra(pistaLetra);
						
								
								// 16Al dar la pista se consume una vida del ahorcado  - 16.3
								numeroVidasElegido -=1; 
								numeroDeVidas(numeroVidasElegido);
							}

						} else {
							// 16 si ya se ha consumido las ayudas aparecera este mensaje
							JOptionPane.showMessageDialog(null, "No hay mas ayudas disponibles");
						}
					}
				});
		
		
		

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

		btnÑ  = new JButton("Ñ ");
		btnÑ.setBounds(74, 78, 39, 39);
		tecladoPanel.add(btnÑ );

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
		btnÑ.setFont(new Font("Calibri", Font.PLAIN, 8));
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

		
		
		
		// BOTONES DE VIDAS    - 3
		vidasPanel = new JPanel();
		vidasPanel.setBounds(10, 6, 205, 90);
		pistasPanel.add(vidasPanel);
		vidasPanel.setLayout(null);
		
		intentosFallidos = new JLabel();
		intentosFallidos.setBounds(6, 2, 144, 22);
		vidasPanel.add(intentosFallidos);

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
		// HASTA AQUI LAS VIDAS

		
		
		imagenesPanel = new JPanel();
		imagenesPanel.setBounds(241, 11, 333, 539);
		contentPane.add(imagenesPanel);
		imagenesPanel.setLayout(null);

		// imagenlABEL - VICTOR
		imagenLabel = new JLabel();
		imagenLabel.setBounds(10, 11, 313, 517);
		imagenesPanel.add(imagenLabel);

		
		
		// JLIST DE PALABRAS PARA ACERTAR - 5
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

		// BOTON DE INICIAR EL JUEGO - 
		btnIniciarJuego = new JButton("Iniciar juego");
		btnIniciarJuego.setBounds(10, 11, 201, 55);
		menuPanel.add(btnIniciarJuego);
		tecladoPanel.setVisible(false);
		imagenesPanel.setVisible(false);
		pistasPanel.setVisible(false);
		

	}

	// METODO ELECCION DE IMAGEN - 7.2
	public static void elegirImagen(int numero) {
		
		ImageIcon img = new ImageIcon(Pantalla.class.getResource("/Imagenes/Vida" + numero + ".jpg"));
		Image imagen = img.getImage();
		Image newSize = imagen.getScaledInstance(440, 400, Image.SCALE_SMOOTH);
		img = new ImageIcon(newSize);
		imagenLabel.setIcon(img);
		imagenLabel.repaint();
		intentosFallidos.setText(String.valueOf("Intentos fallidos: "+(foto)+"/10"));

	}

	// METODO PARA COMPROBAR LA LETRA - 7
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
		palabraSecreta.setText(resultado);
		if (!esta) {
			foto++;
			
			// 16 @giorocor oculta boton de pista en la ultima vida 16
			if (foto == 9) {
					elegirImagen(foto);
					btnPista.setVisible(false);
			// 16 @giorocor al decimo intento da por perdido la partida
			} else if(foto==10){
					elegirImagen(foto);
					ganadorPerdedor(false); 
			// en caso contrario sigue el juego y cambiara la imagen del ahorcado
			}else {
					elegirImagen(foto);
			}
		}
		if (acertado) { // Si estan todas las letras correctas pasa true
			ganadorPerdedor(true);
		}
	}
	


	/**
	 * @param Pone imagen ganador o perdedor
	 */
	
	
	// METODO DE ACCION CUANDO SE GANA O SE PIERDE - 8.1
	// si se gana aparece la imagen de ganador y si se pierde la de perdedor
	private static void ganadorPerdedor(boolean ganador) {
		if (ganador) {
			ImageIcon img = new ImageIcon(Pantalla.class.getResource("/Imagenes/winner.jpg"));
			Image imagen = img.getImage();
			Image newSize = imagen.getScaledInstance(340, 400, Image.SCALE_SMOOTH);
			img = new ImageIcon(newSize);
			imagenLabel.setIcon(img);
			imagenLabel.repaint();
		} else {
			ImageIcon img = new ImageIcon(Pantalla.class.getResource("/Imagenes/perdedor.jpg"));
			Image imagen = img.getImage();
			Image newSize = imagen.getScaledInstance(340, 400, Image.SCALE_SMOOTH);
			img = new ImageIcon(newSize);
			imagenLabel.setIcon(img);
			imagenLabel.repaint();
		}
		
		//mensaje de reinicio del juego despues de ganar o perder - 8.3
		int reiniciar = JOptionPane.showConfirmDialog(null, "¿Quieres seguir Jugado? ", "Reinicio",
				JOptionPane.YES_NO_OPTION);
		if (reiniciar == JOptionPane.YES_OPTION) {
			siguientePalabra();
		} else {
			System.exit(0);
		}
	}

	
	// MEOTODO INICIO JUEGO
	private static void iniciarJuego() {

		menuNivel();	 
		cuantasVidas();	 
		palabraSecreta.setText("");
		tecladoPanel.setVisible(true);
		imagenesPanel.setVisible(true);
		pistasPanel.setVisible(true);
		btnPista.setVisible(true);
		elegirPalabra();
		activarBotones();
	}
	
	//@giorocor seleccion ramdon de la palabra a adivinar
	public static void elegirPalabra() {
		int random = (int) (Math.random() * listaDiez.getSize());
		palabra = listaDiez.get(random);
		
		for (int i = 0; i < palabra.length(); i++) {
			palabraSecreta.setText(palabraSecreta.getText() + " _");
		}
	}
		
		
		
	
	
	// METODO  HABILITAR/DESHABILITAR TODOS LOS BOTONES A LA VEZ - 1

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
		btnÑ.setEnabled(true);
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
	
	
	
	//@giorocor
	public static void siguientePalabra() {
		palabraSecreta.setText("");
		elegirPalabra();
		pista=0;
		elegirImagen(foto);
		activarBotones();
	}
	
	
	//metodo para saber las vidas con las que se empieza
	 public static void cuantasVidas() {
		  //@giorocor Metodo para solicitar vidas
		 int numeroString = darOpciones(vidas, "Cantidad de vidas: ");
		 numeroVidasElegido = numeroString+1;
			 //@giorocor Metodo para hacer visible cuadros de vidas dada 
		 numeroDeVidas(numeroVidasElegido);
	}
	
	//NUMERO DE VIDAS DISPONIBLES - 3.1
	public static void numeroDeVidas(int num) {
		
			
			switch (numeroVidasElegido) {
			
			case 1:
				vida1.setVisible(true);
				vida2.setVisible(false);
				vida3.setVisible(false);
				vida4.setVisible(false);
				vida5.setVisible(false);
				break;
			case 2:
				vida1.setVisible(true);
				vida2.setVisible(true);
				vida3.setVisible(false);
				vida4.setVisible(false);
				vida5.setVisible(false);
				break;
			case 3:
				vida1.setVisible(true);
				vida2.setVisible(true);
				vida3.setVisible(true);
				vida4.setVisible(false);
				vida5.setVisible(false);
				break;
			case 4:
				vida1.setVisible(true);
				vida2.setVisible(true);
				vida3.setVisible(true);
				vida4.setVisible(true);
				vida5.setVisible(false);
				break;
			case 5:
				vida1.setVisible(true);
				vida2.setVisible(true);
				vida3.setVisible(true);
				vida4.setVisible(true);
				vida5.setVisible(true);
				break;
			default:
				vida1.setVisible(false);
				vida2.setVisible(false);
				vida3.setVisible(false);
				vida4.setVisible(false);
				vida5.setVisible(false);
				break;
				
		}	
		
	}
  
	
	// 13 @giorocor para crear menu de eleccion -13
	//METODO PARA SELECCIONAR EL NIVEL 
	private static void menuNivel () {
	
		String niveles[] ={"Junior","Medio","Avanzado"};

		 Object respuesta = JOptionPane.showInputDialog(null,"Elige tu nivel", "Nivel de juego",JOptionPane.QUESTION_MESSAGE,null,niveles, niveles[0]);
		 String nivelDelJugador = String.valueOf(respuesta);
		 nivelElegido(nivelDelJugador);

	}
	 
	 
	
		// IMAGENES DISPONIBLES segun el nivel - 14
		public static int nivelElegido(String nivelDelJugador) {
			
		int nivel=0;
			switch (nivelDelJugador) {
			case "Junior":
				foto = 1;
				elegirImagen(foto);
				
				break;
			case "Medio":
				foto = 2;
				elegirImagen(foto);
				
				break;
			case "Avanzado":
				foto= 4;
				elegirImagen(foto);
				break;
			}
			return nivel;
		}
	 
		// 16 @giorocor Cuadro de opcion SI o NO
		public static int darOpciones(String[] opciones, String textoOpciones) {
			int opcion = JOptionPane.showOptionDialog(null, textoOpciones, "Selector de opciones",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
			return opcion;
		}
}
