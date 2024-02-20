import javax.swing.JOptionPane;

public class UnidadeRecursiva {
    public static void main(String [] args){

        int num;
        int algarismo, resultado;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número desejado"));
        algarismo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o algarismo que deseja saber a quantidade"));

        resultado = cont (num, algarismo);

        JOptionPane.showMessageDialog(null, "No número " + num + " aparece o algarismo " + algarismo + " " + resultado + " vezes");
    }

    public static int cont (int num, int unidade){
        if (num == 0){
            return 0;
        }

        int digito = num % 10;

        if (digito == unidade){
            return 1 + cont(num / 10, unidade);
        }
        else{
            return cont(num / 10, unidade);
        }
    }
}
