
package ListasEnlazadaNodo;

public class PruebaLista2 {

    public static void main(String[] args) {
        ListaEnlazada Lista = new ListaEnlazada();
        System.out.println("La lista es:");
        System.out.println(Lista);
        
        Lista.agregarAlInicio(new Nodo(null,1));
        System.out.println("La lista es:");
        System.out.println(Lista);
        
        Lista.agregarAlInicio(new Nodo(null,2));
        System.out.println("La lista es:");
        System.out.println(Lista);
        // Data 2 Data 1
        // Data 1 Data 2
        ///////////////////////////////////////////////////
        Lista.agregarAlFinal(new Nodo(null,10));
        System.out.println("La lista es:");
        System.out.println(Lista);
        // Data 2 Data 1 Data 10
        
        Lista.agregarAlFinal(new Nodo(null,20));
        System.out.println("La lista es:");
        System.out.println(Lista);
        // Data 2 Data 1 Data 10 Data 20
        ///////////////////////////////////////////////////
        Nodo Busca = new Nodo(null,10);
        boolean Resp;
        Resp = Lista.buscar(Busca);
        System.out.println(Resp);
        System.out.println(Lista);
        Lista.eliminarPorNodo(Busca);
        System.out.println(Lista);
        
        Nodo eliminado = Lista.eliminarAlFin();
        System.out.println(eliminado.Siguiente);
        //////////////////////////////////////////////////
        System.out.println(Lista);
        //System.out.println(Lista.elementoPorIndice(0));
        //System.out.println(Lista.elementoPorIndice(1));
        //System.out.println(Lista.elementoPorIndice(2));
        for(int j =0 ; j<Lista.obtenerNoElementos();j++){
            System.out.println(Lista.elementoPorIndice(j));
        }
    } 
}