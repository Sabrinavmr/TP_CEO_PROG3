package ColaboracionEntreObjetos_C;

import java.util.ArrayList;
import java.util.List;

public class Sector {
    private int numero;
    private String denominacion;
    private String tipo;

    private Sector sectorPadre;
    private List<Sector> sectores = new ArrayList<>();

    private List<Persona> personas = new ArrayList<>();

    public Sector(int numero, String denominacion, String tipo) {
        this.numero = numero;
        this.denominacion = denominacion;
        this.tipo = tipo;
    }


    //C.4
    public List<Sector> obtenerTotalSubsectores(){
        //retorna la totalidad de subsectores de un sector
        List<Sector> total = new ArrayList<>();
        metodoRecursivoSubsectores(this,total);

        return total;
    }

    public void metodoRecursivoSubsectores(Sector sector, List<Sector> acumu){

        if ( sector.sectores != null ){
            for (Sector ss : sector.sectores){
                acumu.add(ss);
                metodoRecursivoSubsectores(ss,acumu);

            }
        }
    }



    public void agregarSector(Sector s){
        if (this.sectores == null) this.sectores = new ArrayList<>();
        this.sectores.add(s);

    }

    public void agregarPersona(Persona p){
        if (this.personas == null)this.personas = new ArrayList<>();
        this.personas.add(p);
        p.setSector(this);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Sector getSectorPadre() {
        return sectorPadre;
    }

    public void setSectorPadre(Sector sectorPadre) {
        this.sectorPadre = sectorPadre;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public List<Sector> getSectores() {
        return sectores;
    }

    public void setSectores(List<Sector> sectores) {
        this.sectores = sectores;
    }

    @Override
    public String toString() {
        return "Sector{" +
                "numero=" + numero +
                ", denominacion='" + denominacion + '\'' +
                ", tipo='" + tipo + '\'' +
                ", sectorPadre=" + sectorPadre +
                ", personas=" + personas +
                ", sectores=" + sectores +
                '}';
    }
}
