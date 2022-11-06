import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor: "));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor: "));
        if (numero1 >= numero2 && numero2 >= numero3) {
            JOptionPane.showMessageDialog(null, "A ordem crescente: " + numero3 + ' ' + numero2 + ' ' + numero1);
        } else if (numero1 >= numero2 && numero1 >= numero3) {
            JOptionPane.showMessageDialog(null, "A ordem crescente: " + numero2 + ' ' + numero3 + ' ' + numero1);
        } else if (numero1 >= numero3 && numero2 >= numero3) {
            JOptionPane.showMessageDialog(null, "A ordem crescente: " + numero3 + ' ' + numero1 + ' ' + numero2);
        } else if (numero3 >= numero1 && numero1 >= numero2) {
            JOptionPane.showMessageDialog(null, "A ordem crescente: " + numero2 + ' ' + numero1 + ' ' + numero3);
        } else if (numero2 >= numero3 && numero3 >= numero1) {
            JOptionPane.showMessageDialog(null, "A ordem crescente: " + numero1 + ' ' + numero3 + ' ' + numero2);
        } else {
            JOptionPane.showMessageDialog(null, "A ordem crescente: " + numero1 + ' ' + numero2 + ' ' + numero3);
        }
    }
}
