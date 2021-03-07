package metodos;

import pantalla.Pantalla;

import javax.swing.ImageIcon;

import java.awt.Image;

import javax.swing.JOptionPane;

public class Metodos {

	// MEOTODO que realiza el inicio del Juego
	public static void iniciarJuego() {

		menuNivel();
		cuantasVidas();
		Pantalla.palabraSecreta.setText("");
		Pantalla.tecladoPanel.setVisible(true);
		Pantalla.imagenesPanel.setVisible(true);
		Pantalla.pistasPanel.setVisible(true);
		Pantalla.btnPista.setVisible(true);
		Pantalla.vidasPanel.setVisible(true);
		elegirPalabra();
		activarBotones();
	}

	// METODO para saber las vidas con las que se empieza
	public static void cuantasVidas() {

		// @giorocor Metodo para solicitar vidas
		int numeroString = darOpciones(Pantalla.vidas, " Cantidad de vidas: ");
		Pantalla.numeroVidasElegido = numeroString + 1;

		// llamamos al Metodo para hacer visible los cuadros rojos de las vidas
		numeroDeVidas(Pantalla.numeroVidasElegido);
	}

	// METODO para hacer visible los cuadros rojos de las vidas del jugador
	public static void numeroDeVidas(int num) {

		// usamos como input el metodo de numero de vidas elegido, que recoje la
		// eleccion de vidas del usuario
		switch (Pantalla.numeroVidasElegido) {

		case 1:
			Pantalla.btnPista.setVisible(false);
			Pantalla.vida1.setVisible(true);
			Pantalla.vida2.setVisible(false);
			Pantalla.vida3.setVisible(false);
			Pantalla.vida4.setVisible(false);
			Pantalla.vida5.setVisible(false);

			break;
		case 2:
			Pantalla.vida1.setVisible(true);
			Pantalla.vida2.setVisible(true);
			Pantalla.vida3.setVisible(false);
			Pantalla.vida4.setVisible(false);
			Pantalla.vida5.setVisible(false);
			break;
		case 3:
			Pantalla.vida1.setVisible(true);
			Pantalla.vida2.setVisible(true);
			Pantalla.vida3.setVisible(true);
			Pantalla.vida4.setVisible(false);
			Pantalla.vida5.setVisible(false);
			break;
		case 4:
			Pantalla.vida1.setVisible(true);
			Pantalla.vida2.setVisible(true);
			Pantalla.vida3.setVisible(true);
			Pantalla.vida4.setVisible(true);
			Pantalla.vida5.setVisible(false);
			break;
		case 5:
			Pantalla.vida1.setVisible(true);
			Pantalla.vida2.setVisible(true);
			Pantalla.vida3.setVisible(true);
			Pantalla.vida4.setVisible(true);
			Pantalla.vida5.setVisible(true);
			break;
		default:
			Pantalla.vida1.setVisible(false);
			Pantalla.vida2.setVisible(false);
			Pantalla.vida3.setVisible(false);
			Pantalla.vida4.setVisible(false);
			Pantalla.vida5.setVisible(false);
			break;

		}

	}

	// METODO donde recogemos el valor del nivel escogido por el jugador
	private static void menuNivel() {

		String niveles[] = { "Junior", "Medio", "Avanzado" };

		Object respuesta = JOptionPane.showInputDialog(null, "Elige tu nivel", "Nivel de juego",
				JOptionPane.QUESTION_MESSAGE, null, niveles, niveles[0]);
		String nivelDelJugador = String.valueOf(respuesta);
		nivelElegido(nivelDelJugador);

	}

	// METODO para cambiar la imagen en funcion del nivel del jugador
	// recogemos los datos del metodo "nivelDelJugador"
	public static int nivelElegido(String nivelDelJugador) {

		int nivel = 0;
		switch (nivelDelJugador) {
		case "Junior":
			Pantalla.foto = 0;
			elegirImagen(Pantalla.foto);

			break;
		case "Medio":
			Pantalla.foto = 2;
			elegirImagen(Pantalla.foto);

			break;
		case "Avanzado":
			Pantalla.foto = 4;
			elegirImagen(Pantalla.foto);
			break;
		}
		return nivel;
	}

	// METODO que realiza la accion de elegir la palabra que el jugador debe
	// adivinar y reinicia la imagen
	public static void siguientePalabra() {
		Pantalla.palabraSecreta.setText("");
		elegirPalabra();
		Pantalla.pista = 0;
		elegirImagen(Pantalla.foto = 0);
		activarBotones();
	}

	// METODO para habilitar y deshabilitar todos los botones a la vez

	public static void activarBotones() {
		Pantalla.btnA.setEnabled(true);
		Pantalla.btnB.setEnabled(true);
		Pantalla.btnC.setEnabled(true);
		Pantalla.btnD.setEnabled(true);
		Pantalla.btnE.setEnabled(true);
		Pantalla.btnF.setEnabled(true);
		Pantalla.btnG.setEnabled(true);
		Pantalla.btnH.setEnabled(true);
		Pantalla.btnI.setEnabled(true);
		Pantalla.btnJ.setEnabled(true);
		Pantalla.btnK.setEnabled(true);
		Pantalla.btnL.setEnabled(true);
		Pantalla.btnM.setEnabled(true);
		Pantalla.btnN.setEnabled(true);
		Pantalla.btn—.setEnabled(true);
		Pantalla.btnO.setEnabled(true);
		Pantalla.btnP.setEnabled(true);
		Pantalla.btnQ.setEnabled(true);
		Pantalla.btnR.setEnabled(true);
		Pantalla.btnS.setEnabled(true);
		Pantalla.btnT.setEnabled(true);
		Pantalla.btnU.setEnabled(true);
		Pantalla.btnV.setEnabled(true);
		Pantalla.btnW.setEnabled(true);
		Pantalla.btnX.setEnabled(true);
		Pantalla.btnY.setEnabled(true);
		Pantalla.btnZ.setEnabled(true);
	}

	// METODO que realiza una seleccion random de la palabra que el jugador debera
	// adivinar
	public static void elegirPalabra() {

		// llamamos a la palabra de la lista creada por defecto "listaDiez"
		int random = (int) (Math.random() * Pantalla.listaDiez.getSize());
		Pantalla.palabra = Pantalla.listaDiez.get(random);

		for (int i = 0; i < Pantalla.palabra.length(); i++) {
			Pantalla.palabraSecreta.setText(Pantalla.palabraSecreta.getText() + " _");
		}
	}

	// METODO donde comprobamos que la letra escogida por el jugador es correcta
	// y donde vamos cambiando la imagen en funcion de si el jugador acierta, gana o
	// pierde
	// llamando al metodo "ganadorPerdedor"
	public static void compruebaLetra(String letra) {

		String resultado = "";
		String palabraLabel = Pantalla.palabraSecreta.getText();
		Pantalla.palabraSecreta.setText("");
		boolean esta = false;
		boolean acertado = true;
		for (int j = 0; j < Pantalla.palabra.length(); j++) {
			if (Pantalla.palabra.charAt(j) == letra.charAt(0)) {
				resultado = resultado + " " + letra;
				esta = true;

			} else if (palabraLabel.charAt(j * 2 + 1) >= 'A' && palabraLabel.charAt(j * 2 + 1) <= 'Z') {
				resultado = resultado + " " + palabraLabel.charAt(j * 2 + 1);
			} else {
				resultado = resultado + " _";
				acertado = false;
			}
		}

		Pantalla.palabraSecreta.setText(resultado);
		if (!esta) {
			Pantalla.foto++;

			if (Pantalla.foto == 9) {
				elegirImagen(Pantalla.foto);

				// al decimo intento da por perdido la partida
			} else if (Pantalla.foto == 10) {
				elegirImagen(Pantalla.foto);
				ganadorPerdedor(false);

				// en caso contrario sigue el juego y cambiara la imagen del ahorcado
			} else {
				elegirImagen(Pantalla.foto);
			}
		}
		if (acertado) { // Si estan todas las letras correctas pasa true
			ganadorPerdedor(true);
		}
	}

	// METODO que realiza la eleccion de la imagen en funcion de la cantidad de
	// intentos que quedan
	public static void elegirImagen(int numero) {

		ImageIcon img = new ImageIcon(Pantalla.class.getResource("/Imagenes/Vida" + numero + ".jpg"));
		Image imagen = img.getImage();
		Image newSize = imagen.getScaledInstance(440, 400, Image.SCALE_SMOOTH);
		img = new ImageIcon(newSize);
		Pantalla.imagenLabel.setIcon(img);
		Pantalla.imagenLabel.repaint();
		Pantalla.intentosFallidos.setText(String.valueOf("Intentos fallidos: " + (Pantalla.foto) + "/10"));

	}

	// METODO de accion cuando se gana o se pierde
	// Si se gana aparece la imagen de ganador y si se pierde la de perdedor
	private static void ganadorPerdedor(boolean ganador) {

		if (ganador) {
			ImageIcon img = new ImageIcon(Pantalla.class.getResource("/Imagenes/winner.jpg"));
			Image imagen = img.getImage();
			Image newSize = imagen.getScaledInstance(340, 400, Image.SCALE_SMOOTH);
			img = new ImageIcon(newSize);
			Pantalla.imagenLabel.setIcon(img);
			Pantalla.imagenLabel.repaint();

			// mensaje de reinicio del juego despues de ganar o perder
			int reiniciar = JOptionPane.showConfirmDialog(null, "°Felicidades! °Has Ganado!, øQuieres seguir Jugado? ",
					"Reinicio", JOptionPane.YES_NO_OPTION);
			if (reiniciar == JOptionPane.YES_OPTION) {
				iniciarJuego();
			} else {
				System.exit(0);
			}

		} else {
			ImageIcon img = new ImageIcon(Pantalla.class.getResource("/Imagenes/perdedor.jpg"));
			Image imagen = img.getImage();
			Image newSize = imagen.getScaledInstance(340, 400, Image.SCALE_SMOOTH);
			img = new ImageIcon(newSize);
			Pantalla.imagenLabel.setIcon(img);
			Pantalla.imagenLabel.repaint();

			Pantalla.numeroVidasElegido -= 1;
			numeroDeVidas(Pantalla.numeroVidasElegido);

			if (Pantalla.numeroVidasElegido == 0) {

				// mensaje de reinicio del juego despues de perder todas las vidas
				int reiniciar = JOptionPane.showConfirmDialog(null,
						"°Has perdido todas las vidas... y deberias estar programando!  øAun asi...Quieres volver a empezar? ",
						"Reinicio", JOptionPane.YES_NO_OPTION);
				if (reiniciar == JOptionPane.YES_OPTION) {
					iniciarJuego();
				} else {
					System.exit(0);

				}

			}
		}

	}

	// METODO que determina las opciones de vida que desea el jugador al inicio del
	// juego
	public static int darOpciones(String[] opciones, String textoOpciones) {
		int opcion = JOptionPane.showOptionDialog(null, textoOpciones, "Selector de opciones: ",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		return opcion;
	}

}
