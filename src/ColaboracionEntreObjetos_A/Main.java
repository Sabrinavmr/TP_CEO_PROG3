package ColaboracionEntreObjetos_A;

public class Main {
    public static void main(String[] args) {

        //estado control
        EstadoControl e1 = new EstadoControl(1,true);
        EstadoControl e2 = new EstadoControl(2,false);

        //control
        Control c1 = new Control(10,"centro",true,e1);
        Control c2 = new Control(20,"superior",false,e1);
        Control c3 = new Control(30,"inferior",true,e2);
        Control c4 = new Control(40,"manual",true,e1);

        //expediente
        Expediente exp1 = new Expediente(100,"A",100,"expediente a","confidencial","central");
        Expediente exp2 = new Expediente(200,"B",200,"expediente b","confidencial","central");
        Expediente exp3 = new Expediente(300,"C",300,"expediente c","confidencial","central");
        Expediente exp4 = new Expediente(400,"D",400,"expediente d","confidencial","central");

        //
        exp1.agregarControl(c1);
        exp1.agregarControl(c3);
        exp1.agregarControl(c2);
        //
        exp2.agregarControl(c3);
        exp3.agregarControl(c1);
        exp4.agregarControl(c4);

        //
        exp3.agregarExpediente(exp4);
        exp2.agregarExpediente(exp3);
        exp1.agregarExpediente(exp2);

        //A.1
        System.out.println("Caratula del expediente: "+exp1.getCaratulaExpediente());

        //A.2
        System.out.println("Controles obligatorios asociados (denominacion) : "+exp1.getControlesObligatorios());

        //A.3
        System.out.println("Estados de controles obligatorios:"+exp1.getEstadoControles());

        //A.4
        System.out.println("Lista de expediente asociados: "+exp1.listaExpedientes());




    }
}
