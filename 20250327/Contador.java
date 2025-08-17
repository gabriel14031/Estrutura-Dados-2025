public class Contador{
    /* uma simples variável de instancia
     */
    private int registro;

    // O método construtor da classe
    public Contador(){
        registro = 0;
    }
    
    // Procedimento de alteração: não devolve valor
    public void incrementar(){
        registro++;
    }

    // Procedimento de alteração: não devolve valor
    public void decrementar(){
        registro--;
    }

    // Função de consulta: devolve valor
    public int getRegistro(){
        return registro;
    }

    // Procedimento de alteração do estado: não devolve valor
    public void setRegistro(int valor){
        registro = valor;
    }
}