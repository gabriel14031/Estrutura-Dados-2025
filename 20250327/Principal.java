public class Principal {
    public static void main(String[] args) {
        // Declaração de uma varíavel do tipo Contador
        Contador contador;

        // Criação de uma instância da classe Contador: um objeto
        contador = new Contador();
        // Se a propriedade registro fosse publica, poderia ser acessada diretamente
        // contador.registro = 10;
        // Como não é, devemos usar o método setRegistro
        contador.setRegistro(10);
        // Da mesma forma, para acessar o valor de registro, devemos usar o método getRegistro
        System.out.println(contador.getRegistro());

        // Como o método foi declarado como static, não é necessário criar uma instância da classe ZeraContador
        ZeraContador.zera(contador);
        System.out.print(contador.getRegistro());
        
        // Também é possível acesscar o valorInicialPadrao diretamente, pois ele é static
        System.out.println(ZeraContador.valorInicialPadrao);
    }
}
