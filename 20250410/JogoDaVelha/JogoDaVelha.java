public class JogoDaVelha {
    protected static final int X = 1, O = -1;
    protected static final int VAZIO = 0;
    protected int tabuleiro[][] = new int[3][3];
    protected int jogador;

    public JogoDaVelha() {
        limpaTabuleiro();
    }


    public void limpaTabuleiro() {
        for(int i = 0;i<3;i++) {
            for (int j=0; j<3; j++) {
                tabuleiro[i][j]=VAZIO;
            }
        }
        jogador = X;
    }

    public void poePeca(int i, int j) {
        if (i<0||i>2||j<0||j>2){
            throw new IllegalArgumentException("Posição Inválida");
        }
        if (tabuleiro[i][j]!=VAZIO) throw new IllegalArgumentException("Posição Ocupada");
        tabuleiro[i][j]=jogador;
        jogador = -jogador;
    }

    public boolean eVencedor(int marca) {
        return ((tabuleiro[0][0] + tabuleiro[0][1] + tabuleiro[0][2] == marca*3) 	// linha 0 
|| (tabuleiro[1][0] + tabuleiro[1][1] + tabuleiro[1][2] == marca*3) 			// linha 1 
|| (tabuleiro[2][0] + tabuleiro[2][1] + tabuleiro[2][2] == marca*3) 			// linha 2 
|| (tabuleiro[0][0] + tabuleiro[1][0] + tabuleiro[2][0] == marca*3) 			// coluna 0 
|| (tabuleiro[0][1] + tabuleiro[1][1] + tabuleiro[2][1] == marca*3) 			// coluna 1 
|| (tabuleiro[0][2] + tabuleiro[1][2] + tabuleiro[2][2] == marca*3) 			// coluna 2 
|| (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2] == marca*3) 			// diagonal 
|| (tabuleiro[2][0] + tabuleiro[1][1] + tabuleiro[0][2] == marca*3)); 		// diagonal
    }

    public int vencedor() {
        /** Implementar método indicando se há um vencedor e retornando o valor 1 ou -1
         * para indicar o vencedor ou zero para indicar empate.
         */
        return 2;
    }

    
    public String toString() {
        /** Implementar o método to String que deve retornar
         * uma string com o tabuleiro do jogo da velha com as peças
         * nas posições corretas.
         */
        String retorno = "";
        for (int i=0; i<3;i++){
            for (int j=0; j<3; j++){
                if(tabuleiro[i][j]==X) {
                    retorno += ("X");
                } else if (tabuleiro[i][j]==O) {
                    retorno += ("O");
                } else {
                    retorno += (" ");
                }
                if (j<2){
                    retorno += ("|");
                }
            }
            //System.out.println();
            if (i<2){
                retorno += ("\n-----\n");
            }

        }   
        return retorno;
    }
}