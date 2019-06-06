package gt.edu.umg.ingenieria.sistemas.is.examenfinal.pascal.triangle;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PascalTriangleTest {
    
    public PascalTriangleTest() {
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

    @Test
    public void Test1(){
        System.out.println("TEST #1 - Negative Input - Basic Output");

        // given
        int input = -1;
        String expectedResult = Arrays.toString(new long[0]);

        // when
        PascalTriangle pt = new PascalTriangle();
        String actualResult = pt.build(input);

        // then
        assertTrue("TEST #1 FAILED!!!", expectedResult.equals(actualResult));    
    }
    
    @Test
    public void Test2(){
        System.out.println("TEST #2 - Single Level Input - Basic Output");

        // given
        int input = 1;
        String expectedResult = "[1]"+System.lineSeparator();

        // when
        PascalTriangle pt = new PascalTriangle();
        String actualResult = pt.build(input);

        // then
        assertTrue("TEST #2 FAILED!!!", expectedResult.equals(actualResult));    
    }
    
    @Test
    public void Test3(){
        System.out.println("TEST #3 - Zero Input - Basic Output");

        // given
        int input = 0;
        String expectedResult = Arrays.toString(new long[0]);

        // when
        PascalTriangle pt = new PascalTriangle();
        String actualResult = pt.build(input);

        // then
        assertTrue("TEST #3 FAILED!!!", expectedResult.equals(actualResult));    
    }
    
    @Test
    public void Test4(){
        System.out.println("TEST #3 - Even Level Input - Basic Output");

        // given
        int input = 2;
        String expectedResult = "[1]"+System.lineSeparator()+"[1, 1]"+System.lineSeparator();

        // when
        PascalTriangle pt = new PascalTriangle();
        String actualResult = pt.build(input);

        // then
        assertTrue("TEST #4 FAILED!!!", expectedResult.equals(actualResult));    
    }
    
    @Test
    public void Test5(){
        System.out.println("TEST #5 - Uneven Level Input - Basic Output");

        // given
        int input = 3;
        String expectedResult = "[1]"+System.lineSeparator()+"[1, 1]"+System.lineSeparator()+"[1, 2, 1]"+System.lineSeparator();

        // when
        PascalTriangle pt = new PascalTriangle();
        String actualResult = pt.build(input);

        // then
        assertTrue("TEST #5 FAILED!!!", expectedResult.equals(actualResult));    
    }
    
    @Test
    public void Test6(){
        System.out.println("TEST #6 - Max Value Input - Zero Output");

        // given
        int input = Integer.MAX_VALUE;
        String expectedResult = "0";

        // when
        PascalTriangle pt = new PascalTriangle();
        String actualResult = pt.build(input);

        // then
        assertTrue("TEST #6 FAILED!!!", expectedResult.equals(actualResult));    
    }
}
