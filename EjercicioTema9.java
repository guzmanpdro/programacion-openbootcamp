public class EjercicioTema9 {
  public static void main(String[] args) {
    // Crea objeto cliente y muestra sus propiedades
    Cliente cliente = new Cliente(24, "Pedro Guzman", 1234567, 5000);
    System.out.println(cliente.getEdad());
    System.out.println(cliente.getNombre());
    System.out.println(cliente.getTelefono());
    System.out.println(cliente.getCredito());

    // Crea objeto trabajador y muestra sus propiedades
    Trabajador trabajador = new Trabajador(24, "Pedro Guzman", 1234567, 1200);
    System.out.println(trabajador.getEdad());
    System.out.println(trabajador.getNombre());
    System.out.println(trabajador.getTelefono());
    System.out.println(trabajador.getSalario());
  }
}

class Persona {
  int edad;
  String nombre;
  int telefono;

  public Persona(int edad, String nombre, int telefono) {
    this.edad = edad;
    this.nombre = nombre;
    this.telefono = telefono;
  }

  public int getEdad() {
    return edad;
  }

  public String getNombre() {
    return nombre;
  }

  public int getTelefono() {
    return telefono;
  }
}

class Cliente extends Persona {
  int credito;

  public Cliente(int edad, String nombre, int telefono, int credito) {
    super(edad, nombre, telefono);
    this.credito = credito;
  }

  public int getCredito() {
    return credito;
  }
}

class Trabajador extends Persona {
  int salario;

  public Trabajador(int edad, String nombre, int telefono, int salario) {
    super(edad, nombre, telefono);
    this.salario = salario;
  }

  public int getSalario() {
    return salario;
  }
}


