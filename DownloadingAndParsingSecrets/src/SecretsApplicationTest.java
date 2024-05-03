import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SecretsApplicationTest {

	@Test
	public void testParse1() {
		SecretsApplication app = new SecretsApplication( new StubStringSource("SECRET NUMBER: 478") );
		assertEquals(478, app.obtainInput());
	}
	@Test
	public void testParse2() {
		SecretsApplication app = new SecretsApplication( new StubStringSource("SECRET NUMBER: -15") );
		assertEquals(-15, app.obtainInput());
	}

}
