public class EjercicioTema4 {
  public static void main(String[] args) {
    int numeroIf = 0;
    int numeroWhile = 0;
    int numeroDoWhile = 2;
    String estacion = "Verano";

    // Condicionales
    if (numeroIf > 0) {
      System.out.println("El " + numeroIf + " es un número positivo.");
    } else if (numeroIf < 0) {
      System.out.println("El " + numeroIf + " es un número negativo.");
    } else {
      System.out.println("El " + numeroIf + " se considera un número neutro.");
    }

    // Bucles while y do while
    while (numeroWhile < 3) {
      numeroWhile = numeroWhile + 1;
      System.out.println(numeroWhile);
    }

    do {
      numeroDoWhile = numeroWhile + 1;
      System.out.println("Do while output " + numeroDoWhile);
    } while (numeroDoWhile < 3);

    // Bucle for
    for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
      System.out.println(numeroFor);
    }

    // Switch
    switch (estacion) {
      case "Primavera":
        System.out.print("La estación actual es: " + estacion);
        break;

      case "Verano":
        System.out.print("La estación actual es: " + estacion);
        break;

      case "Otoño":
        System.out.print("La estación actual es: " + estacion);
        break;

      case "Invierno":
        System.out.print("La estación actual es: " + estacion);
        break;

      default:
        System.out.print("El valor de la variable no es una estación del año.");
        break;
    }
  }
}
