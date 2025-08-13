package ColaboracionEntreObjetos_A;

import java.util.ArrayList;
import java.util.List;

public class Expediente {
    private int id;
    private String letra;
    private int numero;
    private String descripcion;
    private String tipo;
    private String ambito;

    private List<Expediente> listaExpendientes = new ArrayList<>(); // los hijos
    private Expediente expedientePadre; // Padre de este expediente

    private List<Control> controles = new ArrayList<>();

    public Expediente(int id, String letra, int numero, String descripcion, String tipo, String ambito) {
        this.id = id;
        this.letra = letra;
        this.numero = numero;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.ambito = ambito;
    }

    public void agregarExpediente(Expediente exp){
        if (this.listaExpendientes == null) this.listaExpendientes = new ArrayList<>();
        exp.setExpedientePadre(this); //establecer padre
        this.listaExpendientes.add(exp);
    }


    //A.4
    public List<Expediente> listaExpedientes(){
        List<Expediente> todos = new ArrayList<>();
        agregarHijosExpRecursiva(this, todos);
        return todos;
    }

    public void agregarHijosExpRecursiva(Expediente exp, List<Expediente> acumu){

        if (exp.listaExpendientes != null) {
            for (Expediente hijo : exp.listaExpendientes) {
                acumu.add(hijo); // Agrego el hijo directo
                agregarHijosExpRecursiva(hijo, acumu); // Recursión
            }
        }
    }


    public void agregarControl(Control control){
        if (this.controles == null) this.controles = new ArrayList<>();
        this.controles.add(control);
        control.agregarxpedienteC(this);

    }

    //A.1
    public String getCaratulaExpediente(){
        //String num = Integer.toString(numero);
        return numero +" - "+ letra +" - "+ descripcion;
    }

    //A.2
    public String getControlesObligatorios(){
        List<String> obligatorios = new ArrayList<>();

        for (Control c : controles){
            if (c.getEsObligatorio()){
                obligatorios.add(c.getDenominacion());
            }
        }
        //return obligatorios.toString(); = usamos toString sobre una List<String> --> [www, rrr, rr]
        return String.join(",",obligatorios); // ej: wer, eed, dew
    }

    //A.3
    public boolean getEstadoControles(){
       for (Control c : controles){
           if (c.getEsObligatorio() && !c.getEstadoControl().getAprobado()){
               return false; //si un obligatorio esta desaprobado, false
           }
       }

       return true;
    }


    //get y set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public List<Expediente> getListaExpendientes() {
        return listaExpendientes;
    }

    public void setListaExpendientes(List<Expediente> listaExpendientes) {
        this.listaExpendientes = listaExpendientes;
    }

    public Expediente getExpedientePadre() {
        return expedientePadre;
    }

    public void setExpedientePadre(Expediente expedientePadre) {
        this.expedientePadre = expedientePadre;
    }


    @Override
    public String toString() {
        return "ColaboracionEntreObjetos_A.Expediente{" +
                "id=" + id +
                ", letra='" + letra + '\'' +
                ", numero=" + numero +
                ", descripcion='" + descripcion + '\'' +
                ", tipo='" + tipo + '\'' +
                ", ambito='" + ambito + '\'' +
                ", controles=" + controles +
                '}';
    }
}
