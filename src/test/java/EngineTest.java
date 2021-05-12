import HelicopterBuild.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    Engine engine;

    @Before
    public void setUp() {
        engine = new Engine("FlyFly");
    }
    @Test
    public void hasName() {
        assertEquals("FlyFly", engine.getName());
    }
    @Test
    public void canStartEngine() {
        assertEquals("Vroom Vroom", engine.startEngine());
    }
}
