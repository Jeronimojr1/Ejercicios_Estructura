
package ColaGen;
public class ColaGenerica<T> {
    private T Esquina [];
    private int Frente;
    private int Siguiente;
    //Constructor
    @SuppressWarnings("unchecked")
    public ColaGenerica(int N){
        Esquina = (T[])new Object[N];
        // Posicion inicial de siguiente
        Siguiente = 0;
        // Posicion inicial de Frente
        Frente = -1;
    }
    public Boolean colaLlena(){
        if(Siguiente == Esquina.length){
           return true; 
        }else{
           return false;
        }       
    }
    public void encolar(T Num)throws ExcepcionColaLlena{
        // Sila cola esta vacia RESET
        if(colaVacia()){      
            //System.out.println("RESET");
            Frente = -1;
            Siguiente = 0; 
        }
        if (colaLlena()){
            throw new ExcepcionColaLlena();
        }
        Esquina[Siguiente]= Num;
        Siguiente++;
        // Cuando Apenas Agregue un Elemento
        if(Siguiente== 1){
            Frente = 0;
        }
    }
    public boolean colaVacia(){
        if(Frente == Siguiente){
            return true;
        }else if(Frente ==-1){
            return true;
        }else{
            return false;
        }
    }
    public T sacar()throws ExcepcionColaVacia{
        if(colaVacia()){
           throw new ExcepcionColaVacia(); 
        }
        T Valor = Esquina[Frente];
        Frente++;
        return Valor;
    }
    // Frente -1 0
}
