package br.com.tde2.main;

import java.util.Scanner;

import br.com.tde2.logic.AutoResolucao;
import br.com.tde2.logic.ConfereOrdem;
import br.com.tde2.logic.Mover;
import br.com.tde2.structure.Pilha;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int escolhaDeInterface = 0;
		int contadorDeJogadasRealizadas = 0;

		System.out.print("Digite o tamanho das pilhas: ");
		int tamanhoDasPilhas = scanner.nextInt();

		Pilha pilha1 = new Pilha(tamanhoDasPilhas);
		Pilha pilha2 = new Pilha(tamanhoDasPilhas);
		Pilha pilha3 = new Pilha(tamanhoDasPilhas);

		pilha1.preencherPilhaComInteirosAleatorios(pilha1, tamanhoDasPilhas);

		AutoResolucao resolução = new AutoResolucao();
		Mover movimentacao = new Mover(pilha1, pilha2, pilha3);
		ConfereOrdem confereOrdem = new ConfereOrdem();

		do {
			if (pilha1.tamanhoDaPilha() == tamanhoDasPilhas) {
				confereOrdem.verificarOrdem(pilha1, "pilha 1");
			} else if (pilha2.tamanhoDaPilha() == tamanhoDasPilhas) {
				confereOrdem.verificarOrdem(pilha2, "pilha 2");
			} else if (pilha3.tamanhoDaPilha() == tamanhoDasPilhas) {
				confereOrdem.verificarOrdem(pilha3, "pilha 3");
			}
			System.out.println();
			
			System.out.print("Pilha 1:");
			pilha1.printPilha();
			System.out.print("Pilha 2:");
			pilha2.printPilha();
			System.out.print("Pilha 3:");
			pilha3.printPilha();

			System.out.println("\n1. Mover\n2. Auto Resoluçao\n3. Sair");
			escolhaDeInterface = scanner.nextInt();

			if (escolhaDeInterface == 1) {
				movimentacao.moverPilhas(scanner);
				contadorDeJogadasRealizadas++;
			} else if (escolhaDeInterface == 2) {
				contadorDeJogadasRealizadas = resolução.ordenarCrescente( pilha1, pilha2, pilha3);
			} else if (escolhaDeInterface <= 0 || escolhaDeInterface >= 4) {
				System.out.println("Escolha inválida");
			}
		} while (escolhaDeInterface != 3);

		System.out.println("Jogadas usadas: " + contadorDeJogadasRealizadas);
		scanner.close();
	}
}
