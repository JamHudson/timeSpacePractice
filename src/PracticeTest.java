import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PracticeTest {

  @Test
  void testMostCommonTimeEfficientWithNullArray(){
    int[] array = {};

    int actual = Practice.mostCommonTimeEfficient(array);

    assertEquals(0,actual);
  }

  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  @Test
  void testMostCommonSpaceEfficient() {
    int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,1,2,2,1};

    int actual = Practice.mostCommonSpaceEfficient(numbers);

    assertEquals(1, actual);
  }

  @Test
  void testMostCommonSpaceEfficientNegatives() {
    int[] numbers = new int[]{-1,-2,-3,-4,-5,-6,-1,-1,-2,-2};

    int actual = Practice.mostCommonSpaceEfficient(numbers);

    assertEquals(-1, actual);
  }

  @Test
  void testMostCommonSpaceEfficient2() {
    int[] numbers = new int[]{-1,-2,-3,-4,-5,-6,-1,-1,-2,-2,-3,-3,-3,-3,-3,-3,-3,-3};

    int actual = Practice.mostCommonSpaceEfficient(numbers);

    assertEquals(-3, actual);
  }

  @Test
  void testEmptyArray() {
    int[] numbers = new int[1];

    int actual = Practice.mostCommonSpaceEfficient(numbers);

    assertEquals(0,actual);
  }
}
