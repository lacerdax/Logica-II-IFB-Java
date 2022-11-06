import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int numero = -1;
        int incremento = 0;
        while (numero != 0) {
            numero = Integer.parseInt(
                    JOptionPane.showInputDialog("Insira um valor para somar, e encerre o programa digitando 0"));
            incremento += numero;
            JOptionPane.showMessageDialog(null, "A soma de todos os números:" + incremento);
        }
    }
}
