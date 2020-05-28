package ColaEntera;
public class ColaNumEntero {
    private int Esquina [];
    private int Frente;
    private int Siguiente;
    public ColaNumEntero(int N){
        Esquina = new int [N];
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
    public void encolar(int Num)throws ExcepcionColaLlena{
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
    public int sacar()throws ExcepcionColaVacia{
        if(colaVacia()){
           throw new ExcepcionColaVacia(); 
        }
        int Valor = Esquina[Frente];
        Frente++;
        return Valor;
    }
    // Frente -1 0
}
