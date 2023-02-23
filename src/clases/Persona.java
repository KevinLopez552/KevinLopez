
package clases;


public class Persona {
    
    int Num;
    String Nombre;
    Double Peso;

    public Persona(int Num, String Nombre, Double Peso) {
        this.Num = Num;
        this.Nombre = Nombre;
        this.Peso = Peso;
    }    

    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Double getPeso() {
        return Peso;
    }

    public void setPeso(Double Peso) {
        this.Peso = Peso;
    }
    
    public static String Mundo(){
        return "Hola Mundo";
        
    }
    
    
}
