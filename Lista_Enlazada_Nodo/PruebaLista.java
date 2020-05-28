package ListasEnlazadaNodo;
public class PruebaLista {
    
    public static void main(String[] args) {
        ListaEnlazada Lista = new ListaEnlazada();
        Lista.agregarAlInicio(new Nodo(null,10));
        System.out.println(Lista.obtenerNoElementos());
        Lista.agregarAlInicio(new Nodo(null,20));
        System.out.println(Lista.obtenerNoElementos());
        Lista.agregarAlFinal(new Nodo(null,-10));
        System.out.println(Lista.obtenerNoElementos());
        Lista.agregarAlFinal(new Nodo(null,-20));
        System.out.println(Lista.obtenerNoElementos());
        
        ///////////////////////////////////////////////////
        // si lo encuentra
        Nodo Buscar = new Nodo(null,-20);
       /* Nodo R = Lista.buscar(Buscar);
        if(R == null){
            System.out.println("Valor no encontrado");
        }else{
            System.out.println("Valor encontrado");
            System.out.println(R);
        }
        ///////////////////////////////////////////////////
        //Donde no lo encuentra
        Buscar = new Nodo(null,-200);
        R = Lista.buscar(Buscar);
        if(R == null){
            System.out.println("Valor no encontrado");
        }else{
            System.out.println("Valor encontrado");
            System.out.println(R);
        }
        ////////////////////////////////////////////////////
        // sacar un elemento al inicio
        R = Lista.eliminarAlInicio();
        if(R == null){
           System.out.println("La lista estaba vacia");
        }else{
            System.out.println("Elemento eliminado");
            System.out.println(R);
            System.out.println("Elemento en la lista " + Lista.obtenerNoElementos());
        }
        //////////////////////////////////////////////////////////////////////////////
        // Sacar un elemento por el fin
        R = Lista.eliminarAlFin();
        if(R == null){
           System.out.println("La lista estaba vacia");
        }else{
            System.out.println("Elemento eliminado");
            System.out.println(R);
            System.out.println("Elemento en la lista " + Lista.obtenerNoElementos());
        }*/
    }   
}