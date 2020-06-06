package ListaDLSuerte;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ProbarSuerte {

    public static void main(String[] args) throws IOException{
        BufferedReader Teclado = new BufferedReader(new InputStreamReader(System.in));
        Random Gen = new Random();
        ListaDobleEnlazada L = new ListaDobleEnlazada();
        boolean Pr=false,Ale=false;
        int Num=0,NE=0;
        String Opcion="";
        do{
            System.out.println("INGRESA NUMERO ENTERO");
            Num=Integer.parseInt(Teclado.readLine());
            L.agregarAlInicio(new Nodo<Integer>(Num,1));
            if(Pr==false){
                for(int i=0;i<4;i++){
                    System.out.println("INGRESA NUMERO ENTERO");
                    Num=Integer.parseInt(Teclado.readLine());
                    L.agregarAlInicio(new Nodo<Integer>(Num,1));
                }
                Pr=true;
            }
            System.out.println("DESEA AGREGAR OTRO NUMERO S/N");
            Opcion=Teclado.readLine(); 
        }while(Opcion.equals("S"));
        
        System.out.println(L.toStringReverse());
        System.out.println(L);      
        System.out.println("PROCESANDO");
        NE = (L.obtenerNoElementos())-1;
        for(int j=0;j<NE;j++){
            Ale = Gen.nextBoolean();
            /*
                cara = true
                cruz = false
            */  
            if(Ale==true){
                Nodo Eliminado =L.eliminarAlInicio();
            }
            if(Ale==false){
                Nodo Eliminado =L.eliminarAlFin();      
            }
        }
        System.out.println("NUMERO DE LA SUERTE = "+ L);
    }  
}