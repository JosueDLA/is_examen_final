package gt.edu.umg.ingenieria.sistemas.is.examenfinal.sort.bubble;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {
    
    public BubbleSortTest() {
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
        System.out.println("TEST #1 - Single Input - Basic Output");

        // given
        int[] input = {1};
        int[] expectedResult = {1};

        // when
        int[] actualResult = BubbleSort.sortBasic(input);

        // then
        assertArrayEquals("TEST #1 FAILED!!!", expectedResult, actualResult);
    }
    
    @Test
    public void Test2(){
        System.out.println("TEST #2 - Basic Input - Basic Output");

        // given
        int[] input = {5, 1, 3};
        int[] expectedResult = {1,3,5};

        // when
        int[] actualResult = BubbleSort.sortBasic(input);

        // then
        assertArrayEquals("TEST #2 FAILED!!!", expectedResult, actualResult);
    }
    
    @Test
    public void Test3(){
        System.out.println("TEST #3 - Array with negative Input - Basic Output");

        // given
        int[] input = {1,2,3,-1,-4};
        int[] expectedResult = {-4,-1,1,2,3};

        // when
        int[] actualResult = BubbleSort.sortBasic(input);

        // then
        assertArrayEquals("TEST #3 FAILED!!!", expectedResult, actualResult);
    }
    
    @Test
    public void Test4(){
        System.out.println("TEST #4 - Empty Input - Basic Output");

        // given
        int[] input = {};
        int[] expectedResult = {};

        // when
        int[] actualResult = BubbleSort.sortBasic(input);

        // then
        assertArrayEquals("TEST #4 FAILED!!!", expectedResult, actualResult);
    }
    
    @Test
    public void Test5(){
        System.out.println("TEST #5 - Null Input - Null Output");

        // given
        int[] input = null;
        int[] expectedResult = null;

        // when
        int[] actualResult = BubbleSort.sortBasic(input);

        // then
        assertArrayEquals("TEST #5 FAILED!!!", expectedResult, actualResult);
    }
}
