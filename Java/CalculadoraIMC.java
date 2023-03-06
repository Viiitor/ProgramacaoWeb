import javax.swing.JOptionPane;

public class CalculadoraIMC {

    public static void main(String[] args) {
        String sexo = JOptionPane.showInputDialog(null, "Digite o sexo (M/F):");
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso (em Kg):"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura (em metros):"));

        double imc = calcularIMC(peso, altura);

        String resultado = interpretarIMC(imc, sexo);

        JOptionPane.showMessageDialog(null, resultado);
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String interpretarIMC(double imc, String sexo) {
        String resultado = "IMC: " + String.format("%.2f", imc) + "\n";
        resultado += "Classificação: ";

        if (sexo.equalsIgnoreCase("M")) {
            if (imc < 20.7) {
                resultado += "Abaixo do peso";
            } else if (imc < 26.4) {
                resultado += "Peso normal";
            } else if (imc < 27.8) {
                resultado += "Marginalmente acima do peso";
            } else if (imc < 31.1) {
                resultado += "Acima do peso ideal";
            } else {
                resultado += "Obeso";
            }
        } else if (sexo.equalsIgnoreCase("F")) {
            if (imc < 19.1) {
                resultado += "Abaixo do peso";
            } else if (imc < 25.8) {
                resultado += "Peso normal";
            } else if (imc < 27.3) {
                resultado += "Marginalmente acima do peso";
            } else if (imc < 32.3) {
                resultado += "Acima do peso ideal";
            } else {
                resultado += "Obeso";
            }
        } else {
            resultado = "Sexo inválido";
        }

        return resultado;
    }
}
