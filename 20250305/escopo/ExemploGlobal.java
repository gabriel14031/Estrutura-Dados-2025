import javax.swing.JOptionPane;

public class ExemploGlobal {
    // Global variable declared at class level
    private int globalNumber;

    // Method that uses the global variable
    public void displayNumber() {
        System.out.println("Global number is: " + globalNumber);
    }

    public void coletaValor() {
        globalNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
    }


}