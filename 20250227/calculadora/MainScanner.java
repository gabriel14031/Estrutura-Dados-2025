import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor para iniciar a calculadora (formato ddd,d): ");
        float valor = scanner.nextFloat();
        Calculadora calc = new Calculadora(10);
        
        int opcao = 0;
        while (opcao != 5) {
            System.out.println("Digite a operação desejada: ");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser somado: ");
                    calc.somar(scanner.nextFloat());
                    break;
                case 2:
                    System.out.println("Digite o valor a ser subtraído: ");
                    calc.subtrair(scanner.nextFloat());
                    break;
                case 3:
                    System.out.println("Digite o valor a ser multiplicado: ");
                    calc.multiplicar(scanner.nextFloat());
                    break;
                case 4:
                    System.out.println("Digite o valor a ser dividido: ");
                    calc.dividir(scanner.nextFloat());
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

        System.out.println(calc.valor);
    }
}
