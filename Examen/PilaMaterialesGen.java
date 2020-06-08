package Examen;

public class PilaMaterialesGen <T> extends ListaEnlazada{
    private ListaEnlazada Esquina;
    private int indice;
    //contructor
    @SuppressWarnings("unchecked")
    public PilaMaterialesGen(){    
        Esquina=new ListaEnlazada();
        indice =0;
    }
    public int cantidad(){
        return indice ;
    }
    public void apilar(int n)throws DesbordamientoPila{
        Esquina.agregarAlInicio(new Nodo(null,n));
        indice++;
    }
     
    public Nodo sacar()throws SubDesbordamientoPila{
        Nodo esacar= Esquina.eliminarAlInicio();
        indice--;
        return esacar;     
    }   
}