public class EjercicioTema8 {
  public static void main(String[] args) {
    Persona persona = new Persona();
    persona.setEdad(24);
    persona.setNombre("Pedro");
    persona.setTelefono(1234567);

    int edad = persona.getEdad();
    String nombre = persona.getNombre();
    int telefono = persona.getTelefono();

    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Teléfono: " + telefono);
  }
}

class Persona {
  private int edad;
  private String nombre;
  private int telefono;

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }

  public int getEdad() {
    return this.edad;
  }

  public String getNombre() {
    return this.nombre;
  }

  public int getTelefono() {
    return this.telefono;
  }
}