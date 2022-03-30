
package evaluacionpractica;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);
         empleado e= new empleado();
         
         String nombre,direccion, cargo,fecha,area;
         int edad,codigoE;
         
         System.out.println("Ingrse su nombre: ");
         e.setNombre(leer.nextLine());
         System.out.println("Ingrese su edad: ");
         e.setEdad(leer.nextInt());
         System.out.println("Su direccion: ");
         e.setDireccion(leer.nextLine());
         System.out.println("Codigo de empleado: ");
         e.setCodigoE(leer.nextInt());
         System.out.println("Area al que pertenece: ");
         e.setArea(leer.nextLine());
         System.out.println("Cargo que desempeña: ");
         e.setCargo(leer.nextLine());
         System.out.println("su sueldo base: ");
         e.setSueldo(leer.nextDouble());
         System.out.println("Fecha en la que ingreso al trabajo: ");
         e.setFecha(leer.nextLine());
         
         System.out.println("<<<<<------------>>>>>>");
         System.out.println("");
    }
}
