package br.edu.ufrn.bti.banco.classes;

public abstract class Conta {
	protected String cliente;
	protected String numero;
	protected double saldo;
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double depositar(double valor) {
		if (valor <= 0) {
			return 0;
		}
		
		this.saldo += valor;
		return this.saldo;
	}
	
	public abstract void mostrar();
	public abstract double sacar(double valor);
	public abstract double transferir(double valor, Conta conta);
	
}
