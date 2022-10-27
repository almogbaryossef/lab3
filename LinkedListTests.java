import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {

    @Test
    public void prependTest() {
        LinkedList lst = new LinkedList();
        lst.prepend(1);
        lst.prepend(2);
        lst.prepend(3);

        assertEquals(3,lst.first());
        assertEquals(1, lst.last());
    }

    @Test
    public void appendTest() {
        LinkedList lst = new LinkedList();
        lst.append(4);
        lst.append(5);
        lst.append(6);

        assertEquals(4, lst.first());
        assertEquals(6, lst.last());
    }
    

}