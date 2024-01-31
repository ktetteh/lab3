import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = {9,8,7};
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(new int[] {7,8,9}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {1,2,3,4};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[] {4,3,2,1}, ArrayExamples.reversed(input2));
  }
}
