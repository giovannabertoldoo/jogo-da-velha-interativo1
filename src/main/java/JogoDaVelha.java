import java.util.Scanner;

public class JogoDaVelha {

    private Jogador jogador1;
    private Jogador jogador2;
    private Tabuleiro tabuleiro;

    public JogoDaVelha(Jogador jogador1, Jogador jogador2, Tabuleiro tabuleiro)
    {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.tabuleiro = tabuleiro;
    }

    private void iniciar() {

        while (!tabuleiro.acabouOJogo()) {

            tabuleiro.mostrar();

            jogador1.jogar(tabuleiro);

            if(tabuleiro.acabouOJogo()) {
                break;
            }

            jogador2.jogar(tabuleiro);
        }

        tabuleiro.mostrar();

        System.out.println("Fim de jogo!");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Tabuleiro tabuleiro = new Tabuleiro();

        System.out.println("Escolha o símbolo do jogador 1 (X ou O): ");
        char simbolo = scanner.next().charAt(0);

        Jogador jogador1 = new Jogador(simbolo);

        char simbolo2;

        if(simbolo == 'X') {
            simbolo2 = 'O';
        } else {
            simbolo2 = 'X';
        }

        Jogador jogador2 = new Jogador(simbolo2);

        JogoDaVelha jogoDaVelha;

        jogoDaVelha = new JogoDaVelha(jogador1, jogador2, tabuleiro);

        jogoDaVelha.iniciar();

        scanner.close();
    }
}