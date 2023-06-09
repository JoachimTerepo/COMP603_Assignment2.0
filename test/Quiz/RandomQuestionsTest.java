/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Quiz;

import java.util.ArrayList;
import java.util.List;
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
public class RandomQuestionsTest {
    
    public RandomQuestionsTest() {
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
     * Test of getQuestion method, of class RandomQuestions.
     */
    @Test
    public void testGetQuestion() {
        System.out.println("getQuestion");
        RandomQuestions instance = new RandomQuestions();
        RandomQuestions question = instance.getFirstQuestionsFromDatabase();
        String expResult = "What is the capital city of Australia?";
        String result = question.getQuestion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstAnswer method, of class RandomQuestions.
     */
    @Test
    public void testGetFirstAnswer() {
        System.out.println("getFirstAnswer");
        RandomQuestions instance = new RandomQuestions();
        RandomQuestions question = instance.getFirstQuestionsFromDatabase();
        String expResult = "Sydney";
        String result = question.getFirstAnswer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSecondAnswer method, of class RandomQuestions.
     */
    @Test
    public void testGetSecondAnswer() {
        System.out.println("getSecondAnswer");
        RandomQuestions instance = new RandomQuestions();
        RandomQuestions question = instance.getFirstQuestionsFromDatabase();
        String expResult = "Melbourne";
        String result = question.getSecondAnswer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getThirdAnswer method, of class RandomQuestions.
     */
    @Test
    public void testGetThirdAnswer() {
        System.out.println("getThirdAnswer");
        RandomQuestions instance = new RandomQuestions();
        RandomQuestions question = instance.getFirstQuestionsFromDatabase();
        String expResult = "Perth";
        String result = question.getThirdAnswer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCorrectAnswer method, of class RandomQuestions.
     */
    @Test
    public void testGetCorrectAnswer() {
        System.out.println("getCorrectAnswer");
        RandomQuestions instance = new RandomQuestions();
        RandomQuestions question = instance.getFirstQuestionsFromDatabase();
        String expResult = "Canberra";
        String result = question.getCorrectAnswer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of shuffleAnswerOptions method, of class RandomQuestions.
     */
    @Test
    public void testShuffleAnswerOptions() {
        System.out.println("shuffleAnswerOptions");
        RandomQuestions instance = new RandomQuestions();
        RandomQuestions question = instance.getFirstQuestionsFromDatabase();
        question.shuffleAnswerOptions();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAnswerOptions method, of class RandomQuestions.
     */
    @Test
    public void testGetAnswerOptions_int() {
        System.out.println("getAnswerOptions");
        int i = 0;
        RandomQuestions instance = new RandomQuestions();
        RandomQuestions question = instance.getFirstQuestionsFromDatabase();
        String expResult = "Sydney";
        String result = question.getAnswerOptions(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class RandomQuestions.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        RandomQuestions instance = new RandomQuestions();
        RandomQuestions question = instance.getFirstQuestionsFromDatabase();
        String expResult = "What is the capital city of Australia? Sydney, Melbourne, Perth, Canberra";
        String result = question.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
