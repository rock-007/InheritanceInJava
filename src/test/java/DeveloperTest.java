import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Umair", "x234xxx", 120000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Umair", developer.getName());
    }

    @Test
    public void raiseSalary(){
        assertEquals((170000.00), developer.raiseSalary(50000.00), 0.0);
    }

    @Test
    public void payBonus(){
        assertEquals(1200, developer.payBonus(),0.0);
    }
}
