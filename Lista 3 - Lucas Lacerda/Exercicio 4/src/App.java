import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int calculadora = Integer.parseInt(JOptionPane.showInputDialog(
                "Escolha uma opção \n" + "1 - Soma \n" + "2 - Subtração \n" + "3 - Multiplicação \n" + "4 - Divisao"));

        if (calculadora == 1)

        {
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do primeiro número"));
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do segundo número"));
            int resultado = numero1 + numero2;
            JOptionPane.showMessageDialog(null, "A soma dos números: " + resultado);
        } else if (calculadora == 2) {
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do primeiro número"));
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do segundo número"));
            int resultado = numero1 - numero2;
            JOptionPane.showMessageDialog(null, "A subtração dos números: " + resultado);

        } else if (calculadora == 3) {
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do primeiro número"));
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do segundo número"));
            int resultado = numero1 * numero2;
            JOptionPane.showMessageDialog(null, "A multiplicação dos números: " + resultado);
        } else if (calculadora == 4) {
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do primeiro número"));
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do segundo número"));
            int resultado = numero1 / numero2;
            JOptionPane.showMessageDialog(null, "A divisão dos números: " + resultado);
        }
    }
}
