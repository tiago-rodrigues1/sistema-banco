package br.edu.ufrn.bti.banco.app;

import java.util.ArrayList;

import br.edu.ufrn.bti.banco.classes.Conta;

public class Sistema {
	private int operacaoAtual = 0;
	private Menu menu = new Menu();
	private int id = 101;
	private ArrayList<Conta> contas = new ArrayList<Conta>();

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
