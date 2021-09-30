/**
 * POO2 - Encapsulamento 
 * @author Marcelo Faquim Dos Anjos
 */

package contas;

public class Conta {

	// encapsulamento
	private double saldo;
	private String cliente;

	/**
	 * obter o saldo
	 * 
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Atribuir um valor a variavel saldo
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * obter o nome do cliente
	 * 
	 * @return cliente
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * Atribuir um valor a variavel cliente
	 * 
	 * @param cliente
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Conta() {
		System.out.println("Agência 0261");
	}

	/**
	 * Exibir o saldo da conta
	 */
	protected void exibirsaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}

	/**
	 * Debitar da conta corrente
	 * 
	 * @param valor
	 */
	protected void sacar(double valor) {
		saldo -= valor;
		System.out.println("Débito: " + valor);
	}

	/**
	 * Depositar valor a uma conta corrente
	 * 
	 * @param valor
	 */
	protected void depositar(double valor) {
		saldo += valor;
		System.out.println("Deposito: " + valor);
	}

	/**
	 * Transferencia de uma conta corrente para a outra
	 * @param destino
	 * @param valor
	 */
	protected void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferencia: R$ " + valor);
	}
}
