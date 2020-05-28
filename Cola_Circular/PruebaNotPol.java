package ColaCircular;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PruebaNotPol {
    
    public static void main(String[] args)throws IOException {
        BufferedReader Teclado = new BufferedReader(new InputStreamReader(System.in));
	String Opcion="";
	int Ope1=0,Ope2=0,Ope3=0,Ope4=0,Ope5=0;
        double NumSacado=0,NumNuevo=0;
	NotPol ColaCircular=new NotPol(5);
	System.out.println("ELIGUE UNA OPERACION");
	System.out.println("+.-SUMA");
	System.out.println("-.-RESTA");
	System.out.println("/.-DIVISION");
	System.out.println("*.-MULTIPLICACION");
	Opcion=(Teclado.readLine());
        try{
            System.out.println("Escribe el Operando 1");
            Ope1=Integer.parseInt(Teclado.readLine());
            ColaCircular.encolar(Ope1);
            System.out.println("Escribe el Operando 2");
            Ope2=Integer.parseInt(Teclado.readLine());
            ColaCircular.encolar(Ope2);
            System.out.println("Escribe el Operando 3");
            Ope3=Integer.parseInt(Teclado.readLine());
            ColaCircular.encolar(Ope3);
            System.out.println("Escribe el Operando 4");
            Ope4=Integer.parseInt(Teclado.readLine());
            ColaCircular.encolar(Ope4);
            System.out.println("Escribe el Operando 5");
            Ope5=Integer.parseInt(Teclado.readLine());
            ColaCircular.encolar(Ope5);
        }catch(ExcepcionColaLlena Err){
          System.out.println(Err.getMessage());  
        }
        switch(Opcion){
            case "+":
                try{
		    while(!ColaCircular.colaVacia()){                      
                        NumSacado=ColaCircular.sacar();
		    	NumNuevo=NumSacado+NumNuevo;
		    }
		}catch(ExcepcionColaVacia Err){
                    System.out.println(Err.getMessage());
		}
                break;
            case "-":
                try {
		    while(!ColaCircular.colaVacia()){  
                        NumSacado=ColaCircular.sacar();
                        if(ColaCircular.ObtenerFrente()==1){
                            NumNuevo=NumSacado-NumNuevo;
                        }else{
                            NumNuevo=NumNuevo-NumSacado;
                        } 
                    }
		}catch(ExcepcionColaVacia Err){
                    System.out.println(Err.getMessage());
		}
                break;
            case "/":
		try{
                    while(!ColaCircular.colaVacia()){
                        NumSacado=ColaCircular.sacar();
                        if(ColaCircular.ObtenerFrente()==1) {
                            NumNuevo=NumSacado;
                        }else{
                            NumNuevo=(NumNuevo)/(NumSacado);
                        } 
                    }        
		}catch(ExcepcionColaVacia Err) {
                    System.out.println(Err.getMessage());
		}
                break;
            case "*":
                try{
		    while(!ColaCircular.colaVacia()){  
                        NumSacado=ColaCircular.sacar();
                        if(ColaCircular.ObtenerFrente()==1){                                
                            NumNuevo=NumSacado;
                        }else{ 
                            NumNuevo=NumNuevo*NumSacado;
                        } 
                    }
		}catch(ExcepcionColaVacia Err){
                    System.out.println(Err.getMessage());
		}
                break;
            default:
                System.out.println("ERROR INGRESA UNA OPCION VALIDA");
                break;
        }
        System.out.println("EL RESULTADO ES= "+NumNuevo);
	System.out.println("NOTACION POLACA= "+Opcion+" "+Ope1+" "+Ope2+" "+Ope3+" "+Ope4+" "+Ope5);
    }  
}