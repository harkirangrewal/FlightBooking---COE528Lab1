/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author h36grewa
 */
public class FlightTest {
    
    public FlightTest() {
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

    //Test of constructor of class Flight
    @Test
    public void testConstructor()
    {
        System.out.println("Constructor");
        boolean exceptionCaught = false;
        try{
           Flight f1 = new Flight(4, "Toronto", "New York", "09/03/2019 12:30",450, 500.60);
        }
        catch (Exception ex)
        {
            exceptionCaught = true;
        }
        
        assertFalse(exceptionCaught);
        
    }
             
       
    @Test
    public void testInvalidConstructor()
    {
        System.out.println("InvalidConstructor");
        try 
        {
            Flight f2 = new Flight(1, "origin", "destination", "time", 4, 4.40);
        }
        catch(Exception ex)
        {
            assertEquals(ex, new IllegalArgumentException());
        }
    }
    
         
    /**
     * Test of getflightNumber method, of class Flight.
     */
    @Test
    public void testGetflightNumber() {
        System.out.println("getflightNumber");
        Flight instance = null;
        int expResult = 0;
        int result = instance.getflightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setflightNumber method, of class Flight.
     */
    @Test
    public void testSetflightNumber() {
        System.out.println("setflightNumber");
        int n = 0;
        Flight instance = null;
        instance.setflightNumber(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getorigin method, of class Flight.
     */
    @Test
    public void testGetorigin() {
        System.out.println("getorigin");
        Flight instance = null;
        String expResult = "";
        String result = instance.getorigin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of setorigin method, of class Flight.
     */
    @Test
    public void testSetorigin() {
        System.out.println("setorigin");
        String o = "";
        Flight instance = null;
        instance.setorigin(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getdestination method, of class Flight.
     */
    @Test
    public void testGetdestination() {
        System.out.println("getdestination");
        Flight instance = null;
        String expResult = "";
        String result = instance.getdestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String d = "";
        Flight instance = null;
        instance.setDestination(d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getdeparturetime method, of class Flight.
     */
    @Test
    public void testGetdeparturetime() {
        System.out.println("getdeparturetime");
        Flight instance = null;
        String expResult = "";
        String result = instance.getdeparturetime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setdeparturetime method, of class Flight.
     */
    @Test
    public void testSetdeparturetime() {
        System.out.println("setdeparturetime");
        String d = "";
        Flight instance = null;
        instance.setdeparturetime(d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getcapacity method, of class Flight.
     */
    @Test
    public void testGetcapacity() {
        System.out.println("getcapacity");
        Flight instance = null;
        int expResult = 0;
        int result = instance.getcapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setcapacity method, of class Flight.
     */
    @Test
    public void testSetcapacity() {
        System.out.println("setcapacity");
        int c = 0;
        Flight instance = null;
        instance.setcapacity(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberofSeats method, of class Flight.
     */
    @Test
    public void testGetNumberofSeats() {
        System.out.println("getNumberofSeats");
        Flight instance = null;
        int expResult = 0;
        int result = instance.getNumberofSeats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberofSeats method, of class Flight.
     */
    @Test
    public void testSetNumberofSeats() {
        System.out.println("setNumberofSeats");
        int n = 0;
        Flight instance = null;
        instance.setNumberofSeats(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getoriginalPrice method, of class Flight.
     */
    @Test
    public void testGetoriginalPrice() {
        System.out.println("getoriginalPrice");
        Flight instance = null;
        double expResult = 0.0;
        double result = instance.getoriginalPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setoriginalPrice method, of class Flight.
     */
    @Test
    public void testSetoriginalPrice() {
        System.out.println("setoriginalPrice");
        double p = 0.0;
        Flight instance = null;
        instance.setoriginalPrice(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bookaSeat method, of class Flight.
     */
    @Test
    public void testBookaSeat() {
        System.out.println("bookaSeat");
        Flight instance = null;
        boolean expResult = false;
        boolean result = instance.bookaSeat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flight f = null;
        Flight instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
