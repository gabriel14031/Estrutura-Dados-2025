public class EscopoDeBloco {
    public static void main(String args[])
    {
          // Escopo de bloco
        {
            // A variável X só existe dentro do bloco
            int x = 10;
            System.out.println(x);
        }
        
        // Tirando o comentário abaixo gera um erro de compilação
        // porque a variável x não existe fora do bloco

        // System.out.println(x); 
    } 
}
