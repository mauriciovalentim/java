import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar (int a, int b) throws ParametrosInvalidosException{
        if (a > b || b == a)
            throw new ParametrosInvalidosException();
        
        int contagem = b - a;
        for (int i = 1; i <= contagem; i++)
            System.out.println(i);
    }
}
