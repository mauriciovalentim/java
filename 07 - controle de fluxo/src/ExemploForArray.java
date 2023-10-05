public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "Felipe", "João", "Pedro", "Maria" };

        for (String aluno:alunos) 
            System.out.println(aluno);   
        
        int numero = 1;
        for (int x=1; x < 2; x++)
            numero = numero + x;
        System.out.println("O valor de número é: " + numero);
    }
}
