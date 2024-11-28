
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestAlphabetChecker{

	@Test 
	public void alphabetCheckerstandardtest(){
	
	// given(pre - conditions)
	AlphabetChecker alphabetChecker = new AlphabetChecker();
	String words = "the quick brown fox jumps over the lazy dog";

	//action
	boolean result = AlphabetChecker.ispangram(words);

	//check
	boolean expected = true;
	assertEquals(expected, result);
	
	}


}