package dominio;

public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    // Constructor de la clase
    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    // Get idEmpleado
    public int getIdEmpleado() {
        return idEmpleado;
    }

    // Set idEmpleado
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    // Get sueldo
    public double getSueldo() {
        return sueldo;
    }

    // Set sueldo
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado { idEmpleado = ").append(this.idEmpleado);
        sb.append(", suseldo = ").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append("}");
        return sb.toString();
    }
}
