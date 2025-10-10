package br.edu.ufrn.bti.banco.classes;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca() {};
	
	public ContaPoupanca(String cliente) {
		this.setCliente(cliente);
		this.setSaldo(0);
	}

	@Override
	public double sacar(double valor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double transferir(double valor, Conta conta) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void mostrar() {
		System.out.printf("> Tipo: Conta Poupança\n");
		System.out.printf("> Cliente: %s\n", this.cliente);
		System.out.printf("> Número: %s\n", this.numero);
		System.out.printf("> Saldo: R$%.2f\n", this.saldo);
	}
}
