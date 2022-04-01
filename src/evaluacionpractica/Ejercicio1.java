
package evaluacionpractica;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Salario s = new Salario();
        
        String nombre;
        Double sueldo;
        double HT,HP;
            
        System.out.println("Ingrese su nombre: ");
        nombre=leer.nextLine();
        System.out.println("Ingrese su salario: ");
       sueldo= leer.nextDouble();
        System.out.println("Horas trabajadas en el mes: ");
        HT=leer.nextDouble();
        System.out.println("El pago por hora: ");
        HP=leer.nextDouble();
       
       s.setNombre(nombre);
       s.setSueldo(sueldo);       
       s.setHT(HT);
       s.setHP(HP);
       
        System.out.println("Nombre del em'pleado: "+s.getNombre());
        System.out.println("Salario Bruto del empleado: "+s.slB(s));
        System.out.println("Salario Liquido: "+s.sLQ(s));
        System.out.println("Rentencion del salario: "+s);
   
    }
}
