import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import management.Manager;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Giuiliano", "x10000", 100000.00, "SoftwareEngg");

    }

    @Test
    public void hasName(){
        assertEquals("Giuiliano", manager.getName());
    }

    @Test
    public void raiseSalary(){
        assertEquals((150000.00), manager.raiseSalary(50000.00), 0.0);
    }

    @Test
    public void raiseNegativeSalary(){
        assertEquals(null, manager.raiseSalary(-50000.00));
    }
    @Test
    public void payBonus(){
        assertEquals(1000, manager.payBonus(),0.0);
    }
}
