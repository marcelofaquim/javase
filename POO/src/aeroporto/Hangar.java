package aeroporto;

import avioes.Aviao;

public class Hangar {

	public static void main(String[] args) {
		Aviao boeing777 = new Aviao();
		boeing777.ano = 2016;
		boeing777.cor = "Branco";
		boeing777.envergadura = 64.8;
		System.out.println("Avião: Boeing 777");
		System.out.println("Ano: " + boeing777.ano);
		System.out.println("Cor: " + boeing777.cor);
		System.out.println("Envergadura: " + boeing777.envergadura);
		boeing777.ligar();
		boeing777.acelerar();
		boeing777.aterrizar();
		System.out.println("_____________________________");
		Aviao boeing314 = new Aviao();
		boeing314.ano = 1939;
		boeing314.cor = "Azul e Preto";
		boeing314.envergadura = 46;
		boeing314.tremPouso = false;
		System.out.println("Avião: Boeing314");
		System.out.println("Ano: " + boeing314.ano);
		System.out.println("Cor: " + boeing314.cor);
		System.out.println("Envergadura: " + boeing314.envergadura);
		boeing314.ligar();
		boeing314.acelerar();
		boeing314.aterrizar();
		if (boeing314.tremPouso == true) {
			boeing314.aterrizar();
		} else {
			System.out.println("Arremeter!");
		}
	}
}
