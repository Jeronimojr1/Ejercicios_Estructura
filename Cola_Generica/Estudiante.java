package ColaGen;

public class Estudiante {
    private String Nocontrol;
    private String Nombre;
    public String Carrera;
    private byte Semestre;
    
    public Estudiante(String Nocontrol, String Nombre, String Carrera, byte Semestre){
        this.Nocontrol = Nocontrol;
        this.Nombre = Nombre;
        this.Carrera = Carrera;
        this.Semestre = Semestre;
    }
    
    /////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////CONTRUCTOR COPIA///////////////////////////////////////////
    public Estudiante(Estudiante Est){
        this(Est.obtenerNocontrol(),Est.obtenerNombre(),Est.Carrera,Est.obtenerSemestre());
    }
    /////////////////////////////////////////////////////////////////////////////////////
    
    public String obtenerNocontrol(){
        return this.Nocontrol;
    }
    public String obtenerNombre(){
        return this.Nombre;
    }
    public byte obtenerSemestre(){
        return this.Semestre;
    }
    //Incrementa Semestre
    public void incrementarSemestre(){
        this.Semestre++;
    }
    //toString
    public String toString(){
        String tmp = "";
        tmp = "Nombre " + Nombre+ " ";
        tmp += "NoControl " + Nocontrol+" ";
        tmp += "Carrera " + Carrera+" ";
        tmp += "Semestre " + Semestre+" ";
        return tmp;
    }
    public int compareTo(Estudiante Obj){
        int comp;
        comp = Nombre.compareTo(Obj.obtenerNombre());
        //Nombre son igulaes
        if (comp == 0){
            return 0;
        }else if(comp < 0){
            //Primer nombre es menor
            return -1;
        }else{
            //Primer Nombre es mayor
            return 1;
        }
    }
}