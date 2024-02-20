import javax.swing.JOptionPane;

public class MDCRecursivo {
    public static int MDC(int num, int num2){
        if (num2 == 0){
            return num;
        }
        else {
            return MDC(num2, num % num2);
        }
    }
    public static void main(String[] args){
        int num, num2, resultado;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));

        resultado = MDC(num, num2);

        JOptionPane.showMessageDialog(null, "O MDC dos números " + num + " e " + num2 + " é: " + resultado);
    }
}
