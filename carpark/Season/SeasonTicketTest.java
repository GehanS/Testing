package salinda.tickets.season;

import java.util.List;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sun.security.provider.certpath.OCSPResponse;

/**
 *
 * @author SALINDA
 */
public class SeasonTicketTest extends TestCase {
    
    public SeasonTicketTest() {
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
     * Test of getId method, of class SeasonTicket.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        SeasonTicket instance = new SeasonTicket("01","P1",012,0420);
        instance.setTicketId("01");
        assertEquals("01", instance.getId());
        // TODO review the generated test code and remove the default call to fail.
        
        
    }

    /**
     * Test of getCarparkId method, of class SeasonTicket.
     */
    @Test
    public void testGetCarparkId() {
        System.out.println("getCarparkId");
        SeasonTicket instance = new SeasonTicket("01","P1",012,0420) ;
        instance.setCarparkId("P2");
        
        assertEquals("P2",instance.getCarparkId() );
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getStartValidPeriod method, of class SeasonTicket.
     */
    @Test
    public void testGetStartValidPeriod() {
        System.out.println("getStartValidPeriod");
        SeasonTicket instance = new SeasonTicket("01","P1",012,0420) ;
        instance.setStartValidPeriod(1234);
        assertEquals(1234,instance.getStartValidPeriod() );
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getEndValidPeriod method, of class SeasonTicket.
     */
    @Test
    public void testGetEndValidPeriod() {
        System.out.println("getEndValidPeriod");
        SeasonTicket instance = new SeasonTicket("01","P1",012,0420);
       instance.setEndValidPeriod(51515);
        assertEquals(51515, instance.getEndValidPeriod());
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of inUse method, of class SeasonTicket.
     */
    @Test
    public void testInUse() {
        System.out.println("inUse");
        SeasonTicket instance = new SeasonTicket("01","P1",012,0420);
       
        assertEquals(false, instance.inUse());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of recordUsage method, of class SeasonTicket.
     */
   

    /**
     * Test of getCurrentUsageRecord method, of class SeasonTicket.
     */
   

    /**
     * Test of endUsage method, of class SeasonTicket.
     */
    @Test
    public void testEndUsage() {
        System.out.println("endUsage");
        long dateTime = 230417;
        SeasonTicket instance = new SeasonTicket("01","P1",012,0420);
        instance.endUsage(dateTime);
        // TODO review the generated test code and remove the default call to fail.
         assertEquals(230417, instance.endUsage());
         
    }

    /**
     * Test of getUsageRecords method, of class SeasonTicket.
     */
    
    
}
