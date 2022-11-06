import javax.swing.JOptionPane;

public class App {

    public static void primo(int numero, int divisores) {
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }

        }
        if (divisores == 2) {
            JOptionPane.showMessageDialog(null, "É primo");
        } else {
            JOptionPane.showMessageDialog(null, "Não é primo");
        }
    }

    public static void main(String[] args) throws Exception {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para verificar se é primo: "));
        int divisores = 0;
        primo(numero, divisores);
    }
}
