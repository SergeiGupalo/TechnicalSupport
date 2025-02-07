package org.example;

import org.junit.Test;
import java.awt.Color;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShapeFactoryColorTest {

    @Test
    public void testShapeColor() {

        ShapeFactory shapeFactory = new ShapeFactory(18);

        Color actualColor = shapeFactory.paint instanceof Color ? (Color) shapeFactory.paint : null;

        assertNotNull("Color should not be null", actualColor);

        Color expectedColor = Color.red;

        assertEquals("Unexpected color", expectedColor, actualColor);
    }
}
