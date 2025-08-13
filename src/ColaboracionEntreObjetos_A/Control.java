package ColaboracionEntreObjetos_A;

import java.util.ArrayList;
import java.util.List;

public class Control {
    private int id;
    private String denominacion;
    private Boolean esObligatorio;

    private EstadoControl estadoControl;
    private List<Expediente> ListExpedientes;

    public Control(int id, String denominacion, Boolean esObligatorio) {
        this.id = id;
        this.denominacion = denominacion;
        this.esObligatorio = esObligatorio;
    }

    public Control(int id, String denominacion, Boolean esObligatorio, EstadoControl estadoControl) {
        this.id = id;
        this.denominacion = denominacion;
        this.esObligatorio = esObligatorio;
        this.estadoControl = estadoControl;
    }



    public void agregarxpedienteC(Expediente expediente){
        if (this.ListExpedientes == null)this.ListExpedientes = new ArrayList<>();
        this.ListExpedientes.add(expediente);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Boolean getEsObligatorio() {
        return esObligatorio;
    }

    public void setEsObligatorio(Boolean esObligatorio) {
        this.esObligatorio = esObligatorio;
    }

    public EstadoControl getEstadoControl() {
        return estadoControl;
    }

    public void setEstadoControl(EstadoControl estadoControl) {
        this.estadoControl = estadoControl;
    }

    public List<Expediente> getListExpedientes() {
        return ListExpedientes;
    }

    public void setListExpedientes(List<Expediente> listExpedientes) {
        ListExpedientes = listExpedientes;
    }

    @Override
    public String toString() {
        return "ColaboracionEntreObjetos_A.Control{" +
                "id=" + id +
                ", denominacion='" + denominacion + '\'' +
                ", esObligatorio=" + esObligatorio +
                ", estadoControl=" + estadoControl ;
    }
}
