package avioes;

import carros.Carro;

public class Aviao extends Carro {

	public boolean tremPouso;
	public double envergadura;

	/**
	 * Aterrizar
	 */
	public void aterrizar() {
		System.out.println("Avi�o pousou____________");
	}

	/**
	 * Acelerar
	 */
	public void acelerar() {
		System.out.println("Avi�o decolou ___ ----");
	}
}
