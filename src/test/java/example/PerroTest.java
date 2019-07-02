package example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PerroTest {

    private static final String COMIDA = "Doggy";
    private static final int NRO_PATAS = 4;

    private Perro perro;

    @Before
    public void setUp() {
        perro = new Perro(NRO_PATAS, COMIDA);
    }

    @Test
    public void debeAsegurarQueSePerroTieneCuatroPatas() {
        assertThat(perro.getNroPatas(), is(NRO_PATAS));
    }

    @Test
    public void debeAsegurarQuePerroComeDoggy() {
        assertThat(perro.getComida(), is(COMIDA));
    }

    @Test
    public void debeAsegurarQuePerroEnojadoMuestraLosDientes() {
        String resultado = perro.enojado();

        assertThat(resultado, is("Muestro los dientes"));
    }

    @Test
    public void debeAsegurarQuePerroFelizMueveLaCola() {
        String resultado = perro.feliz();

        assertThat(resultado, is("Mueve la cola!"));
    }

    @Test
    public void debeAsegurarQuePerroLadra() {
        String resultado = perro.sonido();

        assertThat(resultado, is("Woof!"));
    }

    @Test
    public void debeAsegurarQuePerroTragaDoggy() {
        String resultado = perro.comer();

        assertThat(resultado, is("Trago " + COMIDA));
    }

    @Test
    public void debeAsegurarQuePerroCaminaEnCuatroPatas() {
        String resultado = perro.mover();

        assertThat(resultado, is("Camino en " + NRO_PATAS + " patas"));
    }
}
