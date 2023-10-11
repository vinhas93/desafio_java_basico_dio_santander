import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Seja bem vindo!");
        System.out.println();

        System.out.println("Como devemos lhe chamar?");
        String nomeCliente = scanner.nextLine();

        System.out.println();
        System.out.println("Por favor " + nomeCliente + ", digite o número de sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println();
        System.out.println("Agora, digite o código de sua Agência: ");
        String agencia = scanner.next();


        System.out.println();
        System.out.println("Para finalizar, digite o saldo de sua conta: ");
        double saldo = scanner.nextDouble();

        System.out.println();
        System.out.println();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agencia é " + agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque.");

    }
}