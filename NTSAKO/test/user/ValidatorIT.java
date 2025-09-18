/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package user;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a
 */
public class ValidatorIT {
    
    public ValidatorIT() {
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
     * Test of isValidUsername method, of class Validator.
     */
    @Test
    public void testIsValidUsername() {
        System.out.println("isValidUsername");
        String username = "";
        boolean expResult = false;
        boolean result = Validator.isValidUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of isValidPassword method, of class Validator.
     */
    @Test
    public void testIsValidPassword() {
        System.out.println("isValidPassword");
        String password = "";
        boolean expResult = false;
        boolean result = Validator.isValidPassword(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of isValidCellPhone method, of class Validator.
     */
    @Test
    public void testIsValidCellPhone() {
        System.out.println("isValidCellPhone");
        String cellPhone = "";
        boolean expResult = false;
        boolean result = Validator.isValidCellPhone(cellPhone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of isValidEmail method, of class Validator.
     */
    @Test
    public void testIsValidEmail() {
        System.out.println("isValidEmail");
        String email = "";
        boolean expResult = false;
        boolean result = Validator.isValidEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
