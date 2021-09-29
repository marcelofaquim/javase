/**
 * Poo - Abstracao Hernca e Polimorfismo
 * @author Marcelo.faquim Dos Anjos
 */



package carros;

import java.util.Random;

public class Carro {

	public Carro() {
		String chassi = new String("0123456789ABDCEFGHIJKLMNOPQRSTUVXWYZ");
		Random gerador = new Random();
		System.out.print("* ");
		for (int i = 0; i < 16; i++) {
			char numeracao = (char) gerador.nextInt(chassi.length());
			System.out.print(chassi.charAt(numeracao));
		}
		System.out.println(" *");
	}

	public int ano;
	public String cor;

	/**
	 * Ligar
	 */
	public void ligar() {
		System.out.println("Motor ligado.....................");
	}

	/**
	 * Desligar
	 */
	public void desligar() {
		System.out.println("Motor desligado.");
	}

	/**
	 * Acelerar
	 */
	public void acelerar() {
		System.out.println("Vrummmmmmmmmmmmmm");
	}
}
