/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    suma(10, 30, 30);

    Coche miCoche = new Coche();
    miCoche.incrementarPuertas();
    System.out.println(miCoche.puertasCoche);
  }

  public static int suma(int a, int b, int c) {
    return a + b + c;
  }
}

class Coche {
  int puertasCoche = 0;

  void incrementarPuertas() {
    this.puertasCoche++;
  }
}