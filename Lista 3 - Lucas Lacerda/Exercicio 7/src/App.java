import javax.swing.JOptionPane;

public class App {

    public static void expo(int num1, int num2, int resultado) {
        for (int i = num2; i >= 1; i--) {
            resultado = resultado * num1;
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void main(String[] args) throws Exception {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da base: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor exponencial: "));
        int resultado = 1;
        expo(num1, num2, resultado);
    }

}
