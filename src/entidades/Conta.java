package entidades;

public class Conta {
	private int numeroConta;
	private String nomeCliente;
	private double saldo;
	
	public Conta(int numeroConta, String nomeCliente) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
	}
	
	public Conta(int numeroConta, String nomeCliente, double valor) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		deposito(valor);
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque (double valor) {
		saldo -= valor + 5.00;
	}
	
	public String toString() {
		return "Numero Conta: " 
				+ numeroConta 
				+ ", Nome Cliente: " + nomeCliente
				+ ", Saldo: R$ " + String.format("%.2f", saldo);
	}
	
	
	
}
