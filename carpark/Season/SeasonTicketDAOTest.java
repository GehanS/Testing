package salinda.tickets.season;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SALINDA
 */
public class SeasonTicketDAOTest {
    
    public SeasonTicketDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNumberOfTickets method, of class SeasonTicketDAO.
     */
    @Test
    public void testGetNumberOfTickets() {
        System.out.println("getNumberOfTickets");
        SeasonTicketDAO instance = new SeasonTicketDAO();
        int expResult = 50;
        int result = instance.getNumberOfTickets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
