package seguros;

import contas.Conta;

public class SeguroPessoaFisica extends Conta {

	public static void main(String[] args) {
		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
		cc3.setCliente("Iohanes Nascimento");
		cc3.setSaldo(200);
		System.out.println("Cliente: " + cc3.getCliente());
		cc3.exibirsaldo();
		cc3.depositar(800);
		cc3.exibirsaldo();

	}

}
