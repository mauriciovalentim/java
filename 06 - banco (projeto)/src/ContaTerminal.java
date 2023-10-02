import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Seu nome: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Numero: ");
        int numeroUsuario = scanner.nextInt();

        System.out.print("Agencia: ");
        String agenciaUsuario = scanner.next();

        System.out.print("Saldo: ");
        double saldoUsuario = scanner.nextDouble();

        System.out.print("Olá " + nomeUsuario + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agenciaUsuario +", conta "+ numeroUsuario + " e seu saldo "+ saldoUsuario +" já está disponível para saque");

    }
}
