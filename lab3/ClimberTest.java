import junit.framework.*;

/**
 * The test class ClimberTest.
 *
 * @author Vj
 * @version Sep 2020
 */
public class ClimberTest extends TestCase
{
    
    /**
     * Default constructor for test class ClimberTest
     */
    public ClimberTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
    }

    public void testEmpty()
    {
        Climber climber1 = new Climber();
        assertEquals(true, climber1.isEmpty());
    }

    public void testNotEmpty()
    {
        Climber climber1 = new Climber("John", 0);
        assertEquals(false, climber1.isEmpty());
    }

    public void testGetName()
    {
        Climber climber1 = new Climber("Dave", 1);
        // This assert uses the optional message parameter
        assertEquals("Test name accessor failed.", "Dave", climber1.getName());
    }

    public void testLongReach()
    {
        Climber climber1 = new Climber("Bob", 2);
        assertFalse(climber1.hasLongReach());
        Climber climber2 = new Climber("Bob", 1);
        assertFalse(climber2.hasLongReach());
        Climber climber3 = new Climber("Bob", 3);
        assertTrue(climber3.hasLongReach());
    }
    
    public void testEquals()
    {
        Climber climber1 = new Climber("Ron", 1);
        Climber climber2 = new Climber("Ron", 1);
        assertEquals(climber1, climber2);
    }    
}