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

        Souris souris = new Souris(100, "blanche", 12, 36);
        String expected = "Souris de couleur blanche, age : 12, poids : 100kg, esperance de vie : 36 mois.";
        assertEquals(expected, souris.toString());
    }

    @Test
    public void testVieillir() {
        Souris souris = new Souris(100, "blanche", 12, 36);
        souris.vieillir();
        assertEquals(13, souris.getAge());
    }

}
