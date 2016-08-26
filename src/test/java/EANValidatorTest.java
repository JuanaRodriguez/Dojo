import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EANValidatorTest {
    EANValidator eanValidator;
    Integer code;

    @Before
    public void setUp() {
        EANValidator eanValidator = new EANValidator();
        code = 400330101839;
    }

    @Test
    public void test_validate() {
        assertTrue(eanValidator.validate(code));
    }

    @Test
    public void test_sum() {
        int expectedSum = 72;
        int newCodeInteger = 400330101839;
        assertEquals(expectedSum, eanValidator.sum(newCodeInteger));
    }

}