import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
            soma = soma + numero;
        }
        JOptionPane.showMessageDialog(null, "A soma dos 10 números são: " + soma);
    }
}
