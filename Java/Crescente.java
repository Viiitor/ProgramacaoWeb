import javax.swing.JOptionPane;

public class Crescente {
    
    
        public static void main(String[] args) {
            String entrada = JOptionPane.showInputDialog(null, "Digite os valores separados por vírgula:");
            String[] valores = entrada.split(",");
            ordenarValores(valores);
            JOptionPane.showMessageDialog(null, "Valores ordenados: " + valores[0] + ", " + valores[1] + ", " + valores[2]);
        }
    
        public static void ordenarValores(String[] valores) {
            int[] numeros = new int[3];
            for (int i = 0; i < valores.length; i++) {
                numeros[i] = Integer.parseInt(valores[i]);
            }
    
            if (numeros[0] > numeros[1]) {
                trocar(numeros, 0, 1);
            }
            if (numeros[0] > numeros[2]) {
                trocar(numeros, 0, 2);
            }
            if (numeros[1] > numeros[2]) {
                trocar(numeros, 1, 2);
            }
    
            valores[0] = String.valueOf(numeros[0]);
            valores[1] = String.valueOf(numeros[1]);
            valores[2] = String.valueOf(numeros[2]);
        }
    
        public static void trocar(int[] numeros, int i, int j) {
            int temp = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = temp;
        }
    }
    