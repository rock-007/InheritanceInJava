import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;
public class DatabaseAdminTest {


    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Harry", "x234xxx", 50000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Harry", databaseAdmin.getName());
    }

    @Test
    public void raiseSalary(){
        assertEquals((100000.00), databaseAdmin.raiseSalary(50000.00), 0.0);
    }

    @Test
    public void payBonus(){
        assertEquals(500, databaseAdmin.payBonus(),0.0);
    }
}
