import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String idade = JOptionPane.showInputDialog("Informe uma idade: ");
        int idadeC = Integer.parseInt(idade);
        if (idadeC >= 0 && idadeC <= 2) {
            JOptionPane.showMessageDialog(null, "Bebê");
        } else if (idadeC >= 3 && idadeC <= 11) {
            JOptionPane.showMessageDialog(null, "Criança");
        } else if (idadeC >= 12 && idadeC <= 17) {
            JOptionPane.showMessageDialog(null, "Adolescente");
        } else if (idadeC >= 18 && idadeC <= 24) {
            JOptionPane.showMessageDialog(null, "Jovem");
        } else if (idadeC >= 25 && idadeC <= 59) {
            JOptionPane.showMessageDialog(null, "Adulto");
        } else if (idadeC >= 60 && idadeC <= 99) {
            JOptionPane.showMessageDialog(null, "Idoso");
        } else if (idadeC >= 100) {
            JOptionPane.showMessageDialog(null, "Ancião");
        }
    }
}
