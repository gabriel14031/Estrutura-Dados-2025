import javax.swing.JOptionPane;

public class MainJOption {
    public static void main(String[] args) {


        float valorInicial = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor para iniciar a calculadora"));

        Calculadora calc = new Calculadora(valorInicial);
        String mensagem = "Valor digitado: " + calc.valor;
        JOptionPane.showMessageDialog(null, mensagem);


    }
}
