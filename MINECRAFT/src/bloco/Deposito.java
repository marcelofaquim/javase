package bloco;

public class Deposito {

	public static void main(String[] args) {

		Inventario blocograma = new Inventario();
		blocograma.textura = "1";
		blocograma.resistencia = "Grama";
		System.out.println("Inventario: Bloco de Grama");
		System.out.println("Resistencia : " + blocograma.resistencia);
		System.out.println("Textura :" + blocograma.textura);
		blocograma.construir();
		blocograma.minerar();

		System.out.println("____________________");

		Inventario blocomadeira = new Inventario();
		blocomadeira.textura = "2";
		blocomadeira.resistencia = "Madeira";
		System.out.println("Inventario: Bloco de Madeira");
		System.out.println("Resistencia : " + blocomadeira.resistencia);
		System.out.println("Textura :" + blocomadeira.textura);
		blocomadeira.construir();
		blocomadeira.minerar();
		blocomadeira.craftar();

	}
}
