import javax.swing.JOptionPane;

public class Idade{

    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));

        if (idade >= 60){
            System.out.println("Idoso");
        }
        else if (idade >=18){
            System.out.println("Adulto");
        }
        else if (idade >12){
            System.out.println("Adolescente");
        }
        else {
            System.out.println("Criança");
        }
    }

}