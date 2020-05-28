package ListasEnlazadaNodo;
import java.io.*;
public class PruebaNodos {

    public static void main(String[] args)throws IOException{
        Nodo N1 = new Nodo(null,0);
        Nodo N2 = new Nodo(null,1);
        Nodo N3 = new Nodo(null,2);
        //Funcionamiento de la referencia
        System.out.println(N1);
        System.out.println(N2);
        System.out.println(N3);
        //Enlazar el Nodo1 al Nodo2
        System.out.println("#################");
        N1.Siguiente = N2;
        System.out.println(N1.Siguiente);
        N2.Siguiente = N3;
        System.out.println(N2.Siguiente);
        ///////////////////////////////////////
        System.out.println("#################");
        System.out.println(N1);
        System.out.println(N1.Siguiente);
        System.out.println(N1.Siguiente.Siguiente);
        ///////////////////////////////////////
        N2 = null;
        N3 = null;
        ///////////////////////////////////////
        System.out.println("-----------------");
        System.out.println(N1);
        System.out.println(N1.Siguiente);
        System.out.println(N1.Siguiente.Siguiente);
        ///////////////////////////////////////
        Nodo ref = N1;
        while(ref != null){
            System.out.println("Valor "+ref);
            ref = ref.Siguiente;
        }
        /*
            ref
            |
            V
            (|0| sig) => (|1| Sig) => |2| sig) => null
            
        */
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader Teclado=new BufferedReader(r);
        int Num =0;
        String resp = "";
        Nodo Inicial = null;
        Nodo SigNod = null;
        Nodo Actual = null;
        
        System.out.println("Bienvenido vamos a guardar numeros enteros");
        do{
            System.out.println("Dame un número");
            Num = Integer.parseInt(Teclado.readLine());
            if(Inicial == null){
               Inicial = new Nodo(null,Num);
               Actual = Inicial;
            }else{
                SigNod = new Nodo(null,Num);
                Actual.Siguiente = SigNod;
                Actual = SigNod;
            }
            System.out.println("Deseas Continuar S/N");
            resp = Teclado.readLine();

        }while(resp.compareToIgnoreCase("S")==0);
        //////////////////////////////////////////////////////
        /*
          NODO INICIAL              NODOSIG             NODOACTUAL
                I                       I                   I
                V                       V                   V
               null                    null                null
          
            (|10|sig) => null          (|10|)
        */
    
        ref = Inicial;
        while(ref != null){
            System.out.println("Valor "+ref);
            ref = ref.Siguiente;
        }
    }
    
}
