public class TesteJogoDaVelha {
    public static void main(String[] args) {
        System.out.println("Jogando para ganhar");
        // Instanciando o jogo da velha
        JogoDaVelha jogo = new JogoDaVelha();
        jogo.poePeca(1,1);
        jogo.poePeca(1,2);
        jogo.poePeca(2,1);
        jogo.poePeca(0,1);
        String primeiroJogo = jogo.toString();
        System.out.println(primeiroJogo);
   }
}