package ColaCircular;
public class NotPol{
    
    private int Vuelta[];
    private int Frente;
    private int Siguiente;
    
    public NotPol(int N){      
        Vuelta=new int[N];
        //Posici�n inicial de Siguiente
        Siguiente=0;
        //Posicion inicial de Frente
        Frente=-1;
    }
    public boolean colaLlena() {
	if((Siguiente==Vuelta.length)) {
            return true;
	}else{
            return false;
	}
    }
    public int ObtenerFrente() {
	return Frente;
    }
    public void encolar(int Num) throws ExcepcionColaLlena{ 
        if(colaVacia()&&(evaluaEspacio()==true)){
            System.out.println("//Reset");
            Frente=-1;
            Siguiente=0;
        }
        if(colaLlena()) {
            throw new ExcepcionColaLlena();
        }	 
        Vuelta[Siguiente]=Num;
        Siguiente++;
        if(Siguiente==1) {
            Frente=0;
        }
    }
    public int sacar() throws ExcepcionColaVacia {
	if(colaVacia()){
            throw new ExcepcionColaVacia();
	}
	int valor=Vuelta[Frente];
	Frente++;
	return valor;
    }
    public boolean colaVacia() {
	if(Frente==Siguiente){
            return true;
	}else if(Frente==-1){            
            return true;
	}else{
            return false;
	}
    }
    
    public boolean evaluaEspacio(){ 
	int PosVacias;
	PosVacias=((Frente+1)%Vuelta.length);
	if(PosVacias>0){
            return true;
	}else{
            return false;
	}
    }
}
