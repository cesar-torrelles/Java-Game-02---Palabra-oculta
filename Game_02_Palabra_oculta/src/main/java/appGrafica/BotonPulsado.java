/**
 * 
 */
package appGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * @author Víctor Lozano
 *
 */
public class BotonPulsado implements ActionListener{
	private String letra;
	private Pantalla pantalla = new Pantalla();

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("hola");
		letra = e.getActionCommand();
		System.out.println(letra);
		pantalla.compruebaLetra(letra);
	}
}
