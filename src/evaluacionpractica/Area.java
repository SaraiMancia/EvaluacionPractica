
package evaluacionpractica;


public class Area {
    String Ccomputos,Biblioteca,zonaVerde,lab,cancha;
public Area(String Ccomputos, String Biblioteca, String zonaVerde, String lab, String cancha) {
        this.Ccomputos = Ccomputos;
        this.Biblioteca = Biblioteca;
        this.zonaVerde = zonaVerde;
        this.lab = lab;
        this.cancha = cancha;
    }

    public Area() {
    }

    public String getCcomputos() {
        System.out.println("El codigo de los computos es: us01");
        return Ccomputos;
    }

    public void setCcomputos(String Ccomputos) {
        this.Ccomputos = Ccomputos;
    }

    public String getBiblioteca() {
        System.out.println("El codigo de la biblioteca es: 567");
        return Biblioteca;
    }

    public void setBiblioteca(String Biblioteca) {
        this.Biblioteca = Biblioteca;
    }

    public String getZonaVerde() {
        System.out.println("El codigo de la zona verde es: v345");
        return zonaVerde;
    }

    public void setZonaVerde(String zonaVerde) {
        this.zonaVerde = zonaVerde;
    }

    public String getLab(){
        System.out.println("El codigo de laboratorio : L098");
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public String getCancha() {
        System.out.println("El codigo de la cancha es: C865");
        return cancha;
    }

    public void setCancha(String cancha) {
        this.cancha = cancha;
    }

    
}

