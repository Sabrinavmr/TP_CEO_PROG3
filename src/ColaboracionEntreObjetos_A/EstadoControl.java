package ColaboracionEntreObjetos_A;

import java.util.ArrayList;
import java.util.List;

public class EstadoControl {
    private long id;
    private Boolean aprobado;
    
    private List<Control> ListControl;

    public EstadoControl(long id, Boolean aprobado) {
        this.id = id;
        this.aprobado = aprobado;
    }

    public void agregarControl(Control control){
        if (this.ListControl == null) this.ListControl =  new ArrayList<>();
        this.ListControl.add(control);
        control.setEstadoControl(this);

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Boolean getAprobado() {
        return aprobado;
    }

    public void setAprobado(Boolean aprobado) {
        this.aprobado = aprobado;
    }

    public List<Control> getListControl() {
        return ListControl;
    }

    public void setListControl(List<Control> listControl) {
        ListControl = listControl;
    }

    @Override
    public String toString() {
        return "ColaboracionEntreObjetos_A.EstadoControl{" +
                "id=" + id +
                ", aprobado=" + aprobado +
                '}';
    }
}
