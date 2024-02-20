import java.util.Scanner;
import Computador.computador;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    computador Computador = new computador();
    for (int i = 0; i < 3; i++){

        System.out.println("Digite a marca do computador " + (i + 1) + ": ");
        Computador.marca[i] = scanner.next();

        System.out.println("Digite o ano de fabicação do computador " + (i + 1) + ": ");
        Computador.ano[i] = scanner.nextInt();

        System.out.println("Digite o peso do computador " + (i + 1) + ": ");
        Computador.peso[i] = scanner.nextDouble();
    }

        System.out.println("Foram salvas as informações: ");

    for (int i = 0; i < 3; i++){

        System.out.println("Computador " + (i + 1));
        System.out.println("Marca: " + Computador.marca[1]);
        System.out.println("Ano de Fabricação: " + Computador.ano[1]);
        System.out.println("Peso: " + Computador.peso[1]);
        }
    }
}