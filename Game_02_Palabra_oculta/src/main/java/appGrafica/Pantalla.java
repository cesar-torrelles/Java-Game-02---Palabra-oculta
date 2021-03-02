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
import java.awt.event.ActionEvent;

/**
 * @author Víctor Lozano
 *
 */
public class Pantalla extends JFrame {
	static int foto = 1;
	static String palabra;
	static JLabel palabraSecreta;
	static JLabel imagenLabel;
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

		final JButton btnB = new JButton("B");
		btnB.setBounds(38, 0, 39, 39);
		tecladoPanel.add(btnB);

		final JButton btnC = new JButton("C");
		btnC.setBounds(74, 0, 39, 39);
		tecladoPanel.add(btnC);

		final JButton btnD = new JButton("D");
		btnD.setBounds(110, 0, 39, 39);
		tecladoPanel.add(btnD);

		final JButton btnE = new JButton("E");
		btnE.setBounds(147, 0, 39, 39);
		tecladoPanel.add(btnE);

		final JButton btnF = new JButton("F");
		btnF.setBounds(183, 0, 39, 39);
		tecladoPanel.add(btnF);

		final JButton btnG = new JButton("G");
		btnG.setBounds(0, 40, 39, 39);
		tecladoPanel.add(btnG);

		final JButton btnH = new JButton("H");
		btnH.setBounds(38, 40, 39, 39);
		tecladoPanel.add(btnH);

		final JButton btnI = new JButton("I");
		btnI.setBounds(74, 40, 39, 39);
		tecladoPanel.add(btnI);

		final JButton btnJ = new JButton("J");
		btnJ.setBounds(110, 40, 39, 39);
		tecladoPanel.add(btnJ);

		final JButton btnK = new JButton("K");
		btnK.setBounds(147, 40, 39, 39);
		tecladoPanel.add(btnK);

		final JButton btnL = new JButton("L");
		btnL.setBounds(183, 40, 39, 39);
		tecladoPanel.add(btnL);

		final JButton btnM = new JButton("M");
		btnM.setBounds(0, 78, 39, 39);
		btnM.setFont(new Font("Arial", Font.PLAIN, 9));
		tecladoPanel.add(btnM);

		final JButton btnN = new JButton("N");
		btnN.setBounds(38, 78, 39, 39);
		tecladoPanel.add(btnN);

		final JButton btnÑ = new JButton("Ñ");
		btnÑ.setBounds(74, 78, 39, 39);
		tecladoPanel.add(btnÑ);

		final JButton btnO = new JButton("O");
		btnO.setBounds(110, 78, 39, 39);
		btnO.setFont(new Font("Arial", Font.PLAIN, 9));
		tecladoPanel.add(btnO);

		final JButton btnP = new JButton("P");
		btnP.setBounds(147, 78, 39, 39);
		tecladoPanel.add(btnP);

		final JButton btnQ = new JButton("Q");
		btnQ.setBounds(183, 78, 39, 39);
		btnQ.setFont(new Font("Arial", Font.PLAIN, 9));
		tecladoPanel.add(btnQ);

		final JButton btnR = new JButton("R");
		btnR.setBounds(0, 116, 39, 39);
		tecladoPanel.add(btnR);

		final JButton btnS = new JButton("S");
		btnS.setBounds(38, 116, 39, 39);
		tecladoPanel.add(btnS);

		final JButton btnT = new JButton("T");
		btnT.setBounds(74, 116, 39, 39);
		tecladoPanel.add(btnT);

		final JButton btnU = new JButton("U");
		btnU.setBounds(110, 116, 39, 39);
		tecladoPanel.add(btnU);

		final JButton btnV = new JButton("V");
		btnV.setBounds(147, 116, 39, 39);
		tecladoPanel.add(btnV);

		final JButton btnW = new JButton("W");
		btnW.setBounds(183, 116, 39, 39);
		btnW.setFont(new Font("Arial", Font.PLAIN, 8));
		tecladoPanel.add(btnW);

		final JButton btnX = new JButton("X");
		btnX.setBounds(61, 150, 39, 39);
		tecladoPanel.add(btnX);

		final JButton btnY = new JButton("Y");
		btnY.setBounds(98, 150, 39, 39);
		tecladoPanel.add(btnY);

		final JButton btnZ = new JButton("Z");
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

		palabraSecreta = new JLabel("");
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

		imagenLabel = new JLabel();
		elegirImagen(foto);
		imagenLabel.setBounds(10, 11, 313, 517);
		imagenesPanel.add(imagenLabel);

		JList<String> list = new JList<String>();
		final DefaultListModel<String> listaDiez = new DefaultListModel<String>();
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
				palabra = listaDiez.get(random);
				for (int i = 0; i < palabra.length(); i++) {
					palabraSecreta.setText(palabraSecreta.getText() + " _");
				}
				btnA.addActionListener(new BotonPulsado());
				btnB.addActionListener(new BotonPulsado());
				btnC.addActionListener(new BotonPulsado());
				btnD.addActionListener(new BotonPulsado());
				btnE.addActionListener(new BotonPulsado());
				btnF.addActionListener(new BotonPulsado());
				btnG.addActionListener(new BotonPulsado());
				btnH.addActionListener(new BotonPulsado());
				btnI.addActionListener(new BotonPulsado());
				btnJ.addActionListener(new BotonPulsado());
				btnK.addActionListener(new BotonPulsado());
				btnL.addActionListener(new BotonPulsado());
				btnM.addActionListener(new BotonPulsado());
				btnN.addActionListener(new BotonPulsado());
				btnÑ.addActionListener(new BotonPulsado());
				btnO.addActionListener(new BotonPulsado());
				btnP.addActionListener(new BotonPulsado());
				btnQ.addActionListener(new BotonPulsado());
				btnR.addActionListener(new BotonPulsado());
				btnS.addActionListener(new BotonPulsado());
				btnT.addActionListener(new BotonPulsado());
				btnU.addActionListener(new BotonPulsado());
				btnV.addActionListener(new BotonPulsado());
				btnW.addActionListener(new BotonPulsado());
				btnX.addActionListener(new BotonPulsado());
				btnY.addActionListener(new BotonPulsado());
				btnZ.addActionListener(new BotonPulsado());
			}
			

		});
		btnIniciarJuego.setBounds(10, 11, 201, 55);
		menuPanel.add(btnIniciarJuego);
	}

	public void elegirImagen(int numero) {
		System.out.println(numero);
		ImageIcon img = new ImageIcon(Pantalla.class.getResource("/Imagenes/Imagen" + numero + ".png"));
		Image imagen = img.getImage();
		Image newSize = imagen.getScaledInstance(440, 400, Image.SCALE_SMOOTH);
		img = new ImageIcon(newSize);
		imagenLabel.setIcon(img);
		imagenLabel.repaint();

	}

	public void compruebaLetra(String letra) {
		palabraSecreta.setText("");
		boolean esta = false;
		for (int j = 0; j < palabra.length(); j++) {
			if (palabra.charAt(j) == letra.charAt(0)) {
				palabraSecreta.setText(palabraSecreta.getText() + " " + letra);
				esta = true;
			} else {
				palabraSecreta.setText(palabraSecreta.getText() + " _");
			}
		}
		if (!esta) {
			foto++;
			elegirImagen(foto);
		}
		System.out.println(palabra);
		System.out.println(palabraSecreta.getText());
	}
	
}
