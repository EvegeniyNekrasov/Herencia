package dominio;

import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    // Constructor de la clase
    public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion,
            String email) {
        super(nombre, genero, edad, direccion, email);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    // Get idCleinte
    public int getIdCliente() {
        return idCliente;
    }

    // Get fechaRegistro
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    // Set fechaRegistro
    public void setfechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    // Is vip
    public boolean isVip() {
        return vip;
    }

    // Set vip
    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente { idCliente = ").append(this.idCliente);
        sb.append(", fecha registro: ").append(this.fechaRegistro);
        sb.append(", vip: ").append(this.vip);
        sb.append(", ").append(super.toString());
        sb.append("}");
        return sb.toString();
    }
}
