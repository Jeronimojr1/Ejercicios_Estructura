import java.util.Random;
public class PruebaVJ {
    public static void main(String[] args) {
        Random gen = new Random();
        PilaMaterialesGen<Integer> PM = new PilaMaterialesGen<>(10);
        PilaMaterialesGen<Integer> PR = new PilaMaterialesGen<>(10);
        PilaMaterialesGen<Integer> PH = new PilaMaterialesGen<>(10);       
        boolean Mesa=false;
        boolean Barco=false;
        boolean Baston=false;
        boolean Cana_p=false;
        boolean Cuerda=false;  
        int NumAle=0;
        for(int Dia=0; Dia<30 ;Dia++){
            NumAle =gen.nextInt(3);
            /////////////////////LLENADO DE PILA PM,PR,PH///////////////////////
            if(NumAle==0){
                try{
                    PM.apilar(0);
                }catch(DesbordamientoPila e){
                    System.out.println(e.getMessage()+"MADERA YA ESTA LLENA");
                }      
            }
            if(NumAle==1){
                try{
                    PR.apilar(1);
                }catch(DesbordamientoPila e){
                    System.out.println(e.getMessage()+"RESINA YA ESTA LLENA");
                }      
            }
            if(NumAle==2){
                try{
                    PH.apilar(2);
                }catch(DesbordamientoPila e){
                    System.out.println(e.getMessage()+"HILO YA ESTA LLENA");
                }
            }
            ////////////////////CREACION DE HERRAMINETAS////////////////////////
            if((PM.cantidad()>4) && (Mesa==false)){
                for(int i=0;i<4;i++){
                    try{                      
                        PM.sacar();
                    }catch(SubDesbordamientoPila e){  
                        System.out.println(e.getMessage());
                    }
                } 
                Mesa=true;
                System.out.println("Mesa Adquirida");  
            }
            if((Mesa==true) && (PM.cantidad()==2) && (Baston==false)){
                for(int i=0;i<2;i++){
                    try{                      
                        PM.sacar();
                    }catch(SubDesbordamientoPila e){  
                        System.out.println(e.getMessage());
                    }
                }
                Baston=true;
                System.out.println("Baston Adquirido");
            }
            if((Mesa==true) && (PH.cantidad()==4) && (PR.cantidad()>=1) && (Cuerda==false)){
                try{                      
                    PH.sacar();
                    PH.sacar();
                    PH.sacar();
                    PH.sacar();
                    PR.sacar();
                }catch(SubDesbordamientoPila e){  
                    System.out.println(e.getMessage());
                }
                Cuerda=true;
                System.out.println("Cuerda Adquirida"); 
            }
            if((Mesa==true)&&(Baston==true)&&(Cuerda==true)&&(Cana_p==false)){
                Cana_p=true;
                System.out.println("Caña de Pescar Adquirida");   
            }
            if((Mesa==true)&&(PM.cantidad()==5)&& (Barco==false)){
                for(int i=0;i<5;i++){
                     try{                      
                         PM.sacar();
                     }catch(SubDesbordamientoPila e){  
                         System.out.println(e.getMessage());
                     }
                 }
                Barco=true;
                System.out.println("Barco Adquirido"); 
            }
        }
    }
}