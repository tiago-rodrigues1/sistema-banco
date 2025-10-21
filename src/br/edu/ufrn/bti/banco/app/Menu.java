package br.edu.ufrn.bti.banco.app;

import java.util.Scanner;

import br.edu.ufrn.bti.banco.classes.Conta;
import br.edu.ufrn.bti.banco.classes.ContaCorrente;
import br.edu.ufrn.bti.banco.classes.ContaPoupanca;

public class Menu {
	private Scanner scanner = new Scanner(System.in);
	
	public int getOperacao() {
		System.out.println("\n========================================");
		System.out.println("                 IMD BANK               ");
		System.out.println("========================================");

		System.out.println("[1] Criar conta");
		System.out.println("[2] Realizar depósito");
		System.out.println("[3] Realizar  saque");
		System.out.println("[4] Realizar  transferência");
		System.out.println("[5] Listar  contas");
		System.out.println("[6] Calcular total de tributos");
		System.out.println("[7] Sair");
		
		System.out.print("\n> Escolha uma opção: ");

		int op = scanner.nextInt();
		
		return op;
	}
	
	public Conta getConta() {
		scanner.nextLine();
		
		System.out.println("> Nome do cliente [-c para voltar]:");
		String nome = scanner.nextLine();
		
		if (nome.isEmpty()) {
			System.out.println(">>> ERRO: Nome não pode ser vazio");
			return null;
		} else if (nome.equalsIgnoreCase("-c")) {
			return null;
		}
		
		
		System.out.println("> Selecione o tipo de conta");
		System.out.println(" [1] Conta corrente");
		System.out.println(" [2] Conta poupança");
		System.out.println("\n> Tipo de conta:");
		int tipoConta = scanner.nextInt();
		
		Conta c = null;
		
		if (tipoConta == 1) {
			c = new ContaCorrente(nome);
		} else if (tipoConta == 2) {
			c = new ContaPoupanca(nome);
		} else {
			System.out.println(">>> ERRO: Valor inválido");
		}
		
		return c;
	}
	
	public String getNumeroConta() {
		scanner.nextLine();
		
		System.out.println("> Número da conta [-c para voltar]:");
		String numero = scanner.nextLine();
		
		if (numero.isEmpty()) {
			System.out.println(">>> ERRO: Número da conta não pode ser vazio");
			return null;
		} else if (numero.equalsIgnoreCase("-c")) {
			return null;
		}
		
		return numero;
	}
	
	public double getValor() {		
		System.out.println("> Valor:");
		double valor = scanner.nextDouble();
		
		if (valor <= 0) {
			System.out.println(">>> ERRO: Valor inválido");
			return -1;
		}
		
		return valor;
	}

}
