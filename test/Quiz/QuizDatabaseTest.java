/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Quiz;

import java.sql.Connection;
import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joachim Terepo
 */
public class QuizDatabaseTest {
    
    public QuizDatabaseTest() {
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
     * Test of establishConnection method, of class QuizDatabase.
     */
    @Test
    public void testEstablishConnection() {
        System.out.println("establishConnection");
        QuizDatabase instance = new QuizDatabase();
        instance.establishConnection();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of closeConnections method, of class QuizDatabase.
     */
    @Test
    public void testCloseConnections() {
        System.out.println("closeConnections");
        QuizDatabase instance = new QuizDatabase();
        instance.closeConnections();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createUserTable method, of class QuizDatabase.
     */
    @Test
    public void testCreateUserTable() {
        System.out.println("createUserTable");
        QuizDatabase instance = new QuizDatabase();
        instance.createUserTable();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createQuestionTable method, of class QuizDatabase.
     */
    @Test
    public void testCreateQuestionTable() {
        System.out.println("createQuestionTable");
        QuizDatabase instance = new QuizDatabase();
        instance.createQuestionTable();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of insertOrUpdateUserData method, of class QuizDatabase.
     */
    @Test
    public void testInsertOrUpdateUserData() {
        System.out.println("insertOrUpdateUserData");
        String firstName = "Joachim";
        String lastName = "Terepo";
        int earned = 1000000;
        QuizDatabase instance = new QuizDatabase();
        instance.insertOrUpdateUserData(firstName, lastName, earned);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of myQuery method, of class QuizDatabase.
     */
    @Test
    public void testMyQuery() {
        System.out.println("myQuery");
        String sql = "";
        QuizDatabase instance = new QuizDatabase();
        ResultSet expResult = null;
        ResultSet result = instance.myQuery(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of myUpdate method, of class QuizDatabase.
     */
    @Test
    public void testMyUpdate() {
        System.out.println("myUpdate");
        String sql = "";
        QuizDatabase instance = new QuizDatabase();
        instance.myUpdate(sql);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
