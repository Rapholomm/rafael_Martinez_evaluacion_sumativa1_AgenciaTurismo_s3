package model;

public class Persona {

    private String rut;
    private String nombre;

    // depemdemcoa desde la clase dirección: la clase perosona contiene a la clase direccion como atrubuto.
    private Direccion domicilio;

    public Persona() {
    }

    public Persona(String rut, String nombre, Direccion domicilio) {
        this.rut = rut;
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Direccion domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", domicilio=" + domicilio +
                '}';
    }
}
