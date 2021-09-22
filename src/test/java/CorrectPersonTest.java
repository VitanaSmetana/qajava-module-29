import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CorrectPersonTest {

    @Test
    public void successfullyDetect16AgeTeenager() {
        boolean result = CorrectPerson.isTeenager(16);
        assertTrue(result);
    }

    @Test
    public void successfullyDetect13AgeTeenager() {
        boolean result = CorrectPerson.isTeenager(13);
        assertTrue(result);
    }

    @Test
    public void successfullyDetect19AgeTeenager() {
        boolean result = CorrectPerson.isTeenager(19);
        assertTrue(result);
    }

    @Test
    public void successfullyDetect20AgeBoomer() {
        boolean result = CorrectPerson.isTeenager(20);
        assertFalse(result);
    }

    @Test
    public void successfullyDetect12AgeZoomer() {
        boolean result = CorrectPerson.isTeenager(12);
        assertFalse(result);
    }

    @Test
    public void successfullyDetect0AgePerson() {
        boolean result = CorrectPerson.isTeenager(0);
        assertFalse(result);
    }

    @Test
    public void unsuccessfullyDetectNegateAgePerson() {
        assertThrows(
                Exception.class,
                () -> CorrectPerson.isTeenager(-1)
        );
    }

}
