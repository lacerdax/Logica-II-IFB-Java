import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String elogio = JOptionPane
                .showInputDialog(
                        "Escolha uma opção: \n 1 - Cumprimento \n 2 - Elogio \n 3 - Despedida \n 0 - Finalizar o programa");
        int opcoes = Integer.parseInt(elogio);
        while (opcoes != 0) {
            if (opcoes == 1) {
                JOptionPane.showMessageDialog(null, "Bom dia!");
                break;
            } else if (opcoes == 2) {
                JOptionPane.showMessageDialog(null, "Você está de parabéns!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Até breve!");
                break;
            }
        }
    }
}
