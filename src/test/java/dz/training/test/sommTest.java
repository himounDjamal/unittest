package dz.training.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sommTest {

    somm somm;

    @BeforeEach
    void setUp() {
        somm = new somm();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void som_shouldAddInts() {
        int som = somm.som(4, 5);

        assertEquals(9, som);

    }

    @Test
    void shouldAddIntsPlus0() {
        int som = somm.som(4, 0);

        assertEquals(4, som);

    }

    @Test
    void shouldsubtwonumber() {
        int sub = somm.sub(8, 3);

        assertEquals(5, sub);

    }

    @Test
    void shouldthrowexp() {

        assertThrows(IllegalArgumentException.class,
                () -> {
                    somm.div(8, 0);
                }
        );
    }

}