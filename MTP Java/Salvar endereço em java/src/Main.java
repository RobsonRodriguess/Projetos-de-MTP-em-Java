import java.util.Scanner;
import Endereco.endereco;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        endereco Endereco = new endereco ();

        System.out.println("Digite as informações para salvar seu endereço");
        System.out.println("Digite o nome da rua: ");
        Endereco.nomeRua = scanner.next();

        System.out.println("Digite o numero da casa: ");
        Endereco.numero = scanner.nextInt();

        System.out.println("Digite o nome da cidade");
        Endereco.cidade = scanner.next();

        System.out.println("Digite o estado: ");
        Endereco.estado = scanner.next();

        System.out.println("Digite o cep: ");
        Endereco.CEP = scanner.next();

        System.out.println("Os seus dados sao: ");
        System.out.println("Nome da rua: " + Endereco.nomeRua);
        System.out.println("Numero da casa: " +Endereco.numero);
        System.out.println("Nome da cidade: " +Endereco.cidade);
        System.out.println("Nome do Estado: " +Endereco.estado);
        System.out.println("Numero do cep: " +Endereco.CEP);

    }
}