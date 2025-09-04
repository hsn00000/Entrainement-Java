import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SourisTest {
    @Test
    public void vieillirShouldIncreaseMouseAgeFromFiveToSixMonths() {
        Souris s1 = new Souris(50, "blanche", 5);
        s1.vieillir();
        assertEquals(6, s1.getAge());
    }
}