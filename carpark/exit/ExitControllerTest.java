
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
		
    }

	 /**
     * Unit Testing of carEventDetected method, of class ExitController.
     */
	 
	  @Test
    public void testCarEventDetected() {
        System.out.println("carEventDetected");
        String detectorId = "";
		boolean carDetected = false;
        ExitController instance = null;
        instance.carEventDetected(detectorId, carDetected);
        // TODO review the generated test code and remove the default call to fail.
        
    }

	/**
     * Test of ticketInserted method, of class ExitController.
     */
	 
	 @Test
    public void testTicketInserted() {
        System.out.println("ticketInserted");
        String ticketStr = "";
		ExitController instance = null;
        instance.ticketInserted(ticketStr);
        // TODO review the generated test code and remove the default call to fail.
	}
	
    /**
     * Test of ticketTaken method, of class ExitController.
     */
	  @Test
    public void testTicketTaken()
	{
        System.out.println("ticketTaken");
	  ExitController instance = null;
        instance.ticketTaken();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
	 
