import org.example.PhoneBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();

        int initialSize = phoneBook.add(1);
        assertEquals(0, initialSize);

        int newSize = phoneBook.add(1);
        assertEquals(1, newSize);
    }
}
