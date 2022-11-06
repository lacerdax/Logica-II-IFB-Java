import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int cotacao = 1;
        int valorDolar = 0;
        int media = 0;
        int auxiliar = 0;
        while (cotacao <= 7) {
            valorDolar = Integer.parseInt(JOptionPane.showInputDialog("Insira a ultima cotação do dolar: "));
            cotacao += 1;
            auxiliar += valorDolar;
            media = auxiliar / 7;
        }
        JOptionPane.showMessageDialog(null, "A média da cotação do dolar da semana é: " + media);
    }
}
