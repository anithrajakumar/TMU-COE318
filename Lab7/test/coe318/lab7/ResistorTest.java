/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package coe318.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anith Rajakumar
 */
public class ResistorTest {
    
    public ResistorTest() {
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
     * Test of getNodes method, of class Resistor.
     */
    @Test
    public void testGetNodes() {
        System.out.println("getNodes");
        Node node1 = new Node();
        Node node2 = new Node();
        Resistor instance = new Resistor(5, node1, node2);
        Node[] expResult = {node1, node2};
        Node[] result = instance.getNodes();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of spiceDescription method, of class Resistor.
     */
    @Test
    public void testSpiceDescription() {
        System.out.println("spiceDescription");
        Resistor instance = new Resistor(5, new Node(), new Node());
        String expResult = "R2 2 3 5.0 ";
        String result = instance.spiceDescription();
        assertEquals(expResult, result);
    }
    
}
