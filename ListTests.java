import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter() {
        List<String> lst = new ArrayList<String>();
        lst.add("hello");
        lst.add("consequence");
        lst.add("shannanigans");
        lst.add("flower");
        lst.add("code");
        lst.add("carrot");

        StringChecker sc = new ListExamples();
        
        List<String> result = new ArrayList<String>();
        result.add("consequence");
        result.add("shannanigans");
        result.add("flower");
        result.add("carrot");

        assertArrayEquals(result.toArray(), ListExamples.filter(lst, sc).toArray());
    }
}
