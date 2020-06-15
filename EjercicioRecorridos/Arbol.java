package EjercicioRecorridos;
public class Arbol {
    private Nodo raiz;
    private String Recorrido;
    public Arbol(){
        raiz = null;
        Recorrido = "";
    }
    // Metodo a envolver
    private void insertarDesde(Nodo noda,Nodo Desde){
        
        if(Desde.obtenerData()== noda.obtenerData()){
            return;
        }
        if(noda.obtenerData() > Desde.obtenerData()){           
            //Colocar a la Derecha
            if(Desde.Der == null){
                Desde.Der = noda;
                return;
            }else{
                // Nodo 11
                insertarDesde(noda,Desde.Der);
                return;
            }
        }else{
            //colocar a la Izquierda
            if(Desde.Izq == null){
                Desde.Izq = noda;
                return;
            }else{
                // Nodo 5
                insertarDesde(noda,Desde.Izq);
                return;
            }
        }
    }
    // Metodo que envulve Wrapper        
    public void insertar(Nodo noda){
        // Esto pasa cuando la raiz es nula
        // es decir es el primer elemento
        if(raiz == null){
            raiz = noda;
            return; // hace que termine el metodo
        }
        ///////////
        // Si llego aqui la raiz no es nulla
        insertarDesde(noda,raiz);
    }
    public boolean buscar(Nodo noba){
        return buscarDesde(noba,raiz);
    }
    private boolean buscarDesde(Nodo noba,Nodo Desde){
        if(Desde == null){
            return false;
        }
        // Cuando el Nodo es el encontrado
        if(Desde.obtenerData() == noba.obtenerData()){
            return true;
        }
        if(noba.obtenerData() > Desde.obtenerData()){     
            //Derecha
            return buscarDesde(noba,Desde.Der);
        }else{
            //Izquierda
            return buscarDesde(noba,Desde.Izq);
        }
    }
    // VID
    public String toStringPreOrder(){
        Recorrido = "";
        ////////////////////////////
        preOrderDesde(raiz);
        ////////////////////////////
        return Recorrido;
    }    
    private void preOrderDesde(Nodo Desde){
        if(Desde == null){
            return;
        }
        // VALOR    
        Recorrido = Recorrido + " " + Desde; 
        //Recorrido = Recorrido + " " + Desde.obtenerData();
        // IZQ
        preOrderDesde(Desde.Izq);
        // DER
        preOrderDesde(Desde.Der);
    }
    // IVD
    public String toStringinOrder(){
        Recorrido = "";
        ////////////////////////////
        inOrderDesde(raiz);
        ////////////////////////////
        return Recorrido;
    }
    private void inOrderDesde(Nodo Desde){
        if(Desde == null){
            return;
        }
        // IZQ
        inOrderDesde(Desde.Izq);
        // VALOR    
        Recorrido = Recorrido + " " + Desde; 
        //Recorrido = Recorrido + " " + Desde.obtenerData();
        // DER
        inOrderDesde(Desde.Der);
    }
    // IDV
    public String toStringpostOrder(){
        Recorrido = "";
        ////////////////////////////
        postOrderDesde(raiz);
        ////////////////////////////
        return Recorrido;
    }
    private void postOrderDesde(Nodo Desde){
        if(Desde == null){
            return;
        }
        // IZQ
        postOrderDesde(Desde.Izq);
        // DER
        postOrderDesde(Desde.Der);
        // VALOR    
        Recorrido = Recorrido + " " + Desde; 
        //Recorrido = Recorrido + " " + Desde.obtenerData();
        
    }
}