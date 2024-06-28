import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();


        System.out.print("Digite a sua Agência: ");
        String agencia = scanner.nextLine();


        System.out.print("Digite o número da Conta: ");
        int numeroConta = scanner.nextInt();


        System.out.print("Digite o saldo da Conta: ");
        double saldodaConta = scanner.nextDouble();


        System.out.println("\"Olá, " +nomeCliente+ " obrigado por criar uma conta em nosso banco, sua agência é " +agencia+", conta "+numeroConta+" e seu saldo "+saldodaConta+" já está disponível para saque.");
 


    }
}
