public class ExemploGlobalEstatica {
    // Variável global estática compartilhada 
    // entre todas as instâncias
    public static int contador = 0;
    
    // Cada instância tem um id, 
    // que é definido com base no contador global
    private int id;

    public ExemploGlobalEstatica() {
        // Incrementa o contador global e 
        // define o id da instância
        id = ++contador;
    }
    
    // Exibe o id da instância e o valor atual do contador global
    public void exibirInfo() {
        System.out.println("ID desta instância: " + id);
        System.out.println("Contador global (valor estático): " + contador);
    }
    
    // Altera o contador global
    public void alterarContador(int novoValor) {
        System.out.println("Instância " + id + " alterando o contador para: " + novoValor);
        contador = novoValor;
    }
    
}