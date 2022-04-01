
package evaluacionpractica;

import java.util.Scanner;
public class Ejercicio2 {
    
    Scanner leer;
    String nombre,direccion,nEdificio,fecha;
    int cargo,edad;
    double salario,salariofinal,renta,AFP,ISSS;
    

    
   public void inicializar() {
       
        leer=new Scanner(System.in);
        
        System.out.print("Ingrese su nombre:");
        nombre=leer.nextLine();
        System.out.print("Ingrese su edad:");
        edad=leer.nextInt();
        System.out.print("Ingrese su salario base:");
        salario=leer.nextDouble();
        System.out.print("Ingrese 1 si su cargo es por servicio y 2 si es permanente:");
        cargo =leer.nextInt();
          System.out.print("Ingrese su direccion: ");
          direccion=leer.toString();
        System.out.println("Ingrese su fecha de inicio de trabajo: ");
        fecha=leer.nextLine();
          System.out.print("Ingrese numero de edificio: ");
        nEdificio=leer.nextLine();
       System.out.println("");
    }

    public void imprimir() {
        System.out.println("------------------DATOS PERSONALES--------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
         System.out.println("Direccion: "+direccion);
         System.out.println("Fecha de ingreso: "+fecha);
         System.out.println("Numero de edificio al que pertenece: "+nEdificio );
         System.out.println("");
    }
    public void cargo() {
        if (cargo==1) {
            renta= (salario * 0.10);
             salariofinal= (salario-renta);
             System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            System.out.print("El cargo es por servicio y su salario menos renta es : $"+ salariofinal+"\n");
             System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            
        } else if(cargo==2){
             renta= (salario * 0.10);
             ISSS= (salario* 0.14);
             AFP= (salario * 0.10);
             salariofinal= (salario-renta-ISSS-AFP);
             System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            System.out.print(" El cargo es permanente y su salario final es: $"+salariofinal+"\n");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }
        }
    public static void main(String[] args) {
        Datos d= new Datos();
       Ejercicio2 DatosP;
       
        DatosP=new Ejercicio2();
        DatosP.inicializar();
        DatosP.imprimir();
        DatosP.cargo();
        
         System.out.println("");
         System.out.println("----------DATOS EDIFICIO-----------");
         
        d.getUbicacion();
        d.getNombreE();
        d.getCantidadDep();
        d.getCantidadP();
        
        System.out.println("");
        System.out.println("--------------DATOS AREA------------");
         
         Area c= new Area();
         c.getCcomputos();
         c.getBiblioteca();
         c.getCancha();
         c.getLab();
         c.getZonaVerde();
    }
} 

