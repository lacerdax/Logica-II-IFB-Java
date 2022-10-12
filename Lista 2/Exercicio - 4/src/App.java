import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String num = JOptionPane.showInputDialog("Informe um valor: ");
        int conversao = Integer.parseInt(num);
        if (conversao > 0) {
            JOptionPane.showMessageDialog(null, "O valor informado é positivo: " + conversao);
        } else if (conversao == 0) {
            JOptionPane.showMessageDialog(null, "O valor informado é nulo: " + conversao);
        } else {
            JOptionPane.showMessageDialog(null, "O valor informado é negativo: " + conversao);
        }
    }
}
