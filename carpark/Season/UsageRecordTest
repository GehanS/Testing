
package salinda.tickets.season;

import salinda.tickets.season.UsageRecord;
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
public class UsageRecordTest {
    
    public UsageRecordTest() {
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
     * Test of finalise method, of class UsageRecord.
     */
    @Test
    public void testFinalise() {
        System.out.println("finalise");
        long endDateTime = 0L;
        UsageRecord instance = new UsageRecord("01", 1530);
        
        instance.finalise(1530);
        assertEquals(1530, instance.getFinalise());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getStartTime method, of class UsageRecord.
     */
    @Test
    public void testGetStartTime() {
        System.out.println("getStartTime");
        UsageRecord instance = new UsageRecord("01", 1530);
        instance.setStartDateTime(1530);
        long expResult = 1530;
        long result = instance.getStartTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getEndTime method, of class UsageRecord.
     */
    @Test
    public void testGetEndTime() {
        System.out.println("getEndTime");
        UsageRecord instance = new UsageRecord("01", 1820);
        instance.setEndDateTime(1820);
        long expResult = 1820;
        long result = instance.getEndTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSeasonTicketId method, of class UsageRecord.
     */
    @Test
    public void testGetSeasonTicketId() {
        System.out.println("getSeasonTicketId");
        UsageRecord instance = new UsageRecord("01", 1820);
        instance.setTicketId("02");
        String expResult = "02";
        String result = instance.getSeasonTicketId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
