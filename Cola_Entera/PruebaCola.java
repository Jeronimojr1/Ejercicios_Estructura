package ColaEntera;
public class PruebaCola {

    public static void main(String[] args) {
        int num =0;
        ColaNumEntero Cl = new ColaNumEntero(3);
        try{
            System.out.println("AGREGAMOS 1");
            Cl.encolar(1);
            System.out.println("AGREGAMOS 2");
            Cl.encolar(2);
            // Sacar Numero
            num = Cl.sacar();
            System.out.println("SACAMOS "+num);
            num = Cl.sacar();
            System.out.println("SACAMOS"+num);
            System.out.println("AGREGAMOS 10");
            Cl.encolar(10);
        }catch(ExcepcionColaLlena Err){
            System.out.println(Err.getMessage());
        }catch(ExcepcionColaVacia Err){
            System.out.println(Err.getMessage());
        }
    }  
}