import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String fahrenheit = JOptionPane
                .showInputDialog("Insira a temperatura em Fahnreheit para ser convertida para Celsius");
        float conversaoInt = Integer.parseInt(fahrenheit);
        float conversaoCelsius = (conversaoInt - 32) * 5 / 9;
        JOptionPane.showMessageDialog(null, conversaoCelsius);
    }
}
