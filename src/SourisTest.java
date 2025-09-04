import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SourisTest {
    @Test
    public void testEvolue() {
        Souris souris = new Souris(100, "blanche", 12, 36);
        souris.evolue();
        assertEquals(36, souris.getAge());
    }

    @Test
    public void testToString() {

    }

    @Test
    public void testVieillir() {

    }
}
