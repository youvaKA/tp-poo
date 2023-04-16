import org.junit.*;
import static org.junit.Assert.*;

import factory.Robot;
import factory.util.*;

public class RobotTest {	

    @Test
    public void robotCarryNoBoxWhenCreated() {
        Robot robbie = new Robot();
        assertFalse(robbie.carryingBox());
    }

    @Test
    public void robotCanTakeBoxIfNotCarrying(){
        Robot robbie = new Robot();
        Box box = new Box(10);
        assertFalse(robbie.carryingBox()); //check if robbie don't have box

        robbie.take(box);
        assertSame(box, robbie.getCarriedBox());

    }

    @Test
    public void robotCannotTakeBoxIfAlreadyCarrying(){
        Robot robbie = new Robot();
        Box b1 = new Box(15);
        Box b2 = new Box(10);
        robbie.take(b1);
        assertTrue(robbie.carryingBox()); //check if robbie have box

        robbie.take(b2);
        assertEquals(robbie.getCarriedBox().getWeight(),b1.getWeight());
    }

    @Test
    public void robotCannotPutOnBoxIfNotCarrying(){
        Robot robbie = new Robot();
        ConveyerBelt cb = new ConveyerBelt(10);
        assertFalse(robbie.putOn(cb));
    }

    @Test
    public void robotHaveABoxAndPutOnConveyerBelt(){
        Robot robbie = new Robot();
        ConveyerBelt cb = new ConveyerBelt(10);
        assertFalse(robbie.putOn(cb)); // don't have a box

        Box b1 = new Box(8);
        robbie.take(b1); // robbie take a box b1
        assertTrue(robbie.putOn(cb));
    }

    @Test
    public void robotHaveABoxAndPutATooHeavyBoxOnConveyerBelt(){
        Robot robbie = new Robot();
        ConveyerBelt cb = new ConveyerBelt(10); // max weight 10
        assertFalse(robbie.putOn(cb)); // don't have a box

        Box b1 = new Box(12); // max weight 12
        robbie.take(b1); // robbie take a box b1
        assertFalse(robbie.putOn(cb));
    }

    @Test
    public void robotHaveABoxAndPutOnFullConveyerBelt(){
        Robot robbie = new Robot();
        ConveyerBelt cb = new ConveyerBelt(10); // max weight 10

        Box b1 = new Box(8);
        Box b2 = new Box(7);
        Box b3 = new Box(4);

        cb.receive(b1);
        cb.receive(b2);
        robbie.take(b3);

        assertTrue(cb.isFull()); // Conveyor is full
        assertTrue(robbie.carryingBox()); // Robbie have a box

        assertFalse(robbie.putOn(cb)); // Robbie can't put on this box
    }






    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(RobotTest.class);
    }

}