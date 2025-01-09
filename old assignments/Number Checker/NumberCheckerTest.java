import java.util.ArrayList;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberCheckerTest{

	@Test
	public void testIfNumberCheckerExist(){
		NumberChecker number = new NumberChecker();
			
	
	}
	@Test 
	public void testIfgetNumberReturnsATrueValue(){
		int[] numbers = {2,3,4,5,6,23} ;
		NumberChecker number = new NumberChecker();
		String value = number.getNumber(23 , numbers);
		String expected = "5";
		assertEquals(value, expected);
	}
	/*@Test
	public void testIfgetPositiveNagativeAndZerosExist(){
		 NumberChecker number = new NumberCheckergetPositiveNagativeAndZeros({15,34,-1,24,-7,9});
		int expected = ;
		assert.Equal(expexted , value);

	}*/

	
}