# Sorting-Game

Este projeto Java implementa um Jogo de Ordenação, onde o objetivo é organizar pilhas de números em ordem decrescente. O jogo oferece duas opções de interface: a movimentação manual das pilhas ou a resolução automática.

## Funcionalidades

- **Mover**: Permite ao usuário realizar movimentos entre as pilhas para organizar os números.
- **Auto Resolução**: Ordena automaticamente as pilhas em ordem decrescente.
- **Verificação de Ordem**: Verifica se alguma pilha atingiu a ordenação desejada.

## Como Jogar

1. Execute o programa e insira o tamanho desejado para as pilhas.
2. As pilhas serão preenchidas com números aleatórios.
3. Escolha entre as opções de interface:
    - **Mover (1)**: Realize movimentos entre as pilhas.
    - **Auto Resolução (2)**: Delegue a ordenação automática.
    - **Sair (3)**: Encerre o jogo.
4. O jogo exibirá o estado atual das pilhas após cada jogada.
5. O jogo continua até que o usuário escolha sair.

## Estrutura do Projeto

- `Main.java`: Contém a lógica principal do jogo, interagindo com as classes responsáveis pela resolução automática, movimentação e verificação de ordem.
- `AutoResolucao.java`: Implementa a lógica de resolução automática.
- `ConfereOrdem.java`: Verifica se uma pilha atingiu a ordenação desejada.
- `Mover.java`: Gerencia a movimentação de elementos entre as pilhas.
- `Pilha.java`: Representa a estrutura de pilha e inclui métodos para preenchimento aleatório e impressão.

## Execução

Certifique-se de ter o ambiente Java configurado. Execute o programa e divirta-se jogando e ordenando as pilhas!

```bash
javac Main.java
java Main
