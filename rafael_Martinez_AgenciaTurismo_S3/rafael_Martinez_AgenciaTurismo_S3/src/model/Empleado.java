package model;

public class Empleado extends Persona {
    //que tipo o funcion hace ese empleado
    private String tipo;

    public Empleado(String tipo) {
        this.tipo = tipo;
    }

    public Empleado(String tipo, String rut, String nombre, Direccion domicilio) {
        super(rut, nombre, domicilio);
        this.tipo = tipo;
    }

    public Empleado() {
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "| tipo: " + tipo ;
    }
}
