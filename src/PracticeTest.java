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
}
