package tiles;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void shouldHaveArea28Point27WhenRadiusIs3() throws Exception {
        assertEquals(28.27, new Circle(3).area(), 0.1);

    }
}
