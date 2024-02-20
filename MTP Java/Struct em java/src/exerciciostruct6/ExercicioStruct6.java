package exerciciostruct6;
import java.util.Scanner;
import model.Cadastro;

public class ExercicioStruct6 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadastro[] cad = new Cadastro[2];
        
        String identPesquisada;
        int maiorIdade = 0;
        int i;

        for (i = 0; i < 7; i++) {
            
            cad[i] = new Cadastro();
            
            System.out.println("CADASTRO: ");

            System.out.print("Digite o seu salario: ");
            cad[i].salario = scanner.nextDouble();
            
            scanner.nextLine(); // Consumir a nova linha pendente

            System.out.print("Digite o seu nome: ");
            cad[i].nome = scanner.nextLine();

            System.out.print("Digite o seu sexo: ");
            cad[i].sexo = scanner.nextLine();

            System.out.print("Insira o seu CPF: ");
            cad[i].cpf = scanner.nextLine();

            System.out.print("Digite o seu estado civil, sendo solteiro, casado(a), separado(a), divorciado(a), viuvo(a): ");
            cad[i].estadoCiv = scanner.nextLine();

            System.out.print("Insira o seu telefone: ");
            cad[i].telefone = scanner.nextLine();

            System.out.print("Insira a sua identidade: ");
            cad[i].identidade = scanner.nextLine();

            System.out.print("Digite aqui a sua idade: ");
            cad[i].idade = scanner.nextInt();
            
            scanner.nextLine(); 

            System.out.println("==== ENDERECO ====");

            System.out.print("Digite aqui a sua rua: ");
            cad[i].rua = scanner.nextLine();

            System.out.print("Digite aqui o seu bairro: ");
            cad[i].bairro = scanner.nextLine();

            System.out.print("Digite aqui a sua cidade: ");
            cad[i].cidade = scanner.nextLine();

            System.out.print("Digite aqui o seu estado: ");
            cad[i].estado = scanner.nextLine();

            System.out.print("Digite aqui o seu CEP: ");
            cad[i].cep = scanner.nextLine();
        }

        for (i = 0; i < 7; i++) {
            if (cad[i].idade > cad[maiorIdade].idade) {
                maiorIdade = i;
            }
        }

        System.out.println("Pessoa com a maior idade é " + cad[maiorIdade].nome + " com idade igual a " + cad[maiorIdade].idade + " anos");

        for (i = 0; i < 7; i++) {
            if (cad[i].sexo.equalsIgnoreCase("M")) {
                System.out.println(cad[i].nome + " é do sexo masculino");
                break;
            }
        }
        
        for (i = 0; i < 7; i++) {
            if (cad[i].salario > 1000) {
                System.out.println("A pessoa " + cad[i].nome + " recebe um salario maior que 1000 reais");
                break;
            }
        }
        
        System.out.print("Digite a identidade a ser pesquisada:");
        identPesquisada = scanner.nextLine();

        for (i = 0; i < 7; i++) {
            if (cad[i].identidade.equals(identPesquisada)) {
                System.out.println("NOME: " + cad[i].nome);
                System.out.println("IDADE: " + cad[i].idade);
                System.out.println("SEXO: " + cad[i].sexo);
                System.out.println("CPF: " + cad[i].cpf);
                System.out.println("IDENTIDADE: " + cad[i].identidade);
                System.out.println("SALÁRIO: " + cad[i].salario);
                System.out.println("ESTADO CIVIL: " + cad[i].estadoCiv);
                System.out.println("TELEFONE: " + cad[i].telefone);
                System.out.println("ENDEREÇO: " + cad[i].rua + " " + cad[i].bairro + " " + cad[i].cidade + " " + cad[i].estado + " " + cad[i].cep);
                break;
            }
        }
    }
}
    

