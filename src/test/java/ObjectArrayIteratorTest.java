import org.example.ObjectArrayIterator;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ObjectArrayIteratorTest {

    @Test
    void testEmptyArray() {
        String[] emptyArray = {};
        ObjectArrayIterator<String> iterator = new ObjectArrayIterator<>(emptyArray);

        assertFalse(iterator.hasNext());
        assertThrows(NoSuchElementException.class, () -> iterator.next());
    }

    @Test
    void testSingleElementArray() {
        String[] singleElementArray = {"Hello"};
        ObjectArrayIterator<String> iterator = new ObjectArrayIterator<>(singleElementArray);

        assertTrue(iterator.hasNext());
        assertEquals("Hello", iterator.next());
        assertFalse(iterator.hasNext());
        assertThrows(NoSuchElementException.class, () -> iterator.next());
    }

    @Test
    void testMultipleElementsArray() {
        String[] multipleElementsArray = {"First", "Second", "Third"};
        ObjectArrayIterator<String> iterator = new ObjectArrayIterator<>(multipleElementsArray);

        assertTrue(iterator.hasNext());
        assertEquals("First", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Second", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Third", iterator.next());
        assertFalse(iterator.hasNext());
        assertThrows(NoSuchElementException.class, () -> iterator.next());
    }
}