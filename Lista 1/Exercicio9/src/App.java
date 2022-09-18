import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String numero1 = JOptionPane.showInputDialog("Insira o primeiro número inteiro: ");
        String numero2 = JOptionPane.showInputDialog("Insira o segundo número inteiro: ");
        int conversao1 = Integer.parseInt(numero1);
        int conversao2 = Integer.parseInt(numero2);
        int diferenca = conversao1 - conversao2;
        if (diferenca > 10) {
            JOptionPane.showMessageDialog(null, "Diferença maior que 10: " + diferenca);
        } else {
            JOptionPane.showMessageDialog(null, "Diferença menor que 10: " + diferenca);
        }
    }
}
