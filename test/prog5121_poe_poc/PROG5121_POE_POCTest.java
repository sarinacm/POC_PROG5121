/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog5121_poe_poc;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ctill
 */
public class PROG5121_POE_POCTest {
    
    Login loginTestClass = new Login();
    
    public PROG5121_POE_POCTest() {
    }

    @Test
    public void testLoginSuccess()
    {
        String expected = loginTestClass.loginSuccess;
        String actual  = loginTestClass.loginUser("Mike", "123456");
        assertEquals(expected,actual);
    }
    
}
