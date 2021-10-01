package bloco;

public class Inventario {
	public String textura;
	public String resistencia;

	// construtores
	public Inventario() {
		System.out.println("================================");
	}

	// metodos
	public void construir() {
		System.out.println("Construido");
	}

	public void craftar() {
		System.out.println("Transformando em item");
	}

	public void minerar() {
		System.out.println("Mineirando o objeto");
	}
}
