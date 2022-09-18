import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String numero = JOptionPane.showInputDialog("Insira um número inteiro: ");
        int conversao = Integer.parseInt(numero);
        if (conversao > 10) {
            JOptionPane.showMessageDialog(null, "Maior que 10");
        } else {
            JOptionPane.showMessageDialog(null, "Menor que 10");
        }
    }
}
