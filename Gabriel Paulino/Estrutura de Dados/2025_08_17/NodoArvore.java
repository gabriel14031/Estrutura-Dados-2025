public class NodoArvore {
    public NodoArvore filhoEsquerda;
    public int chave;
    public NodoArvore filhoDireita;

    private NodoArvore(int chave) {
        this.chave = chave;
        this.filhoEsquerda = null;
        this.filhoDireita = null;
    }
    

}
