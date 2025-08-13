package ColaboracionEntreObjetos_C;

import java.util.ArrayList;
import java.util.List;

public class TipoActividad {
    private int codigo;
    private String denominacion;
    private double puntosAsignados;

    private List<Actividad> ListaActividades = new ArrayList<>();

    public TipoActividad(int codigo, String denominacion, double puntosAsignados) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.puntosAsignados = puntosAsignados;
    }

    public void agregarActividad(Actividad act){
        if (this.ListaActividades == null) this.ListaActividades = new ArrayList<>();
        this.ListaActividades.add(act);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getPuntosAsignados() {
        return puntosAsignados;
    }

    public void setPuntosAsignados(double puntosAsignados) {
        this.puntosAsignados = puntosAsignados;
    }

    public List<Actividad> getListaActividades() {
        return ListaActividades;
    }

    public void setListaActividades(List<Actividad> listaActividades) {
        ListaActividades = listaActividades;
    }

    @Override
    public String toString() {
        return "TipoActividad{" +
                "codigo=" + codigo +
                ", denominacion='" + denominacion + '\'' +
                ", puntosAsignados=" + puntosAsignados +
                ", ListaActividades=" + ListaActividades +
                '}';
    }
}
