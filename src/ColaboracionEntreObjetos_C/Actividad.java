package ColaboracionEntreObjetos_C;

import java.time.LocalDate;

public class Actividad {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String nombre;
    private String descripcion;

    private TipoActividad tipoActividad;
    private Persona persona;

    public Actividad(LocalDate fechaInicio, LocalDate fechaFin, String nombre, String descripcion) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Actividad(LocalDate fechaInicio, LocalDate fechaFin, String nombre, String descripcion, TipoActividad tipoActividad) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoActividad = tipoActividad;
    }

    public Actividad(LocalDate fechaInicio, LocalDate fechaFin, String nombre, String descripcion, TipoActividad tipoActividad, Persona persona) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoActividad = tipoActividad;
        this.persona = persona;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoActividad getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(TipoActividad tipoActividad) {
        this.tipoActividad = tipoActividad;
        tipoActividad.agregarActividad(this);
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Actividad{" +
                "fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipoActividad=" + tipoActividad +
                ", persona=" + persona +
                '}';
    }
}
