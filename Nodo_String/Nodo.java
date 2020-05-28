
package NodoString;

public class Nodo {
    public Nodo Siguiente;
    private String Data;
    public Nodo(Nodo Sig, String Data){
       this.Siguiente = Sig;
       this.Data = Data;
    }
    public String obtenerData(){
        return Data;
    }
    public void colocarDara(String Data){
        this.Data = Data;
    }
    public String toString(){
        return "Data : "+Data;
    }
    
}
