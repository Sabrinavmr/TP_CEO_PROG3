package ColaboracionEntreObjetos_C;

import java.time.LocalDate;
import java.util.Date;

public class MainC {
    public static void main(String[] args) {


        LocalDate fecha1 = LocalDate.of(2025,5,20);
        LocalDate fecha2 = LocalDate.of(2025,6,20);

        //
        TipoActividad tA1 = new TipoActividad(222,"tipo1",20.0);
        TipoActividad tA2 = new TipoActividad(222,"tipo2",30.0);
        TipoActividad tA3 = new TipoActividad(333,"tipo3",40.0);
        //

        Actividad act1 = new Actividad(fecha1,fecha2,"actividad 1","descripcion act 1...",tA1);
        Actividad act2 = new Actividad(fecha1,fecha2,"actividad 2","descp act 2...",tA2);

        //
        Sector sector1 = new Sector(1,"sector 1","AAA");
        Sector sector2 = new Sector(2,"sector 2","BBB");
        Sector sector3 = new Sector(3,"sector 3","CCC");

        //
        Persona perso1 = new Persona("pedro","7894561",1234567,44598633,"pedro@gmail.com","26148455");
        Persona perso2 = new Persona("rosa","48894561",1846212,474598633,"rosa@gmail.com","1126448455");
        Persona perso3 = new Persona("juan","7154461",1846212,474598633,"juan@gmail.com","1126448455");

        //
        sector1.agregarPersona(perso1);
        sector1.agregarSector(sector2);
        sector1.agregarSector(sector3);


        sector2.agregarPersona(perso2);
        sector3.agregarPersona(perso1);

        //
        perso1.agregarActividad(act1);
        perso1.agregarActividad(act2);





        //C.1
        System.out.println("Total puntos asignados de las actividades de "+perso1.getNombre()+" :"+perso1.totalPuntosAsignados());

        //C.2
        System.out.println("Puntos asignados del tipo de actividad con su codigo: "+perso1.totalPuntosAsignados(222));

        //c.3
        System.out.println("Puntos asignados de un tipo de actividad, de un periodo asignado: "+perso1.totalPuntosAsignados(222,2025));

        //C.4
        int total = sector1.obtenerTotalSubsectores().size();
        System.out.println("total de subsectores dentro del sector "+sector1.getDenominacion()+" : "+total);
    }
}
