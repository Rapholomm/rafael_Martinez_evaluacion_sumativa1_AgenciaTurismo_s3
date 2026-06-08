package app;
import model.*;

public class Main {

    public static void main (String [] args) {

        //instanciando direcciones

        Direccion direccion_1 = new Direccion("Santiago","Pedro Aguirre Cerda 16134");
        Direccion direccion_2 = new Direccion("Linares","Valentin Letelier 645");
        Direccion direccion_3 = new Direccion("Punta Arenas", "Jose Miguel Pinto 541");

        //Instanciando Personas

        Persona turista_A = new Persona("15.123456-k", "José Pérez", direccion_1);


        // instanciando Empleados
        Empleado chofer_A = new Empleado("conductor", "14567123-k", "John", direccion_2);
        Empleado admin_A = new Empleado("Administrador", "15.345.123-k", "Lucas Montero", direccion_3);

        System.out.println("---SISTEMA LLANQUIHUE TOUR---");
        System.out.println(direccion_1.toString());
        System.out.println(turista_A.toString());
        System.out.println(chofer_A.toString());;
        System.out.println(admin_A.toString());
    }

}
