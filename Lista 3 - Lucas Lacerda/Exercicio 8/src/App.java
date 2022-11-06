import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int i = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor em Hexadecimal: "), 16);
        String binaria = Integer.toBinaryString(i);
        JOptionPane.showMessageDialog(null, binaria);
    }
}
