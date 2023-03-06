import javax.swing.JOptionPane;

public class InversorDeValores {

    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog(null, "Digite os valores separados por vírgula:");
        String[] valores = entrada.split(",");
        String resultado = inverterValores(valores);
        JOptionPane.showMessageDialog(null, "Valores invertidos: " + resultado);
    }

    public static String inverterValores(String[] valores) {
        StringBuilder sb = new StringBuilder();
        for (int i = valores.length - 1; i >= 0; i--) {
            sb.append(valores[i]);
            if (i > 0) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
