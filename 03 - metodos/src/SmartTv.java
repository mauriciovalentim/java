public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void aumentarCanal() {
    this.volume++;
    System.out.println("Canal atual: " + this.canal);
  }

  public void diminuirCanal() {
    this.volume--;
    System.out.println("Canal atual: " + this.canal);
  }

  public void aumentarVolume() {
    this.volume++;
    System.out.println("Volume atual: " + this.volume);
  }

  public void diminuirVolume() {
    this.volume--;
    System.out.println("Volume atual: " + this.volume);
  }

  public void ligar() {
    this.ligada = true;
  }

  public void desligar() {
    this.ligada = false;
  }
}
