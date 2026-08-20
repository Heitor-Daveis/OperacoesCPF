import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu CPF:");
        String cpf = scanner.nextLine();

        Usuario usuario = new Usuario(cpf);

        Banner.meubanner();
        int opcao;
        double valor;

        do {
            Opcoes.Banneropcoes();
            System.out.println("Digite sua opção:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser sacado:");
                    valor = scanner.nextDouble();
                    usuario.Sacar(valor);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado:");
                    valor = scanner.nextDouble();
                    usuario.InserirCredito(valor);
                    break;
                case 3:
                    usuario.ImprimirExtrato();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    usuario.ImprimirExtrato();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}