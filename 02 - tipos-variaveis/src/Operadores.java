public class Operadores {
    public static void main(String[] args) {
        String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        int numero1 = 5;
        numero1 = - 5;
        System.out.println(numero1);

        int numero2 = - 5;
        numero2 = + 5;
        System.out.println(numero2);

        int numero3 = 25;
        System.out.println(++numero3);
        System.out.println(numero3);

        int numero4 = 14;
        System.out.println(numero4++);
        System.out.println(numero4);

        int a, b;
        a = 5;
        b = 6;
        String resultado;
        resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

    }
}
