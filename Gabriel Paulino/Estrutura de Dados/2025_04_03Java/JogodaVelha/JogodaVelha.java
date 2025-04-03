package JogodaVelha;
public class JogodaVelha{
    protected static final int X = 1, O = -1;   //Definindo os Xs e Os
    protected static final int VAZIO = 0;   //Definindo o espaço em branco
    protected int tabuleiro[][] = new int[3][3];    //Criando o tabuleiro
    protected int jogador;  //Definindo o jogador; Setando se ele é X ou O
    /*Construtor*/
    public JogodaVelha() {limpaTabuleiro();}
    
    //Limpando o tabuleiro; Deixando o tabuleiro vazio
    public void limpaTabuleiro(){
            for (int i = 0; i < 3; i++){ //Linha
                for (int j = 0; j < 3; j++){ //Coluna
                    tabuleiro[i][j] = VAZIO;
                }
            }
            jogador = X;
        }
    
    //Posiciona X/O no espaço do tabuleiro
    public void poePeca(int i,int j) throws IllegalArgumentException {
        if ((i<0) || (i>2) || (j<0) || (j>2)){
            throw new IllegalArgumentException("Posição inválida");
        }
    if (tabuleiro[i][j] != VAZIO) throw new IllegalArgumentException("Posição usada");
    tabuleiro[i][j] = jogador;  //Insere a marca do jogador (X/O)
    jogador = -jogador;
    }

    //Verificando quem ganhou
    public boolean eVencedor(int marca){
        return ((tabuleiro[0][0] + tabuleiro[0][1] + tabuleiro[0][2] == marca*3)) //Linha 0: -
        || ((tabuleiro[1][0] + tabuleiro[1][1] + tabuleiro[1][2] == marca*3)) //Linha 1: -
        || ((tabuleiro[2][0] + tabuleiro[2][1] + tabuleiro[2][2] == marca*3)) //Linha 2: -
        || ((tabuleiro[0][0] + tabuleiro[1][0] + tabuleiro[2][0] == marca*3)) //Coluna 0: |
        || ((tabuleiro[0][1] + tabuleiro[1][1] + tabuleiro[2][1] == marca*3)) //Coluna 1: _|
        || ((tabuleiro[0][2] + tabuleiro[1][2] + tabuleiro[2][2] == marca*3)) //Coluna 2: __|
        || ((tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2] == marca*3)) //Diagonal Esqurda-Direita: \
        || ((tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][1] == marca*3)); //Diagonal Direita-Esquerda: /
    }

    //Retorna quem ganhou ou se há um empate
    public int vencedor(){
        if (eVencedor(X))
            return(X);
        else if(eVencedor(O))
            return(O);
        else
            return(0);
    }
}