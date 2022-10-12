import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String num1 = JOptionPane.showInputDialog("Informe um número: ");
        String num2 = JOptionPane.showInputDialog("Informe um segundo número: ");
        int conversao1 = Integer.parseInt(num1);
        int conversao2 = Integer.parseInt(num2);

        int soma = conversao1 + conversao2;
        int sub = conversao1 - conversao2;
        int produto = conversao1 * conversao2;
        int razao = conversao1 / conversao2;

        JOptionPane.showMessageDialog(null, "A soma: " + soma +
                "\n A subtração: " + sub +
                "\n O produto: " + produto +
                "\n A razão: " + razao);

    }
}
