public class EjercicioTema8 {
  public static void main(String[] args) {
    Persona persona = new Persona();
    persona.setEdad(24);
    persona.setNombre("Pedro");
    persona.setTelefono(1234567);

    Number edad = persona.getEdad();
    String nombre = persona.getNombre();
    Number telefono = persona.getTelefono();

    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Teléfono: " + telefono);
  }
}

class Persona {
  private Number edad;
  private String nombre;
  private Number telefono;

  public void setEdad(Number edad) {
    this.edad = edad;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setTelefono(Number telefono) {
    this.telefono = telefono;
  }

  public Number getEdad() {
    return this.edad;
  }

  public String getNombre() {
    return this.nombre;
  }

  public Number getTelefono() {
    return this.telefono;
  }
}