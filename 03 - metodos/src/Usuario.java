public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv tv = new SmartTv();

        System.out.println("Está ligada? " + tv.ligada);
        System.out.println("Canal atual: " + tv.canal);
        System.out.println("Volume atual: " + tv.volume);

        tv.ligar();
        System.out.println("Está ligada? " + tv.ligada);
        tv.desligar();
        System.out.println("Está ligada? " + tv.ligada);

        tv.aumentarCanal();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.aumentarVolume();

    }
}
