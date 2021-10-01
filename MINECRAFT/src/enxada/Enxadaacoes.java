package enxada;

import bloco.Inventario;

public class Enxadaacoes extends Inventario {
	
	public boolean conquista;
	
	public void arar() {
		System.out.println("Terra pronta para plantio");
		
	}
	
	public void minerar() {
		System.out.println("Você deu um dano");
	}
}
