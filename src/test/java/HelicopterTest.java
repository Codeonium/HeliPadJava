import HelicopterBuild.Blades;
import HelicopterBuild.Body;
import HelicopterBuild.Engine;
import HelicopterBuild.Helicopter;
import HelicopterBuild.Rotor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelicopterTest {
    
    Helicopter helicopter;
    Body sexy;
    Blades crystal;
    Engine hybrid;
    Rotor fast;

    @Before
    public void setUp() {
        sexy = new Body("Sexy");
        crystal = new Blades(150);
        hybrid = new Engine("Hybrid");
        fast = new Rotor("rotor");
        helicopter = new Helicopter("Pinky", "Fun",sexy, crystal, hybrid, fast, 777.00, "ivy green");
    }

    @Test
    public void hasName() {
        assertEquals("Pinky", helicopter.getName());
    }

    @Test
    public void hasType() {
        assertEquals("Fun", helicopter.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("ivy green", helicopter.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(777.00, helicopter.getPrice(), 0.01);
    }
    @Test
    public void heliCanFly() {
        assertEquals("Vroom Vroom", hybrid.startEngine());
    }
}



