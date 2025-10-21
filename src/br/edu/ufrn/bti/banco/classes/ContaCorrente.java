package br.edu.ufrn.bti.banco.classes;

import br.edu.ufrn.bti.banco.interfaces.ITributavel;

public class ContaCorrente extends Conta implements ITributavel {
	
	public ContaCorrente() {}
	
	public ContaCorrente(String cliente) {
		this.setCliente(cliente);
		this.setSaldo(0);
	}

	@Override
	public double calculaTributos() {
		// TODO Auto-generated method stub
		return 0;
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
		System.out.printf("> Tipo: Conta Corrente\n");
		System.out.printf("> Cliente: %s\n", this.cliente);
		System.out.printf("> Número: %s\n", this.numero);
		System.out.printf("> Saldo: R$ %.2f\n", this.saldo);
	}
	
}
