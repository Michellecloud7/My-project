
package com.mycompany.assignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mpho Mudau
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getUsername method, of class Login.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Login instance = null;
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getpassword method, of class Login.
     */
    @Test
    public void testGetpassword() {
        System.out.println("getpassword");
        Login instance = null;
        String expResult = "";
        String result = instance.getpassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCellnumber method, of class Login.
     */
    @Test
    public void testGetCellnumber() {
        System.out.println("getCellnumber");
        Login instance = null;
        String expResult = "";
        String result = instance.getCellnumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UsernameChecker method, of class Login.
     */
    @Test
    public void testUsernameChecker() {
        System.out.println("UsernameChecker");
        String Username = "";
        boolean expResult = false;
        boolean result = Login.UsernameChecker(Username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of passwordChecker method, of class Login.
     */
    @Test
    public void testPasswordChecker() {
        System.out.println("passwordChecker");
        String password = "";
        boolean expResult = false;
        boolean result = Login.passwordChecker(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CellnumberChecker method, of class Login.
     */
    @Test
    public void testCellnumberChecker() {
        System.out.println("CellnumberChecker");
        String Cellnumber = "";
        boolean expResult = false;
        boolean result = Login.CellnumberChecker(Cellnumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String enteredUsername = "";
        String enteredpassword = "";
        Login instance = null;
        boolean expResult = false;
        boolean result = instance.loginUser(enteredUsername, enteredpassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
