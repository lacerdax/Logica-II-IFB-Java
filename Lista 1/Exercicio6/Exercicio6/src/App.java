import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String numero = JOptionPane.showInputDialog("Insira o número que será dobrado: ");
        int conversao = Integer.parseInt(numero);
        int dobro = conversao * 2;
        JOptionPane.showMessageDialog(null, dobro);
    }
}
