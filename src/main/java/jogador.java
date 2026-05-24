import java.util.Scanner;

public class Jogador {

    private char simbolo;

    public Jogador(char simbolo) {
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void jogar(Tabuleiro tabuleiro) {

        Scanner scanner = new Scanner(System.in);

        int linha;
        int coluna;

        System.out.println("Jogador " + simbolo);

        System.out.print("Linha: ");
        linha = scanner.nextInt();

        System.out.print("Coluna: ");
        coluna = scanner.nextInt();

        tabuleiro.marcar(linha, coluna, simbolo);
    }
}