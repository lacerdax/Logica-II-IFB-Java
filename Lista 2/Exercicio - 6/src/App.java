import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String num = JOptionPane.showInputDialog("Informe um valor: ");
        int conversao = Integer.parseInt(num);
        if (conversao % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O valor informado é par: " + conversao);
        } else {
            JOptionPane.showMessageDialog(null, "O valor informado é impar: " + conversao);
        }

    }
}
