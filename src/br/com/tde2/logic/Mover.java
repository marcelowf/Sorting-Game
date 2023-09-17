package br.com.tde2.logic;

import java.util.Scanner;

import br.com.tde2.structure.Pilha;

public class Mover {
	private Pilha pilha1;
	private Pilha pilha2;
	private Pilha pilha3;

	public Mover(Pilha pilha1, Pilha pilha2, Pilha pilha3) {
		this.pilha1 = pilha1;
		this.pilha2 = pilha2;
		this.pilha3 = pilha3;
	}

	public void moverPilhas(Scanner scanner) {
		int escolhaPilaParaDesempilhar;
		int escolhaPilhaParaEmpilhar;
		int valorDesempilhado = 0;

		do {
			System.out.println("Qual pilha deseja desempilhar? (1, 2 ou 3)");
			escolhaPilaParaDesempilhar = scanner.nextInt();
			if (escolhaPilaParaDesempilhar < 1 || escolhaPilaParaDesempilhar > 3) {
				System.out.println("Essa pilha não existe");
			} else {
				Pilha pilhaOrigem = getPilha(escolhaPilaParaDesempilhar);
				if (pilhaOrigem.pilhaVazia()) {
					System.out.println("Pilha vazia");
				} else {
					valorDesempilhado = pilhaOrigem.pop();
				}
			}

		} while (escolhaPilaParaDesempilhar < 1 || escolhaPilaParaDesempilhar > 3 || valorDesempilhado == 0);

		do {
			System.out.println("Qual a pilha de destino? (1, 2 ou 3)");
			escolhaPilhaParaEmpilhar = scanner.nextInt();

			if (escolhaPilhaParaEmpilhar < 1 || escolhaPilhaParaEmpilhar > 3
					|| escolhaPilhaParaEmpilhar == escolhaPilaParaDesempilhar) {
				System.out.println("Essa pilha não existe ou está sendo desempilhada");
			} else {
				Pilha pilhaDestino = getPilha(escolhaPilhaParaEmpilhar);
				if (pilhaDestino.pilhaCheia()) {
					System.out.println("Pilha cheia");
				} else {
					pilhaDestino.push(valorDesempilhado);
				}
			}

		} while (escolhaPilhaParaEmpilhar < 1 || escolhaPilhaParaEmpilhar > 3
				|| escolhaPilhaParaEmpilhar == escolhaPilaParaDesempilhar);
	}

	private Pilha getPilha(int escolha) {
		Pilha pilhaSelecionada = null;
		if (escolha == 1) {
			pilhaSelecionada = pilha1;
		} else if (escolha == 2) {
			pilhaSelecionada = pilha2;
		} else {
			pilhaSelecionada = pilha3;
		}
		return pilhaSelecionada;
	}
}