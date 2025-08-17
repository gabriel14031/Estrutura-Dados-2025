public class Argumentos {

    public static void main(String[] args) {
        // Declaração de uma varíavel do tipo Contador
        Contador contador;

        // Criação de uma instância da classe Contador: um objeto
        contador = new Contador();
        // Vamos chamar o método altera sem efeito:
        // Valor do contador antes de chamar o método:
        System.out.println("Valor do contador antes de chamar o método sem efeito:" + contador.getRegistro());
        // Chamada do método   
        Argumentos argumentos = new Argumentos();
        argumentos.alteraSemEfeito(contador);
        // Valor do contador depois de chamar o método:
        System.out.println("Valor do contador depois de chamar o método sem efeito:" + contador.getRegistro());    

        // Vamos chamar o método altera com efeito:
        // Valor do contador antes de chamar o método: 
        System.out.println("Valor do contador antes de chamar o método com efeito:" + contador.getRegistro());
        argumentos.alteraComEfeito(contador);
        // Valor do contador depois de chamar o método:
        System.out.println("Valor do contador depois de chamar o método com efeito:" + contador.getRegistro());


    }
    

    public void alteraSemEfeito(Contador contador){
        // Aqui está sendo iniciada uma nova instância que será alterada. Ela deixa de existir ao final do método
        contador = new Contador();
        contador.setRegistro(10);
        System.out.println("Valor do contado em semEfeito:" + contador.getRegistro());
    }   

    public void alteraComEfeito(Contador contador){
        contador.setRegistro(10);
        System.out.println("Valor do contado em comEfeito:" + contador.getRegistro());
    }

}

