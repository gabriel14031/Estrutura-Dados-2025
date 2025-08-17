public class MainExemploGlobalEstatica {
    public static void main(String[] args) {
        // Criação de duas instâncias
        ExemploGlobalEstatica obj1 = new ExemploGlobalEstatica();
        ExemploGlobalEstatica obj2 = new ExemploGlobalEstatica();
        
        // Exibe as informações iniciais
        System.out.println("Após criação das instâncias:");
        obj1.exibirInfo();
        obj2.exibirInfo();
        
        // Alteração do contador global pela primeira instância
        System.out.println("\nAlterando o contador através de obj1:");
        obj1.alterarContador(100);
        
        // Exibe informações após alteração do contador
        System.out.println("\nApós alteração do contador:");
        obj1.exibirInfo();
        obj2.exibirInfo();
        
        // Criando uma nova instância para ver o efeito da alteração global
        ExemploGlobalEstatica obj3 = new ExemploGlobalEstatica();
        System.out.println("\nApós criação de uma nova instância obj3:");
        obj3.exibirInfo();
    }
  
}
