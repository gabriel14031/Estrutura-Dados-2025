/**
 * Implementação de uma Árvore Binária de Busca.
 * Foco em operações recursivas para inserção, busca e remoção.
 * * @author Equipe da Disciplina
 * @version 2025.08.14
 */
import java.util.Comparator;

public class ArvoreBinariaAlternativa<T extends Comparable<T>> implements Arvore<T> {
    private NodoArvore<T> raiz;
    private Comparator<T> comparator;

    /**
     * Construtor da árvore. Inicia uma árvore vazia sem Comparator.
     */
    public ArvoreBinariaAlternativa() {
        this.raiz = null;
        this.comparator = null; // Usa o compareTo padrão
    }

    /**
     * Construtor da árvore com um Comparator.
     * @param comparator Comparator para definir a ordem dos elementos.
     */
    public ArvoreBinariaAlternativa(Comparator<T> comparator) {
        this.raiz = null;
        //Permite a entrada de um comparator
        this.comparator = comparator;
    }

    // --- MÉTODO DE INSERÇÃO ---

    @Override
    public void inserir(T objeto) {
        this.raiz = inserirRecursivo(this.raiz, objeto);
    }

    private NodoArvore<T> inserirRecursivo(NodoArvore<T> noAtual, T objeto) {
        if (noAtual == null) {
            return new NodoArvore<>(objeto);
        }

        int comparacao = comparar(objeto, noAtual.objeto);

        if (comparacao < 0) {
            noAtual.filhoEsquerda = inserirRecursivo(noAtual.filhoEsquerda, objeto);
        } else if (comparacao > 0) {
            noAtual.filhoDireita = inserirRecursivo(noAtual.filhoDireita, objeto);
        }

        return noAtual;
    }

    // --- MÉTODO DE PESQUISA ---

    @Override
    public NodoArvore<T> pesquisa(T objeto) {
        return pesquisaRecursivo(this.raiz, objeto);
    }

    private NodoArvore<T> pesquisaRecursivo(NodoArvore<T> noAtual, T objeto) {
        if (noAtual == null) {
            return null;
        }

        int comparacao = comparar(objeto, noAtual.objeto);

        if (comparacao == 0) {
            return noAtual;
        } else if (comparacao < 0) {
            return pesquisaRecursivo(noAtual.filhoEsquerda, objeto);
        } else {
            return pesquisaRecursivo(noAtual.filhoDireita, objeto);
        }
    }

    // --- MÉTODO AUXILIAR PARA COMPARAÇÃO ---

    private int comparar(T objeto1, T objeto2) {
        if (this.comparator != null) {
            return this.comparator.compare(objeto1, objeto2);
        } else if (objeto1 instanceof Comparable) {
            return ((Comparable<T>) objeto1).compareTo(objeto2);
        } else {
            throw new IllegalArgumentException("Os objetos não são comparáveis e nenhum Comparator foi fornecido.");
        }
    }
// --- MÉTODO DE IMPRESSÃO (CAMINHAMENTO) ---
    
    @Override
    public void remover(T objeto) {
        this.raiz = removerRecursivo(this.raiz, objeto);
    }

    /**
     * Método auxiliar recursivo para remover um nó da árvore.
     * * @param noAtual O nó raiz da subárvore atual.
     * 
     * @param objeto O valor a ser removido.
     * @return O nó raiz da subárvore modificada.
     */
    private NodoArvore<T> removerRecursivo(NodoArvore<T> noAtual, T objeto) {
        // Caso base: se a árvore estiver vazia ou o nó não for encontrado.
        if (noAtual == null) {
            return null;
        }

        int comparacao = noAtual.objeto.compareTo(objeto);

        // Procura o nó a ser removido
        if (comparacao > 0) {
            noAtual.filhoEsquerda = removerRecursivo(noAtual.filhoEsquerda, objeto);
            return noAtual;
        } else if (comparacao < 0) {
            noAtual.filhoDireita = removerRecursivo(noAtual.filhoDireita, objeto);
            return noAtual;
        } else { // O nó foi encontrado.
            // Caso 1: Nó com no máximo um filho.
            if (noAtual.filhoEsquerda == null) {
                return noAtual.filhoDireita;
            } else if (noAtual.filhoDireita == null) {
                return noAtual.filhoEsquerda;
            }

            // Caso 2: Nó com dois filhos.
            // Encontra o menor valor na subárvore direita (sucessor).
            T menorValor = encontrarMenorValor(noAtual.filhoDireita);
            noAtual.objeto = menorValor;

            // Remove o sucessor da sua posição original.
            noAtual.filhoDireita = removerRecursivo(noAtual.filhoDireita, menorValor);
            return noAtual;
        }
    }

    /**
     * Encontra o menor valor em uma subárvore.
     * Usado para encontrar o sucessor de um nó com dois filhos.
     * * @param no O nó raiz da subárvore.
     * 
     * @return O valor do nó com o menor valor.
     */
    private T encontrarMenorValor(NodoArvore<T> no) {
        if (no.filhoEsquerda == null) {
            return no.objeto;
        } else {
            return encontrarMenorValor(no.filhoEsquerda);
        }
    }

    /**
     * Imprime os elementos da árvore usando o caminhamento pré-fixado. [cite: 7]
     * Raiz -> Esquerda -> Direita.
     */

    /**
     * Imprime os elementos da árvore usando o caminhamento pré-fixado. [cite: 7]
     * Raiz -> Esquerda -> Direita. 
     */
    @Override
    public void imprimePreFixado() {
        imprimePreFixadoRecursivo(this.raiz);
        System.out.println(); // Quebra de linha após a impressão
    }

    /**
     * Método auxiliar recursivo para o caminhamento pré-fixado.
     * @param no O nó raiz da subárvore a ser impressa.
     */
    private void imprimePreFixadoRecursivo(NodoArvore<T> no) {
        if (no != null) {
            System.out.print(no.objeto + ", ");
            imprimePreFixadoRecursivo(no.filhoEsquerda);
            imprimePreFixadoRecursivo(no.filhoDireita);
        }
    }

    /**
     * Imprime os elementos da árvore usando o caminhamento pós-fixado. [cite: 7]
     * Esquerda -> Direita -> Raiz. 
     */
    public void imprimePosFixado() {
        imprimePosFixadoRecursivo(this.raiz);
        System.out.println(); // Quebra de linha após a impressão
    }

    /**
     * Método auxiliar recursivo para o caminhamento pós-fixado.
     * @param no O nó raiz da subárvore a ser impressa.
     */
    private void imprimePosFixadoRecursivo(NodoArvore<T> no) {
        if (no != null) {
            imprimePosFixadoRecursivo(no.filhoEsquerda);
            imprimePosFixadoRecursivo(no.filhoDireita);
            System.out.print(no.objeto + ", ");
        }
    }

    /**
     * Imprime os elementos da árvore usando o caminhamento em ordem. [cite: 7]
     * Esquerda -> Raiz -> Direita. 
     */
    public void imprimeEmOrdem() {
        imprimeEmOrdemRecursivo(this.raiz);
        System.out.println(); // Quebra de linha após a impressão
    }

    /**
     * Método auxiliar recursivo para o caminhamento em ordem.
     * @param no O nó raiz da subárvore a ser impressa.
     */
    private void imprimeEmOrdemRecursivo(NodoArvore<T> no) {
        if (no != null) {
            imprimeEmOrdemRecursivo(no.filhoEsquerda);
            System.out.print(no.objeto + ", ");
            imprimeEmOrdemRecursivo(no.filhoDireita);
        }
    }
}