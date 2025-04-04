import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao seu banco!\nRealize seu login: ");

        System.out.print("Digite o número de sua conta: ");
        int numeroDaConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.print("Digite sua agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o seu nome: ");
        String nomeDoCliente = scanner.nextLine();

        Double saldoDoCliente = 1090.0;

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco!%n", nomeDoCliente);
        System.out.printf("Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n", agencia, numeroDaConta, saldoDoCliente);

        scanner.close();
    }
}
