package dominio.test;

import dominio.Empleado;
import dominio.Cliente;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Paco", 5000.0);
        System.out.println("empleado1 = " + empleado1);

        Cliente cliente1 = new Cliente(new Date(), true, "Mario", 'M', 32, "Coruña 16", "email@domail.com");
        System.out.println("cliente1 = " + cliente1);
    }
}
