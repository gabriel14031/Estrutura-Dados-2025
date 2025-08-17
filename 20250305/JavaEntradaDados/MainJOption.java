import javax.swing.JOptionPane;

public class MainJOption {
    public static void main(String[] args) {


        float valorInicial = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor para iniciar a calculadora"));

        Calculadora calc = new Calculadora(valorInicial);
        String mensagem = "Valor digitado: " + calc.valor;
        JOptionPane.showMessageDialog(null, mensagem);

        int opcao = 0;
        while (true) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção desejada:\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Sair"));
            if (opcao == 5) {
                JOptionPane.showMessageDialog(null, "Resultado final: " + calc.valor + "\nSaindo...");      
                break;
            }

            float valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor para realizar a operação"));

            if (opcao == 4 && valor == 0) {
                JOptionPane.showMessageDialog(null, "Operação inválida: impossível dividir por zero");
                continue;
            } else {
                if (opcao ==1) {
                    calc.somar(valor);
                    JOptionPane.showMessageDialog(null, "Resultado da soma: " + calc.valor);
                }
                else if (opcao == 2) {
                    calc.subtrair(valor);
                    JOptionPane.showMessageDialog(null, "Resultado da subtração: " + calc.valor);
                } 
                else if (opcao == 3) {
                    calc.multiplicar(valor);
                    JOptionPane.showMessageDialog(null, "Resultado da multiplicação: " + calc.valor);
                }
                else if (opcao == 4) {
                    calc.dividir(valor);
                    JOptionPane.showMessageDialog(null, "Resultado da divisão: " + calc.valor);
                }
            }
        }
    }
}
