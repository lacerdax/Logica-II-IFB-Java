import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String informacao = JOptionPane.showInputDialog("Insira alguma informação: ");
        JOptionPane.showMessageDialog(null, informacao);
    }
}
