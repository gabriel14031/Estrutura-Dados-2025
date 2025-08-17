public class Calculadora {
    public float valor=0;

    public Calculadora (float valor){
        this.valor = valor;
    }

    public void somar(float valor){
        this.valor += valor;
    }

    public void subtrair(float valor){
        this.valor -= valor;
    }

    public void multiplicar(float valor){
        this.valor *= valor;
    }    

    public void dividir(float valor){
        this.valor /= valor;
    }
}
