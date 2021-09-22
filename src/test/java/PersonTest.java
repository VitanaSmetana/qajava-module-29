import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {

    @Test
    public void successfullyDetect16AgeTeenager() {
        boolean result = Person.isTeenager(16);
        assertTrue(result);
    }

    @Test
    public void successfullyDetect13AgeTeenager() {
        boolean result = Person.isTeenager(13);
        assertTrue(result);
    }

    @Test
    public void successfullyDetect19AgeTeenager() {
        boolean result = Person.isTeenager(19);
        assertTrue(result);
    }

    @Test
    public void successfullyDetect20AgeBoomer() {
        boolean result = Person.isTeenager(20);
        assertFalse(result);
    }

    @Test
    public void successfullyDetect12AgeZoomer() {
        boolean result = Person.isTeenager(12);
        assertFalse(result);
    }

    @Test
    public void successfullyDetect0AgePerson() {
        boolean result = Person.isTeenager(0);
        assertFalse(result);
    }

    @Test
    public void unsuccessfullyDetectNegateAgePerson() {
        assertThrows(
                Exception.class,
                () -> Person.isTeenager(-1)
        );
    }

}
