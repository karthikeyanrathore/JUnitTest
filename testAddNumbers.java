package TestPackage;
import static org.junit.Assert.*;
import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
        jUnitTesting add_number = new jUnitTesting();
        int result = add_number.addNumbers(20, 200);
        assertEquals (220,result);
        result = add_number.addNumbers(300, 200);
        assertEquals (600, result);
    }

}
