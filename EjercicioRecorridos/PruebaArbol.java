package EjercicioRecorridos;
public class PruebaArbol {
    
    public static void main(String[] args) {
        Arbol bonsai = new Arbol();
        bonsai.insertar(new Nodo(10));
        if(bonsai.buscar(new Nodo(10))){
            System.out.println("EL 10 SI SE ENCUENTRA");
        }
        ////////////////////////////////////////////////////
        Nodo AB;
        ////////////////////////////////////////////////////
        AB= new Nodo(0);
        if(bonsai.buscar(AB)){
            System.out.println("EL "+AB+" SI SE ENCUENTRA");
        }else{
            System.out.println("EL "+AB+" NO SE ENCUENTRA");
        }
        ////////////////////////////////////////////////////
        AB= new Nodo(5);
        bonsai.insertar(AB);
        if(bonsai.buscar(AB)){
            System.out.println("EL "+AB+" SI SE ENCUENTRA");
        }else{
            System.out.println("EL "+AB+" NO SE ENCUENTRA");
        }
        ////////////////////////////////////////////////////
        AB= new Nodo(15);
        bonsai.insertar(AB);
        if(bonsai.buscar(AB)){
            System.out.println("EL "+AB+" SI SE ENCUENTRA");
        }else{
            System.out.println("EL "+AB+" NO SE ENCUENTRA");
        }
        ////////////////////////////////////////////////////
        AB= new Nodo(4);
        bonsai.insertar(AB);
        if(bonsai.buscar(AB)){
            System.out.println("EL "+AB+" SI SE ENCUENTRA");
        }else{
            System.out.println("EL "+AB+" NO SE ENCUENTRA");
        }
        ////////////////////////////////////////////////////
        AB= new Nodo(16);
        bonsai.insertar(AB);
        if(bonsai.buscar(AB)){
            System.out.println("EL "+AB+" SI SE ENCUENTRA");
        }else{
            System.out.println("EL "+AB+" NO SE ENCUENTRA");
        }    
        ////////////////////////////////////////////////////
        AB= new Nodo(8);
        bonsai.insertar(AB);
        if(bonsai.buscar(AB)){
            System.out.println("EL "+AB+" SI SE ENCUENTRA");
        }else{
            System.out.println("EL "+AB+" NO SE ENCUENTRA");
        }    
        ////////////////////////////////////////////////////
        AB= new Nodo(11);
        bonsai.insertar(AB);
        if(bonsai.buscar(AB)){
            System.out.println("EL "+AB+" SI SE ENCUENTRA");
        }else{
            System.out.println("EL "+AB+" NO SE ENCUENTRA");
        }    
        ////////////////////////////////////////////////////
        AB= new Nodo(1111);
        if(bonsai.buscar(AB)){
            System.out.println("EL "+AB+" SI SE ENCUENTRA");
        }else{
            System.out.println("EL "+AB+" NO SE ENCUENTRA");
        }
        System.out.println("Pre-Order = " + bonsai.toStringPreOrder());
        System.out.println("In-Order = " + bonsai.toStringinOrder());
        System.out.println("Post-Order = " + bonsai.toStringpostOrder());
    } 
}