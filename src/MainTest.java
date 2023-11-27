import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.OffsetDateTime;

public class MainTest {
    private final esercizio32di5 testing = new esercizio32di5();
    @Test
    void addYear_from_2010() {
        OffsetDateTime result = testing.agregarYear(OffsetDateTime.parse("2010-01-05T13:00:00Z"));
        assertEquals(OffsetDateTime.parse("2011-01-05T13:00:00Z"), result);
    }

    @Test
    void changeDate_null() {
        OffsetDateTime result = testing.agregarYear(null);
        assertNull(result);
    }
    @Test
    void subtractMonth() {
        OffsetDateTime result = testing.agregarMes(OffsetDateTime.parse("2010-01-05T13:00:00Z"));
        assertEquals(OffsetDateTime.parse("2009-12-05T13:00:00Z"), result);
    }

    @Test
    void subtractMonth_null() {
        OffsetDateTime result = testing.agregarMes(null);
        assertNull(result);
    }

    @Test
    void add7days_from_05012010() {
        OffsetDateTime result = testing.agregar7dias(OffsetDateTime.parse("2010-01-05T13:00:00Z"));
        assertEquals(OffsetDateTime.parse("2010-01-12T13:00:00Z"), result);
    }

    @Test
    void add7days_null() {
        OffsetDateTime result = testing.agregar7dias(null);
        assertNull(result);
    }
}

