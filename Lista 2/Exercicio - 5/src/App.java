import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String num1 = JOptionPane.showInputDialog("Informe o primeiro número: ");
        String num2 = JOptionPane.showInputDialog("Informe o segundo número: ");
        int conversao1 = Integer.parseInt(num1);
        int conversao2 = Integer.parseInt(num2);
        if (conversao1 > conversao2) {
            JOptionPane.showMessageDialog(null, conversao2 + " " + conversao1);
        } else {
            JOptionPane.showMessageDialog(null, conversao1 + " " + conversao2);
        }
    }
}
