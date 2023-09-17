package br.com.tde2.logic;

import br.com.tde2.structure.Pilha;

public class ConfereOrdem {

	// Método para verificar e imprimir a ordem (crescente e decrescente) da pilha.
	public void verificarOrdem(Pilha pilha, String nome) {
		verificarEImprimirOrdemCrescente(pilha, nome);
		verificarEImprimirOrdemDecrescente(pilha, nome);
	}

	private void verificarEImprimirOrdemCrescente(Pilha pilha, String nomePilha) {
		boolean status = pilha.conferirOrdemCrescente();
		if (status) {
			System.out.println(nomePilha + " está ordenada em Ordem Crescente!");
		}
	}

	private void verificarEImprimirOrdemDecrescente(Pilha pilha, String nomePilha) {
		boolean status = pilha.conferirOrdemDecrescente();
		if (status) {
			System.out.println(nomePilha + " está ordenada em Ordem Decrescente!");
		}
	}
}
