package tiles;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void shouldHaveArea10WhenSidesAre2And5() throws Exception {
        assertEquals(10, new Rectangle(2, 5).area(), 0.1);
    }

    @Test
    public void shouldHaveArea25WhenSquareSideIs5() throws Exception {
        assertEquals(25, Rectangle.createSquare(5).area(), 0.1);
    }
}
