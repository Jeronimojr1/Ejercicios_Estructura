package EjercicioArbol;
public class Arbol {
    private Nodo raiz;
    
    public Arbol(){
        raiz = null;
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
}