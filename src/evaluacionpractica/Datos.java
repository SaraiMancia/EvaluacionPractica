
package evaluacionpractica;


public class Datos {
     String ubicacion,nombreE,cantidadDep,cantidadP;

    public Datos(String ubicacion, String nombreE,String cantidadDep, String cantidadP) {
        this.ubicacion = ubicacion;
        this.nombreE = nombreE;
          this.cantidadDep = cantidadDep;
        this.cantidadP = cantidadP;
    }

    

    Datos() {
      
    }

    public String getUbicacion() {
        System.out.println("Direccion: Km 64 1/2 , desvio Hacienda el Nilo, sobre autopista a Zacatecoluca y Usulutan El Salvador. ");        
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        
        this.ubicacion = ubicacion;
    }

    public String getNombreE(){ 
        System.out.println("Nombre del edificio: ITCA FEPADE Edificio C");
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

     
    public String getCantidadDep() {
        System.out.println("Cantidad de departamentos: 4 departamentos ");
        return cantidadDep;
    }

    public void setCantidadDep(String cantidadDep) {
        this.cantidadDep = cantidadDep;
    }

    public String getCantidadP() {
        System.out.println("Cantidad de pisos: 3 pisos en el edificio C Y 2 pisos en el edificio B");
        return cantidadP;
    }

    public void setCantidadP(String cantidadP) {
        this.cantidadP = cantidadP;
    }


}

