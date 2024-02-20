import javax.swing.JOptionPane;

public class expo {
    public static void main(String[] args) {
        int base;
        int expo;

        base = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da base: "));
        expo = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente: "));

        JOptionPane.showMessageDialog(null, "O seu valor é: " + ex(base, expo));

    }

    public static int ex(int base, int expo) {
        if (expo == 0) {
            return 0;
        }
        if (expo == 1) {
            return base;
        }
        else{
            return base * ex(base, expo-1);
        }
    }
}