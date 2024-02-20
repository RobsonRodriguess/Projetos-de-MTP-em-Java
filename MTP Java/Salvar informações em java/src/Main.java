import java.util.Scanner;
import Informacao.informacao;
import Informacao.Endereco;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        informacao Informacao = new informacao ();
        Endereco informacao = new Endereco();

        System.out.println("Para salvar seus dados siga os passos a seguir");
        System.out.println("Primeiro suas informações pessoais: ");
        System.out.println("Digite seu nome: ");
        Informacao.nome = scanner.next();
        System.out.println("Digite sua data de nascimento ");
        System.out.println("Dia: ");
        Informacao.dia = scanner.nextInt();
        System.out.println("Mes: ");
        Informacao.mes = scanner.nextInt();
        System.out.println("Ano: ");
        Informacao.ano = scanner.nextInt();
        System.out.println("Digite seu peso: ");
        Informacao.peso = scanner.nextDouble();
        System.out.println("Digite seu sexo: ");
        Informacao.sexo = scanner.next();

        System.out.println("Digite seu endereço agora ");
        System.out.println("Digite o nome da rua: ");
        informacao.nomeRua = scanner.next();

        System.out.println("Digite o numero da casa: ");
        informacao.numero = scanner.nextInt();

        System.out.println("Digite o nome da cidade");
        informacao.cidade = scanner.next();

        System.out.println("Digite o estado: ");
        informacao.estado = scanner.next();

        System.out.println("Digite o cep: ");
        informacao.CEP = scanner.next();

        System.out.println("Os seus dados sao: ");
        System.out.println("Nome: " + Informacao.nome);
        System.out.println("Data de nascimento: " + Informacao.dia + "/" + Informacao.mes + "/" + Informacao.ano );
        System.out.println("O seu peso: " + Informacao.peso);
        System.out.println("O seu sexo: " + Informacao.sexo);
        System.out.println("Nome da rua: " + informacao.nomeRua);
        System.out.println("Numero da casa: " + informacao.numero);
        System.out.println("Nome da cidade: " + informacao.cidade);
        System.out.println("Nome do Estado: " + informacao.estado);
        System.out.println("Numero do cep: " + informacao.CEP);

    }
}