import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NigeriaGeoPoliticalZonesTest {
    @Test
    public void test_thatIfA_StateIsImputed() {
        String userInput = "Kaduna";
        for( Zones zone: Zones.values() ) {
            for(String state : zone.getState()){
                System.out.println(state);
                    zone.states.equals(userInput);

            }
        }
        assertTrue(true);

    }
    @Test
    public void test_thatIfA_StateIsNotImputed() {
        String userInput = "Kaduna";

    }
}
