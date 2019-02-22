
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TextFormaterTest {

	@Test
	public void testFormat() {
		TextFormater textFormater = new TextFormater();
		String str = textFormater.format("CGM", 3);
		assertEquals("CCC\nGGG\nMMM\n", str);
	}

}
