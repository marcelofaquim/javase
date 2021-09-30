package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		/**
		 * Set serve para dar nome ou numero para a variavel
		 */
		cc1.setCliente("Marcelo Faquim");
		cc1.setSaldo(25000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirsaldo();
		cc1.sacar(12000);
		cc1.exibirsaldo();
		cc1.depositar(250);
		cc1.exibirsaldo();
		System.out.println("--------------------------------");
		Conta cc2 = new Conta();
		cc2.setCliente("Monica Faquim");
		cc2.setSaldo(5000);
		cc2.sacar(1000);
		cc2.exibirsaldo();
		cc2.depositar(5000);
		cc2.exibirsaldo();
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirsaldo();
		System.out.println("--------------------------------");
		System.out.println("transferencia");
		System.out.println("");
		cc1.transferir(cc2, 2000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirsaldo();
		System.out.println("Favorecido: " + cc2.getCliente());
		cc2.exibirsaldo();
		System.out.println("--------------------------------");
	}

}
