package ColaGen;
public class PruebaColaGen {
    public static void main(String[] args) {
        double num =0;
        ColaGenerica<Double> CI = new ColaGenerica(3);
        try{
            System.out.println("AGREGAMOS 1.5");
            CI.encolar(1.5);
            System.out.println("AGREGAMOS 2.5");
            CI.encolar(2.5);
            // Sacar Numero
            num = CI.sacar();
            System.out.println("SACAMOS "+num);
            num = CI.sacar();
            System.out.println("SACAMOS "+num);
            System.out.println("AGREGAMOS 10.5");
            CI.encolar(10.5);
        }catch(ExcepcionColaLlena Err){
            System.out.println(Err.getMessage());
        }catch(ExcepcionColaVacia Err){
            System.out.println(Err.getMessage());
        }
        /////////////////////////////////////////////////////////////////////////
        System.out.println("////////////////////////////////");
        ColaGenerica<String> CS = new ColaGenerica(3);
        String Palabra="";
        try{
            System.out.println("AGREGAMOS hola");
            CS.encolar("hola");
            System.out.println("AGREGAMOS Mundo");
            CS.encolar("Mundo");
            // Sacar Texto
            Palabra = CS.sacar();
            System.out.println("SACAMOS "+ Palabra);
            Palabra = CS.sacar();
            System.out.println("SACAMOS "+ Palabra);
            System.out.println("AGREGAMOS Estructura de Datos");
            CS.encolar("Estructura de Datos");
        }catch(ExcepcionColaLlena Err){
            System.out.println(Err.getMessage());
        }catch(ExcepcionColaVacia Err){
            System.out.println(Err.getMessage());
        }
        /////////////////////////////////////////////////////////////////////////
        System.out.println("////////////////////////////////");
        ColaGenerica<Estudiante> CE = new ColaGenerica(3);
        try{
            Estudiante e1,e2,e3;
            e1 = new Estudiante("19590091","Jeronimo","Sistemas",(byte)3);
            e2 = new Estudiante("19590015","Nuevo","Sistemas",(byte)5);
            System.out.println("AGREGAMOS "+ e1);
            CE.encolar(e1);
            System.out.println("AGREGAMOS "+ e2);
            CE.encolar(e2);
            // Sacar Numero
            Estudiante Ref1 =CE.sacar();
            System.out.println("SACAMOS "+Ref1);
            Estudiante Ref2 =CE.sacar();
            System.out.println("SACAMOS "+Ref2);
            e3 = new Estudiante("19590078","estudiante","Sistemas",(byte)1);
            System.out.println("AGREGAMOS "+e3);
            CE.encolar(e3);
        }catch(ExcepcionColaLlena Err){
            System.out.println(Err.getMessage());
        }catch(ExcepcionColaVacia Err){
            System.out.println(Err.getMessage());
        }
    }
}
