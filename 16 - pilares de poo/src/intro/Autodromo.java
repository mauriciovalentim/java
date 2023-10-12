public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.ligar();
        jeep.setChassi("3453");
        System.out.println("Chassi do jeep " + jeep.getChassi());

        Moto honda = new Moto();
        honda.ligar();
        honda.setChassi("5464");
        System.out.println("Chassi da Honda " + honda.getChassi());
    }
}
