package br.edu.ufrn.bti.banco.app;

public class Main {

	public static void main(String[] args) {
		Sistema app = new Sistema();
		
		while (!app.podeEncerrar()) {
			app.renderizar();
			app.processar();
		}

	}

}
