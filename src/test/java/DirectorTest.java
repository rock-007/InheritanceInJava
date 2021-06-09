import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import management.Director;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Steve", "1xxxxx", 300000.00, "Management", 12000000.00);

    }

    @Test
    public void hasName(){
        assertEquals("Steve", director.getName());
    }

    @Test
    public void raiseSalary(){
        assertEquals((350000.00), director.raiseSalary(50000.00), 0.0);
    }

    @Test
    public void payBonus(){
        assertEquals(6000, director.payBonus(),0.0);
    }

    @Test
    public void getBudget(){
        assertEquals(12000000.00, director.getBudget(), 0.0);
    }

    @Test
    public void changeName(){
        assertEquals("Steve", director.setName("Steve"));
    }

}
