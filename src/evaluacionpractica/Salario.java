
package evaluacionpractica;

public class Salario {
     String Nombre;
        double renta;
        double sueldo;
        double HT,HP;

    public Salario(String Nombre, double sueldo, double HT, double HP, double renta) {
        this.Nombre = Nombre;
        this.sueldo = sueldo;
        this.HT = HT;
        this.HP = HP;
        this.renta= renta;
    }

    public Salario() {
    }

    public double getHT() {
        return HT;
    }

    public void setHT(double HT) {
        this.HT = HT;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }
    
   public double horasT(){
       double he2,he3;
       double sl=0.0;
       
       if(this.HT<=40){
           sl=this.HT*this.HP;
       }else if(this.HT>40 &&this.HT<=48){
           he2=HT-HP;
           sl=(40*this.HT)+(he2*this.HP*2);
       }else if (this.HT>48){
           he3=this.HT-48;
           sl=(40*this.HP)+(8*this.HP*2)+(he3*this.HP*3);
       }
       return sl;
   }
   
    public double slB(Salario dato){
        
        double salarioB;
        double slb;
        
         salarioB = dato.horasT();
         
       slb=(this.sueldo+salarioB);
         
         return slb;
         
    }

    public double RENTA(){
        double renta;
        
       renta=(this.sueldo*10/100);
       return renta;
        
    }
    
    public double sLQ(Salario dato){
        double sr;
        double sb;
        double salarioLiq;
        
        salarioLiq=dato.RENTA();
        sb=dato.slB(dato);
        
        sr=sb-salarioLiq;
        return sr;
    }
}
