import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CaixaRegistrado {
    /**
     * @param args
     */
    public static void main(String[] args) {
        float numero = -1;
        double soma = 0;
        float pagamento = 0;
        float troco = 0;
        double parcelamento = 0;
        String resultado = "Parcelamento em 10x: \n";
        int parcelaCartao = 0;
        double parcelaCheque = 0;
        int pagamentoCheque = 0;
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        while (numero != 0) {
            numero = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do produto ou 0 para sair"));

            soma += numero;

        }
        // Menu bonitinho
        String[] opcoes = { "Dinheiro", "Cartão de crédito", "Cheque" };
        float opcao = JOptionPane.showOptionDialog(null,
                "A soma de todos os produtos é: R$" + soma + "\n Qual a forma de pagamento?", "Menu",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                opcoes, null);
        // dinheiro
        if (opcao == JOptionPane.YES_OPTION) {
            double valorOriginal = soma;
            double percentual = 10.0 / 100.0;
            double valorFinal = valorOriginal - (percentual * valorOriginal);
            pagamento = Integer.parseInt(JOptionPane.showInputDialog(
                    "O valor com o desconto de 10% é: R$" + valorFinal + "\n Insira o valor do pagamento:"));
            troco = (float) (pagamento - valorFinal);
            if (valorFinal <= pagamento) {
                JOptionPane.showMessageDialog(null, "O seu troco é: R$" + troco);
            } else {
                JOptionPane.showMessageDialog(null, "Ainda falta: R$" + troco);
            }

        }
        // cartao
        else if (opcao == JOptionPane.NO_OPTION) {
            for (int i = 1; i <= 10; i++) {
                parcelamento = soma / i;
                resultado += i + " - " + df.format(parcelamento) + "\n";

            }
            parcelaCartao = Integer.parseInt(JOptionPane.showInputDialog("\n" + resultado + "\n"));
            if (parcelaCartao == 1) {
                JOptionPane.showMessageDialog(null, "O seu valor foi parcelado em 1x");
            } else if (parcelaCartao == 2) {
                JOptionPane.showMessageDialog(null, "O seu valor foi parcelado em 2x");

            } else if (parcelaCartao == 3) {
                JOptionPane.showMessageDialog(null, "O seu valor foi parcelado em 3x");

            } else if (parcelaCartao == 4) {
                JOptionPane.showMessageDialog(null, "O seu valor foi parcelado em 4x");

            } else if (parcelaCartao == 5) {
                JOptionPane.showMessageDialog(null, "O seu valor foi parcelado em 5x");
            } else if (parcelaCartao == 6) {
                JOptionPane.showMessageDialog(null, "O seu valor foi parcelado em 6x");
            } else if (parcelaCartao == 7) {
                JOptionPane.showMessageDialog(null, "O seu valor foi parcelado em 7x");
            } else if (parcelaCartao == 8) {
                JOptionPane.showMessageDialog(null, "O seu valor foi parcelado em 8x");
            } else if (parcelaCartao == 9) {
                JOptionPane.showMessageDialog(null, "O seu valor foi parcelado em 9x");
            } else if (parcelaCartao == 10) {
                JOptionPane.showMessageDialog(null, "O seu valor foi parcelado em 10x");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR");
            }

        } else if (opcao == JOptionPane.CANCEL_OPTION) {
            for (int i = 1; i <= 3; i++) {
                parcelaCheque = soma / i;
                resultado += i + " - " + df.format(parcelaCheque) + "\n";
            }
            pagamentoCheque = Integer.parseInt(JOptionPane.showInputDialog("\n" + resultado + "\n"));
            if (pagamentoCheque == 1) {
                double valorOriginal = soma;
                double percentual = 5.0 / 100.0;
                double valorFinal = valorOriginal - (percentual * valorOriginal);
                JOptionPane.showMessageDialog(null,
                        "O valor com o desconto de 5% é: R$" + valorFinal);
            }
        }
    }
}
