import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String numero1 = JOptionPane.showInputDialog("Insira o primeiro número: ");
        String numero2 = JOptionPane.showInputDialog("Insira o segundo número: ");
        int conversao1 = Integer.parseInt(numero1);
        int conversao2 = Integer.parseInt(numero2);
        int subtracao = conversao1 - conversao2;
        JOptionPane.showMessageDialog(null, subtracao);
    }
}
