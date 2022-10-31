package assignment.rectangle.test;
import assignment.rectangle.entity.Rectangle;
import assignment.rectangle.logic.RectangleOperations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleOperationsTest {

    @Test
    public void testisIntersectingHappyPath(){
        Rectangle rec1 = new Rectangle(0,0,6,4);
        Rectangle rec2 = new Rectangle(4,2,10,10);

        String result = "Points of intersection are: (4, 2) (6, 4) (6, 2) (4, 4)";
        assertEquals(RectangleOperations.isIntersecting(rec1, rec2), result);
    }

    @Test
    public void testisIntersecting_illegalScenario(){
        Rectangle rec1 = new Rectangle(0, 0, 2, 2);
        Rectangle rec2 = new Rectangle(4, 4, 4,5);

        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> RectangleOperations.isIntersecting(rec1, rec2), "");

        assertTrue(thrown.getMessage().contains("Illegal Rectangle Coordinates"));
    }

    @Test
    public void testisContainmentHappyPath(){
        Rectangle rec2 = new Rectangle(4, 4, 10, 12);
        Rectangle rec1 = new Rectangle(5, 5, 8, 10);

        assertEquals(RectangleOperations.isContainment(rec1, rec2), true);
    }

    @Test
    public void testisContainment_illegalScenario(){
        Rectangle rec2 = new Rectangle(4, 4, 4, 12);
        Rectangle rec1 = new Rectangle(5, 5, 8, 10);

        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> RectangleOperations.isContainment(rec1, rec2), "");

        assertTrue(thrown.getMessage().contains("Illegal Rectangle Coordinates"));
    }

    @Test
    public void testisAdjacentHappyPath(){
        Rectangle rec1 = new Rectangle(0, 4, 4, 5);
        Rectangle rec2 = new Rectangle(4, 4, 8, 7);

        assertEquals(RectangleOperations.isAdjacent(rec1, rec2), true);
    }

    @Test
    public void testisAdjacent_illegalScenario(){
        Rectangle rec1 = new Rectangle(0, 0, 4, 6);
        Rectangle rec2 = new Rectangle(4, 5, 4,12);

        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> RectangleOperations.isAdjacent(rec1, rec2), "");

        assertTrue(thrown.getMessage().contains("Illegal Rectangle Coordinates"));
    }
}