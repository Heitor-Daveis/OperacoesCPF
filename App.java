import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cpf = "";
        boolean cpfValido = false;

        while (!cpfValido) {
            System.out.println("Informe seu CPF (11 dígitos):");
            cpf = scanner.nextLine();
            cpfValido = true;
            if (cpf.length() != 11) {
                cpfValido = false;
            } else {
                for (int i = 0; i < cpf.length(); i++) {
                    if (!Character.isDigit(cpf.charAt(i))) {
                        cpfValido = false;
                    }
                }
            }
            if (!cpfValido) {
                System.out.println("CPF inválido! Digite os 11 números, sem pontos ou traço.");
            }
        }

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