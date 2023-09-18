package br.com.tde2.logic;

import br.com.tde2.structure.Pilha;

public class ConfereOrdem {
	public boolean verificarOrdem(Pilha pilha, String nome) {
		if (verificarEImprimirOrdemCrescente(pilha, nome) || verificarEImprimirOrdemDecrescente(pilha, nome)) {
			return true;
		} else {
			return false;
		}
	}

	private boolean verificarEImprimirOrdemCrescente(Pilha pilha, String nomePilha) {
		boolean status = pilha.conferirOrdemCrescente();
		if (status) {
			System.out.println(nomePilha + " está ordenada em Ordem Crescente!");
		}
		return status;
	}

	private boolean verificarEImprimirOrdemDecrescente(Pilha pilha, String nomePilha) {
		boolean status = pilha.conferirOrdemDecrescente();
		if (status) {
			System.out.println(nomePilha + " está ordenada em Ordem Decrescente!");
		}
		return status;
	}
}
