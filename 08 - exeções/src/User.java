import java.util.Locale;
import java.util.Scanner;

public class User {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.print("Nome: ");
            String name = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Dados inválidos!");
        }
    }
}
