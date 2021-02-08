package dominio;

public class Persona {
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    protected String email;

    // Constructor vacio
    public Persona() {

    }

    // Constructor con el argumento
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Constructor completo
    public Persona(String nombre, char genero, int edad, String direccion, String email) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Get nombte
    public String getNombre() {
        return nombre;
    }

    // Set nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Get genero
    public char getGenero() {
        return genero;
    }

    // Set genero
    public void setGenero(char edad) {
        this.edad = edad;
    }

    // Get edad
    public int getEdad() {
        return edad;
    }

    // Set edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Get direccion
    public String getDireccion() {
        return direccion;
    }

    // Set direccion
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Get email
    public String getEmail() {
        return email;
    }

    // Set direccion
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona { nombte: ").append(nombre);
        sb.append(", genero: ").append(genero);
        sb.append(", edad: ").append(edad);
        sb.append(", direccion: ").append(direccion);
        sb.append(", email: ").append(email);
        sb.append("}");
        return sb.toString();
    }
}
