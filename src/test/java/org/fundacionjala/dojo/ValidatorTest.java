package org.fundacionjala.dojo;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Test for {@link Validator}
 */
public class ValidatorTest {
    private Validator validator;

    @Before
    public void setUp() {
        validator = new Validator();
    }
    @Test
    public void test_01() {
        final String value = "9783815820865";
        assertTrue(validator.validate(value));
    }

    @Test
    public void test_02() {
        final String value = "9783815820864";
        assertFalse(validator.validate(value));
    }

    @Test
    public void test_03() {
        final String value = "9783827317100";
        assertTrue(validator.validate(value));
    }
}

