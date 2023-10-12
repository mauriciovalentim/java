package apps;
public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void testarConexão() {
        System.out.println("Testando conexão");
    }
}
