import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem.Type;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProblemTest {
    @BeforeEach
    public void setUp() {
        Problem problem = new Problem("name" ,Type.FINANCIAL);
    }
    @Test
    public void test_thatProblemIsNotSolved() {

    }

}
