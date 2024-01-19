import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCoche {
    @Test
    public void test_acelerar_una_determinada_velocidad()throws Exception{
        Coche coche = new Coche();
        coche.acelerar(30);
        assertEquals(30,coche.getVelocidad());
    }

    @Test
    public void test_frenar_desde_una_determinada_velociadad() throws Exception{
        Coche coche = new Coche();
        coche.acelerar(50);
        coche.frenar(30);
        assertEquals(20,coche.getVelocidad());
    }
}
