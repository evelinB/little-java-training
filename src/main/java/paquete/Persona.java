package paquete;

import lombok.AllArgsConstructor;
import tipos.Genero;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Persona {
    //defino atributos
    private String nombre;
    private int dni;
    //getter y setter con annotations
    @Getter
    @Setter
    private byte edad;
    @Getter
    @Setter
    private Genero genero;
    //constructor con nombre y dni
    public Persona(String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    //constructor con nombre, dni y edad
    public Persona(String nombre, int dni, byte edad){
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    //setter definidos sin annotation //accesors
    public void setNombre(String nombre) { this.nombre = nombre;}
    public void setDni(int dni){this.dni = dni;}
    //getter definidos sin annotation
    public String getNombre(){return nombre;}
    public int getDni(){return dni;}

    //definir metodo hablar
    public String hablar() {
        return "Hola me llamo " + nombre;
    }

}


