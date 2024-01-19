import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCoche {
    @Test
    public void test_acelerar_una_determinada_velocidad()throws Exception{
        Coche coche = new Coche();
        coche.acelerar(30);
        assertEquals(30,coche.getVelocidad());
    }
}
