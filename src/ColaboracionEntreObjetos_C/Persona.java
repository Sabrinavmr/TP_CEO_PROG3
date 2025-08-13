package ColaboracionEntreObjetos_C;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String tipoDocumento;
    private long nroDocumento;
    private int telefono;
    private String email;
    private String celular;

    private Sector sector;
    private List<Actividad> actividades = new ArrayList<>();

    public Persona(String nombre, String tipoDocumento, long nroDocumento, int telefono, String email, String celular) {
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.telefono = telefono;
        this.email = email;
        this.celular = celular;
    }
    


    //C.3
    public double totalPuntosAsignados(int cod , int anio){
        //retorna los puntos de un tipo de actividad por un periodo asignado
        double total = 0;

        for (Actividad a : actividades){
            if ((a.getTipoActividad().getCodigo() == cod) &&(a.getFechaInicio().getYear() == anio)){
                total += a.getTipoActividad().getPuntosAsignados();
            }
        }
        return total;
    }

    //C.2
    public double totalPuntosAsignados(int codigo){
        //retorna el total de puntos de un tipo de actividad
        double total = 0;
        for (Actividad a : actividades){

            if (a.getTipoActividad().getCodigo() == codigo){
            total += a.getTipoActividad().getPuntosAsignados();
            }
        }
        return total;
    }
    //C.1
    public double totalPuntosAsignados(){
        //retorna el total de puntos de las actividades
        double total = 0;

        for (Actividad a : actividades){

            total += a.getTipoActividad().getPuntosAsignados();
        }
        return total;
    }

    public void agregarActividad(Actividad act){
        if (this.actividades == null)this.actividades = new ArrayList<>();
        this.actividades.add(act);
        act.setPersona(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public long getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(long nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", nroDocumento=" + nroDocumento +
                ", telefono=" + telefono +
                ", email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                ", sector=" + sector +
                ", actividades=" + actividades +
                '}';
    }
}
