import static org.junit.Assert.*;

import org.junit.*;

public class CompteTest {
@Test    

	public void testSolde()
{
	Compte c = new Compte(100);
	assertTrue(c.getSolde() >= 0);
}




}
