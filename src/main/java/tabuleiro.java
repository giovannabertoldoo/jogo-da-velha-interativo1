public class Tabuleiro {

    private char[][] tabuleiro;

    public Tabuleiro() {

        tabuleiro = new char[3][3];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }

    public void mostrar() {

        for(int i = 0; i < 3; i++) {

            for(int j = 0; j < 3; j++) {

                System.out.print(tabuleiro[i][j] + " ");
            }

            System.out.println();
        }
    }

    public void marcar(int linha, int coluna, char simbolo) {

        if(tabuleiro[linha][coluna] == '-') {
            tabuleiro[linha][coluna] = simbolo;
        }
    }

    public boolean acabouOJogo() {

        for(int i = 0; i < 3; i++) {

            if(tabuleiro[i][0] != '-'
                    && tabuleiro[i][0] == tabuleiro[i][1]
                    && tabuleiro[i][1] == tabuleiro[i][2]) {

                return true;
            }
        }

        for(int j = 0; j < 3; j++) {

            if(tabuleiro[0][j] != '-'
                    && tabuleiro[0][j] == tabuleiro[1][j]
                    && tabuleiro[1][j] == tabuleiro[2][j]) {

                return true;
            }
        }

        if(tabuleiro[0][0] != '-'
                && tabuleiro[0][0] == tabuleiro[1][1]
                && tabuleiro[1][1] == tabuleiro[2][2]) {

            return true;
        }

        if(tabuleiro[0][2] != '-'
                && tabuleiro[0][2] == tabuleiro[1][1]
                && tabuleiro[1][1] == tabuleiro[2][0]) {

            return true;
        }

        return false;
    }
}