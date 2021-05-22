package net.barakiroth.java16barebone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyRecordTest {

    @Test
    void when_set_with_name_then_the_same_name_should_be_got() {

        final int  id = 29;
        final String name = "John Doe";

        final MyInterface myRecord = new MyRecord(id, name);

        assertEquals(myRecord.name(), name);
    }

    @Test
    void when_set_with_some_values_then_the_same_values_should_be_got() {

        final int  id = 29;
        final String name = "John Doe";

        final MyRecord myRecord1 = new MyRecord(id, name);
        final MyRecord myRecord2 = new MyRecord(id, name);

        assertEquals(myRecord1.hashCode(), myRecord2.hashCode());
    }
}
