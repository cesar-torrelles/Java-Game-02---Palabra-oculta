package mainApp;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import metodos.Metodos;
import pantalla.Pantalla;

public class Main {
	
	
	//Clase Main donde invocaremos todos los elementos del juego
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla frame = new Pantalla();
					
					
					//Iniciamos el juego al pulsar el boton de inicio
					Pantalla.btnIniciarJuego.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							
							Metodos.iniciarJuego();	
							Metodos.menuNivel();
							Metodos.cuantasVidas();
						}

					});
					
					
					//Cuando se pulsan las teclas del teclado estas se deshabilitan
					ActionListener click = new ActionListener() {
						
						
						public void actionPerformed(ActionEvent e) {
							String letra;
							JButton boton = (JButton) e.getSource();
							letra = boton.getText();
							boton.setEnabled(false);
							Metodos.compruebaLetra(letra);
						}
					};
					Pantalla.btnA.addActionListener(click);
					Pantalla.btnB.addActionListener(click);
					Pantalla.btnC.addActionListener(click);
					Pantalla.btnD.addActionListener(click);
					Pantalla.btnE.addActionListener(click);
					Pantalla.btnF.addActionListener(click);
					Pantalla.btnG.addActionListener(click);
					Pantalla.btnH.addActionListener(click);
					Pantalla.btnI.addActionListener(click);
					Pantalla.btnJ.addActionListener(click);
					Pantalla.btnK.addActionListener(click);
					Pantalla.btnL.addActionListener(click);
					Pantalla.btnM.addActionListener(click);
					Pantalla.btnN.addActionListener(click);
					Pantalla.btn—.addActionListener(click);
					Pantalla.btnO.addActionListener(click);
					Pantalla.btnP.addActionListener(click);
					Pantalla.btnQ.addActionListener(click);
					Pantalla.btnR.addActionListener(click);
					Pantalla.btnS.addActionListener(click);
					Pantalla.btnT.addActionListener(click);
					Pantalla.btnU.addActionListener(click);
					Pantalla.btnV.addActionListener(click);
					Pantalla.btnW.addActionListener(click);
					Pantalla.btnX.addActionListener(click);
					Pantalla.btnY.addActionListener(click);
					Pantalla.btnZ.addActionListener(click);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

}
