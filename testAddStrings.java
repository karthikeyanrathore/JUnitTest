package TestPackage;
import static org.junit.Assert.*;
import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
        jUnitTesting add_string = new jUnitTesting();
        String result = add_string.addStrings("Hey","2020");
        assertEquals("Hey",result);
        result = add_string.addStrings("Hello","2021");
        assertEquals("2021",result);
        result = add_string.addStrings("se ","Lab");
        assertEquals("SELAB",result);
    }

}
