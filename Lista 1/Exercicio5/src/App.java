import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String entrada1 = JOptionPane.showInputDialog("Insira uma entrada: ");
        String entrada2 = JOptionPane.showInputDialog("Insira outra entrada: ");
        JOptionPane.showMessageDialog(null, entrada2);
        JOptionPane.showMessageDialog(null, entrada1);
    }
}
