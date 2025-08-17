public class ExemploLocal {
    // Uma variável global
    static int versao = 1;

    public void incrementaLocal(){
        // Uma variável local
        int versao = 2;
        System.out.println("Versão local: " + versao);
        System.out.println("Versão global: " + ExemploLocal.versao);
    }

    public void incrementaGlobal(){
        versao++;
        System.out.println("Versão global: " + versao);
    }

    public void cuidadoComLoops() {
        int versao = 99;
        System.out.println("Versão local: " + versao);
//        for (int versao=0;versao<5;versao++) {
        for (int i=0;i<5;i++) {
            versao = i;
            System.out.println("Versão local no loop: " + versao);
            System.out.println("Versão local na função: " + versao);
        }
    }    
}
