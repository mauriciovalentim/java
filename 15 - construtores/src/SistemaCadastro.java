public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", "11198778946");

        marcos.setEndereco("Rua Oito");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}
