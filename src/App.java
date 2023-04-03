import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        double radius = 0;
        boolean validInput = false;
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        JOptionPane.showMessageDialog(null, "Informe o raio do círculo (cm)");
        while (!validInput) {
            String input_1 = JOptionPane.showInputDialog(null, "Raio");
            try {
                radius = Double.parseDouble(input_1);
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida!");
            }
        }
        double area = Math.PI * Math.pow(radius, 2);
        JOptionPane.showMessageDialog(null, "A área do círculo é de " + numberFormat.format(area) + " cm²");
    }
}