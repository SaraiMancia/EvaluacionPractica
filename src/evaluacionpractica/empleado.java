

package evaluacionpractica;

public class empleado {
       String nombre,direccion, cargo,fecha,area;
         int edad,codigoE;
         double sueldo;

    public empleado() {
    }

    public empleado(String nombre, String direccion, String cargo, String fecha, String area, int edad, int codigoE) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cargo = cargo;
        this.fecha = fecha;
        this.area = area;
        this.edad = edad;
        this.codigoE = codigoE;
    }

    public empleado(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigoE() {
        return codigoE;
    }

    public void setCodigoE(int codigoE) {
        this.codigoE = codigoE;
    } 

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
