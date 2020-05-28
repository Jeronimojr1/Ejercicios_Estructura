
package NodoString;
import java.io.*;
public class PruebaNodoString {

    public static void main(String[] args)throws IOException{
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader Teclado=new BufferedReader(r);
        String Cadena ="";
        Nodo Inicial = null;
        Nodo SigNod = null;
        Nodo Actual = null;
        
        System.out.println("Bienvenido vamos a guardar datos String");
        for(int i=0; i<=9;i++){
            System.out.println("Igresa dato");
            Cadena = Teclado.readLine();
            if(Inicial == null){
               Inicial = new Nodo(null,Cadena);
               Actual = Inicial;
            }else{
                SigNod = new Nodo(null,Cadena);
                Actual.Siguiente = SigNod;
                Actual = SigNod;
            }    
        }
        Nodo ref = Inicial;
        while(ref != null){
            System.out.println("Valor "+ref);
            ref = ref.Siguiente;
        }
    }
    
}
