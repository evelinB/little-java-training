package paquete;

import org.junit.Before;
import org.junit.Test;
import tipos.Genero;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PersonaTest {
    private static final String NOMBRE = "Eve";
    private static final int DNI = 31676191;
    private static final Byte EDAD = 25;
    private static final Genero GENERO = Genero.FEMENINO;

    //Declarar instancia de persona;
    public Persona persona;
    //crear un metodo anotado con @Before llamado setUp que dentro inicialice la instancia construyendo una persona
    @Before
    public void setUp() {
        persona = new Persona(NOMBRE, DNI,EDAD,GENERO);
    }
    //crear test que verifique cada uno de los atributos de la persona
    @Test
    public void debeVerificarQueSeLlamaEve() { assertThat(persona.getNombre(), is(NOMBRE)); }
    @Test
    public void debeVerificarElDni() {
        assertThat(persona.getDni(), is(DNI));
    }
    @Test
    public void debeVerificarLaEdad() {assertThat(persona.getEdad(), is(EDAD));}
    @Test
    public void debeVerificarElGenero(){assertThat(persona.getGenero(), is(GENERO));}
    //crear un test que verifique que la persona sabe hablar()
    @Test
    public void debeAsegurarQueLaPersonaHabla() {
        String resultado = persona.hablar();
        //Persona persona2 = new Persona("Arcangel",10564786);
        //String resultado2 = persona2.hablar();
        assertThat(resultado, is("Hola me llamo " + NOMBRE));
    }
}