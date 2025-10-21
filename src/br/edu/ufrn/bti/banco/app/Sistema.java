package br.edu.ufrn.bti.banco.app;

import java.util.ArrayList;

import br.edu.ufrn.bti.banco.classes.Conta;

public class Sistema {
	private int operacaoAtual = 0;
	private Menu menu = new Menu();
	private int id = 101;
	private ArrayList<Conta> contas = new ArrayList<Conta>();
	
	private Conta buscarConta(String numero) {
		for (Conta c : this.contas) {
			if (c.getNumero().equals(numero)) {
				return c;
			}
		}
		
		return null;
	}

	public void processar() {
		switch (this.operacaoAtual) {
			case 1: {
				Conta c = menu.getConta();
				
				if (c != null) {
					c.setNumero(Integer.toString(id));
					contas.add(c);
					
					id += 1;
					System.out.println("> Conta criada com sucesso!");
				}
				
				break;
			}
			
			case 2: {
				String numero = menu.getNumeroConta();
				Conta c = this.buscarConta(numero);
				
				if (c == null) {
					System.out.println(">>> ERRO: Conta não encontrada");
					return;
				}
				
				double valor = menu.getValor();
				
				if (valor > 0) {
					c.depositar(valor);
					System.out.println("> Depósito realizado com sucesso!");
				}
				
				break;
			}
			
			case 5: {
				if (contas.size() == 0) {
					System.out.println("> Ainda não há contas cadastradas");
					return;
				}
				
				for (Conta c : contas) {
					c.mostrar();
				}
				
				break;
			}
			
			default:
				break;
		}
	}

	public void renderizar() {
		this.operacaoAtual = menu.getOperacao();
	}

	public boolean podeEncerrar() {
		return this.operacaoAtual == 7;
	}
}
