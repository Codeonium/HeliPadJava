import HelicopterBuild.Rotor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotorTest {
    Rotor rotor;

    @Before
    public void setUp() {
        rotor = new Rotor("Spinnie");
    }
    @Test
    public void hasRotor() {
        assertEquals("Spinnie", rotor.getRotor());
    }
    @Test
    public void rotorIsRotating() {
        assertEquals("suai suai suai fly fly", rotor.makeSound());
    }
}
